package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class itemDetails {
    WebDriver driver;

    public itemDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='v-pills-home']/div/div[1]/div/img")
    private WebElement allItemsmg;

    @FindBy(xpath = "//*[@id='v-pills-profile']/div/div[1]/div/img")
    private WebElement item1smg;

    @FindBy(xpath = "//*[@id='v-pills-messages']/div/div[1]/div/img")
    private WebElement item2smg;

    @FindBy(xpath = "//*[@id=\"specialdrink\"]")
    private WebElement allDetail;

    @FindBy(xpath = "//*[@id=\"specialdrin2\"]/p")
    private WebElement item1Detail;

    @FindBy(xpath = "//*[@id=\"specialsweets1\"]/p")
    private WebElement item2Detail;

    public WebElement getAllItemsmg() {
        return allItemsmg;
    }

    public WebElement getItem1smg() {
        return item1smg;
    }

    public WebElement getItem2smg() {
        return item2smg;
    }

    public WebElement getAllDetail() {
        return allDetail;
    }

    public WebElement getItem1Detail() {
        return item1Detail;
    }

    public WebElement getItem2Detail() {
        return item2Detail;
    }
}
