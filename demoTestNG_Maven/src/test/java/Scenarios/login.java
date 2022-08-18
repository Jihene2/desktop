package Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
	WebDriver driver;
	LoginPage login = new LoginPage(driver);
	
	
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.talan-academy.com/#login");
	}
	
	@Test
	public void loginTalan() {
		login.insertMail("jihene.saidane@talan.com");
		login.insertPassword("ME125792moii");
		login.clickSubmit();
	}
	
	
	@AfterTest
	public void aftertest() {
		driver.close();
	}

}
