package Utility;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class CaptureScreenShot extends TestBase {
	
	public static void Screenshot(String name) throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Vikas\\eclipse-workspace\\SouceLabFrame\\ScreenShot\\"+name+".jpeg");
		FileHandler.copy(source, dest);
	}


}
