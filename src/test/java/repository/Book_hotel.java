package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import feature.stepdefination.Hooks;

public class Book_hotel {
	public Book_hotel() {
		PageFactory.initElements(Hooks.driver,this);
	}
	@FindBy(id="first_name")
	private WebElement first;
	@FindBy(id="last_name")
	private WebElement last;
	@FindBy(id="address")
	private WebElement address;
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getNum() {
		return num;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	@FindBy(id="cc_num")
	private WebElement num;
	@FindBy(id="cc_type")
	private WebElement type;
	@FindBy(id="cc_exp_month")
	private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;

}
