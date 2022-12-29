package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import drivers.PageDriver;

import utilities.CommonMethods;
import utilities.GetScreenShot;

public class HomePage extends CommonMethods{

	
	ExtentTest test;
	
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
//	
//	@FindBy(xpath = "//a[@href=\"https://www.printworksbd.com/product-category/bangla-books/\"]")
//	public WebElement bangla;
	
	//@FindBy  = driver.findelement(By.)
		@FindAll({
			@FindBy(xpath = "//header/div[3]/div[1]/div[2]/ul[1]/li[5]/a[1]"),
			@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/header[1]/div[3]/div[1]/div[2]/ul[1]/li[5]/a[1]")
		})
	    WebElement bangla;
	
		@FindAll({
			@FindBy(xpath = "//header/div[3]/div[1]/div[2]/ul[1]/li[5]/div[1]/div[1]/ul[1]/li[1]/a[1]")
		})
	    WebElement upponash;
	
		@FindAll({
			@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/nav[1]/form[1]/select[1]"),
			@FindBy(xpath ="//select[@name='count']")
		})
	    WebElement select;
	
		@FindAll({
			@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[4]/div[1]/a[1]")
		})
	    WebElement addToCart;	
		
	   @FindAll({
			@FindBy(xpath = "//header/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/span[1]")
		})
	    WebElement cartIcon;	
		
	   @FindAll({
			@FindBy(xpath = "//a[contains(text(),'Checkout')]")
			
		})
	    WebElement checkOut;	
		

//		public void clickOnBangla() throws IOException {
//			test.info("Click on bangla Button");
//			try {
//				if (bangla.isDisplayed()) {
//					bangla.click();
//					test.pass("<p style=\"color:green; font-size:13px\"><b>bangla Button Clicked.</b></p>");
//					timeOut();
//				}
//			} catch (Exception e) {
//				test.fail("<p style=\"color:red; font-size:13px\"><b>bangla location not avialble.</b></p>");
//				Throwable t = new InterruptedException("Exception");
//				test.fail(t);
//				@SuppressWarnings("unused")
//				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "banglaButton");
//				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "banglaButton.png";
//				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//				Assert.assertTrue(bangla.isDisplayed());
//				PageDriver.getCurrentDriver().quit();
//			}
//			timeOut(2000);
//		}
		
		
	
		public void hoverOnBangla() throws IOException {
			test.info("hover on bangla button");
			Actions action = new Actions(PageDriver.getCurrentDriver());
			try {
				if (bangla.isDisplayed()) {
					action.clickAndHold(bangla).build().perform();
					test.pass("<p style=\"color:green; font-size:13px\"><b>Hover worked.</b></p>");
					timeOut();
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>Hover didn't work.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "banglaButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "banglaButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(bangla.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		
		public void clickOnUpponash() throws IOException {
			test.info("Click on upponash Button");
			try {
				if (upponash.isDisplayed()) {
					upponash.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>upponash Button Clicked.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>upponash location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "upponashButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "upponashButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(upponash.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(2000);
		}
		
		public void selectNextPage() throws IOException {
			test.info("select next page");
			try {
				if (select.isDisplayed()) {
					Select selectItems = new Select(select);
					selectItems.selectByValue("24");
					test.pass("<p style=\"color:green; font-size:13px\"><b>next page selected.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectNextPage");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectNextPage.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(2000);
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>next page not avilable.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectNextPage");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectNextPage.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(select.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(2000);
		}
		
		
		public void addToCart() throws IOException {
			test.info("Click on addTocart Button");
			try {
				if (addToCart.isDisplayed()) {
					addToCart.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>add to cart button clicked.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addToCart");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addToCart.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(1000);
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>add to cart button not avilable.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addToCart");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addToCart.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(addToCart.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(20000);
		}
		
		public void hoverOnCartIcon() throws IOException {
			test.info("hover on cart icon");
			Actions action = new Actions(PageDriver.getCurrentDriver());
			try {
				if (cartIcon.isDisplayed()) {
					action.clickAndHold(cartIcon).build().perform();
					test.pass("<p style=\"color:green; font-size:13px\"><b>Hover worked.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "cartIcon");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "cartIcon.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(2000);
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>Hover not work.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "cartIcon");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "cartIcon.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(cartIcon.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(3000);
		}
		
		public void clickOnCheckOut() throws IOException {
			test.info("click on checkout button");
			try {
				if (checkOut.isDisplayed()) {
					checkOut.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>checkOut Button Clicked.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "checkOutButton");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "checkOutButton.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>chekout location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "checkOutButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "checkOutButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(checkOut.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
	
}
