package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    WebDriver driver;
    private By textbox = new By.ById("target");
    private By result = new By.ById("result");

    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(textbox).sendKeys(text);
    }

    public String getResultText() {
        return driver.findElement(result).getText();
    }

    public void enterBackSpace() {
        driver.findElement(textbox).sendKeys(Keys.BACK_SPACE);
    }


}
