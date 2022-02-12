package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximizes browser
		driver.manage().window().maximize();

		//open url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//find source and target web element
		
		WebElement source = driver.findElement(By.id("box6"));//rome
		WebElement target = driver.findElement(By.id("box106"));//Itlay
		
		Actions act = new Actions(driver);
				
		//dragAndDrop(sourceElemement, targetElement)
		act.dragAndDrop(source, target).perform();
		
		
	}

}
