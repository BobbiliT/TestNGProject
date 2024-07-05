package HybrdenFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logindetails {

	@FindBy(id="email")
	WebElement unTB;
	@FindBy(id="pass")
	WebElement psTB;
	@FindBy(xpath="//button[text()='Log in']")
	WebElement login;
	
	public logindetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Setusername(String un) {
		unTB.sendKeys(un);
	}
	public void Setpassword(String pn) {
		psTB.sendKeys(pn);
	}
	public void click() {
		login.click();
	}
}
