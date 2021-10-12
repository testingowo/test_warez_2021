import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.MainPage;

import java.net.MalformedURLException;
import java.net.URL;

public class testWarez {

    protected WebDriver driver;
    protected MainPage mainPage;
    protected DesiredCapabilities desiredCapabilities = null;
//    protected ChromeOptions desiredCapabilities = null;

    @BeforeEach
    public void navigateToMainPage() throws MalformedURLException {
        desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability("--no-sandbox", true);
        System.out.println("Desired capabilities"+ desiredCapabilities);
        desiredCapabilities.setCapability("version", "");
        desiredCapabilities.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
//        mainPage.navigateToPage(pageName);
    }

    @Test
    public void testSomething() {
        System.out.println("Test something");
    }
}
