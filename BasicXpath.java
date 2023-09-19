package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("http://leaftaps.com/opentaps/");
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("h_jayanthii@yahoo.co.in");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jayanthi123");

		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
