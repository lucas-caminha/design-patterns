package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class EmailService implements AcaoAposGerarPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando e-mail com dados do pedido!");
		
	}
	
}
