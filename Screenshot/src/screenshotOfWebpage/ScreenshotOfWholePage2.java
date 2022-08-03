package screenshotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfWholePage2 {

public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "D://java automation//chromedriver.exe");	
WebDriver driver = new ChromeDriver ();	
driver.get("https://www.google.com");
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
File dest = new File ("D://Image//Googlepage.jpg");	
FileHandler.copy(src, dest);	
}	
}
