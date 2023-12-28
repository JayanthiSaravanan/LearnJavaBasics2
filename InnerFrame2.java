package Jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_border2");
driver.manage().window().maximize();

driver.switchTo().frame("iframeResult"); //switch to outer iframe //using id
driver.switchTo().frame(0);
System.out.println("Text present in the inner Frame:" + driver.findElement(By.xpath("//h1")).getText());

driver.switchTo().parentFrame(); //got to parent frame or outerframe

//String text = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
String text = driver.findElement(By.xpath("/html/body/p")).getText();
System.out.println("Text Print in outer frame:" +text);


	}

}
