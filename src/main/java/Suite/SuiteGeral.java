package Suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import Core.proprieter;
import ScreenLogin.Login;
import Step2.Challenge_2;
import Stepe1.Challenge_1;
import static Core.DriverFactory.killDriver;
import java.io.IOException;

@RunWith(Suite.class)
@SuiteClasses({
Challenge_1.class,
Challenge_2.class
	
})

public class SuiteGeral {
	
	@BeforeClass
	public static void AcessarTela() {
		Login login = new Login();
		login.AcessarTelaPrincipal();	
	}

	
	@AfterClass
	public static void finalizar() throws IOException {	
		if(proprieter.FECHAR_BROWSER) {
		killDriver();
		}
	}
	
}
