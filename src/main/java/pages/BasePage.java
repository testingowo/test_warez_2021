package pages;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class BasePage {
    public WebDriver driver;

    @FindBy(css = "[class *= 'sub-menu-item'] >  a")
    private List<WebElement> subMenuItems;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToPage(String pageAddress) {
        driver.navigate().to(pageAddress);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
}
