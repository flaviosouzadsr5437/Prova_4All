package Step2;

import org.junit.Test;

import ScreenLogin.Login;

public class Challenge_2 {

	Login login = new Login();
	BaseTestStep2 baseTest = new BaseTestStep2();
	int addRisoles = 1;
	
	@Test
	public void SelecionarBebidasRisoles() {
		//login.AcessarTelaPrincipal();
		baseTest.SelecionarCategoria();
		baseTest.SelecionarBebidas();
		baseTest.BotaoAddCoca();
		baseTest.BotaoAddFanUva();
		baseTest.BotaoAguaSemGas();
		baseTest.SelecionarCategoria();
		baseTest.SelecionarCategoriaTodos();
		baseTest.BotaoAddRisolesMedio();
		baseTest.BotaoAcessarCarinho();
		
		while(addRisoles <9) {
			baseTest.BotaoIncrementarRisoles();
			addRisoles ++;
		}
		
		while(addRisoles > 5) {
			baseTest.BotaoDecrementarRisoles();
			addRisoles --;
		}
		
		baseTest.ValidandoValorTotal();
		baseTest.BotaoFinalizarCompra();
		baseTest.ValidarConfirmacaoSucesso();
		baseTest.BotaoFinalizarConfirmacaoDeCompra();
	}
}
