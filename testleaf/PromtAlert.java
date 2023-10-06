package week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) {

			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://leafground.com/alert.xhtml");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
			 Alert alertprompt = driver.switchTo().alert();
			 alertprompt.sendKeys("Jayanthi"); 
			 alertprompt.accept(); 
			String textprompt = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
			System.out.println(textprompt);

	}

}
