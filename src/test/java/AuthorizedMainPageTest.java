import org.example.ConfProperties;
import org.example.pages.LibraryPage;
import org.example.pages.MainPage;
import org.example.pages.PlaylistPage;
import org.example.pages.SignInPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AuthorizedMainPageTest {

    public static SignInPage signInPage;
    public static WebDriver chromeDriver;
    public static MainPage mainPage;
    public static LibraryPage libraryPage;
    public static PlaylistPage playlistPage;

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

    @BeforeEach
    public void setAuthPage() {
        chromeDriver.get(ConfProperties.getProperty("mainpage"));
        mainPage.getSignInButton().click();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signInPage = new SignInPage(chromeDriver);
        signInPage.getEmailInputField().click();
        signInPage.getEmailInputField().sendKeys(ConfProperties.getProperty("auth_email"));
        signInPage.getIdentifierNextButton().click();
        signInPage.getPasswordInputField().sendKeys(ConfProperties.getProperty("auth_password"));
        signInPage.getPasswordNextButton().click();
    }

    @DisplayName("like test")
    @Test
    public void likeTest() {
        if (mainPage.getPlayAllButton().getText().equals("Play all")) {
            mainPage.getPlayAllButton().click();
            mainPage.getLikeButton().click();

        } else {
            mainPage.getPlayAllButton().click();
            mainPage.getPlayFirstSongFromSinglesAndAlbums().click();
            mainPage.getLikeButton().click();
        }
    }

    @DisplayName("dislike test")
    @Test
    public void dislikeTest() {
        if (mainPage.getPlayAllButton().getText().equals("Play all")) {
            mainPage.getPlayAllButton().click();
            mainPage.getDislikeButton().click();

        } else {
            mainPage.getPlayAllButton().click();
            mainPage.getPlayFirstSongFromSinglesAndAlbums().click();
            mainPage.getDislikeButton().click();
        }
    }

    @DisplayName("Go to library and check liked")
    @Test
    public void goToLibraryAndCheckLikedTest() {
        mainPage.getLibraryButton().click();
        libraryPage = new LibraryPage(chromeDriver);

        libraryPage.getCheckLikedSongs().click();
    }

    @DisplayName("create playlist test and add song")
    @Test
    public void createPlaylistTest() {
        mainPage.getStartCreatePlaylistButton().click();
        mainPage.getInputPlaylistNameField().click();
        mainPage.getInputPlaylistNameField().sendKeys("test");
        mainPage.getChoosePrivacyButton().click();
        mainPage.getChoosePrivate().click();
        mainPage.getFinalCreatePlaylistButton().click();

        playlistPage = new PlaylistPage(chromeDriver);

        playlistPage.getAddSongToPlaylistButton().click();

    }

    @DisplayName("go to explore page")
    @Test
    public void goToExplorePageTest() {
        mainPage.getExploreButton().click();
    }


}
