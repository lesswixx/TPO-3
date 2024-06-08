package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAuthorPage {

    public WebDriver webDriver;


    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-app-layout/div[4]/ytmusic-search-page/ytmusic-tabbed-search-results-renderer/div[2]/ytmusic-section-list-renderer/div[2]/ytmusic-shelf-renderer[1]/div[6]/a/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")
    private WebElement showAlbumsButton;

    @FindBy(xpath = "/html/body/ytmusic-app/ytmusic-app-layout/div[4]/ytmusic-search-page/ytmusic-tabbed-search-results-renderer/div[2]/ytmusic-section-list-renderer/div[2]/ytmusic-shelf-renderer/div[1]/h2/yt-formatted-string")
    private WebElement albumsHeader;

    public SearchAuthorPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public WebElement getShowAlbumsButton() {
        return showAlbumsButton;
    }

    public WebElement getAlbumsHeader() {
        return albumsHeader;
    }
}
