package base;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesPagesTest extends BaseTests{
    @Test
    public void BackSpaceTest(){
       var KeyPage = homePages.ClickkeyPresses();
        KeyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(KeyPage.getResult(),"You entered: BACK_SPAC");
        KeyPage.enterpi();
    }


}
