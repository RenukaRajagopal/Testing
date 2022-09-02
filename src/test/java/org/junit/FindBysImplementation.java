package org.junit;

import java.io.IOException;

public class FindBysImplementation extends Baseclassmethods {
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		getUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait(30);
	}

	@Test
	public void hotelLogin() throws IOException {
	FindBysExample findbys=new FindBysExample();
	findbys.login("Renukagowri", "Renugopal@30");
	}
}
