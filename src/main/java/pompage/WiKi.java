package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class WiKi {
	WebDriver driver;
	String actualdatewiki;
	String actualcountrywiki;
	


	public  WiKi(WebDriver driver) {
		this.driver=driver;
	driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");

	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
	WebElement releasedatewiki=driver.findElement(By.xpath("(//*[@class='infobox-data'])[10]"));
	js.executeScript("arguments[0].scrollIntoView();", releasedatewiki);
	actualdatewiki=releasedatewiki.getText();
	//System.out.println(actualdatewiki);
	
	WebElement countrywiki=driver.findElement(By.xpath("//td[text()='India']"));
	
	
	actualcountrywiki=countrywiki.getText();
	//System.out.println(actualcountrywiki);
	
}
	public boolean releasewiki () {
		if(actualdatewiki.contains("17 December 2021"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

    public boolean countrywiki() {
    	if(actualcountrywiki.contains("India"))
		{
			return true;
		}
		else
		{
			return false;
		}
    }

}

