package Demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
public static void main(String[] args) {
		
		//Chrome driver
		
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "Drivers\\Chromedriver.exe");
			
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver  driver = new ChromeDriver();
				 
		//Implement the method of web drive
				 
		//Go to the url
		driver.get("https://www.findmyfare.com/");
				 
		//Validate your page title is correct
		System.out.println(driver.getTitle());
		
		//Validate landed url
		System.out.println(driver.getCurrentUrl());
		
		//Print page source
		System.out.println(driver.getPageSource());
		
		//Go to the url
		driver.get("https://www.airbnb.com/");
		
		//Navigate back
		driver.navigate().back();
		
		//Navigate forward
		driver.navigate().forward();
		
		//Close current browser
		driver.close();
		
		//Close all the browsers
		driver.quit();

	}

}