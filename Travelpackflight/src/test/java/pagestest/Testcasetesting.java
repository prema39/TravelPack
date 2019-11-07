package pagestest;



import org.testng.annotations.Test;

import base.Basetest;
import pages.Travelpackhomepage;


public class Testcasetesting extends Basetest {

	@Test()
	public void bookflight(){
		Travelpackhomepage th=new Travelpackhomepage(driver);
		//th.oneway();
		th.departingplaces("London");
		th.travelto("Hyderabad");
		th.depart();
		th.adult("5 Adults");
	}
}