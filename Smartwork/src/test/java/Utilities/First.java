package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.cli.Main;

public class First {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","D:\\Education Work\\Drivers\\chromedriver.exe");

		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		//Some New Chnages Changes ahead ssssssssssssssssss
		
		
	}
}
