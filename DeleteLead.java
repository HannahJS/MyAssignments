package week3.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*- Initialize the WebDriver (ChromeDriver).
- Load the URL http://leaftaps.com/opentaps/. .
- Maximize the browser window.





Requirements:
- Enter the username.
- Enter the password.
- Click the Login button.
- Click the "crm/sfa" link.
- Click the "Leads" link.
- Click "Find leads."
- Click on the "Phone" tab.
- Enter the phone number.
- Click the "Find leads" button.
- Capture the lead ID of the first resulting lead.---> store in local var-> ->Var.gettext()->var.click()
- Click the first resulting lead.
- Click the "Delete" button.
- Click "Find leads" again.
- Enter the captured lead ID.--> pass the Var name in Send Keys  --> send Keys( loc var)
- Click the "Find leads" button-->.click()
- Verify the presence of the message "No records to display" in the Lead List. --> Xpath of msg.get text( store in loc var)

if ( var.contains('no record'))
{}
else{}

message confirms the successful deletion.
- Close the browser.
 * 
 * 
 */


public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//Pre-condition: Adding Implicit Wait
		driver.get("http://leaftaps.com/opentaps");//1
		


		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");//2
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");//3
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();//4
		driver.findElement(By.xpath("//*[@id=\"button\"]/a")).click();//5
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')][1]")).click();// Click the "Leads" link
		driver.findElement(By.xpath("//a[text()='Find Leads']/parent::li")).click(); //Click "Find leads."///error-rework
		
		
		driver.findElement(By.xpath("//a[text()='Find Leads']/ancestor:: ul[@class='shortcuts']"));//Click "Find leads."-error
		
		
		WebElement phone = driver.findElement(By.xpath("//span[text()='Phone']"));//Click on the "Phone" tab.
		phone.click();
		
		// Enter phone number-91 9840-7889
				// Sendkeys ( 3rd text box)
		WebElement typePhone3rdTextbox = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		typePhone3rdTextbox.sendKeys("1");
		
		// Click on Find lead
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Inspect the first result - use class element/a.-> store as local var
		//then use click
		WebElement firstPhoneResult = driver.findElement(By.xpath("//a[@class='linktext']/parent::div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1])"));
		firstPhoneResult.click();
		System.out.println("First Phone result selected");
		/*
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10224");
	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//driver.findElement(By.xpath("//a[text()='10224']/parent::div")).click();//not working
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		//System.out.println("Lead was deleted successfully");
		
		
/*		driver.findElement(By.xpath("//a[@class='subMenuButton' and text()='Edit']")).click();//Click on Edit button
		driver.findElement(By.name("importantNote")).sendKeys("Notes entered");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Type some text");
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();
		 String get_title = driver.getTitle();
		 System.out.println("The title of the page is " +get_title);
		Thread.sleep(5000);
		driver.quit();*/
	}

}
