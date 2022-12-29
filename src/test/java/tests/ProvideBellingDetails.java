package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
//import pages.CreateAnAccountPage;
import pages.HomePage;
import pages.BellingDetails;
import utilities.ExtentFactory;

public class ProvideBellingDetails extends BaseDriver{

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>BellingDetails</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
	//	PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void fillDiscountCode() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide discount code.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillDiscountCode();
	}
	
	@Test(priority = 1)
	public void fillName() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide name.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillName();
	}
	
	@Test(priority = 2)
	public void fillLastName() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide last name.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillLastName();
	}
	
	@Test(priority = 3)
	public void clickOnCountry() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on country.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.clickOnCountry();
	}
	
	@Test(priority = 4)
	public void selectCountry() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>select country.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.selectCountry();
	}
	
	@Test(priority = 5)
	public void fillAddress() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide address.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillAddress();
	}
	
	@Test(priority = 6)
	public void fillAddress2() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide address2.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillAddress2();
	}
	
	@Test(priority = 7)
	public void fillPostcode() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide  Postcode.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillPostcode();
	}
	
	@Test(priority = 8)
	public void fillPhoneNumber() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide phone number.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillPhoneNumber();
	}
	
	@Test(priority = 9)
	public void fillEmail() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide Email.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillEmail();
	}
	
	@Test(priority = 10)
	public void fillOrderNotes() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>provide orderNotes.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.fillOrderNotes();
	}
	
	@Test(priority = 11)
	public void clickOnCheckBox() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>clicke On checkBox.</b></p>");
		BellingDetails bellingdetails = new BellingDetails(childTest);
		bellingdetails.clickOnCheckBox();
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	
	
	
	
}
