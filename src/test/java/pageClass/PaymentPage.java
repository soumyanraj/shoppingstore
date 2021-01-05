package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	@FindBy(xpath="//span[contains(text(),'Your payment method')]")
	public WebElement YourPayment;
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")
	public WebElement Payment;
}
