package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class PedidoRepository implements AcaoAposGerarPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados!");
	}
	
}
