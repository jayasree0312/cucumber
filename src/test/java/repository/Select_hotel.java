package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import feature.stepdefination.Hooks;

public class Select_hotel {
public Select_hotel() {
	PageFactory.initElements(Hooks.driver,this);
}
@FindBy(id="radiobutton_0")
private WebElement radio;
public WebElement getRadio() {
	return radio;
}
public WebElement getEnter() {
	return enter;
}
@FindBy(id="continue")
private WebElement enter;
}
