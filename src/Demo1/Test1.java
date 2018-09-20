package Demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

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
		 
		 //Get the title and print it
		 System.out.println(driver.getTitle());
		 
		 
		 

	}

}