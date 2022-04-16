package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    private By chooseFileInput = new By.ById("file-upload");
    private By uploadButton = new By.ById("file-submit");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String absoluteAddress) {
        driver.findElement(chooseFileInput).sendKeys(absoluteAddress);
        driver.findElement(uploadButton).click();

    }

}
