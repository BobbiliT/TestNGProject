package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegestrationPage1 {

	WebDriver driver;
	@FindBy(linkText="REGISTER")
	WebElement reg;
	@FindBy(name="firstName")
	WebElement firstname;
	@FindBy(name="lastName")
	WebElement lastname;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement postcode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement mail;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement repassword;
	@FindBy(name="submit")
	WebElement submit;
	
	RegestrationPage1(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void setclick() {
		reg.click();
	}
	public void setfirstname(String fname) {
		firstname.sendKeys(fname);
	}
	public void setlastname(String lname) {
		lastname.sendKeys(lname);
	}
	public void setphone(String phonen) {
		phone.sendKeys(phonen);
	}
	public void setmail(String email) {
		mail.sendKeys(email);
	}
	public void setaddress(String address1) {
		address.sendKeys(address1);
	}
	public void setcity(String cityname) {
		city.sendKeys(cityname);
	}
	public void setstate(String statename) {
		state.sendKeys(statename);
	}
	public void setpostcode(String pcode) {
		postcode.sendKeys(pcode);
	}
	public void setcountry(String countryname) {
		country.sendKeys(countryname);
	}
	public void setusername(String uname) {
		username.sendKeys(uname);
	}
	public void setpassword(String pass) {
		password.sendKeys(pass);
	}
	public void setrepassword(String repass) {
		repassword.sendKeys(repass);
	}
	public void submit() {
		submit.click();
	}
}
