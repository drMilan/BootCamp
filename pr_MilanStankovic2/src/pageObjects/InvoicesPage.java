package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvoicesPage {
	//Opening Bsnss page, new bsnss
	public static WebElement GetInvoicesButton(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//label[contains(text(),'Client Name')]"));
		return A;	}
	public static WebElement GetAddNewInvoice(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-input v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return A;	}
	
	//select header elements
	public static WebElement GetSellClient(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//label[contains(text(),'Client Name')]"));
		return A;	}
	public static WebElement GetSellStatus(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-input v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return A;	}
	public static WebElement GetSellFrom(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//label[contains(text(),'Client Name')]"));
		return A;	}
	public static WebElement GetSellTo(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-input v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return A;	}
	public static WebElement GetRefreshChoose(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//label[contains(text(),'Client Name')]"));
		return A;	}
	public static WebElement GetRefresh(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-input v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return A;	}
	// invoices elements
	
	public static WebElement GetGoBack(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//a[@id='inv-form-back-btn']//div[@class='v-btn__content']"));
		return A;	}
	public static WebElement GetTitle(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//strong[@id='click-to-enter']"));
		return A;	}
	public static WebElement GetDraft(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='v-input v-text-field v-text-field--single-line v-select v-input--is-label-active v-input--is-dirty']//div[@class='v-input__append-inner']"));
		return A;	}
	public static WebElement GetTo(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='layout pa-2 column']//div[@class='v-select__selections']"));
		return A;	}
	public static WebElement GetFrom(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='layout pa-2 secondary column']//div[@class='v-select__selections']"));
		return A;	}
	public static WebElement GetInvoiceNum(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-number']"));
		return A;	}
	public static WebElement GetSubmittedDate(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-date-submitted']"));
		return A;	}
	public static WebElement GetDueDate(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-date-duedate']"));
		return A;	}
	public static WebElement GetBasis(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-basis']"));
		return A;	}
	public static WebElement GetCurrency(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='flex xs4 ml-2']//div[@class='v-select__selections']"));
		return A;	}

//invoice contents
	public static WebElement GetAdd(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//i[contains(text(),'add')]"));
		return A;	}
	public static WebElement GetService(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-service-0']"));
		return A;	}
	public static WebElement GetNote(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-service-0']"));
		return A;	}
	public static WebElement GetDays(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-days-0']"));
		return A;	}
	public static WebElement GetHours(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-hours-0']"));
		return A;	}
	public static WebElement GetRatePerHour(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-rate-0']"));
		return A;	}
	public static WebElement GetAmmount(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-amount-0']"));
		return A;	}
	public static WebElement GetDeleteIcon(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//i[contains(text(),'delete')]"));
		return A;	}
	public static WebElement GetNotes(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//textarea[@id='inv-form-notes']"));
		return A;	}
	public static WebElement GetDiscount(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-discount']"));
		return A;	}
	public static WebElement GetTax(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//input[@id='inv-form-tax']"));
		return A;	}
	
	//Bottom page
	
	public static WebElement GetSelectBusiness(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//label[contains(text(),'Select Business')]"));
		return A;	}
	public static WebElement GetBankInfo(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//strong[@id='inv-form-bank-info']"));
		return A;	}
	public static WebElement GetCancel(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[contains(text(),'cancel')]"));
		return A;	}
	public static WebElement GetSave(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[contains(text(),'save')]"));
		return A;	}
	public static WebElement GetExportPDF(WebDriver driver) {
		WebElement  A = driver.findElement(By.xpath("//div[@class='layout pa-2']//div[@class='flex']"));
		return A;	}


	
	
	
}
