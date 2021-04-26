package patterns.chainOfResponsibility;

import java.math.BigDecimal;

import patterns.state.Orcamento;
import patterns.templateMethod.Desconto;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
