package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		//find web element image link open cart
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		
		//verify title of the current page with exptecte home page title
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		//browser close
		driver.close();
		
	}

}
