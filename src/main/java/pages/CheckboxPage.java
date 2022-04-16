package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {
    WebDriver driver;

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    private By checkBox1 = new By.ByCssSelector("#checkboxes > input[type=checkbox]:nth-child(1)");
    private By checkBox2 = new By.ByCssSelector("input:nth-child(3)");

    public void selectCheckBox1() {
        if (driver.findElement(checkBox1).getAttribute("checked") == null) {
            System.out.println("checkbox is unchecked.");
            driver.findElement(checkBox1).click();
        } else
            System.out.println("Checkbox is already checked");
    }

    public void selectCheckBox2() {
        if (driver.findElement(checkBox2).getAttribute("checked") == null) {
            System.out.println("checkbox is unchecked.");
            driver.findElement(checkBox2).click();
        } else
            System.out.println("Checkbox is already checked");

    }


}
