package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//maximise browser
		driver.manage().window().maximize();

		//open url
		driver.get("https://www.facebook.com/");
		
		//find sign up web element
		String actualtoolTip = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
		String expectedToolTip = "Sign  for Facebook";
		
		if(actualtoolTip.equals(expectedToolTip))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	
	}

}
