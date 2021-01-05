package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageClass.AddressPage;
import pageClass.CategoryPage;
import pageClass.ConfirmationPage;
import pageClass.HomePage;
import pageClass.ItemsListPage;
import pageClass.MyAccountPage;
import pageClass.Orderplaced;
import pageClass.PaymentPage;
import pageClass.ShippingPage;
import pageClass.SignInPage;


public class OrderComplete extends BaseClass{

			HomePage hp;
			SignInPage sp;
			MyAccountPage ap;
			CategoryPage cp;
			AddressPage adp;
			ItemsListPage ip;
			PaymentPage pp;
			ShippingPage sgp;
			ConfirmationPage crp;
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
				//items list
				ip=PageFactory.initElements(driver, ItemsListPage.class);
				ip.NextPage.click();
				//Address page
				adp=PageFactory.initElements(driver, AddressPage.class);
				adp.Continue.click();
				sgp=PageFactory.initElements(driver, ShippingPage.class);
				sgp.TermsCondtions.click();
				sgp.Confirm.click();
				pp=PageFactory.initElements(driver, PaymentPage.class);
				pp.Payment.click();
				crp=PageFactory.initElements(driver, ConfirmationPage.class);
				crp.ConfirmOrder.click();
				op=PageFactory.initElements(driver, Orderplaced.class);

		//get alert mssg
		String S = driver.findElement(By.xpath("//p[contains(text(),'Your order on My Store is complete.')]")).getText();
		System.out.println("" + S);
		//screenshot
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Screenshots\\screencapture.jpg"));
		hp.ClickSignout();
		
	}

}
