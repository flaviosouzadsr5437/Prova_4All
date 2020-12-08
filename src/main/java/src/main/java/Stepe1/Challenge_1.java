package Stepe1;

import org.junit.Test;
import Core.BasePage;
import ScreenLogin.Login;

public class Challenge_1 extends BasePage {
	
	private static Login login = new Login();
	int Incremento = 1;
	
	BaseTestStep1 baseTest = new BaseTestStep1();
	
	@Test
	public void SelecionaTodosDosces() {
		//login.AcessarTelaPrincipal();
		baseTest.BotaoAddCategoria();
		baseTest.BotaoSelecionaDoces();
		baseTest.BotaoAddBrigadeiro();
		baseTest.BotaoAddAlfajor();
		baseTest.BotaoCarinho();
		
		while(Incremento < 4)
		{
			baseTest.BotaoAddQtdBrigadeiro();
			Incremento ++;
		}
		
		if(Incremento == 4) {
			baseTest.verificandoValorTotal();
			baseTest.BotaoFinalizarCompra();
			baseTest.verificandoMensagemSucesso();
			baseTest.BotaoPedidoFinalizadoComSucesso();			
		}		
		//DriverFactory.getDriver().quit();
	}	
}
