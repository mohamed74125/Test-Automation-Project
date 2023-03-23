package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private By boxcation=By.className("figcaption");
    By figureBox=new By.ByClassName("figure");
    public HoversPage(WebDriver driver){
        this.driver=driver;
    }
    public FigureCaption HoverOverFigure(int index){


       WebElement figer =driver.findElements(figureBox).get(index-1);
        Actions action=new Actions(driver);
        action.moveToElement(figer).perform();
        return new FigureCaption(figer.findElement(boxcation));
    }
    public class FigureCaption{
        private WebElement caption;
        private By header=By.tagName("h5");
        private By link=By.tagName("a");
        private FigureCaption(WebElement caption){
            this.caption=caption;

        }
        public boolean isdisplayeible(){
           return caption.isDisplayed();
        }
        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }



}
