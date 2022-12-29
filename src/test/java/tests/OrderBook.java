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


public class OrderBook extends BaseDriver {

	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Order A book</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
//	@Test(priority = 0)
//	public void ClickOnBangla() throws IOException {
//		childTest = parentTest
//				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On bangla.</b></p>");
//		HomePage homePage = new HomePage(childTest);
//		homePage.clickOnBangla();
//	}
	
	
	@Test(priority = 0)
	public void hoverOnBangla() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Hover on bangla.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.hoverOnBangla();
	}
	
	@Test(priority = 1)
	public void clickOnUpponash() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on upponash.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOnUpponash();
	}
	
	@Test(priority = 2)
	public void selectNextPage() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>select next page.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.selectNextPage();
	}
	
	@Test(priority = 3)
	public void addToCart() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click add to cart button.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.addToCart();
	}
	
	@Test(priority = 4)
	public void hoverOnCartIcon() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>hover on cart icon.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.hoverOnCartIcon();
	}
	
	@Test(priority = 5)
	public void clickOnCheckOut() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on checkout.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOnCheckOut();
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
