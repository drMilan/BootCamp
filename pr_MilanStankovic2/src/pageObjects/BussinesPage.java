package pageObjects;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class BussinesPage {
	private static String missingNameMessage = "The name field is required.";
	//Opening Bsnss page, new bsnss
	public static WebElement GetBusinessPage(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//a[@id='nav-bar-business']"));
		return A;	}
	public static WebElement GetAddNewBusiness(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//a[@id='add-new-business']"));
		return A;	}
	public static WebElement GetSaveAcc(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return A;	}

	//getting elements
	public static WebElement GetBusinessName(WebDriver driver) {
		WebElement  businessName = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return businessName; }

	public static WebElement GetCountries(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return A;	}
	public static WebElement GetCity (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return A;	}
	public static WebElement GetStreet (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return A;	}
	public static WebElement GetZip (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		return A;	}
	public static WebElement GetRegistryNumber(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return A;	}

	
// getting bank elements
	public static WebElement GetAddBankAccount (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']"));
		return A;	}
	public static WebElement GetBankName (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return A;	}
	public static WebElement GetBankAccNumber (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return A;	}
	public static WebElement GetBankSwiftNum (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return A;	}
	public static WebElement GetBankPayIns (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return A;	}
	public static WebElement GetBankCurrency (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//label[contains(text(),'Currency')]"));
		return A;	}
	public static WebElement GetBankAddAcc (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return A;	}
	public static WebElement GetBankCancel (WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
		return A;	}


// setters
//set open business

	public static void SetBusinessPage(WebDriver driver ) {
		GetBusinessPage(driver).click();
	}
	public static void SetAddNewBusiness(WebDriver driver ) {
		GetAddNewBusiness(driver).click();
	}
	public static void setSaveAcc(WebDriver driver) {
		GetSaveAcc(driver).click();
	}
	
	
	//set elements
	public static void SetBusinessName(WebDriver driver, String businessName ) {
		GetBusinessName(driver).sendKeys(businessName);
	}
		
	public static void SetCountries(WebDriver driver, String countryName) throws InterruptedException
		{   
		Actions builder = new Actions(driver);
		Actions country = builder
		.moveToElement(GetCountries(driver))
		.click()
		.sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
		}
	public static void setCity(WebDriver driver, String cityName) {
		GetCity(driver).sendKeys(cityName);
	}
	public static void setStreet(WebDriver driver, String streetName) {
		GetStreet(driver).sendKeys(streetName);
	}
	public static void setZip(WebDriver driver, String zipNum) {
		GetZip(driver).sendKeys(zipNum);
	}
	public static void setRegistryNum(WebDriver driver, String registryNumber) {
		GetRegistryNumber(driver).sendKeys(registryNumber);
	}

	// set add bank acc
	
	public static void setAddBankAccount(WebDriver driver) {
		GetAddBankAccount(driver).click();
	}
	public static void setAddBankName(WebDriver driver, String bankName) {
		GetBankName(driver).sendKeys(bankName);
	}
	public static void setAccNum(WebDriver driver, String BankAccNumber) {
		GetBankAccNumber(driver).sendKeys(BankAccNumber);
	}
	public static void setBankPayIns(WebDriver driver, String BankPayIns) {
		GetBankPayIns(driver).sendKeys(BankPayIns);
	}
	public static void setBankSwiftNum(WebDriver driver, String BankSwiftNum) {
		GetBankSwiftNum(driver).sendKeys(BankSwiftNum);
	}
	
	
	public static void SetAddBankCurrency(WebDriver driver, List<WebDriver> currency ) {
		GetBankCurrency(driver).click();
		driver.findElement(By.xpath("//div[@class='v-menu__content menuable__content__active']//div[@class='v-list']//div[3]//a[1]")).click();
		
		
	}
	
	
	public static void setBankAddAcc(WebDriver driver) {
		GetBankAddAcc(driver).click();
	}
	public static void setBankCancel(WebDriver driver) {
		GetBankCancel(driver).click();
	}
	public static WebElement getMissingNameMessage(WebDriver driver)
	{
		
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
		return A;	}
	public static boolean CheckMissingNameMessage(WebDriver driver)
	{
		
		String message = getMissingNameMessage(driver).getText();
		if(message.equals(missingNameMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}