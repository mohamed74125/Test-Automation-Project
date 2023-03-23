package base;


import org.testng.annotations.Test;

public class horizontalTest extends BaseTests{
   @Test
    public void horizontalTestf(){
        var  Horizontalclick=  homePages.clickHorizontal_Slider();
        Horizontalclick.setrange("5");
    }


}
