package scripts;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.OrdersDropdown;

public class CheckingOrdersDrpDwn extends BaseClass {
	
	@Test
	public void checkingDrpDwn() {
		OrdersDropdown orders = new OrdersDropdown(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		orders.clickOrdersBtn();
		Assert.assertTrue(orders.foodDrpDwnDisplayed());
		Assert.assertTrue(orders.spclDrpDwnDisplayed());
		Assert.assertTrue(orders.areaDrpDwnDisplayed());
		Assert.assertTrue(orders.deliveryTypeDrpDwnDisplayed());
	}
	

}
