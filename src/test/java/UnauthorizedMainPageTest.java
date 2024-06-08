import org.example.ConfProperties;
import org.example.pages.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class UnauthorizedMainPageTest {

    public static WebDriver chromeDriver;
    public static MainPage mainPage;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.get(ConfProperties.getProperty("mainpage"));
        mainPage = new MainPage(chromeDriver);
    }

//    @AfterAll
//    public static void close() {
//        chromeDriver.close();
//    }

    @DisplayName("listen first track from recommendations")
    @Test
    public void listenFirstTrackFromRecommendations() {

        mainPage.getSongsFromRecommendations().click();

    }
}
