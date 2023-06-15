package selenium_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_LinkOfGoogle {
public static void main(String args[])throws Exception {
		//TEST STEPS 
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	List<WebElement> values =  driver.findElements(By.tagName("a"));
	for(WebElement links:values) {
		System.out.println(links.getText());
	}
	driver.close();
}
}