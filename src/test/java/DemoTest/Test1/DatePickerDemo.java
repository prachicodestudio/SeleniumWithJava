package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//02-May-2022;
		
		String expectedDay = "8";
		String expectedMonth = "July";
		String expectedYear = "2022";
				//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//maximise browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to iframe
		driver.switchTo().frame(0);
		
		//find date picker webelement to perform click action
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();

		while(true)
		{
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if(calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear))
			{
				List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e:daysList)
				{
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay))
					{
						e.click();
						break;
						
					}
				}
					
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}

	}

}
