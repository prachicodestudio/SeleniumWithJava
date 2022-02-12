package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximizes browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://demoqa.com/buttons");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act = new Actions (driver);
		act.doubleClick(button).perform();//double click action
		
	}

}
