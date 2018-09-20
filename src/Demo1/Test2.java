package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

public static void main(String[] args) {
		
		//Firefox driver
		
		//invoke .exe file
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
				
		//Create driver object for the browser
		WebDriver  driver = new FirefoxDriver();
				 
		//Implement the method of web drive
				 
		//Go to the url
		driver.get("https://www.findmyfare.com/");
				 
		//Get the title and print it
		System.out.println(driver.getTitle());
	}

}
