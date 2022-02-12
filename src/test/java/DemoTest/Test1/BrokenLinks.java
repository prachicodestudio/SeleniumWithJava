package DemoTest.Test1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//maximise browser
		driver.manage().window().maximize();

		//wait 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//open url
		driver.get("http://www.deadlinkcity.com/");

		//find hyperlinks
		List <WebElement> linkList = driver.findElements(By.tagName("a"));

		int resCode = 200;//2xx response code is valid link 
		int brokenLinkCnt = 0;
		
		System.out.println("Total links on page:" + linkList.size());
		
		for(WebElement element:linkList)
		{
			String url = element.getAttribute("href");

			try {

				URL urlLink =new URL(url);

				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				
				if(resCode >=400)
				{
					System.out.println(url + "broken link.");
					brokenLinkCnt ++;
				}


			}

			catch(MalformedURLException e)
			{

			}
			catch(Exception e)
			{

			}

		}
		System.out.println("Total broken links: " + brokenLinkCnt);





	}

}
