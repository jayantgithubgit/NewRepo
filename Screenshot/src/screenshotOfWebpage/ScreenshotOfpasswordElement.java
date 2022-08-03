package screenshotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfpasswordElement {

public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "D://java automation//chromedriver.exe");	
WebDriver driver = new ChromeDriver();	
driver.get("https:www.facebook.com");	
WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
File src = Password.getScreenshotAs(OutputType.FILE);	
File Dest = new File ("D://Image//Password1.png");	
FileHandler.copy(src, Dest);	
}	
}
