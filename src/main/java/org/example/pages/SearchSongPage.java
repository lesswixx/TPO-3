package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchSongPage {

    public WebDriver webDriver;

    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-app-layout/div[4]/ytmusic-search-page/ytmusic-tabbed-search-results-renderer/div[2]/ytmusic-section-list-renderer/div[1]/ytmusic-chip-cloud-renderer/iron-selector/ytmusic-chip-cloud-chip-renderer[1]/div/a/yt-formatted-string")
    private WebElement chooseTracksCategory;

    @FindBy(xpath = "//*[@id=\"contents\"]/ytmusic-responsive-list-item-renderer[1]")
    private WebElement playFoundSong;

    @FindBy(xpath = "//*[@id=\"contents\"]/ytmusic-responsive-list-item-renderer[1]/div[2]/div[3]/yt-formatted-string[1]/a[1]")
    private WebElement checkAuthor;

    @FindBy(xpath = "//*[@id=\"contents\"]/ytmusic-shelf-renderer/div[1]/h2/yt-formatted-string")
    private WebElement header;


    public SearchSongPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public WebElement getCheckAuthor() {
        return checkAuthor;
    }

    public WebElement getPlayFoundSong() {
        return playFoundSong;
    }

    public WebElement getChooseTracksCategory() {
        return chooseTracksCategory;
    }

    public WebElement getHeader() {
        return header;
    }
}
