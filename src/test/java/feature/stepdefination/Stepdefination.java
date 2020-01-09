package feature.stepdefination;

     import java.time.Clock;

import org.resouces.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import repository.Book_hotel;
import repository.Booking_confrm;
import repository.Search_hotel;
import repository.Select_hotel;
import repository.login;

public class Stepdefination extends Base{
	login p1 = new login();
	Search_hotel p2 = new Search_hotel();
	Book_hotel p3 = new Book_hotel();
	Booking_confrm p4 = new Booking_confrm();
	Select_hotel p5 = new Select_hotel();

@Given("open the user & enter the username & password &login")
public void open_the_user_enter_the_username_password_login() throws Exception {
	url("https://www.adactin.com/HotelAppBuild2/index.php");
	fill(p1.getUser(),readValues().get(0).get("username"));
	fill(p1.getPass(),readValues().get(1).get("password"));
	click(p1.getLogin());
}

@When("enter user into home page & search the hotels with your choices")
public void enter_user_into_home_page_search_the_hotels_with_your_choices() {
selecting(p2.getLoc(),"Sydney");
selecting(p2.getHot(),"Hotel Creek");
selecting(p2.getRoom(),"Double");
selecting(p2.getNumber(),"2 - Two");
selecting(p2.getAdult(),"3 - Three");
selecting(p2.getChild(),"2 - Two");
click(p2.getSubmit());

}

@When("select the preferances and click and continue")
public void select_the_preferances_and_click_and_continue() {
	click(p5.getRadio());
	click(p5.getEnter());
}
@When("enter the address & pay the amount & click book now")
public void enter_the_address_pay_the_amount_click_book_now() throws Exception {
	fill(p3.getFirst(), readValues().get(2).get("firstname"));
	fill(p3.getLast(),readValues().get(3).get("lastname"));
	fill(p3.getAddress(),readValues().get(4).get("address"));
	fill(p3.getNum(),readValues().get(5).get("cardnum"));
	selecting(p3.getType(),"American Express");
	selecting(p3.getMonth(),"February");
	selecting(p3.getYear(),"2015");
	fill(p3.getCvv(),readValues().get(6).get("cvv"));
	click(p3.getBook());
	Thread.sleep(8000);

}

@Then("successfully completed your booking & logout")
public void successfully_completed_your_booking_logout() {
	click(p4.getOut());
}
}
