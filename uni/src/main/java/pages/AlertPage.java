package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By triggerAlertButton= By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerconformButton= By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerpromptButton= By.xpath(".//button[text()='Click for JS Prompt']");
    private By result=By.id("result");
    public AlertPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String GetResult (){
        return driver.findElement(result).getText();
    }
    public void TriggerconformButton(){
        driver.findElement(triggerconformButton).click();
    }


    public void alert_clicktodismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String getalertText(){
        return driver.switchTo().alert().getText();
    }
    public void TriggerpromptButton(){
        driver.findElement(triggerpromptButton).click();
    }
    public void SetTextprompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
