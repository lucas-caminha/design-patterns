package patterns.comportamentais.command;

import java.time.LocalDateTime;
import java.util.List;

import patterns.comportamentais.observer.AcaoAposGerarPedido;
import patterns.comportamentais.state.Orcamento;

/*
 * Comando � um padr�o de design comportamental que transforma uma solicita��o em um objeto independente
 * que cont�m todas as informa��es sobre a solicita��o. Essa transforma��o permite transmitir solicita��es como argumentos de m�todo,
 *  atrasar ou enfileirar a execu��o de uma solicita��o e oferecer suporte a opera��es que podem ser desfeitas.
 */
public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;	
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		LocalDateTime data = LocalDateTime.now();		
		Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));
	}
	
}
