package webPage;

import org.openqa.selenium.WebDriver;

import commonLib.ReuseableMethods;
import locatorRepository.LocatorRepository;

public class LoginPage {

	public WebDriver driver;
	ReuseableMethods reuse;
	LocatorRepository obj;

	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		reuse= new ReuseableMethods(driver);
		
		//obj=PageFactory.initElements(driver, LocatorRepository.class);
		obj = new LocatorRepository();
		
		
	}
	
	private void setUsername(String username)
	{
		reuse.typeData(obj.Email, username);
	}
	private void setPwd (String password)
	{
		reuse.typeData(obj.pwdfield, password);
	}
	private void clickbutton ()
	{
		reuse.clickonbutton(obj.NxtButton);
		
	}
	private void clickbuttonpwd ()
	{
		reuse.clickonbutton(obj.NxtButtonpwd);
	}
	/*private void clickonbuttanuser()
	{
		reuse.clickonbutton(obj.Anotheruserfield);
	}
	private boolean valuedheaderText ()
	{
		return reuse.textisDisplayed(obj.headerText);
	}*/
	
	
	
	
	
	public void validLogin(String username, String password) throws InterruptedException 
	{
		
		{
			
			setUsername(username);
			//clickbutton();
			Thread.sleep(2000);
			setPwd(password);
			clickbuttonpwd();
		
			
		}
		
	}
	public void inValidLogin(String username, String password) throws InterruptedException
	{
		
		{
			setUsername(username);
			//clickbutton();
			Thread.sleep(2000);
			setPwd(password);
			clickbuttonpwd();		
		
		}
	
	}


	
}
