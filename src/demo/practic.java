package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practic {

	@Test
	public void m1 () throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anna.aniket09@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8484031441");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	 
	}

}
