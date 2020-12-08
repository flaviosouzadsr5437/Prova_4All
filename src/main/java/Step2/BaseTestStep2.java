package Step2;

import static Core.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.BasePage;

public class BaseTestStep2<Utilitarios> extends BasePage {

	Step2Utils stp2Utils = new Step2Utils();
	
	
	public void SelecionarCategoria() {
		ClicarBotao(By.id(stp2Utils.BotaoSelecionarCategoria));		
	}
		
	public void SelecionarCategoriaTodos() {
		ClicarBotao(By.id(stp2Utils.BotaoSelecionarTodasCategorias));
	}
	
	public void SelecionarBebidas() {
		ClicarBotao(By.id(stp2Utils.BotaoSelecionarBebidas));
	}
	
	public void BotaoAddCoca() {
		ClicarBotao(By.id(stp2Utils.BotaoAddCocoCala));
	}
	
	public void BotaoAddFanUva() {
		ClicarBotao(By.id(stp2Utils.BotaoAddFantaUva));
	}
	
	public void BotaoAguaSemGas() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 90);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(stp2Utils.BotaoAddAguaSemGas)));
		ClicarBotao(By.id(stp2Utils.BotaoAddAguaSemGas));
	}
	
	public void BotaoAddRisolesMedio() {
		ClicarBotao(By.id(stp2Utils.BotaoAddRisolesMedio));
	}
	
	public void BotaoAcessarCarinho() {
		ClicarBotao(By.id(stp2Utils.BotaoCarrinho));
	}
	
	public void ValidandoValorTotal() {
		Assert.assertEquals(stp2Utils.msmValorTotal, obterMensagemAlertTotal());
	}
	
// Caso crie outra classe com os utilitarios não será precisso as proximas tres linhas //	
	public void BotaoFinalizarCompra() {
		ClicarBotao(By.id(stp2Utils.BotaoFinalizarCompra));		
	}
	
	public void BotaoFinalizarConfirmacaoDeCompra() {
		ClicarBotao(By.xpath(stp2Utils.BotaoFinalizarConfirmacaoCompra));
	}
	
	public void ValidarConfirmacaoSucesso() {
		Assert.assertEquals(stp2Utils.msmPedidoConfirmado, obterMensagemAlertFinalizarSucesso());
	}
//																					  //
	
	public void BotaoIncrementarRisoles() {
		ClicarBotao(By.id(stp2Utils.BotaoIncrementarRisoles));
	}
	
	public void BotaoDecrementarRisoles() {
		ClicarBotao(By.id(stp2Utils.BotaoDecrementarRisoles));
	}		
}
