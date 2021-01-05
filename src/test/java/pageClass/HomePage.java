package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage{
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement SignInbtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	public WebElement SignOutbtn;
	
	public void ClickSignIn() {
		SignInbtn.click();
	}
	
	public void ClickSignout() {
		SignOutbtn.click();
		
	}

}