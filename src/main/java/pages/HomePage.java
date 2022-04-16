package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    private By javascriptAlert = new By.ByCssSelector("a[href='/javascript_alerts']");
    private By checkboxPage = new By.ByCssSelector("a[href='/checkboxes']");
    private By dropdown = new By.ByCssSelector("a[href='/dropdown']");
    private By hoversPage = new By.ByCssSelector("a[href='/hovers']");
    private By keyPressLink = new By.ByCssSelector("a[href='/key_presses']");
    private By entryAd = new By.ByCssSelector("a[href='/entry_ad']");
    private By fileUploadPageLink = new By.ByCssSelector("a[href='/upload']");
    private By WYSIWYGPageLink = new By.ByCssSelector("a[href='/tinymce']");
    private By dynamicLink = new By.ByCssSelector("a[href='/dynamic_loading']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Go to Javascript Alert Page
    public JavascriptAlertPage goToJavascriptAlert() {
        driver.findElement(javascriptAlert).click();
        return new JavascriptAlertPage(driver);
    }

    // Go to Checkboxes Page
    public CheckboxPage goToCheckboxPage() {
        driver.findElement(checkboxPage).click();
        return new CheckboxPage(driver);
    }

    // Go to Dropdown Page
    public DropdownPage goToDropdownPage() {
        driver.findElement(dropdown).click();
        return new DropdownPage(driver);
    }

    // Go to Hovers Page
    public HoversPage goToHoversPage() {
        driver.findElement(hoversPage).click();
        return new HoversPage(driver);
    }

    //Go to KeyPress Page
    public KeyPressPage goToKeyPressPage() {
        driver.findElement(keyPressLink).click();
        return new KeyPressPage(driver);
    }

    //Go to Entry Ad Page
    public EntryAdPage goToEntryAdPage() {
        driver.findElement(entryAd).click();
        return new EntryAdPage(driver);
    }

    //Go to File Upload Page Link
    public FileUploadPage goToFileUploadPage() {
        driver.findElement(fileUploadPageLink).click();
        return new FileUploadPage(driver);
    }

    //Go to WYSIWYG Editor Page Link
    public WYSIWYGEditorPage goToWYSIWYGEditorPage() {
        driver.findElement(WYSIWYGPageLink).click();
        return new WYSIWYGEditorPage(driver);
    }

    // Go to Dynamic Loading Page
    public DynamicLoadingPage goToDynamicPage() {
        driver.findElement(dynamicLink).click();
        return new DynamicLoadingPage(driver);
    }


    public String getTitle() {
        return driver.getTitle();
    }

}
