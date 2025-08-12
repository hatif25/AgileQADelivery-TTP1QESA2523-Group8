package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pom.HomePage;

public class CheckOrderOnlineNow extends BaseClass {

    @Test
    public void verifyOrderOnlineNowText() {
        HomePage home = new HomePage(driver);
        home.clickHomeLink();
        Assert.assertTrue(home.isOrderOnlineNowDisplayed());
    }
}
