package genericPackage;

import org.openqa.selenium.WebElement;

public class WorkLib extends BaseText {
	
	

	public void handleFrameByIndex(int index)
	{
		
		
		driver.switchTo().frame(index);
		
		
	}
	public void handleFrameByFrameEleemnt(WebElement frameElement)
	{
		
		driver.switchTo().frame( frameElement);
	}
	
	

}
