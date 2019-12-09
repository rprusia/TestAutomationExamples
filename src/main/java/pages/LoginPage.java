package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By txtUserName = By.name("username");
    private By txtPassword = By.name("password");
    private By btnLogin =  By.cssSelector("#login button");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName (String userName){

        driver.findElement(txtUserName).sendKeys(userName);

    }

    public void setPassword (String password){

        driver.findElement(txtPassword).sendKeys(password);

    }

    public SecureAreaPage clickLoginButton (){

        driver.findElement(btnLogin).click();
        return new SecureAreaPage(driver);


    }
}
