package patterns.templateMethod;

import java.math.BigDecimal;

import patterns.state.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	protected abstract boolean deveAplicar(Orcamento orcamento);
	
	/**
	 * O padr�o Template Method favorece o reaproveitamento de c�digos comuns entre classes,
	 * evitando assim duplica��es de c�digos.
	 */
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	
	
}
