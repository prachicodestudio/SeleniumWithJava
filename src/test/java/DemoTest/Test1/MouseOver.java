package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximizes browser
		driver.manage().window().maximize();

		//open url
		driver.get("http://www.ebay.in/");
		
		WebElement element = driver.findElement(By.linkText("Shipping & Payments"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();//moveToElement() for mouse over action
		
		

	}

}
