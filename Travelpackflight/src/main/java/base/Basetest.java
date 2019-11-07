package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import util.Configuration;

public class Basetest  {
	public static  WebDriver driver;
	
	@BeforeSuite
	public void suitsetup(){
		Configuration.loadconfiguration();
	}
	@BeforeMethod()
		public  void launchbrowser(){
		String browsername=Configuration.getbrowsername();
		switch(browsername){
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrishinsrihan\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "Ie":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\vrishinsrihan\\Downloads\\IEDriverServer_x64_2.53.0/IEDriverserver.exe");
			driver=new InternetExplorerDriver();
		break;	
		default:
				System.out.println("please enter any browsername"+ browsername);
		}
		
		driver.manage().window().maximize();
		driver.get(Configuration.geturl());
		
		
			}
	//@AfterMethod()
	//public static void closebrowser(){
	//	driver.quit();
	//}
	
	}


