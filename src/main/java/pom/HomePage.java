package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='homepage']")
    private WebElement homeLink;

    @FindBy(xpath = "//a[normalize-space()='Order Online Now']")
    private WebElement orderOnlineNow;

    public void clickHomeLink() {
        homeLink.click();
    }

    public boolean isOrderOnlineNowDisplayed() {
        return orderOnlineNow.isDisplayed();
    }
}
