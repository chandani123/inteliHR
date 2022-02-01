package inteliHR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public  WebDriver ChromeWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/chandanibhalala/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
