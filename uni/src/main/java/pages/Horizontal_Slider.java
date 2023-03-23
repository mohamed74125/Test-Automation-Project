package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Horizontal_Slider {
    private WebDriver drivar ;
    private By range=By.id("range");

    public Horizontal_Slider(WebDriver drivar) {
        this.drivar=drivar;

    }

    public void setrange(String  idrange) {
        drivar.findElement(range).sendKeys("idrange");
    }
}
