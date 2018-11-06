package pageObjectsTest;

import org.openqa.selenium.WebDriver;

import pageObjects.BussinesPage;

public class BusinessPageTest {

private static String pass = "PASS";
private static String failed = "FAILED";
	public static class ClientsPageTest {


	}

		
	

	public static String AddNewBusinessTest(WebDriver driver) throws InterruptedException {
        BussinesPage.GetBusinessPage(driver).click();
        Thread.sleep(1000);
        BussinesPage.GetAddNewBusiness(driver).click(); 
        BussinesPage.SetBusinessName(driver, "East India Company");
        BussinesPage.SetCountries(driver, "Heard");
        BussinesPage.setCity(driver, "Argos");
        BussinesPage.setStreet(driver, "'Ajduk Stanka 57");
        BussinesPage.setZip(driver, "11306");
        BussinesPage.setRegistryNum(driver, "123456");
        BussinesPage.GetAddBankAccount(driver).click();
        Thread.sleep(1000);
        BussinesPage.setAddBankName(driver, "AlfaBanka");
        BussinesPage.SetAddBankCurrency(driver, null);
        BussinesPage.setAccNum(driver, "555666444");
        BussinesPage.setBankPayIns(driver, "blabla");
        BussinesPage.setBankSwiftNum(driver, "45678984");
        BussinesPage.setBankAddAcc(driver);
        BussinesPage.setSaveAcc(driver);
		return pass;
	}
//	public static String AddNewBusinessTestWithoutName(WebDriver driver) throws InterruptedException {
//        BussinesPage.GetBusinessPage(driver).click();
//        Thread.sleep(1000);
//        BussinesPage.GetAddNewBusiness(driver).click(); 
//       // BussinesPage.SetBusinessName(driver, "East India Company");
//        BussinesPage.SetCountries(driver, "Heard");
//        BussinesPage.setCity(driver, "Argos");
//        BussinesPage.setStreet(driver, "'Ajduk Stanka 57");
//        BussinesPage.setZip(driver, "11306");
//        BussinesPage.setRegistryNum(driver, "123456");
//        BussinesPage.GetAddBankAccount(driver).click();
//        Thread.sleep(1000);
//        BussinesPage.setAddBankName(driver, "AlfaBanka");
//        BussinesPage.SetAddBankCurrency(driver, null);
//        BussinesPage.setAccNum(driver, "555666444");
//        BussinesPage.setBankPayIns(driver, "blabla");
//        BussinesPage.setBankSwiftNum(driver, "45678984");
//        BussinesPage.setBankAddAcc(driver);
//        BussinesPage.setSaveAcc(driver);
//        boolean trueForPass = BussinesPage.CheckMissingNameMessage(driver);
//        if (trueForPass)
//        {
//        	return pass;
//        }
//        else
//        {
//        	return failed;
//        }
	}

