package base;


import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.assertEquals;

public class TestAlertPage extends BaseTests {
    @Test
    public void testALert(){
        var Alert=homePages.clickAlertPage();
        Alert.triggerAlertButton();
        Alert.acceptAlert();

        assertEquals(Alert.GetResult(),"You successfully clicked an alert","result test incorrect");

    }
    @Test
    public void testGetTextFromAlert(){
        var Alert=homePages.clickAlertPage();
        Alert.TriggerconformButton();
        String text= Alert.getalertText();
        Alert.alert_clicktodismiss();
        assertEquals(text,"I am a JS Confirm","confirm is in correct");
    }
    @Test
    public void testPrompt(){
        var Alert=homePages.clickAlertPage();
        Alert.TriggerpromptButton();
        String text="hello";
        Alert.SetTextprompt(text);
        assertEquals(Alert.GetResult(),"You entered: null","result text incorrect");
    }

}
