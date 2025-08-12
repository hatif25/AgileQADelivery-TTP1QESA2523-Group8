package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pom.EmailSection;

public class CheckEmailDisplayed extends BaseClass {

    @Test
    public void verifyEmailVisibility() {
        EmailSection email = new EmailSection(driver);
        Assert.assertTrue(email.isEmailDisplayed());
    }
}
