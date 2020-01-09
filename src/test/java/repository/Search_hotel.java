package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import feature.stepdefination.Hooks;

public class Search_hotel {
public Search_hotel() {
	PageFactory.initElements(Hooks.driver,this);
}
@FindBy(id="location")
private WebElement loc;
@FindBy(id="hotels")
private WebElement hot;
@FindBy(id="room_type")
private WebElement room;
@FindBy(id="room_nos")
private WebElement number;
@FindBy(id="adult_room")
private WebElement adult;
@FindBy(id="child_room")
private WebElement child;
@FindBy(id="Submit")
private WebElement submit;
public WebElement getLoc() {
	return loc;
}
public WebElement getHot() {
	return hot;
}
public WebElement getRoom() {
	return room;
}
public WebElement getNumber() {
	return number;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild() {
	return child;
}
public WebElement getSubmit() {
	return submit;
}
}