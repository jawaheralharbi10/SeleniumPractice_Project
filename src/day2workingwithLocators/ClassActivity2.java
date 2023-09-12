package day2workingwithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivity2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/C:/Users/jawah/OneDrive/Desktop/web tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		WebElement createnewaccount = driver.findElement(By.linkText("Create new account"));
		createnewaccount.click();
		Thread.sleep(1000);
		
		
		WebElement firstnameField = driver.findElement(By.name("firstname"));
		firstnameField.sendKeys("automation");
		
		WebElement lastnameField = driver.findElement(By.name("lastname"));
		lastnameField.sendKeys("automation");
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("automation");
		
		WebElement passwordField = driver.findElement(By.name("pass"));
		passwordField.sendKeys("automation");
		
		WebElement signupButton = driver.findElement(By.name("websubmit"));
		signupButton.click();

	}

}
