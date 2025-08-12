package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pom.ReservationPage;

public class CheckDatePicker extends BaseClass {

    @Test
    public void verifyDatePicker() {
        ReservationPage reserve = new ReservationPage(driver);
        reserve.clickReservation();
        Assert.assertTrue(reserve.isDatePickerDisplayed());
    }
}
