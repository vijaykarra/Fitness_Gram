package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(id="userName")
private WebElement username;

@FindBy(id="loginPassword")
private WebElement password;

@FindBy(xpath="//span[@class='chakra-checkbox__control css-1fawaxf']")
private WebElement checkBox;

@FindBy(xpath="//input[@id='districtCode']")
 private WebElement dist_code;



@FindBy(xpath="//button [text()='Log In']")
		private WebElement log;

public WebElement getDist_code() {
	return dist_code;
}

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getCheckBox() {
	return checkBox;
}

public WebElement getLog() {
	return log;
}

// SuperAdmin,Teacher,SchoolAdmin Login
 public void SuperAdminlog(String User ,String Pass) {
	 username.sendKeys(User);
	 password.sendKeys(Pass);
	 checkBox.click();
	 log.click();
	 
 }
 
 
 //DistAdmin Login (Multi-user Role Can Use)
 public void Dist_Adminlog_2(String User ,String Pass, String code) {
	 username.sendKeys(User);
	 password.sendKeys(Pass);
	 dist_code.sendKeys(code);
	 checkBox.click();
	 log.click();
	 
 }


}
