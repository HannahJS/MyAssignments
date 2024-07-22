package week1.day2;

public class Browser {//class1 declared

	
		// TODO Auto-generated method stub
public String launchBrowser(String browserName) //Method1 declared 
{
System.out.println( "Browser : " +browserName + " (launched successfully)" );	
return browserName; //the method variable is returned because the return type in method declaration is String

}

public String loadURL(String urlName) //Method2 declared 
{
System.out.println("Application URL: " +urlName + " (loaded successfully)");
return urlName; //the method variable is returned because the return type in method declaration is String
}


public static void main(String[] args) { //Method 1 and 2  to be called within main method using objects
	
	Browser chrome= new Browser();// object created 'chrome'
	chrome.launchBrowser("chrome"); // method 1 called through object 'chrome'
	chrome.loadURL("www.chrome.com"); //method 2 called through object 'chrome'

	}

}
