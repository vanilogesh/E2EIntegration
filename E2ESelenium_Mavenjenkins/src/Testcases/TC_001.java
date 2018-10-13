package Testcases;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC_001 {
	

		
	@Test
	public void testcase1(){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("vanikodandan@gmail.com");
		driver.findElementById("pass").sendKeys("vani@18061992");
		driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
		assertTrue(driver.getTitle().contains("Title of Page"));
		//String actualTitle = driver.getTitle();
		//System.out.println(actualTitle);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	}



