package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaylistPage {

    public WebDriver webDriver;

    @FindBy(xpath = "//*[@id=\"contents\"]/ytmusic-responsive-list-item-renderer[1]/div[3]/yt-button-renderer/yt-button-shape")
    private WebElement addSongToPlaylistButton;

    public PlaylistPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public WebElement getAddSongToPlaylistButton() {
        return addSongToPlaylistButton;
    }
}
