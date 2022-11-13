package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
	
	//TC1 verify cart title
	//TC2 verify description text
	//TC3 verify checkoutBtn
	//TC4 verify cart url
	@FindBy(xpath = "//span[@class='title']") private WebElement CartTitle;
	@FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement DescriptionText;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement CheckOutBtn;
	//@FindBy(xpath = "//span[@class='title']") private WebElement CargTitle;
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCartTitle()
	{
		return CartTitle.getText();
	}
	
	public String verifyDescriptiontext()
	{
		return DescriptionText.getText();
	}
	
	public boolean verifyCheckOutBtn()
	{
		return CheckOutBtn.isDisplayed();
	}
	
	public void CheckOutBtnClick()
	{
		CheckOutBtn.click();
	}
	
	public String verifyCartUrl()
	{
		return driver.getCurrentUrl();
	}
	
}
