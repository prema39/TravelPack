package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
protected WebDriver driver;
protected WebDriverWait wait;
protected JavascriptExecutor js;

public Elements(WebDriver driver){
	this.driver=driver;
	wait=new WebDriverWait(driver,20) ;
	js=(JavascriptExecutor)driver;
}

	
public enum dropdowntype{
	BY_INDEX, BY_VALUE, BY_VISIBLE_TEXT
}
public void selectindrodown(By locator,dropdowntype type,Object value){
Select sel=new Select(driver.findElement(locator));
switch(type){
case BY_INDEX:
	sel.selectByIndex(((Integer)value).intValue());
	break;
case BY_VISIBLE_TEXT:
	sel.selectByVisibleText((String)value);
	break;
case BY_VALUE:
	sel.selectByValue((String)value);
}
}
}
