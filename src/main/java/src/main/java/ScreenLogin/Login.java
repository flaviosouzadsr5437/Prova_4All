package ScreenLogin;
import static Core.DriverFactory.getDriver;

public class Login {
	
	public void AcessarTelaPrincipal() {
		getDriver().get("https://shopcart-challenge.4all.com/");		
	}	
}
