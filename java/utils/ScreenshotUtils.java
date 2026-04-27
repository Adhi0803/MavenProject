package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

	public static void capture(WebDriver driver, String name) {
		try {
//			File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			String path = System.getProperty("user.dir") + "/screenshots/" + name + ".png";
			
//			FileUtils.copyFile(src, new File(path));
			
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", name);
			LoggerUtils.info("Scenario" + name + " is failed. Taking screenshot.");
			
			
			
		}catch(IOException e) {
			LoggerUtils.fail(e.getMessage());
		}
	}
}