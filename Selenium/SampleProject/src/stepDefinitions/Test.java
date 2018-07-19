package stepDefinitions;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import pageObjects.BookHotelPage;
import pageObjects.LoginPage;

import pageObjects.SearchHotelPage;

public class Test {

		WebDriver driver;
		BookHotelPage book;
		LoginPage login;
		SearchHotelPage search;
		
		@Given("^I am on Adactin Home page with browser \"(.*)\"$")
		public void user_is_on_Login_Page(String browser){
			Date date = new Date();
			System.out.println("Execution Date & Time: "+date.toString());
			if(browser == "Firefox"){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\P10138906\\source\\repos\\Meetu\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
			else if(browser == "IE"){
			System.setProperty("webdriver.ie.driver","C:\\Users\\P10138906\\source\\repos\\Meetu\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
			else {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\P10138906\\source\\repos\\Meetu\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://adactin.com/HotelApp/");
		}

		/*@And("^I login to the application by providing credentials$")
		public void login_to_application() throws InterruptedException  {
			login = new LoginPage(driver);
			login.fill_LoginDetails();
			login.click_loginBtn();
			Thread.sleep(2000);
		}*/
		
		@And("^I login to the application by providing below credentials$")
		public void login(Map<String, String> table) throws Throwable {
        	login = new LoginPage(driver);
        	login.enter_UserName(table.get("Username"));
        	login.enter_Pwd(table.get("Password"));
        	login.click_loginBtn();
			Thread.sleep(2000);
        } 

		@Then("^I input required information to search a hotel$")
		public void validate_login() {
		 //public void enterData(DataTable table){ 
			search = new SearchHotelPage(driver);
			WebDriverWait wait=new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Search Hotel')]")));
			search.fill_HotelDetails();
			search.click_searchBtn();
			
			
		}

		@And("^Select the resulted hotel and proceed to book the hotel$")
		public void select_hotel(){
			book = new BookHotelPage(driver);
			book.validate_Title("Select Hotel");
			book.check_Hotel();
			book.click_ContinueBtn();
			book.BookHotelDetails();
			book.click_BookNowBtn();			
		}
		
		@And("^I validate the booking confirmation message$")
		public void booking_confirmation(){
			book = new BookHotelPage(driver);
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='booking_form']/table/tbody/tr[1]/td")));
			book.validate_BookingConfir("Booking Confirmation");
		}
		
		@Then("^I logout of the application$")
		public void logout(){
			login = new LoginPage(driver);
			login.click_logout();
			driver.close();
		}


		
			
	}	
    

