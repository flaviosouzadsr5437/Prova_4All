package Step2;

import org.junit.Test;

import Core.DriverFactory;
import Core.proprieter;
import ScreenLogin.Login;

public class Challenge_2 {

	Login login = new Login();
	BaseTestStep2 baseTest = new BaseTestStep2();
	proprieter ppt = new proprieter();
	
	int addRisoles = 1;
    int  IncrementiRiloses = 9;
	int DecrementoRiloses = 5;
	
	@Test
	public void SelecionarBebidasRisoles() throws InterruptedException {		
		//login.AcessarTelaPrincipal();		
		baseTest.SelecionarCategoria();
		baseTest.SelecionarBebidas();
		baseTest.BotaoAddCoca();
		baseTest.BotaoAddFanUva();			
		baseTest.BotaoAguaSemGas();
		baseTest.BotaoAguaSemGas();
		baseTest.SelecionarCategoria();
		baseTest.SelecionarCategoriaTodos();
		baseTest.BotaoAddRisolesMedio();
		baseTest.BotaoAcessarCarinho();
		
		while(addRisoles < IncrementiRiloses) {
			baseTest.BotaoIncrementarRisoles();
			addRisoles ++;
		}
		
		while(addRisoles > DecrementoRiloses) {
			baseTest.BotaoDecrementarRisoles();
			addRisoles --;
		}
		
		baseTest.ValidandoValorTotal();		
		baseTest.BotaoFinalizarCompra();
		baseTest.ValidarConfirmacaoSucesso();
		baseTest.BotaoFinalizarConfirmacaoDeCompra();
	}
}
