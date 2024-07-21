package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@formcontrolname='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@formcontrolname='Password1']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(@class,'CommonSubmitButton')]")
	WebElement loginButton;	

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername() {
		username.sendKeys("DDPPM4786N");
	}
	
	public void enterPassword() {
		password.sendKeys("Abc@12345");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}

}
