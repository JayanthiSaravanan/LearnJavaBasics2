import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luma {

	public static void main(String[] args) {

			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://magento.softwaretestingboard.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//span[text()='Women']")).click();
			driver.findElement(By.xpath("//span[text()='Tops']")).click();
			driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html']")).click();
	}
	

}
