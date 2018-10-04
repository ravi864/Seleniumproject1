package locatorRepository;

import org.openqa.selenium.By;

public class LocatorRepository {
	public By Email = By.xpath(".//*[@id='identifierId']");
	public By NxtButton = By.xpath(".//*[@id='identifierNext']/content");
	public By pwdfield = By.xpath(".//*[@id='password']/div[1]/div/div[1]/input");
	public By NxtButtonpwd = By.xpath(".//*[@id='passwordNext']/content/span");
	
}
