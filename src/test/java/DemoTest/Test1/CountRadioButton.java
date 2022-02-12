package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		
		//open url https://udyamregistration.gov.in/Udyam_Login.aspx
		//driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.get("https://www.calculator.net/");
		//find radion button web elements on web page
		List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		//print total no. of radion button in radiobuttonlist
		System.out.println("Total no. of radio button on web page:" + radioButtonList.size());
		
		//close current browser
		driver.close();
	}

}
