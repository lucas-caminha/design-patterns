package patterns.comportamentais.command;

import patterns.comportamentais.observer.AcaoAposGerarPedido;

public class LogDePedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Log do pedido gerado..." + pedido.toString());
	}

}
