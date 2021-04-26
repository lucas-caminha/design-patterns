package patterns.comportamentais.strategy;

import java.math.BigDecimal;

import patterns.comportamentais.state.Orcamento;

public class CalculadoraDeImpostos {


	/**
	 * Aplicação do pattern Strategy, evitando o crescimento de classes que podem ter muitas variações.
	 * Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). 
	 * Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.
	 */
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
	
	// Imnposto Decorator
	public BigDecimal calcular(Orcamento orcamento, patterns.estruturais.decorators.Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
