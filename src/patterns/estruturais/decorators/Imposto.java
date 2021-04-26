package patterns.estruturais.decorators;

import java.math.BigDecimal;

import patterns.comportamentais.state.Orcamento;

// O padrão Decorator permite adicionar novos comportamentos a um objeto, tornando o código bastante flexível e dinâmico. 
// É o caso do outro imposto que pode ou não ser calculado na própria classe.
public abstract class Imposto {

	private Imposto outro;
	
	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		if (outro != null) {
			valorDoOutroImposto = outro.realizarCalculo(orcamento);
		}
		return valorImposto.add(valorDoOutroImposto);
	}
	
}
