package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HoversPage {
    WebDriver driver;
    private By figure = new By.ByCssSelector("div.figure");
    private By figCaption = new By.ByCssSelector("div.figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    //Selenium has a special class known as action.

    public FigureCaption hoverByUsingFigure(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElements(figure).get(index)).perform();
        return new FigureCaption(driver.findElements(figure).get(index).findElement(figCaption));
    }

    public class FigureCaption {
        WebElement caption;
        private By name = new By.ByTagName("h5");
        private By link = new By.ByTagName("a");

        public FigureCaption(WebElement figcap) {
            this.caption = figcap;
        }

        //Getting the caption text
        public String getName() {
            return caption.findElement(name).getText();
        }

        //Getting the URL
        public String getURL() {
            return caption.findElement(link).getAttribute("href");
        }

        //Getting the link text
        public String getLinkText() {
            return caption.findElement(link).getText();
        }

        public boolean displayed() {
            return caption.isDisplayed();
        }

    }


}
