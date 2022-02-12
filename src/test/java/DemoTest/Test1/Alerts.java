package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		//find alert button and perform click action
		//driver.findElement(By.xpath("//button[@id='alert']")).click();
		
	//	driver.findElement(By.xpath("//button[@id='confirm']")).click();
		
		
		//find prompt button and perform click action
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		//switch to alert window, enter name
		driver.switchTo().alert().sendKeys("Sudha");
		
		//accept alert
		driver.switchTo().alert().accept();//to ok alert
		
		
		
		
	}

}
