package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pom.OrderPage;

public class SelectDeliveryAreaTest extends BaseClass {

    @Test
    public void verifyDeliveryAreaDropdown() {
        OrderPage order = new OrderPage(driver);
        order.clickOrderLink();
        Assert.assertTrue(order.isDropdownDisplayed());
        order.selectDeliveryArea("Adyar");
    }
}
