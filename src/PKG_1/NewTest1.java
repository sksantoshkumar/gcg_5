package PKG_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void test1() {
	  
	  	System.setProperty("webdriver.chrome.driver","chromedriver_v80.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/login");
  }
}