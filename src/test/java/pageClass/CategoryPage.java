package pageClass;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Base.BaseClass;

public class CategoryPage extends BaseClass{
	
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
	public WebElement Women;

	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/span[1]/span[1]")
	public WebElement Instock;
	
	@FindBy(xpath="//img[contains(@title,'T-shirts')]")
	public WebElement shirt;
	
	@FindBy(xpath="//a[contains(@title,'Add to cart')]")
	public WebElement AddToCart;
	
	@FindBy(xpath="//div[@class='product-container']")
	public WebElement ProductContainer;
	
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]")
	public WebElement Next;
		
	public void cart() {
			if (Instock!=null){
				new Actions(driver).moveToElement(ProductContainer).perform();
					AddToCart.click();
				   }else{					   
				   System.out.println("not in stock");
				 }
	}

}
