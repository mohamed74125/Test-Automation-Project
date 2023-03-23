package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver drivar;
    private By inputField= By.id("target");
    private By resultText= By.id("result");
    public KeyPressesPage(WebDriver drivar) {
        this.drivar=drivar;
    }
    public void enterText(String text){
        drivar.findElement(inputField).sendKeys(text);
    }
    public String getResult(){
        return drivar.findElement(resultText).getText();

    }
    public void enterpi(){
       enterText(Keys.chord(Keys.ALT,"p")+"=3.14");
    }

}
