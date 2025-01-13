package HybrdenFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pompage {

	@FindBy(id="email")
	private WebElement unTB;
	@FindBy(id="pass")
	private WebElement pnTB;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement click;
	
	pompage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void SetUsername(String un) {
		unTB.sendKeys(un);
	}
	
	public void SetPassword(String pn) {
		pnTB.sendKeys(pn);
	}
	
	public void clicklogin() {
		click.click();
	}
}
