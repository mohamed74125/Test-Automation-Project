package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By StartButton=By.cssSelector("#start button");

    private By loadingIndecator= By.id("loading");
    private By helloworld = By.id("finish");
    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver=driver;
    }
    public void clickStart(){
        driver.findElement(StartButton).click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndecator)));
    }
    public String getText(){
        return driver.findElement(helloworld).getText();

    }
}
