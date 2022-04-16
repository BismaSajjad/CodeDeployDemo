package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1Page {
    WebDriver driver;
    private By startBtn = new By.ByCssSelector("#start > button");
    private By loadingIcon = new By.ById("loading");
    private By textFound = new By.ById("finish");

    public Example1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(startBtn).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIcon)));

        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).
        pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIcon)));

    }


    public String textFound() {
        return driver.findElement(textFound).getText();
    }

}
