package rough;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSample {
	 static WebDriver driver;
	public static void mouseHover(WebElement element)
	{
	Actions a=new Actions(driver).moveToElement(element);
	a.build().perform();
		
	}
	public static void click(WebElement element)
	{
	Actions a=new Actions(driver).click(element);
	a.build().perform();
		
	}
	public static void doubleClick(WebElement element)
	{
		Actions a=new Actions(driver).doubleClick();
		a.build().perform();
	}

	public static void rightCLick(WebElement element)
	{
		Actions a=new Actions(driver).contextClick(element);
		a.build().perform();
		
	}
	
	public static void dragAndDrop(WebElement source,WebElement target)
	{
		Actions a=new Actions(driver).dragAndDrop(source, target);
		a.build().perform();}
}
