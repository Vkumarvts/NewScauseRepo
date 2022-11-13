package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.UtilityMethod;

public class LastPage extends TestBase {
	
	@FindBy(xpath = "//span[text()='Checkout: Complete!']") private WebElement CompleteTitle;
	@FindBy(xpath = "//h2[@class='complete-header']") private WebElement ThankYouText;
	@FindBy(xpath = "//img[@class='pony_express']") private WebElement PonyLogo;
	@FindBy(xpath = "//button[@id='back-to-products']") private WebElement BackHomeBtn;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement MenueBtn;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']") private WebElement LogoutBtn;
	
	public LastPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCompletTite()
	{
		return CompleteTitle.getText();
	}
	
	public String verifyThankstext()
	{
		return ThankYouText.getText();
	}
	
	public boolean verifyPonyLogo()
	{
		return PonyLogo.isDisplayed();
	}
	
	public boolean verifyBackHomeBtn()
	{
		return BackHomeBtn.isDisplayed();
	}
	
	public String VerifyMenueBtn()
	{
		MenueBtn.click();
		LogoutBtn.click();	
		return driver.getCurrentUrl();	
		
		
	}


}
