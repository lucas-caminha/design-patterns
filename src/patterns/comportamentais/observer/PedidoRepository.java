package patterns.comportamentais.observer;

import patterns.comportamentais.command.Pedido;

public class PedidoRepository implements AcaoAposGerarPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados!");
	}
	
}
