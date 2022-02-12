package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		//launch web page https://www.calculator.net/
		driver.get("https://www.calculator.net/");
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on webpage:" + linkElements.size());
		
		for(WebElement el:linkElements)
		{
			System.out.println(el.getText());
		}
		driver.close();
		
		
	}

}
