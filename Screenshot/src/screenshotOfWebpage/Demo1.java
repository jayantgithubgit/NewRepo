package screenshotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo1 {
public static void main(String[] args) throws IOException {
	
System.setProperty("webdriver.chrome.driver", "D://java automation//chromedriver.exe");	
WebDriver driver = new ChromeDriver();	
driver.get("https://www.facebook.com");	
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File Dest = new File ("D://Image//Facebookfullpage.jpg");	
FileHandler.copy(src,Dest);	
}	
}
