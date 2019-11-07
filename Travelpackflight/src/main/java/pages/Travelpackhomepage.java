
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Elements;

public class Travelpackhomepage extends Elements {
	WebDriver driver;

	public Travelpackhomepage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By oneway_by = By.xpath("html/body/div[1]/div/div/div[2]/div/div/div/div/div/div[1]/form/div[1]/label[2]/div/ins");
	By departingplace_by = By.id("FromName");
	By travelling_by = By.id("ToName");
	By departdate_by = By.id("DepDate");
	By adult_by = By.id("Adults");

	public void oneway() {
		driver.findElement(oneway_by).click();
	}

	public void departingplaces(String fromplace) {
		driver.findElement(departingplace_by).sendKeys(fromplace);
		// driver.findElement(By.xpath("//*[@class='ui-datepicker-next
		// ui-corner-all']")).click();
	}

	public void travelto(String toplace) {
		driver.findElement(travelling_by).sendKeys(toplace);
	}

	public void depart() {
		driver.findElement(departdate_by).click();
		//driver.findElement(By.xpath("//*[@class='ui-datepicker-next ui-corner-all']")).click();
		String inputdate = "22-June-2018";
		String day = inputdate.split("-")[0];
		String month = inputdate.split("-")[1];
		String year = inputdate.split("-")[2];
WebElement calender=driver.findElement(By.id("ui-datepicker-div"));
		String displaymonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']")).getText().trim();
		String displayyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-year']")).getText().trim();
	while(!(month.equalsIgnoreCase(displaymonth)&&year.equalsIgnoreCase(displayyear))){
		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e"
				+ "']")).click();
		 displaymonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']")).getText().trim();
		 displayyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-year']")).getText().trim();
	}
	}

	public void adult(String number) {
		selectindrodown(adult_by, dropdowntype.BY_VISIBLE_TEXT, number);
	}

}
