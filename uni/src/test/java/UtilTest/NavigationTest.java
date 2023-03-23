package UtilTest;

import base.BaseTests;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTests implements WebDriverListener {

    @Test
    public void TestNavigator() {
        homePages.clickDynamicLoadingpage().clickelement();
        getWindowManger().GoBack();
        getWindowManger().refreshPage();
        getWindowManger().goForward();
        getWindowManger().goTo("https://www.filgoal.com/");

    }
    @Test
    public void testSwitchTab(){
        homePages.ClickMultipleWindows().clickHere();
        getWindowManger().switchToTap("New Window");
    }

}
