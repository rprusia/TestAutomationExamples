package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFormPage {

    private WebDriver driver;

    private By txtFirstName = By.id("first-name");
    private By txtLastName = By.id("last-name");
    private By txtJobTitle = By.id("job-title");
    private By rdoEducationLevel = By.className("input-group");

    public WebFormPage (WebDriver driver) {
        this.driver = driver;
    }



    public void enterFirstName(String text){

        driver.findElement(txtFirstName).sendKeys(text);

    }
    public void enterLastName(String text){

        driver.findElement(txtLastName).sendKeys(text);

    }

    public void enterJobTitle(String text){

        driver.findElement(txtJobTitle).sendKeys(text);

    }
}
