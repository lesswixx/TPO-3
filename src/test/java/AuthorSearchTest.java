import org.example.ConfProperties;
import org.example.pages.MainPage;
import org.example.pages.SearchAuthorPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AuthorSearchTest {

    public static WebDriver chromeDriver;
    public static MainPage mainPage;
    public static SearchAuthorPage searchAuthorPage;

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


    @DisplayName("Test search author and check albums")
    @Test
    public void testSearchAuthorAndCheckAlbums() {
        mainPage.getSearchInput().click();
        mainPage.getSearchInput().sendKeys("the beatles");
        mainPage.getSearchInput().sendKeys(Keys.ENTER);

        searchAuthorPage = new SearchAuthorPage(chromeDriver);
        searchAuthorPage.getShowAlbumsButton().click();
    }
}
