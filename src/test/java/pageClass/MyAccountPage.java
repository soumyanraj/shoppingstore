package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
	
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	public WebElement Dresses;
	
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	public WebElement Tshirts;
	
}

