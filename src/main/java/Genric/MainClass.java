package Genric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pom.LoginPage;
import Pom.Logout;

public class MainClass {

	public static WebDriver driver;
	String Browser = "Chrome";

	@BeforeClass
	public void LaunchBrowser() {

		{
			if (Browser.equals("Chrome")) {
				driver = new ChromeDriver();
				System.out.println("chrome");
			} else if (Browser.equals("firefox")) {
				driver = new FirefoxDriver();
				System.out.println("firefox");
			}
		}

		driver.get("https://fitnessgram.com/"); // UAT
		// driver.get("https://help.fitnessgram.net/"); //production
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void LoginPage() {
		LoginPage SA = new LoginPage(driver);
//		SA.Dist_Adminlog_2("ASD@gmail.com","Xelpmoc@123","c8xu");
//		System.out.println("Dist_Admin Login");
		
		
		//Super Admin
		SA.SuperAdminlog("Shrikant", "Xelpmoc@123");
		System.out.println("SuperAdmin Login");
	}
	
	@AfterMethod
	 public void LogOut() throws Throwable  {
		
		System.out.println("logout");
		Thread.sleep(2000);
        Logout lo = new Logout(driver);
        lo.log_out();
	
           
	}

}
