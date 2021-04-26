package patterns.teste;

import java.math.BigDecimal;

import patterns.comportamentais.state.Orcamento;
import patterns.estruturais.adapters.JavaHttpClient;
import patterns.estruturais.adapters.RegistroDeOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
