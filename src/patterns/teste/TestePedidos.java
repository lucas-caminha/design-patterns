package patterns.teste;

import java.math.BigDecimal;
import java.util.Arrays;

import patterns.command.GeraPedido;
import patterns.command.GeraPedidoHandler;
import patterns.observer.EmailService;
import patterns.observer.PedidoRepository;

public class TestePedidos {

	public static void main(String[] args) {
		
		String cliente = "Lucas";
		BigDecimal valorOrcamento = new BigDecimal("500");
		int qntItens = Integer.parseInt("5");
		
		// Pattern Command
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qntItens);
		// Pattern Observer
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(
						new PedidoRepository(),
						new EmailService()
						)
				);
		

		handler.execute(gerador);
	}

}