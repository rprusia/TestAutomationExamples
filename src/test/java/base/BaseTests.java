package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver78.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        https://formy-project.herokuapp.com/
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        //Dimension size = new Dimension(800, 600);
        ///driver.manage().window().fullscreen();
        //driver.manage().window().setSize(size);
        driver.manage().window().fullscreen();


    }

    @AfterClass
    public void tearDown(){

        driver.quit();

    }



}
