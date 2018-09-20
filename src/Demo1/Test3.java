package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {

	public static void main(String[] args) {
		//Internet Explorer driver
		
		//invoke .exe file
		System.setProperty("webdriver.ie.driver", "Drivers\\MicrosoftWebDriver.exe");
						
		//Create driver object for the browser
		WebDriver  driver = new InternetExplorerDriver();
						 
		//Implement the method of web driver
						 
		//Go to the url
		driver.get("https://www.findmyfare.com/");
						 
		//Get the title and print it
		System.out.println(driver.getTitle());

	}

}