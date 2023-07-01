package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon_Search {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Go to Amazon WebApp:
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist Watches");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Search for Display-Analogue:
		driver.findElement(By.linkText("Analogue")).click();
		
		//Search for Brands Material-Leather:
		driver.findElement(By.linkText("Leather")).click();
		
		//Search for Brand-Titan:
		driver.findElement(By.linkText("Titan")).click();
		
		//Search for Discount-25% Off or more:
		driver.findElement(By.linkText("25% Off or more")).click();
		
		//Get the Fifth Element from the search:
		WebElement element = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']")).get(4);
		 
		System.out.println(element.getText());
		 
		//Viewing the Fifth Element:
		element.click();
		
	}

}
