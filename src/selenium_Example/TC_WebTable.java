package selenium_Example;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WebTable {
public static void main(String args[]) throws Exception {
	//TEST STEP
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///c:/Users/Asus/Downloads/WebTable.html");
	//COUNT
	int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
	int colm = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
	
	int row_colm = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
	
	System.out.println("Row Count : "+row);
	System.out.println("Column Count : "+colm);
	System.out.println("Row_Count :"+row_colm);
	
	//DATA CELL
	String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(celldata);
	
	//DATA== WHOLE TABLE
	for(int i = 1;i <=row; i++) 
	{
		String tabledata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
		System.out.println(tabledata);
		Thread.sleep(2000);
		
	}
	driver.close();
}
}


