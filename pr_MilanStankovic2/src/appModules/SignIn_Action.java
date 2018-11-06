package appModules;

        import org.openqa.selenium.WebDriver;

     

        import pageObjects.LogIn;

        import utility.ExcelUtils;

    // Now this method does not need any arguments

    public class SignIn_Action {

		public static void Execute(WebDriver driver) throws Exception{

			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

			String sUserName = ExcelUtils.getCellData(1, 1);
			System.out.println("username je" + sUserName);
			String sPassword = ExcelUtils.getCellData(1, 2);
			System.out.println("Pasword je " + sPassword);
			
			LogIn.txtbx_UserName(driver).sendKeys(sPassword);
			
			LogIn.txtbx_Password(driver).sendKeys(sUserName);
			
			LogIn.btn_LogIn(driver).click();

        }

}