package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage {

	@FindBy(xpath="//h1[contains(text(),'Shipping')]")
	public WebElement Shipping;
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
	public WebElement Confirm;
	
	@FindBy(xpath="//div[@id='uniform-cgv']")
	public WebElement TermsCondtions;
	
}
