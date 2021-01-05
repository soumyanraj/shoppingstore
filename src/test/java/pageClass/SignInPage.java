package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	
	@FindBy(id="email")
	public WebElement emailTxtbox;
	
	@FindBy(id="passwd")
	public WebElement passwordTxtbox;
	
	@FindBy(name="SubmitLogin")
	public WebElement submitbtn;
	

	public void dologin(String email, String password) {
		emailTxtbox.sendKeys(email);
		passwordTxtbox.sendKeys(password);
		submitbtn.click();
	}
	
}
