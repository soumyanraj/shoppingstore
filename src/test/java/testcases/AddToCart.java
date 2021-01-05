package testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageClass.CategoryPage;
import pageClass.ConfirmationPage;
import pageClass.HomePage;
import pageClass.ItemsListPage;
import pageClass.MyAccountPage;
import pageClass.Orderplaced;
import pageClass.PaymentPage;
import pageClass.ShippingPage;
import pageClass.SignInPage;



public class AddToCart extends BaseClass{
	
	
	//WebDriver driver;
	HomePage hp;
	SignInPage sp;
	MyAccountPage ap;
	CategoryPage cp;
	ConfirmationPage crp;
	ItemsListPage ip;
	PaymentPage pp;
	ShippingPage sgp;
	Orderplaced op;
	
	@Test
	public void MyAccount() throws Exception {
		hp=PageFactory.initElements(driver, HomePage.class);
		sp=PageFactory.initElements(driver, SignInPage.class);
		hp.ClickSignIn();
		sp.dologin("info@automation.com", "password");
		//click on T-shirts
		ap=PageFactory.initElements(driver, MyAccountPage.class);
		ap.Tshirts.click();
		//add to cart
		cp=PageFactory.initElements(driver, CategoryPage.class);
		cp.cart();
		cp.Next.click();
		ip=PageFactory.initElements(driver, ItemsListPage.class);
		String detail_page=driver.findElement(By.xpath("//span[@id='layer_cart_product_price']")).getText();
		String cart_page=driver.findElement(By.xpath(".//span[@class ='ajax_cart_total']")).getText();
		Assert.assertEquals(detail_page, cart_page);
		hp.ClickSignout();
	}
}

