package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    protected static HomePage homePage;

    @BeforeMethod
    public void goToHomePage() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();
        goToHomePage();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        homePage = new HomePage(driver);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
