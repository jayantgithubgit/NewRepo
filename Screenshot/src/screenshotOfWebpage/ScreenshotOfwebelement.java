package screenshotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfwebelement {
public static void main(String[] args) throws IOException {
	
System.setProperty("webdriver.chrome.driver", "D://java automation//chromedriver.exe");	
WebDriver driver = new ChromeDriver();	
	
driver.get("https://www.facebook.com");	
WebElement section = driver.findElement(By.xpath("//input[@name='email']"));	
	
File src = section.getScreenshotAs(OutputType.FILE);	
File Dest = new File("D://Image//facebook5.jpg");	
	
FileHandler.copy(src, Dest);	
}	
}
