package tests;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PageBase;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import junit.framework.TestCase;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "resources/features", glue = "steps")
	public class Test extends TestCase {
		
		public static WebDriver driver;
		
		@BeforeClass
		public static void before() {
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.get("https://phptravels.net/admin");
			PageBase.driver = driver;
		}
		
		@AfterClass
		public static void after() {
			driver.quit();
		}

	}

