package Stepe1;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;
import Core.BasePage;

public class BaseTestStep1 extends BasePage {


	Step1Utils util = new Step1Utils();
	
	public void BotaoAddCategoria() {
		ClicarBotao(By.id(util.btnCategoria));
	}
	
	public void BotaoSelecionaDoces() {
		ClicarBotao(By.id(util.btnSelectDoces));
	}
	
	public void BotaoAddBrigadeiro() {
		ClicarBotao(By.id(util.btnBrigadeiro));
	}
	
	public void BotaoAddAlfajor() {
		ClicarBotao(By.id(util.btnAlfajor));
	}
	
	public void BotaoCarinho() {
		ClicarBotao(By.id(util.btnCarrinho));
	}

	public void BotaoAddQtdBrigadeiro() {
		ClicarBotao(By.id(util.btnQtdBrigadeiro));
	}
	
	public void BotaoFinalizarCompra() {
		ClicarBotao(By.id(util.btnFinalizarCompra));
	}
	
	public void BotaoPedidoFinalizadoComSucesso() {
		ClicarBotao(By.xpath(util.btnFinalizarComSucesso));
	}
	
	public void verificandoValorTotal() {
		Assert.assertEquals(util.msmValorTotal, obterMensagemAlertTotal());
	}
	
	public void verificarValorTotalDoces() {
		Assert.assertEquals(util.msmvalorTotalDoces, obterMensagemAlertTotal());
	}
	
	public void verificarBrigadeiroIncluidoComSucesso() {
		Assert.assertEquals(util.msmBrigadeiroAddSucesso, obterMensagemAlertDoceBrigadeiro());
	}
	
	public void verificarAlfajorIncluidoComSucesso() {
		Assert.assertEquals(util.msmAlfajorAddSucesso, obterMensagemAlertDocesAlfajot());
	}
	
	
	public void EncontrarBotaoIncluirBrigadeiro() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.textToBe(By.xpath(util.btnAddBrigadeiroAjax),util.msmBrigadeiroAddSucesso));
	}	
	
	public void EncontrarBotaoIncluirAlfajor() {
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
		wait.until(ExpectedConditions.textToBe(By.xpath("/html/body/div/div[2]/div[2]/div/div/button"), util.msmAlfajorAddSucesso));
		
	}
	
	public void verificandoMensagemSucesso() {
		Assert.assertEquals(util.msmPedidoRealizadoSucesso, obterMensagemAlertFinalizarSucesso());
	}
}
