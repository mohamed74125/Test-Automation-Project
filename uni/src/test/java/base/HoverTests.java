package base;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests{

    @Test
    public void testhoveruser1(){
        var hoverpages =homePages.ClickHoverPages();
        var caption=hoverpages.HoverOverFigure(1);
        assertTrue(caption.isdisplayeible(),"caption not displayed");
        assertEquals(caption.getTitle(),"name: user1","caption title is incorrect");
        assertEquals(caption.getLinkText(),"view profile","caption link text");
        assertTrue(caption.getLink().endsWith("/user/1"),"Link incorrect");
    }

}
