package Utils;

import org.openqa.selenium.WebDriver;



public class WindowManger {
    private WebDriver driver;
    private WebDriver.Navigation navigation;
    public WindowManger (WebDriver driver){
        this.driver=driver;
    }
    public void GoBack(){
        driver.navigate().back();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }
    public void switchToTap(String tabTitle){
        var windows=driver.getWindowHandles();
        windows.forEach(System.out::println);
        for(String window:windows){
            System.out.println("Switching to window"+window);
            driver.switchTo().window(window);
            System.out.println("Current window title"+driver.getTitle());
            if (tabTitle.equals(driver.getTitle())){
                break;
            }

        }
    }

}
