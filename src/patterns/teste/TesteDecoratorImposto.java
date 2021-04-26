package patterns.teste;

import java.math.BigDecimal;

import patterns.comportamentais.state.Orcamento;
import patterns.comportamentais.strategy.CalculadoraDeImpostos;
import patterns.estruturais.decorators.ICMS;
import patterns.estruturais.decorators.ISS;

public class TesteDecoratorImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
		
				
	}
}
