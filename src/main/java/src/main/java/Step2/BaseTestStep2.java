package Step2;

import org.junit.Assert;
import org.openqa.selenium.By;

import Core.BasePage;

public class BaseTestStep2 extends BasePage {

	public void SelecionarCategoria() {
		ClicarBotao(By.id("open-categories-btn"));
	}
	
	public void SelecionarCategoriaTodos() {
		ClicarBotao(By.id("category-all"));
	}
	
	public void SelecionarBebidas() {
		ClicarBotao(By.id("category-0"));
	}
	
	public void BotaoAddCoca() {
		ClicarBotao(By.id("add-product-0-btn"));
	}
	
	public void BotaoAddFanUva() {
		ClicarBotao(By.id("add-product-1-btn"));
	}
	
	public void BotaoAguaSemGas() {
		ClicarBotao(By.id("add-product-2-btn"));
	}
	
	public void BotaoAddRisolesMedio() {
		ClicarBotao(By.id("add-product-3-btn"));
	}
	
	public void BotaoAcessarCarinho() {
		ClicarBotao(By.id("cart-products-qtd"));
	}
	
	public void ValidandoValorTotal() {
		Assert.assertEquals("R$ 36,00", obterMensagemAlertTotal());
	}
	
	public void BotaoFinalizarCompra() {
		ClicarBotao(By.id("finish-checkout-button"));
	}
	
	public void BotaoFinalizarConfirmacaoDeCompra() {
		ClicarBotao(By.xpath("/html/body/div/div[3]/div/div/div/button"));
	}
	
	public void ValidarConfirmacaoSucesso() {
		Assert.assertEquals("Pedido realizado com sucesso!", obterMensagemAlertFinalizarSucesso());
	}
	
	public void BotaoIncrementarRisoles() {
		ClicarBotao(By.id("add-product-3-qtd"));
	}
	
	public void BotaoDecrementarRisoles() {
		ClicarBotao(By.id("remove-product-3-qtd"));
	}
}
