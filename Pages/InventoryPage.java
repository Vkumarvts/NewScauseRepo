package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.ReadData;
import Utility.UtilityMethod;
import io.github.bonigarcia.wdm.online.GitHubApi;

public class InventoryPage extends TestBase {
	
	//TC1 Verify the visibility of small logo
	//TC2 Verify the visibility of big logo
	//TC3 Add 6 product in to cart
	//TC4 Remove 2 prosuct from cart
	//TC5 Verify the visibility of twitter logo
	//TC6 Verify the visibilty of fb logo
	//TC7 Verify the visibility of linkdin logo
	
	//object Repo
	@FindBy(xpath = "//div[@class='peek']") private WebElement SmallLogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement BigLogo;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement SorterDropdown;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement BackPackProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement BikeLightPoduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement TshirtBlackProduct16;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement JacketProduct50;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement TShirtProduct8;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement TshirtRedProduct16;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement ProductCoutICon;
	@FindBy(xpath = "//a[text()='Twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//a[text()='Facebook']") private WebElement FacebookLogo;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']") private WebElement RemoveBackPack;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']") private WebElement RemoveBikeLight;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement CartBtn;
	
	
	//constructor
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public boolean verifySmallLogo()
	{
	    return SmallLogo.isDisplayed();
	}
	public boolean verifyBigLogo()
	{
		return BigLogo.isDisplayed();
	}
	public void Add6Product() throws Exception 
	{
//		Select s = new Select(SorterDropdown);
//		s.selectByVisibleText(ReadData.readExcelFile(0,0));
		UtilityMethod.SelectClass(SorterDropdown, "Price (low to high)");
		BackPackProduct.click();
		BikeLightPoduct.click();
		TshirtBlackProduct16.click();
		TShirtProduct8.click();
		TshirtRedProduct16.click();
		JacketProduct50.click();
	    CartBtn.click();
		
	}
	//Remove 1 product
	public String Remove2Products()
	{
		BackPackProduct.click();
		BikeLightPoduct.click();
	    TshirtBlackProduct16.click();
	    TShirtProduct8.click();
	    
	//product 4 add and then 2 remove
		RemoveBackPack.click();
		RemoveBikeLight.click();
		String count = ProductCoutICon.getText();
		return count;
	}
	//Method To verify invetory url
	public String verifyInventoryUrl()
	{
		return driver.getCurrentUrl();
	}
	//verify TwitterLogo
	public boolean verifyTwitterLogo() 
	{
		return twitterLogo.isDisplayed();
	}
	
	//Verify FacebookLogo
	public boolean verifyFacebookLogo()
	{
		return FacebookLogo.isDisplayed();
	}
	

}

