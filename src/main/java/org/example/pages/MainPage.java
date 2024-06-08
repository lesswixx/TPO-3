package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "//div[@id='right-content']/a")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-guide-entry-renderer[2]/tp-yt-paper-item/yt-icon")
    private WebElement exploreButton;

    @FindBy(xpath = "//*[@id=\"icon\"]/img")
    private WebElement profileButton;

    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-popup-container/tp-yt-iron-dropdown/div/ytd-multi-page-menu-renderer/div[2]/ytd-active-account-header-renderer/div/yt-formatted-string[1]")
    private WebElement profileName;

    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-search-box/div/div[1]/input")
    private WebElement searchInput;

    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-app-layout/div[4]/ytmusic-browse-response/div[2]/div[4]/ytmusic-section-list-renderer/div[2]/ytmusic-carousel-shelf-renderer[1]/div/div/ytmusic-carousel-shelf-basic-header-renderer/h2/div/div/div[3]/yt-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")
    private WebElement getSongsFromRecommendations;

    @FindBy(xpath = "//*[@id=\"more-content-button\"]/yt-button-renderer/yt-button-shape/button\n")
    private WebElement playAllButton;

    @FindBy(xpath = "    /html/body/ytmusic-app/ytmusic-app-layout/div[5]/ytmusic-browse-response/div[2]/div[4]/ytmusic-section-list-renderer/div[2]/ytmusic-grid-renderer/div[2]/ytmusic-two-row-item-renderer[1]/a/ytmusic-item-thumbnail-overlay-renderer/div/ytmusic-play-button-renderer/div\n")
    private WebElement playFirstSongFromSinglesAndAlbums;

    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-player-bar/div[2]/div[3]/ytmusic-like-button-renderer/yt-button-shape[2]")
    private WebElement likeButton;

    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-player-bar/div[2]/div[3]/ytmusic-like-button-renderer/yt-button-shape[1]\n")
    private WebElement dislikeButton;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-guide-entry-renderer[3]/tp-yt-paper-item/div")
    private WebElement libraryButton;

    @FindBy(xpath = "//*[@id=\"buttons\"]/yt-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div\n")
    private WebElement StartCreatePlaylistButton;

    @FindBy(xpath = "//*[@id=\"input-2\"]/input\n")
    private WebElement inputPlaylistNameField;

    @FindBy(xpath = "//*[@id=\"input-3\"]\n")
    private WebElement choosePrivacyButton;

    @FindBy(xpath = "//*[@id=\"dropdown-items\"]/ytmusic-dropdown-item-renderer[3]/tp-yt-paper-item\n")
    private WebElement choosePrivate;

    @FindBy(xpath = "//*[@id=\"general-pane\"]/div[2]/yt-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div\n")
    private WebElement finalCreatePlaylistButton;

    public WebDriver webDriver;

    public MainPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getExploreButton() {
        return exploreButton;
    }

    public WebElement getLibraryButton() {
        return libraryButton;
    }

    public WebElement getProfileButton() {
        return profileButton;
    }

    public WebElement getProfileName() {
        return profileName;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSongsFromRecommendations() {
        return getSongsFromRecommendations;
    }

    public WebElement getPlayAllButton() {
        return playAllButton;
    }

    public WebElement getLikeButton() {
        return likeButton;
    }

    public WebElement getDislikeButton() {
        return dislikeButton;
    }

    public WebElement getPlayFirstSongFromSinglesAndAlbums() {
        return getSongsFromRecommendations;
    }

    public WebElement getFinalCreatePlaylistButton() {
        return finalCreatePlaylistButton;
    }

    public WebElement getChoosePrivate() {
        return choosePrivate;
    }

    public WebElement getChoosePrivacyButton() {
        return choosePrivacyButton;
    }

    public WebElement getInputPlaylistNameField() {
        return inputPlaylistNameField;
    }

    public WebElement getStartCreatePlaylistButton() {
        return StartCreatePlaylistButton;
    }

    public WebElement getGetSongsFromRecommendations() {
        return getSongsFromRecommendations;
    }
}
