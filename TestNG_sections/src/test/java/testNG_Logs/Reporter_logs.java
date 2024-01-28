package testNG_Logs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_logs {
	
	@Test
	public void testing() {
		
		Reporter.log("================== setting bowser =======================",true);
		Reporter.log("================== launching bowser =======================", true);
		Reporter.log("================== Entering password : pwd =======================");
	
	}

}
