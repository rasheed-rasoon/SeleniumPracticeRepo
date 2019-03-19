package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	
	 WebDriver driver;
	
	public  void elementVisible(WebElement element)
	{
	
WebDriverWait w=new WebDriverWait(driver,30);
w.until(ExpectedConditions.visibilityOf(element));
	
	}
	public void elementClickable(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	
	public void elementSelectable(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		
	}
	
	
	public void title(String title){
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains(title));
		
		
	}
}
