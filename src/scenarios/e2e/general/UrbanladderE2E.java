package scenarios.e2e.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UrbanladderE2E {
  @Test
  public void f() {
	 
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	  Actions act=new Actions(driver);
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.xpath("//li[@class='topnav_item saleunit']")).click();
	  driver.findElement(By.xpath("//li[@class='subnav_item 9692']/a/span[text()='TV Units']")).click();
	  driver.findElement(By.xpath("//li[@class='item' and @ data-group='price']")).click();
	//  driver.findElement(By.xpath("//input[@ type='radio' and @id='price_limit_3099-6999']")).click();
	  driver.findElement(By.xpath("//div[@data-taxon='tv_units']/descendant::img[@alt='Lincoln Low TV Unit No Shelf Dark Oak']")).click();
	  
	  WebElement ele=driver.findElement(By.linkText("Add to Cart"));
	  WebDriverWait wait=new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Add to Cart"))));
	  ele.click();
  }
}

