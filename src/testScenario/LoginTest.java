package testScenario;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonLib.BaseUrl;
import utility.ConstantVariables;
import webPage.LoginPage;

public class LoginTest {
	

		//private static final String Title = null;
		public WebDriver driver;
		SoftAssert soft;
		
		
		@BeforeMethod
		public void setUp()
		{
			//creating object for BaseUrl
			BaseUrl bu= new BaseUrl();
			driver=bu.selectBrowser(ConstantVariables.browser);
			driver.get(ConstantVariables.baseurl);
			//driver.manage().window().maximize();
			soft= new SoftAssert();
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.manage().deleteAllCookies();
			//driver.quit();
		}
		
		@Test(description="validating login with valid login")
		public void test1() throws InterruptedException
		{
			LoginPage loginpage = new LoginPage(driver);
			
			loginpage.validLogin(ConstantVariables.username, ConstantVariables.password);
			
			//loginpage.validLogin(ConstantVariables.username, ConstantVariables.password, Title);
			//loginpage.validLogin(ConstantVariables.username, ConstantVariables.password);
			//Assert.assertEquals(res, ConstantVariables.title,"fail to login");
			
			//Assert.assertTrue(res.contains(ConstantVariables.title),"fail to login");
			String exp="Gmail";
			String a=driver.getTitle();
			if(a.equalsIgnoreCase(exp))
			
				System.out.println("pass");
			
			else
			{
				System.out.println("fail");
			}
		}
		@Test(description="validating login with invalid login")
		public void test2() throws InterruptedException
		{
			LoginPage loginpage = new LoginPage(driver);
			
			loginpage.validLogin(ConstantVariables.usernameInvalid, ConstantVariables.password);
			
			//loginpage.validLogin(ConstantVariables.username, ConstantVariables.password, Title);
			//loginpage.validLogin(ConstantVariables.username, ConstantVariables.password);
			//Assert.assertEquals(res, ConstantVariables.title,"fail to login");
			
			//Assert.assertTrue(res.contains(ConstantVariables.title),"fail to login");
			String exp="Gmail";
			String a=driver.getTitle();
			if(a.equalsIgnoreCase(exp))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
		

}
