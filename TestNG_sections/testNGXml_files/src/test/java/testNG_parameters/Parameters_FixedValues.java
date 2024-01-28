package testNG_parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_FixedValues {
	
	@Test
	@Parameters("app")
	public void apptype(String app) {
		System.out.println("app using : "+app);
	}
	
	@Test
	@Parameters("browser")
	public void browserUsed(String browser) {
		System.out.println("Browser using : "+browser);
	}
	
	@Test
	@Parameters("system")
	public void systemUsed(String system) {
		System.out.println("system using : "+system);
	}

}
// ========================= run parametrs.xml file ==========================