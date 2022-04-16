package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    private By example1Link = new By.ByLinkText("Example 1: Element on page that is hidden");
    private By example2Link = new By.ByLinkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page goToExample1() {
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }


}
