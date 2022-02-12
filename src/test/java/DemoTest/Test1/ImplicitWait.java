package DemoTest.Test1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("http://www.ebay.in/");
		
		//wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Stopwatch watch = null;
		
		try {
			watch = Stopwatch.createStarted();
		//find webelement "START SELLING"
		driver.findElement(By.linkText("START SELLING")).click();
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
		}
		
		
		
	}

}
