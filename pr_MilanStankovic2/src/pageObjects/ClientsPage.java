package pageObjects;

import java.util.List;
import java.time.LocalDate;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DateTimeUtils;


public class ClientsPage {
	//Opening Bsnss page, new bsnss
	public static WebElement GetClientsButton(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']"));
		return A;	}
	public static WebElement GetAddNewClient(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']"));
		return A;	}
//Get elments
	public static WebElement getClientName(WebDriver driver)
    {
        WebElement A = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
        return A;
    }
	public static WebElement GetContactName(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return A;	}
	public static WebElement GetEmail(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return A;	}
	public static WebElement GetRegistryNum(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return A;	}
	public static WebElement GetCountries(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		return A;	}
	public static WebElement GetCity(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return A;	}
	public static WebElement GetStreet(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return A;	}
	public static WebElement GetZip(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return A;	}
	public static WebElement GetDateAdded(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return A;	}
	public static WebElement GetCode(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-input code-field v-text-field']//input[@type='text']"));
		return A;	}
	public static WebElement GetAgreeDate(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("/div[@class='flex xs3 ml-3']//input[@type='text']"));
		return A;	}
	public static WebElement getMonthsForward(WebDriver driver){
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[@class='v-picker v-card v-picker--date']//div[@class='v-picker__body']//div//i[@class='v-icon material-icons'][contains(text(),'chevron_right')]"));
		return A; }
	public static WebElement getMonthsBackward(WebDriver driver){
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[@class='v-picker v-card v-picker--date']//div[@class='v-picker__body']//div//i[@class='v-icon material-icons'][contains(text(),'chevron_left')]"));
		return A; }
	
	public static WebElement getOkCalendar(WebDriver driver)
	{
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[@class='v-btn__content'][contains(text(),'OK')]"));
		return A;
	}
	public static WebElement GetStatus(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple primary--text']"));
		return A;	}
	public static WebElement GetSaveClient(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='flex xs12 mr-1']//button[@type='button']"));
		return A;	}
//setteri
	
	public static void setClientName(WebDriver driver, String clientName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement clientN = getClientName(driver);
		wait.until(ExpectedConditions.elementToBeClickable(clientN));
		clientN.sendKeys(clientName);
	}
	public static void setContactName(WebDriver driver, String contactName)
	{
		GetContactName(driver).click();
		GetContactName(driver).sendKeys(contactName);
	}
	public static void setEmail(WebDriver driver, String email)
	{
		GetEmail(driver).sendKeys(email);
	}
	public static void setRegistryNumber(WebDriver driver, String registryNumber)
	{
		GetRegistryNum(driver).sendKeys(registryNumber);
	}
	public static void setCountry(WebDriver driver, String countryName)
	{
		Actions builder = new Actions(driver);
		Actions country = builder
		.moveToElement(GetCountries(driver))
		.click()
		.sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}
	public static void setCity(WebDriver driver, String city)
	{
		GetCity(driver).sendKeys(city);
	}
	public static void setStreet(WebDriver driver, String street)
	{
		GetStreet(driver).sendKeys(street);
	}
	public static void setZip(WebDriver driver, String zip)
	{
		GetZip(driver).sendKeys(zip);
	}
	public static void setDateAdded(WebDriver driver, String dateAdded) throws InterruptedException
	{
		GetDateAdded(driver).click();
		Thread.sleep(1000);
		LocalDate ld = DateTimeUtils.StringToDate(dateAdded);
		int monthsBetween = DateTimeUtils.MonthsBetweenTwoDates(LocalDate.now(), ld);
		if(monthsBetween>=0)
		{
			for(int i=0;i<monthsBetween;i++)
			{
				getMonthsForward(driver).click();
				Thread.sleep(1000);
			}
		}
		else
		{
			for(int i=0;i>monthsBetween;i--)
			{
				getMonthsBackward(driver).click();
				Thread.sleep(1000);
			}	
		}
        String day = Integer.toString(ld.getDayOfMonth());
        //contains(text(),'10')
        String relXPathToRow =String.format("//*[contains(text(),'%s')]", day);
        List<WebElement> lwe = driver.findElements(By.xpath(relXPathToRow));
        lwe.get(lwe.size()-1).click();
        Thread.sleep(1000);
        System.out.println("Kliknuo na datum");
        getOkCalendar(driver).click();
        Thread.sleep(1000);
        
		
	}
	public static void setCode(WebDriver driver, String code)
	{
		GetCode(driver).sendKeys(code);
	}
	public static void setAgreementDay(WebDriver driver, String agreementDay)
	{
		GetAgreeDate(driver).sendKeys(agreementDay);
	}
	public static void setStatus(WebDriver driver, String status )
	{
		String currentStatus = GetStatus(driver).getText();
		String cs = currentStatus.split(":")[1].trim();
		if(!status.equals(cs))
		{
			GetStatus(driver).click();
		}
	}
	public static void setSave(WebDriver driver)
	{
		GetSaveClient(driver).click();
	}
}


 


