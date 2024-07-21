package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransactPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[@id='BankModal']//div[contains(@class,'AlertModalContentCls')]//select[@formcontrolname='ClietBankAccount']")
	WebElement accountDropdown;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitButton;
	@FindBy(xpath="//ul[@class='select2-results__options']/li[1]")
	WebElement dropDownValue;
	public TransactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void selectAccount() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", accountDropdown);
	
//		Select sel=new Select(accountDropdown);
//		System.out.println(sel.getFirstSelectedOption().getText());
//		sel.selectByIndex(1);
	}
	
	public void clickOnSubmitButton() {
		submitButton.click();
	}

}
