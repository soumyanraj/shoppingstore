package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemsListPage {
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[1]/span[2]")
	public WebElement ShoppingCart;
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
	public WebElement NextPage;

}
