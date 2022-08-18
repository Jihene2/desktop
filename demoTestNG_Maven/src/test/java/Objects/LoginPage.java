package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	 By emailField = By.id("inputEmail");
	 By passwordField = By.id("inputPassword");
	 By btn_sumbit = By.xpath("/html/body/header/div[2]/div/div/div/div[3]/form/div[3]/button");
	
	
	public void insertMail(String Mail) {
		
		driver.findElement(emailField).sendKeys(Mail);
		
	}
	
	public void insertPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
		
	}
	
	public void clickSubmit() {
		
		driver.findElement(btn_sumbit).click();
		
		
	}
	

}
