package login;

import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;
import org.testng.annotations.*;
import org.testng.Assert.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){

       LoginPage loginPage = homePage.clickFormAuthLink();
       loginPage.setUserName("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       //assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!");
       assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text is is not correct");


    }
}
