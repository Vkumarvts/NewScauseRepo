package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	

	public static WebDriver driver;
	//This Method open the browser and application url
	public void initialization() throws Exception
	{
//		String browser = ReadData.ReadPropertyFile("Browser");
//		if(browser.equals("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
		WebDriverManager.chromedriver().setup();
	//	without opening browser Run the script
	//	ChromeOptions o = new ChromeOptions();
	//	o.addArguments("headless");
		//pass o object into the ChromeDriver(o)
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
	//	driver.get(ReadData.ReadPropertyFile("Url"));
		// git is push successfully done
	}

}
