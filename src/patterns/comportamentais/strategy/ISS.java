package patterns.comportamentais.strategy;

import java.math.BigDecimal;

import patterns.comportamentais.state.Orcamento;

public class ISS implements Imposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.3"));
	}

}
