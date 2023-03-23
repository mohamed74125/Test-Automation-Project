package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1= By.linkText("Example 1: Element on page that is hidden");
    private By StartButton=By.cssSelector("#start button");
    private By helloworld = By.id("finish");
    private By loadingIndecator= By.id("loading");
    public DynamicLoadingPage(WebDriver drivar) {
        this.driver=drivar;
    }
    /*public void dynamicloadingWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }*/
    public DynamicLoadingExample1Page clickelement(){
        driver.findElement(example1).click();
        return new DynamicLoadingExample1Page (driver);

    }


}
