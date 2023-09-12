package day2workingwithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivity1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/C:/Users/jawah/OneDrive/Desktop/web tools/chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("automation");
		
		WebElement passwordField = driver.findElement(By.name("pass"));
		passwordField.sendKeys("automation");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();		
		
	}

}
