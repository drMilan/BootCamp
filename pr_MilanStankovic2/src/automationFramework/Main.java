package automationFramework;
import java.util.concurrent.TimeUnit;
import pageObjectsTest.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.*;

import pageObjects.*;

import utility.Constant;
import pageObjectsTest.*;

// Import Package utility.*

import utility.ExcelUtils;

import appModules.SignIn_Action;
public class Main {
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
String message = "";
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(Constant.URL);

        SignIn_Action.Execute(driver);

        System.out.println("Login Successfully.");
        Thread.sleep(2000);

        //TESTIRANJE BUSINESSPAGE-a
        message = pageObjectsTest.BusinessPageTest.AddNewBusinessTest(driver);
        ExcelUtils.setCellData(message, 1, 14);
   //     message = pageObjectsTest.BusinessPageTest.AddNewBusinessTestWithoutName(driver);
        ExcelUtils.setCellData(message, 2, 14);
        //TESTIRANJE CLIENTSPAGE-a
        Thread.sleep(2000);
        pageObjectsTest.ClientsPageTest.SetUpExcel();
        pageObjectsTest.ClientsPageTest.AddNewClientTest(driver);
        Thread.sleep(10000);
        
        //testovi za ClientPage
      
//        driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']")).click();
//        Thread.sleep(2000);
//        ClientsPageTest.SetUpExcel();
//        ClientsPageTest.AddNewClientTest(driver);
        driver.quit();

        //This is to send the PASS value to the Excel sheet in the result column.

        //ExcelUtils.setCellData("Pass", 1, 3);

		}
}



