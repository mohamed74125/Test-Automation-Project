package base;

import org.testng.annotations.Test;
import pages.Loginpage;
import pages.SecureAreaPage;

import static org.testng.AssertJUnit.*;

public class LoginTests extends BaseTests{
    @Test
    public void testSuccessfulLogin(){
        var loginpage = homePages
                .clickformauthentication();
        loginpage.setusername("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginpage.ClickLoginArea();
        System.out.println(secureAreaPage.get_alert());
        assertTrue("alert text is incorrect",
                secureAreaPage.get_alert().contains("You logged into a secure area!"));


    }
}
