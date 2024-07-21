package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPPage {
	WebDriver driver;
	
	@FindBy(xpath="(//input)[1]")
	WebElement firstDigitInput;
	
	@FindBy(xpath="(//input)[2]")
	WebElement secondDigitInput;
	
	@FindBy(xpath="(//input)[3]")
	WebElement thirdDigitInput;
	
	@FindBy(xpath="(//input)[4]")
	WebElement fourthDigitInput;
	
	@FindBy(xpath="(//input)[5]")
	WebElement fifthDigitInput;
	
	@FindBy(xpath="(//input)[6]")
	WebElement sixthDigitInput;

	public OTPPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstDigitInput() {
//		firstDigitInput.click();
		firstDigitInput.sendKeys("1");
	}
	
	public void enterSecondDigitInput() {
		secondDigitInput.sendKeys("2");
	}
	
	public void enterThirdDigitInput() {
		thirdDigitInput.sendKeys("3");
	}
	
	public void enterFourthDigitInput() {
		fourthDigitInput.sendKeys("4");
	}
	
	public void enterFifthDigitInput() {
		fifthDigitInput.sendKeys("5");
	}
	
	public void enterSixthDigitInput() {
		sixthDigitInput.sendKeys("6");
	}


}
