package patterns.comportamentais.strategy;

import java.math.BigDecimal;

import patterns.comportamentais.state.Orcamento;

public class CalculadoraDeImpostos {


	/**
	 * Aplica��o do pattern Strategy, evitando o crescimento de classes que podem ter muitas varia��es.
	 * Este padr�o pode ser utilizado quando h� diversos poss�veis algoritmos para uma a��o (como calcular imposto, por exemplo). 
	 * Nele, n�s separamos cada um dos poss�veis algoritmos em classes separadas.
	 */
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
	
	// Imnposto Decorator
	public BigDecimal calcular(Orcamento orcamento, patterns.estruturais.decorators.Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
