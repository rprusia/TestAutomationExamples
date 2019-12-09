package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormHomePage {

    //https://formy-project.herokuapp.com/form
    //https://the-internet.herokuapp.com/login
    private WebDriver driver;

    private By lnkCompleteWebForm = By.linkText("Complete Web Form");

    public WebFormPage clickFormAuthLink(){

        driver.findElement(lnkCompleteWebForm).click();
        return new WebFormPage(driver);
    }


}


