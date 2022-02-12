package DemoTest.Test1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

	//draw broder around web element
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}


	//To generate alert message
	public static void generateAlert(WebDriver driver, String alertMessage) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + alertMessage + "')");

	}

	//Refresh web browser
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	//Flash web element
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String backcolor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 300; i++) {
			changeColor("#000000", element, driver);
			changeColor(backcolor, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	//Scroll  web page down till end
	public static void scrollPgDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	//scroll vertically page up
	public static void ScrollVerticallyPgUp(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

	//Scroll till visibility of web element
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	//get domain name
	public static String getDomainByJavaScript(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String domain =	js.executeScript("return document.domain;").toString();
		return domain;
	}

	//Get Title of the web page
	public static String getTitleByJavaScript(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title =	js.executeScript("return document.title;").toString();
		return title;
	}

	//get URL of the web page
	public static String getURLByJavaScript(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String url =	js.executeScript("return document.URL;").toString();
		return url;
	}

	public static void clickElementByJavaScript(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}



}
