package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PokeBrowser {
	
	WebDriver driver;
	
	@Test
	public void loginPage() {
		
	    driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		
		assertion("There is 1 error","//p[text()='There is 1 error']");
		
			
			
		driver.quit();
	}
    
	public void assertion(String expected,String locator) {
		
		
	String actual =	driver.findElement(By.xpath(locator)).getText();
	
	if(expected.equals(actual)) {
		
		System.out.println("Good Job...Expected Matches the Actual Text  :) ");
	}
	else {
		
		System.out.println("Sorry,,,,,Expected and Actual are not matched :(  ");
		System.out.println("Expected : "+expected);
		System.out.println("Actual  :"+actual);
	}
}
}