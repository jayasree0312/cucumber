package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import feature.stepdefination.Hooks;

public class Booking_confrm {
public Booking_confrm() {
	PageFactory.initElements(Hooks.driver,this);
	
}
@FindBy(id="logout")
private WebElement out;
public WebElement getOut() {
	return out;
}
}
