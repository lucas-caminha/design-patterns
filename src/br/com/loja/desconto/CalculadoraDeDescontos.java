package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	/**
	 * Chain of Responsibility é um padrão de design comportamental que permite passar solicitações ao longo
	 * de uma cadeia de manipuladores. Ao receber uma solicitação,
	 * cada manipulador decide processar a solicitação ou passá-la para o próximo manipulador na cadeia.
	 */
	public BigDecimal calcular(Orcamento orcamento) {	
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
	
}
