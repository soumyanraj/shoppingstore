package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageClass.HomePage;
import pageClass.MyAccountPage;
import pageClass.SignInPage;

public class Myaccount extends BaseClass{
	
	
	HomePage hp;
	SignInPage sp;
	MyAccountPage ap;
	
	@Test
	public void MyAccount() {
		hp=PageFactory.initElements(driver, HomePage.class);
		sp=PageFactory.initElements(driver, SignInPage.class);
		hp.ClickSignIn();
		sp.dologin("info@automation.com", "password");
		ap=PageFactory.initElements(driver, MyAccountPage.class);
		String actual = driver.findElement(By.xpath("//span[contains(text(),'Order history and details')]")).getText();
		String expected = "ORDER HISTORY AND DETAILS";
		Assert.assertEquals(actual, expected);
		hp.ClickSignout();
		
	}
}

