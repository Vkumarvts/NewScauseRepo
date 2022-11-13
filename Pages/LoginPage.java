package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	
	//TC1 verify App Title
	//Tc2 verify App Url
	//TC3 verify visiblity of Login Logo
	//TC4 verify visibilty of bot Logo
	//TC5 Login To App
	//TC6 Verify the Url of Second Page (Inventory Page)
	//Object Repository
	@FindBy(xpath="//div[@class='login_logo']")private WebElement swagLogo;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement bigLogo;
	@FindBy(xpath="//input[@id='user-name']")private WebElement UsernameTextbox;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordTextbox;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	@FindBy(xpath="//span[@class='title']")private WebElement productLabel;
	
	
	//Costructor to initialize the element of page/current class using this 
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public String verifyProductlabel()
	{
		return productLabel.getText();
	}
	//Method to application login
	public void loginApp1() throws Exception
	{
		UsernameTextbox.sendKeys(ReadData.ReadPropertyFile("Username"));
		passwordTextbox.sendKeys(ReadData.ReadPropertyFile("Password"));
		loginBtn.click();
	}
	
	//method to verify visibility of swag logo
	public boolean verifyswaglogo()
	{
		return swagLogo.isDisplayed();
	}
	
	//Method to verify visibility Biglogo
	public boolean verifybiglogo()
	{
		return bigLogo.isDisplayed();
	}
	//Method to verify the title
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	//Method to verify the url
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
		
	
	
	}