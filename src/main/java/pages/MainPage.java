package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(css = ".w-icon-dropdown-toggle")
    WebElement dropDownToggle;

    @FindBy(css = "[href='/agenda-wyklady']")
    WebElement lectures;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnDropDown() {
        dropDownToggle.click();
    }

    public LecturesPage clickOnLecturesOption() {
        lectures.click();
        return new LecturesPage(driver);
    }
}
