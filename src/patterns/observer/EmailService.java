package patterns.observer;

import patterns.command.Pedido;

public class EmailService implements AcaoAposGerarPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando e-mail com dados do pedido!");
		
	}
	
}
