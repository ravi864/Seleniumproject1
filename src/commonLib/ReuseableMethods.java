package commonLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReuseableMethods {
	public WebDriver driver;
	WebDriverWait wait;
	//here ReuseableMethods is a constructor
	//we will use this keyword
	public ReuseableMethods(WebDriver driver)
	{

		this.driver=driver;
	}
	
	public String textisDisplayed(By elementpath)
	{
		return driver.findElement(elementpath).getText();
	}
	public void typeData(By elementpath, String text)
	{
		driver.findElement(elementpath).sendKeys(text);
	}
	public void clickonbutton(By elementpath)
	
	{
		driver.findElement(elementpath).click();
	}
	public void clickonlink(By elementpath)
	{
		driver.findElement(elementpath).click();
	}
	public String getpageTitle()
	{
		return driver.getTitle();
	}

	public void explicitywait(By elementpath, String text)
	{
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe(elementpath, text));
	}

}
