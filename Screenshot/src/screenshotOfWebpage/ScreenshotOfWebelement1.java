package screenshotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfWebelement1 {

public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "D://java automation//chromedriver.exe");	
WebDriver driver = new ChromeDriver ();	
//screenshot of login button only	
driver.get("https://www.facebook.com");	
WebElement Button = driver.findElement(By.name("login"));
File src = Button.getScreenshotAs(OutputType.FILE);	
File dest = new File ("D://Image//LoginButtonFB.png");	
FileHandler.copy(src, dest);	
}	
}
