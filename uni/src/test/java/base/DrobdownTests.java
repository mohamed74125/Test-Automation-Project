package base;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DrobdownTests extends BaseTests{
    @Test
    public void testSelectedOption(){
        var dropDownPages=homePages.clickdropdown();
        String option ="Option 1";
        dropDownPages.selectfromDrobDown(option);
        var selectedOptions=dropDownPages.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"incorecct number of selections");
        assertTrue(selectedOptions.contains(option),"OPtion not selected");
    }
}
