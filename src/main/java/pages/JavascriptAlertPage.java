package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertPage {
    WebDriver driver;

    //For Simple JS Alert
    private By javascriptAlertTrigger = new By.ByCssSelector("button[onclick='jsAlert()']");
    private By result = new By.ById("result");

    public void clickAlertTrigger() {
        driver.findElement(javascriptAlertTrigger).click();
    }

    public void okJavaScriptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getTextFromJavaScriptAlert() {
        return driver.switchTo().alert().getText();
    }


    //For Confirm Alert
    private By getInfo = new By.ByCssSelector("div[class='example'] h3");
    private By javascriptConfirmTrigger = new By.ByCssSelector("button[onclick='jsConfirm()']");

    public JavascriptAlertPage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickConfirmTrigger() {
        driver.findElement(javascriptConfirmTrigger).click();
    }

    public void okConfirmAlert() {
        driver.switchTo().alert().accept();
    }

    public void cancelConfirmAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getTextFromJavaScriptConfirm() {
        return driver.switchTo().alert().getText();
    }

    public String getResultText() {
        return driver.findElement(result).getText();
    }

    //For Prompt Alert


}




