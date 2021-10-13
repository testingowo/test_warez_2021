package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LecturesPage extends BasePage {

    @FindBy(css = "href = 'http://www.testwarez.pl/event/uruchamianie-testow-w-selenium-grid-przy-pomocy-dockera")
    WebElement dockerAgendaElement;

    public LecturesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnDockerAgendaElement() {
        dockerAgendaElement.click();
    }
}
