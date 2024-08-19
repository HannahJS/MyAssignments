package week4.day1.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*Details:
Automate interactions with frames, trigger alerts, and verify the displayed text based on actions using Selenium 
WebDriver on the given application.
Precondition:
- Initialize ChromeDriver
- Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt)
- Maximize the browser window
- Switch to the frame
- Add an implicit wait to ensure the webpage elements are fully loaded
Requirements:
- Click the "Try It" button inside the frame
- Click OK/Cancel in the alert that appears
- Confirm the action is performed correctly by verifying the text displayed
Hints to Solve:
- Use Selenium methods such as `switchTo().frame()`, `findElement()`, `click()`, `switchTo().alert()`, `sendKeys()`, and 
`alert.accept()` or `alert.dismiss()` to perform the required actions.
- Use Conditional statements to verify the text based on the action performed.
 * 
 * 
 */
public class FramesTextVerification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		/***************************************************************************************/
		/********************* Preconditions validation- BEGINS*********************************/
		/***************************************************************************************/
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		
		//Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		//Handle pop-up
		driver.findElement(By.id("accept-choices")).click();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		
		
		
		/***************************************************************************************/
		/*****************Pre-conditions validated- ENDS ***************************************/
		/***************************************************************************************/
		
		//Driver control is already within the iframe= iframeResult
		
		//Requirement 1-    Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[ contains(text(),'Try it')]")).click();
		
		
		
		/***************************************************************************************/
		/********************* Requirements validation- BEGINS*********************************/
		/***************************************************************************************/
		
		
		//Requirement 2-Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		
		
		//If you click 'Cancel'
		//alert.dismiss();// Reject/Dismiss the alert
		
		
	    String capture_AlertText=alert.getText();//Step 1: Capture the Alert text to a String var
		Thread.sleep(2000);
		
		alert.sendKeys("Hannah");// Step 2: Pass the text in the Alert Text Box--PROMPT Alert
		Thread.sleep(2000);
		
		//If you click 'ok'
		alert.accept();// Step 3: accept the alert
		
		
		String capture_AlertAction = driver.findElement(By.id("demo")).getText();//Step 4: Capture the Alert action in a String Var
		Thread.sleep(2000);
		
		//Requirement 3-Confirm the action is performed correctly by verifying the text displayed
		//Print the Alert text and Alert action in console
		
		System.out.println(capture_AlertText);
		System.out.println(capture_AlertAction);
		
		driver.quit();
		
		
		/***************************************************************************************/
		/********************* Requirements validation- ENDS***********************************/
		/***************************************************************************************/
		
	}

}
