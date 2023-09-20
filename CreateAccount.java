package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps/");

		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.className("accountName")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
		WebElement select1 = driver.findElement(By.id("createLeadForm_industryEnumId"));

		Select option = new Select(select1);

		option.selectByIndex(3);

		WebElement select2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));

		Select option1 = new Select(select2);

		option1.selectByVisibleText("S-Corporation");

		WebElement select3 = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select option2 = new Select(select3);

		// option2.selectByValue("Employee");
		option2.selectByIndex(4);

		WebElement select4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select option3 = new Select(select4);

		option3.selectByIndex(6);

		WebElement select5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select option4 = new Select(select5);

		option4.selectByIndex(50);

	}

}
