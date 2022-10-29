package QA_Assignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class QAassignment {
	
	public WebDriver driver;
  @Test
  public void contactus() throws Exception {
	  
	  driver.findElement(By.name("fullname")).sendKeys("chakali veeranjineyulu");
	  driver.findElement(By.name("email")).sendKeys("veeruvnd2000@gmail.com");
	  new Select(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/div/div[2]/div[2]/div[2]/div/form/select"))).selectByVisibleText("India (+91)");
	  driver.findElement(By.name("phone")).sendKeys("8074744017");
	  driver.findElement(By.name("message")).sendKeys("hii sir i am veeranjineyulu");
	  Thread.sleep(2000);
	  driver.findElement(By.id("contactButton")).click();
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://unicreds.com/contact-us");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
