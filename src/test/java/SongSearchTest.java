import org.example.ConfProperties;
import org.example.pages.MainPage;
import org.example.pages.SearchSongPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.*;

public class SongSearchTest {

    public static WebDriver chromeDriver;
    public static MainPage mainPage;
    public static SearchSongPage searchSongPage;

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


    @DisplayName("Test search song and play")
    @Test
    public void testSearchSong() {
        mainPage.getSearchInput().click();
        mainPage.getSearchInput().sendKeys("yesterday");
        mainPage.getSearchInput().sendKeys(Keys.ENTER);

        searchSongPage = new SearchSongPage(chromeDriver);
        searchSongPage.getChooseTracksCategory().click();
    }
}
