package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegestrationPage2 {

	WebDriver driver;
	
	By reg = By.linkText("REGISTER");
	By firstname = By.name("firstName");
	By lastname = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address1 = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By postcode = By.name("postalCode");
	By country = By.name("country");
	By username = By.name("email");
	By password = By.name("password");
	By repassword = By.name("confirmPassword");
	By submit = By.name("submit");
	
	RegestrationPage2(WebDriver d){
		driver=d;
	}
	public void setclick() {
		driver.findElement(reg).click();
	}
	public void setfirstname(String fname) {
		driver.findElement(firstname).sendKeys(fname);
	}
	public void setlastname(String lname) {
		driver.findElement(lastname).sendKeys(lname);
	}
	public void setphone(String phonen) {
		driver.findElement(phone).sendKeys(phonen);
	}
	public void setmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	public void setaddress(String address) {
		driver.findElement(address1).sendKeys(address);
	}
	public void setcity(String cityname) {
		driver.findElement(city).sendKeys(cityname);
	}
	public void setstate(String statename) {
		driver.findElement(state).sendKeys(statename);
	}
	public void setpostcode(String pcode) {
		driver.findElement(postcode).sendKeys(pcode);
	}
	public void setcountry(String countryname) {
		driver.findElement(country).sendKeys(countryname);
	}
	public void setusername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void setpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void setrepassword(String repass) {
		driver.findElement(repassword).sendKeys(repass);
	}
	public void submit() {
		driver.findElement(submit).click();
	}
}
