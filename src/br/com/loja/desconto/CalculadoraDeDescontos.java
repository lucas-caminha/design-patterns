package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	/**
	 * Chain of Responsibility � um padr�o de design comportamental que permite passar solicita��es ao longo
	 * de uma cadeia de manipuladores. Ao receber uma solicita��o,
	 * cada manipulador decide processar a solicita��o ou pass�-la para o pr�ximo manipulador na cadeia.
	 */
	public BigDecimal calcular(Orcamento orcamento) {	
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
	
}
