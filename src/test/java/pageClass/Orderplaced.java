package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orderplaced {

	@FindBy(xpath="//h1[contains(text(),'Order confirmation')]")
	public WebElement OrderConfirmation;
	
		
}
