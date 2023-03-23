package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class HomePages {

    private  WebDriver drivar;

    public HomePages(WebDriver driver){
        this.drivar=driver;
    }
    public Loginpage clickformauthentication(){
        clickLink("Form Authentication");
        return new Loginpage(drivar);
    }
    public DrobDownPages clickdropdown(){
        clickLink("Dropdown");
        return  new DrobDownPages(drivar);
    }
    public HoversPage ClickHoverPages(){
        clickLink(("Hovers"));
        return new HoversPage(drivar);
    }
    public KeyPressesPage ClickkeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage (drivar);
    }
    public  Horizontal_Slider clickHorizontal_Slider(){
        clickLink("Horizontal Slider");
        return new Horizontal_Slider(drivar);
    }
    public AlertPage clickAlertPage(){
        clickLink("WYSIWYG Editor");
        return new AlertPage(drivar);
    }
    public DynamicLoadingPage clickDynamicLoadingpage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(drivar);
    }
    public  MultipleWindowsPage ClickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(drivar);


    }



    private void clickLink(String linkText){
        drivar.findElement(By.linkText(linkText)).click();
    }
}
