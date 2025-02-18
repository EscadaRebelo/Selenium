package part2.com.saucedemo.base;

import com.base.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected String url = "https://www.saucedemo.com";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver(); //initialize the driver
        driver.manage().window().maximize(); //maximize the window
        driver.get(url); //load the application
        basePage = new BasePage(); //create an instance of BasePage
        basePage.setDriver(driver); //set the driver from the BasePage
        loginPage = new LoginPage(); // create an instance of LoginPage
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
