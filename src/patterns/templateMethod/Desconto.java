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
	 * O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes,
	 * evitando assim duplicações de códigos.
	 */
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	
	
}
