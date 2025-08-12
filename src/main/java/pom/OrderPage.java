package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {
    WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='order']")
    private WebElement orderLink;

    @FindBy(xpath = "//select[@id='delivery_area']")
    private WebElement deliveryAreaDropdown;

    public void clickOrderLink() {
        orderLink.click();
    }

    public void selectDeliveryArea(String area) {
        Select dropdown = new Select(deliveryAreaDropdown);
        dropdown.selectByVisibleText(area);
    }

    public boolean isDropdownDisplayed() {
        return deliveryAreaDropdown.isDisplayed();
    }
}
