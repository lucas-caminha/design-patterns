package patterns.chainOfResponsibility;

import java.math.BigDecimal;

import patterns.state.Orcamento;
import patterns.templateMethod.Desconto;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
	
	
}
