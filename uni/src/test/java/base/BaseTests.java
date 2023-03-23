package base;

import Utils.WindowManger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePages;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BaseTests {
    private WebDriver driver;

    protected HomePages homePages;
    @BeforeClass
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver() ;


        homePages=new HomePages(driver);
        goHome();

    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        Path target= Path.of("C:\\Users\\silicon\\IdeaProjects\\uni\\src\\main\\resources\\screenshots"+result.getName()+".png");
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera =(TakesScreenshot)driver;
            File screenshots =camera.getScreenshotAs(OutputType.FILE);
           try {
              Files.move(screenshots.toPath(),target);
           }catch (IOException e){
               e.printStackTrace();
           }

        }

    }

    private void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }
    /*@AfterClass
    public void TrearDown (){
       driver.quit();
      }*/
    private EdgeOptions GetEdheOption(){
        EdgeOptions options =new EdgeOptions();
        options.addArguments("disable-infobars");
        return options;
    }
    public WindowManger getWindowManger(){
        return new WindowManger(driver);
    }

}

