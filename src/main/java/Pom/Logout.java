package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	
	//@FindBy(xpath="(//*[local-name()='svg' and @class='chakra-icon css-17wngq7'])[2]")
	//private WebElement setting_icon;

	@FindBy(xpath="(//*[local-name()='svg' and @class='chakra-icon css-17wngq7'])[2]")
	
	private WebElement setting_icon;
	
	
	@FindBy(xpath="//p[text()='Logout']")
	private WebElement logout_Btn;

	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSetting_icon() {
		return setting_icon;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}
	
	public void log_out() throws Exception {
		setting_icon.click();
		Thread.sleep(2000);
	    logout_Btn.click();
	}
	
	

}
