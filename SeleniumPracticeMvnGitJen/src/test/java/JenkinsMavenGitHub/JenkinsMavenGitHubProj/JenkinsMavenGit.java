package JenkinsMavenGitHub.JenkinsMavenGitHubProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsMavenGit {
	WebDriver driver;
	
@Test
public void jenkinsInteg()
{
	System.out.println("my first commit");

	System.out.println("my second commit");
	System.out.println("my third commit");
	System.out.println("my fourth commit");
	System.out.println("my fifth commit");
	System.out.println("my sixth commit");
	System.out.println("my seventh commit");
	System.out.println("my 9th commit");
	System.out.println("my tenth commit");
	System.out.println("my 11th commit");
	System.out.println("my 12th commit");
	System.out.println("my 13th commit");
	System.out.println("my 14th commit");
	System.out.println("my 15th commit");
	System.out.println("my 16th commit");
	System.out.println("my 17th commit");
	System.out.println("my 18th commit");
	System.out.println("my 19th commigt");
	System.out.println("my 20th commit");
	System.out.println("my 21st commit");
	System.out.println("my 22nd commit");
	System.out.println("my 22nd commit");
	System.out.println("my 23nd commit");
	System.out.println("my 24th commit");
	System.out.println("my 25th commit");
	System.out.println("my 26th commit");
	System.out.println("my 27th commit");
	System.out.println("my 28th commit");
	System.out.println("my 29th commit");
	System.out.println("my 30th commit");
	System.out.println("my 31th commit");
	
	System.setProperty("webdriver.gecko.driver","D:\\stdy\\softwares\\drivers\\geckodriver.exe");
	driver =new FirefoxDriver();
	System.out.println("navigating to BRS URL");
	driver.get("https://www.google.com");

	System.out.println("waiting for 2 seconds");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Going to close the window");
	//driver.findElement(By.id("LinkButton1")).click();
	driver.quit();
}
}

