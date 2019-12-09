package login;

import base.BaseFormTests;
import org.testng.annotations.Test;
import pages.FormHomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import pages.WebFormPage;

import static org.testng.Assert.assertTrue;

public class WebFormTests extends BaseFormTests {

    @Test
    public void testWebFormValidation()   {

        WebFormPage formHomePage = new FormHomePage().clickFormAuthLink();

        formHomePage.enterFirstName("Ray");
        formHomePage.enterLastName("Smith");
        formHomePage.enterJobTitle("King");


    }
}
