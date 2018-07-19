package pageObjects;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='username']") 
	private WebElement txtbx_UserName;
	
	@FindBy(how = How.XPATH, using = "//*[@id='password']") 
	private WebElement txtbx_Pwd;
	
	@FindBy(how = How.XPATH, using = "//*[@id='login']") 
	private WebElement btn_Login;
	
	@FindBy(how = How.XPATH, using = "//*[@id='logout']") 
	private WebElement lnk_logout;
	
	public class ExecDate {
		Date date = new Date();
		
		//System.out.println("Execution Date & Time: "+date.toString());
	}
	public void enter_UserName(String username) {
		txtbx_UserName.sendKeys(username);
	}
	
	public void enter_Pwd(String pwd) {
		txtbx_Pwd.sendKeys(pwd);
	}

	public void click_loginBtn() {
		btn_Login.click();
	}
	
	public void click_logout() {
		lnk_logout.click();
	}
	
	
	public void fill_LoginDetails() {
		enter_UserName("RobinCAP");
		enter_Pwd("79D209");		
	}
	
	

}