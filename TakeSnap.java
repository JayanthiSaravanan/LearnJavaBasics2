package week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {

	public static void main(String[] args) throws IOException {

		ChromeDriver snap = new ChromeDriver();
		snap.get("http://leaftaps.com/opentaps/control/main");
		snap.manage().window().maximize();
		
		//snap.findElement(By.id("username")).sendKeys("Demosalesmanager");
		WebElement user = snap.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
		File src = user.getScreenshotAs(OutputType.FILE);
		
		
		snap.findElement(By.id("password")).sendKeys("crmsfa");
		
		//snap - 3steps
		//File src = snap.getScreenshotAs(OutputType.FILE);
		
		File des = new File("./Snaps/img.png");
		
		FileUtils.copyFile(src, des);
		
		
		
	}

}
