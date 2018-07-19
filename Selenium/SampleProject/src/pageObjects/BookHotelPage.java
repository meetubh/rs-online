package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage {
	
	public BookHotelPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='select_form']/table/tbody/tr[1]/td") 
	private WebElement lbl_SelectHotel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='radiobutton_0']") 
	private WebElement btn_RadioHotel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='continue']") 
	private WebElement btn_Continue;
	
	@FindBy(how = How.XPATH, using = "//*[@id='book_hotel_form']/table/tbody/tr[2]/td") 
	private WebElement lbl_BookHotel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='first_name']") 
	private WebElement txtbx_FirstName;
	
	@FindBy(how = How.XPATH, using = "//*[@id='last_name']") 
	private WebElement txtbx_LastName;
	
	@FindBy(how = How.XPATH, using = "//*[@id='address']") 
	private WebElement txtbx_Address;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cc_num']") 
	private WebElement txtbx_CardNo;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cc_type']") 
	private WebElement sel_CardType;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cc_exp_month']") 
	private WebElement sel_ExpiryMonth;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cc_exp_year']") 
	private WebElement sel_ExpiryYear;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cc_cvv']") 
	private WebElement txtbx_CVV;
	
	@FindBy(how = How.XPATH, using = "//*[@id='book_now']") 
	private WebElement btn_BookNow;
	
	@FindBy(how = How.XPATH, using = "//*[@id='booking_form']/table/tbody/tr[1]/td") 
	private WebElement lbl_BookingConfirm;
	
	
	public void validate_Title(String title) {
		String tit_SelectHotel = lbl_SelectHotel.getText();
		Assert.assertEquals(tit_SelectHotel,title);
	}
	
	public void check_Hotel() {
		btn_RadioHotel.click();
	}
	
	public void click_ContinueBtn() {
		btn_Continue.click();
	}
	
	public void validate_TitleBook(String titleBook) {
		String tit_BookHotel = lbl_BookHotel.getText();
		Assert.assertEquals(tit_BookHotel,titleBook);
	}
	
	public void enter_FirstName(String firstname) {
		txtbx_FirstName.sendKeys(firstname);
	}
	
	public void enter_LastName(String lastname) {
		txtbx_LastName.sendKeys(lastname);
	}
	
	public void enter_Address(String address) {
		txtbx_Address.sendKeys(address);
	}
	
	public void enter_CCNo(String ccNo) {
		txtbx_CardNo.sendKeys(ccNo);
	}
	
	public void select_CCtype(String ccType) {
		Select sel = new Select(sel_CardType);
		sel.selectByValue(ccType);
	}
	
	public void select_expMonth(String expMonth) {
		Select sel = new Select(sel_ExpiryMonth);
		sel.selectByValue(expMonth);
	}
	
	public void select_expYear(String expYear) {
		Select sel = new Select(sel_ExpiryYear);
		sel.selectByValue(expYear);
	}
	
	public void enter_cvv(String cvv) {
		txtbx_CVV.sendKeys(cvv);
	}
	
	public void click_BookNowBtn() {
		btn_BookNow.click();
	}
	
	public void validate_BookingConfir(String msg) {
		String tit_BooConfirm = lbl_BookingConfirm.getText();
		Assert.assertEquals(tit_BooConfirm,msg);
	}
	
	public void BookHotelDetails() {
		
		validate_TitleBook("Book A Hotel");
		enter_FirstName("Test");
		enter_LastName("Test");
		enter_Address("Residential Address");
		enter_CCNo("2223334445553322");
		select_CCtype("VISA");
		select_expMonth("3");		
		select_expYear("2020");
		enter_cvv("567");
	}
}
