package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class BellingDetails extends CommonMethods{

ExtentTest test;
	
	public BellingDetails(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		@FindBy(id = "coupon_code"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/p[1]/input[1]")
	})
    WebElement discountCode;

	@FindAll({
		@FindBy(id = "billing_first_name"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/p[1]/input[1]")
	})
    WebElement name;
	
	@FindAll({
		@FindBy(id = "billing_last_name"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/p[2]/input[1]")
	})
    WebElement lastName;
	
	@FindAll({
		@FindBy(id = "select2-billing_country-container"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/p[3]/span[1]/span[1]/span[1]/span[1]")
	})
    WebElement country;
	
	@FindAll({
		@FindBy(id = "select2-billing_country-result-r8qo-BD"),
		@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[20]")
	})
    WebElement selectBangladesh;
	
	@FindAll({
		@FindBy(id = "billing_address_1"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/p[4]/input[1]")
	})
    WebElement address;
	
	@FindAll({
		@FindBy(id = "billing_address_2"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/p[5]/input[1]")
	})
    WebElement address2;
	
	@FindAll({
		@FindBy(id = "billing_postcode"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/p[6]/input[1]")
	})
    WebElement postcode;
	
	@FindAll({
		@FindBy(id = "billing_phone"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/p[7]/input[1]")
	})
    WebElement phone;
	
	@FindAll({
		@FindBy(id = "billing_email"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/p[8]/input[1]")
	})
    WebElement email;
	
	@FindAll({
		@FindBy(id = "order_comments"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[4]/div[1]/p[1]/textarea[1]")
	})
    WebElement orderNotes;
	
	@FindAll({
		@FindBy(xpath = "//input[@id='terms']"),
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/label[1]/input[1]")
	})
    WebElement checkBox;
	
	
	public void fillDiscountCode() throws IOException {
		test.info("fill discount  code ");
		try {
			if (discountCode.isDisplayed()) {
				discountCode.clear();
				discountCode.sendKeys("specialdiscount");
				test.pass("<p style=\"color:green; font-size:13px\"><b>discount code provided.</b></p>");
			
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>discount code not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "DiscountCode");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "DiscountCode.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(discountCode.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}

	public void fillName() throws IOException {
		test.info("fill name ");
		try {
			if (name.isDisplayed()) {
				name.clear();
			    name.sendKeys("Mehedi");
				test.pass("<p style=\"color:green; font-size:13px\"><b>name provided.</b></p>");
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>name field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "name");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "name.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(name.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}

	public void fillLastName() throws IOException {
		test.info("fill last name ");
		try {
			if (lastName.isDisplayed()) {
				lastName.clear();
				lastName.sendKeys("Hasan");
				test.pass("<p style=\"color:green; font-size:13px\"><b>lastname provided.</b></p>");
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>last name field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "lastName");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "lastName.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(lastName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	public void clickOnCountry() throws IOException {
		test.info("click on country");
		try {
			if (country.isDisplayed()) {
				country.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>country clicked.</b></p>");
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>country not avilable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickCountry");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickCountry.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(country.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	
	
	
	public void selectCountry() throws IOException {
		test.info("select country");
		try {
			if (country.isDisplayed()) {
				selectBangladesh.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>country selected.</b></p>");
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>country not avilable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectCountry");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectCountry.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(country.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	public void fillAddress() throws IOException {
		test.info("fill address ");
		try {
			if (address.isDisplayed()) {
				address.clear();
			    address.sendKeys("nobodoh housing,road no2,block C");
				test.pass("<p style=\"color:green; font-size:13px\"><b>address provided.</b></p>");
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>address field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "address");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "address.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(address.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	public void fillAddress2() throws IOException {
		test.info("fill address2 ");
		try {
			if (address2.isDisplayed()) {
				address2.clear();
			    address2.sendKeys("House no2, flat no1");
				test.pass("<p style=\"color:green; font-size:13px\"><b>address2 provided.</b></p>");
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>address2 field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "address2");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "address2.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(address2.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	public void fillPostcode() throws IOException {
		test.info("fill postcode ");
		try {
			if (postcode.isDisplayed()) {
				postcode.clear();
			    postcode.sendKeys("1207");
				test.pass("<p style=\"color:green; font-size:13px\"><b>postcode provided.</b></p>");
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>postcode field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "postcode");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "postcode.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(address2.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	public void fillPhoneNumber() throws IOException {
		test.info("fill postcode ");
		try {
			if (phone.isDisplayed()) {
				phone.clear();
			    phone.sendKeys("01868354285");
				test.pass("<p style=\"color:green; font-size:13px\"><b>phone number provided.</b></p>");
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>phone number field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "phoneNumber");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "phoneNumber.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(phone.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	public void fillEmail() throws IOException {
		test.info("fill Email ");
		try {
			if (email.isDisplayed()) {
				email.clear();
			    email.sendKeys("Mehedi45@gmail.com");
				test.pass("<p style=\"color:green; font-size:13px\"><b>email provided.</b></p>");
			
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>email field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "email");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "email.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(email.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	public void fillOrderNotes() throws IOException {
		test.info("fill orderNotes ");
		try {
			if (orderNotes.isDisplayed()) {
				orderNotes.clear();
				orderNotes.sendKeys("early delivery will be appreciable");
				test.pass("<p style=\"color:green; font-size:13px\"><b>orderNotes provided.</b></p>");
				timeOut();
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>orderNotes field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderNotes");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderNotes.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(orderNotes.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(4000);
	}
	
	public void clickOnCheckBox() throws IOException {
		test.info("click checkBox ");
		try {
			if (checkBox.isDisplayed()) {
				checkBox.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>checkBox clicked.</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "checkBox");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "checkBox.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				timeOut(2000);
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>checkBox field not avilabe.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "checkBox");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "checkBox.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(checkBox.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(2000);
	}
	
	
	
}
