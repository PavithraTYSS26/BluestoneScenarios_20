package scenarios.srinidhi.assignment.urbanladder;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LivingMenu {
  @Test
  public void living2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.urbanladder.com/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//div[@id='login_dialog']/descendant::div/a")).click();
	  Thread.sleep(2000);
	  
	  WebElement ele=driver.findElement(By.xpath("//ul[@class='topnav bodytext']/li[@class='topnav_item livingunit']/span"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).build().perform();
	  Thread.sleep(2000);
	  
	  act.moveToElement( driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/descendant::a[text()='Chairs']"))).build().perform();
	  driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/descendant::a[contains(.,'Designer Chairs')]")).click();
	
	  driver.findElement(By.xpath("//img[@title='DSW Dining Chair Replicas -  Set of 2 (White)']")).click();
	  
	 Set<String> tabs= driver.getWindowHandles();
	 for(String t:tabs)
	 {
		 System.out.println(t);
		 driver.switchTo().window(t);
	 }
	 driver.findElement(By.xpath("//button[@data-id='7420']")).click();
	 
	 driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']/a[@data-gaclick='1']")).click();
	 
	 driver.findElement(By.xpath("//span[text()='Furniture Home']")).click();
	  System.out.println("done");	 
	  
  }
}
