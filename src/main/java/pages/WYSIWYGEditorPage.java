package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    WebDriver driver;
    private By iFrameId = new By.ById("mce_0_ifr");
    private By textBox = new By.ById("tinymce");
    private By increaseIndentBtn = new By.ByXPath("//button[@title='Increase indent']");
    private By pageTitle = new By.ByCssSelector("div[class='example'] h3");


    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    // Switching to internal Html frame
    private void switchToIframe() {
        driver.switchTo().frame(driver.findElement(iFrameId));
    }

    // Switching to main html frame
    private void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    // Clearing the text box of iframe
    public void clearTextBox() {
        switchToIframe();
        driver.findElement(textBox).clear();
        switchToParentFrame();
    }

    // Enter value in Text Box
    public void enterTextInTextBox(String text) {
        switchToIframe();
        driver.findElement(textBox).sendKeys(text);
        switchToParentFrame();
    }

    // Increase indent
    public void increaseIndent() {
        driver.findElement(increaseIndentBtn).click();
    }

    // Get text from Text Box
    public String getTextFromTextBox() {
        String text;
        switchToIframe();
        text = driver.findElement(textBox).getText();
        switchToParentFrame();
        return text;
    }

    // Get Page Title
    public String getpageTitle() {
        return driver.findElement(pageTitle).getText();
    }


}
