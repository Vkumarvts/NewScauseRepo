package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOut2Page extends TestBase {
	
	@FindBy(xpath = "//span[@class='title']") private WebElement OverviewTitle;
	@FindBy(xpath = "//div[@class='summary_total_label']") private WebElement TotalText;
	@FindBy(xpath = "//button[@id='finish']") private WebElement FinishBtn;
	@FindBy(xpath = "//div[text()='Payment Information:']") private WebElement PaymentText;
	
	public CheckOut2Page() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	public String OverviewtitleCheck()
	{
		return OverviewTitle.getText();
	}
	
	public String infoPaymentText()
	{
		return PaymentText.getText();
	}
	
	public void CheckfinishBtn()
	{
		FinishBtn.click(); 
	}

}
