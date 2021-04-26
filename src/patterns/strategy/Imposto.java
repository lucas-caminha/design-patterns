package patterns.strategy;

import java.math.BigDecimal;

import patterns.state.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
