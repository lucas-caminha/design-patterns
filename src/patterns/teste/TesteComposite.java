package patterns.teste;

import java.math.BigDecimal;

import patterns.estruturais.composite.ItemOrcamento;
import patterns.estruturais.composite.Orcamento;

public class TesteComposite {

	public static void main(String[] args) {

		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);

		System.out.println(novo.getValor());
	}

}
