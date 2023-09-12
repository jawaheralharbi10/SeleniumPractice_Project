package WebElement_07_31;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/C:/Users/jawah/OneDrive/Desktop/web tools/chromedriver.exe/");
		WorkingwithWebElement classObject = new WorkingwithWebElement();
		classObject.KeyPressExample();

	}
	public void KeyPressExample() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// windows maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Navigate to google.com
		driver.get("https://google.com");
		
		//search for coffee mug
		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("coffee mug");
		
		//hit enter
		inputBox.sendKeys(Keys.ENTER);
		
		//find the search box again
		WebElement searchInputBox = driver.findElement(By.name("q"));
		//select the text in it
		searchInputBox.sendKeys(Keys.chord(Keys.COMMAND, "a"));
		Thread.sleep(2500);
		
		//delete the selected text
		searchInputBox.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		
		//search new item 
		searchInputBox.sendKeys("Pretty coffee mug", Keys.ENTER);
		
	}

}
