package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class CheckOutPage extends TestBase {
	
	
	//TC1  verify ckeckout title
	//TC2  verify Fill FLCodeName Fill
	//input[@id='last-name']   lastname
	//input[@id='postal-code']  code
	@FindBy(xpath = "//span[@class='title']") private WebElement CheckOutTitle;
	@FindBy(xpath = "//input[@id='first-name']") private WebElement firstNameTextbox;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement lastNameTextbox;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement postalCodeTexbox;
	@FindBy(xpath = "//input[@id='continue']") private WebElement ContinueBtn;
	
	public CheckOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCheckOutTitle()
	{
		return CheckOutTitle.getText();
	}
	
	public void fillFLName() throws Exception
	{
		firstNameTextbox.sendKeys(ReadData.ReadPropertyFile("FN"));
		lastNameTextbox.sendKeys(ReadData.ReadPropertyFile("LN"));
		postalCodeTexbox.sendKeys(ReadData.ReadPropertyFile("PC"));
		ContinueBtn.click();
	}
	
	public boolean verifyContinueBtn()
	{
		return ContinueBtn.isDisplayed();
	}
	
	
	
}
