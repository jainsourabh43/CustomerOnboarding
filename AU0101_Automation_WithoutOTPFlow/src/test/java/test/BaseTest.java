package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
	    try {
	        Path path = Paths.get("C:\\Users\\Sourabh Jain\\Workspace\\AU0101_Automation_WithoutOTPFlow\\test-output");
	        if (Files.exists(path)) {
	            Files.delete(path);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    

	}
	
	public void initializeDriver() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	public void openWebSite() {
		driver.get("https://mfuat.aubankuat.in/newlogin");
		driver.manage().window().maximize();
	}

}
