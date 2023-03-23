package base;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicLoadTest extends BaseTests {
   @Test
    public void dynamicload() {
        var dynamicload = homePages.clickDynamicLoadingpage().clickelement();
        dynamicload.clickStart();
        System.out.println(dynamicload.getText());
        assertEquals(dynamicload.getText(),"Hello World!");
    }
}