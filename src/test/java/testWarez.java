import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.MainPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class testWarez {

    protected WebDriver driver;
    protected MainPage mainPage;
    protected DesiredCapabilities desiredCapabilities = null;
//    protected ChromeOptions desiredCapabilities = null;

    @BeforeEach
    public void navigateToMainPage() throws MalformedURLException {
        //DOCKER SELENIUM GRID
//        desiredCapabilities = DesiredCapabilities.chrome();
//        desiredCapabilities.setCapability("--no-sandbox", true);
//        System.out.println("Desired capabilities"+ desiredCapabilities);
//        desiredCapabilities.setCapability("version", "");
//        desiredCapabilities.setPlatform(Platform.LINUX);
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
//        driver.manage().window().maximize();
//        mainPage = new MainPage(driver);
//        mainPage.navigateToPage(pageName);
        //OLD
        WebDriverManager.chromedriver().ignoreVersions("95", "94", "93");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testSomething() {
        System.out.println("Test something");
        driver.get("https://www.testwarez.pl/");
        System.out.println(driver.getCurrentUrl());
        List<WebElement> list = driver.findElements(By.tagName("div"));

        for (WebElement el : list) {
            System.out.println(el.getText());
        }
    }
}
