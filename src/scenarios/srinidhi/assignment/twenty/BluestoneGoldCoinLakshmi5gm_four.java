package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BluestoneGoldCoinLakshmi5gm_four {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		act.moveToElement(driver.findElement(By.xpath("//li[@id='goldCoins']/a"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Lakshmi Gold Coins']"))).build().perform();
		driver.findElement(
				By.xpath("//span[text()='Lakshmi Gold Coins']/parent::div/parent::div/ul/li/span[text()='5 gram']")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='(5 gram)']")).isDisplayed());
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='(5 gram)']")).getText(), "(5 gram)");
		System.out.println("5 gram gold coin is diplayed......");
		driver.close();

  }
}
