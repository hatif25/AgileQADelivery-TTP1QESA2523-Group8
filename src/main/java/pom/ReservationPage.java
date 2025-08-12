package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationPage {
    WebDriver driver;

    public ReservationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Reservation']")
    private WebElement reservationLink;

    @FindBy(xpath = "//input[@id='date']")
    private WebElement datePicker;

    public void clickReservation() {
        reservationLink.click();
    }

    public boolean isDatePickerDisplayed() {
        return datePicker.isDisplayed();
    }
}
