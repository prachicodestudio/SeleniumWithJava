package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutheticationPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		//maximise browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	
	

}
