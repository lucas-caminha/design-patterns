package patterns.comportamentais.strategy;

import java.math.BigDecimal;

import patterns.comportamentais.state.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
