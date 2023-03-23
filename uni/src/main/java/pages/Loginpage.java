package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    private WebDriver driver;
    private By username= By.id("username");
    private By password=By.id("password");
    private By loginbutt=By.cssSelector("#login > button > i");
    public Loginpage(WebDriver driver){
        this.driver=driver;
    }
    public void setusername(String Username){
        driver.findElement(username).sendKeys(Username);

    }
    public void setPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }
    public SecureAreaPage ClickLoginArea(){
        driver.findElement(loginbutt).click();
        return new SecureAreaPage(driver);
    }





}
