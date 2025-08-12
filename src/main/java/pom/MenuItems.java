package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuItems {

    WebDriver driver;

    // Constructor
    public MenuItems(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



	@FindBy(xpath = "//a[@id='v-pills-home-tab']")
    private WebElement menuCategoriesAll;

    @FindBy(xpath = "//a[@id='v-pills-profile-tab']")
    private WebElement menuCategoriesItem1;

    @FindBy(xpath = "//a[@id='v-pills-messages-tab']")
    private WebElement menuCategoriesItem2;

   
    public boolean isMenuCategoriesAllDisplayed() {
        return menuCategoriesAll.isDisplayed();
    }

    public boolean isMenuCategoriesItem1Displayed() {
        return menuCategoriesItem1.isDisplayed();
    }

    public boolean isMenuCategoriesItem2Displayed() {
        return menuCategoriesItem2.isDisplayed();
    }
    public WebElement getMenuCategoriesAll() {
        return menuCategoriesAll;
    }

    public WebElement getMenuCategoriesItem1() {
        return menuCategoriesItem1;
    }

    public WebElement getMenuCategoriesItem2() {
        return menuCategoriesItem2;
    }

}
