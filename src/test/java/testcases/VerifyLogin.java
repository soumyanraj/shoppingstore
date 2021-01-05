package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageClass.HomePage;
import pageClass.MyAccountPage;
import pageClass.SignInPage;


public class VerifyLogin extends BaseClass {
	
	
	HomePage hp;
	SignInPage sp;
	MyAccountPage ap;


	@Test
	public void verifyLogin() {
		
		hp=PageFactory.initElements(driver, HomePage.class);
		sp=PageFactory.initElements(driver, SignInPage.class);
				
		//clicking on sign in button on home page
		hp.ClickSignIn();
			
		sp.dologin("info@automation.com", "password");
		app_logs.info("verify login successful");
		
		hp.ClickSignout();
	}

}
