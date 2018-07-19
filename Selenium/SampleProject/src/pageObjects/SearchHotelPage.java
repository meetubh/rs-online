package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

public class SearchHotelPage {
	
	public SearchHotelPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Search Hotel ')]") 
	private WebElement lbl_SearchHotel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='location']") 
	private WebElement sel_Location;
	
	@FindBy(how = How.XPATH, using = "//*[@id='hotels']") 
	private WebElement sel_Hotel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='room_type']") 
	private WebElement sel_RoomType;
	
	@FindBy(how = How.XPATH, using = "//*[@id='room_nos']") 
	private WebElement sel_RoomNo;
	
	@FindBy(how = How.XPATH, using = "//*[@id='datepick_in']") 
	private WebElement sel_DateIn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='datepick_out']") 
	private WebElement sel_DateOut;
	
	@FindBy(how = How.XPATH, using = "//*[@id='adult_room']") 
	private WebElement sel_Adults;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Submit']") 
	private WebElement btn_Search;
	
	public void validate_TitleSearch(String title) {
		String tit_SearchHotel = lbl_SearchHotel.getText();
		Assert.assertEquals(tit_SearchHotel,title);
	}
	
	public void select_Location(String location) {
		Select sel = new Select(sel_Location);
		sel.selectByValue(location);
	}
	
	public void select_Hotel(String hotel) {
		Select sel = new Select(sel_Hotel);
		sel.selectByValue(hotel);
	}

	public void select_RoomType(String roomType) {
		Select sel = new Select(sel_RoomType);
		sel.selectByValue(roomType);
	}
	
	public void select_RoomNo(String roomNo) {
		Select sel = new Select(sel_RoomNo);
		sel.selectByValue(roomNo);
	}
	
	public void select_InDate(String inDate) {
		Select sel = new Select(sel_DateIn);
		sel.selectByValue(inDate);
	}
	
	public void select_OutDate(String outDate) {
		Select sel = new Select(sel_DateOut);
		sel.selectByValue(outDate);
	}
	
	public void select_AdultNo(String adultNo) {
		Select sel = new Select(sel_Adults);
		sel.selectByValue(adultNo);
	}
	
	public void click_searchBtn() {
		btn_Search.click();
	}
	
	public void fill_HotelDetails() {
		validate_TitleSearch("Search Hotel (Fields marked with Red asterix (*) are mandatory)");
		select_Location("Melbourne");
		select_Hotel("Hotel Creek");
		select_RoomType("Double");
		select_RoomNo("3");
		//select_InDate("3");
		//select_OutDate("4");
		select_AdultNo("2");
	} 
	
	/*public void enterData(DataTable table){ 
	      //Initialize data table 
	      List<List<String>> data = table.raw();
	      System.out.println(data.get(1).get(1)); 
	      validate_TitleSearch("Search Hotel (Fields marked with Red asterix (*) are mandatory)");
	      //Enter data
	      select_Location(data.get(1).get(1));
	      select_Hotel(data.get(1).get(2));
	      select_RoomType(data.get(1).get(3));
	      select_RoomNo(data.get(1).get(4));
	      select_AdultNo(data.get(1).get(5));
} */

}