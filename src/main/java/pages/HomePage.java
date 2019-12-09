package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    //https://the-internet.herokuapp.com/login
    private WebDriver driver;

    private By formAuthLink = By.linkText("Form Authentication");

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthLink(){
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }

}
