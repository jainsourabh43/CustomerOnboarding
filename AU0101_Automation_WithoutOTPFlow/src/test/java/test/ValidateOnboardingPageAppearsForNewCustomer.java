package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import pages.OTPPage;
import pages.TransactPage;

public class ValidateOnboardingPageAppearsForNewCustomer extends BaseTest {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	TransactPage transactPage;


@Test
public void validateOnboardingPageAppearsForNewCustomer() throws InterruptedException {
	
	initializeDriver();
	openWebSite();
	loginPage=new LoginPage(driver);
	loginPage.enterUsername();
	loginPage.enterPassword();
	Thread.sleep(2000);
	loginPage.clickOnLoginButton();
	dashboardPage=new DashboardPage(driver);
	Thread.sleep(2000);	
	dashboardPage.clickOnTransactLink();
	Thread.sleep(8000);	
	transactPage=new TransactPage(driver);
	transactPage.selectAccount();
	transactPage.clickOnSubmitButton();
		
}

}
