package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DrobDownPages {
    private WebDriver driver;
    private By drobDown=By.id("dropdown");
    public DrobDownPages(WebDriver driver){
        this.driver=driver;
    }
    public void selectfromDrobDown(String option ){

        findDrobDownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOption(){
        List<WebElement>SelectedElement=findDrobDownElement().getAllSelectedOptions();
        return SelectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDrobDownElement(){
        return new Select(driver.findElement(drobDown));
    }

}
