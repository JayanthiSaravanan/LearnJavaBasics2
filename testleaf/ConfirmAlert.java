package week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Show']")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);

		alert.accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		alert.dismiss();
		

	}
}
//load the url. click the show button. alert will be present.text will be printed. it will accept alert here. wait for sec. clicked caonfim(cancel)

	

