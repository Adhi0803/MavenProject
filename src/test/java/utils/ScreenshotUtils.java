package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

public class ScreenshotUtils {

	public static void capture(WebDriver driver, Scenario scenario, String name) {
//			File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			String path = System.getProperty("user.dir") + "/screenshots/" + name + ".png";
			
//			FileUtils.copyFile(src, new File(path));
			
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", name);
			LoggerUtils.info("Scenario" + name + " is failed. Taking screenshot.");
			
						
		}
	}
