package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersDropdown {

	WebDriver driver;
	
	public  OrdersDropdown(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"order\"]")
	private WebElement ordersBtn;
	
	@FindBy(xpath="//*[@id=\"food_item\"]")
	private WebElement foodDrpDwn;
	
	@FindBy(xpath="//*[@id=\"special_item\"] ")
	private WebElement spclDrpDwn;
	
	@FindBy(xpath="//*[@id=\"delivery_area\"] ")
	private WebElement areaDrpDwn;
	
	@FindBy(xpath="//*[@id=\"delivery_type\"]")
	private WebElement deliveryTypeDrpDwn;
	
	public void clickOrdersBtn() {
		ordersBtn.click();
	}
	public boolean foodDrpDwnDisplayed() {
		return foodDrpDwn.isDisplayed();
	}
	public boolean spclDrpDwnDisplayed() {
		return spclDrpDwn.isDisplayed();
	}
	public boolean areaDrpDwnDisplayed() {
		return areaDrpDwn.isDisplayed();
	}
	public boolean deliveryTypeDrpDwnDisplayed() {
		return deliveryTypeDrpDwn.isDisplayed();
	}
	
	
}
