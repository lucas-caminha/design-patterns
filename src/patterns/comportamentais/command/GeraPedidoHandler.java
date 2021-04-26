package patterns.comportamentais.command;

import java.time.LocalDateTime;
import java.util.List;

import patterns.comportamentais.observer.AcaoAposGerarPedido;
import patterns.comportamentais.state.Orcamento;

/*
 * Comando é um padrão de design comportamental que transforma uma solicitação em um objeto independente
 * que contém todas as informações sobre a solicitação. Essa transformação permite transmitir solicitações como argumentos de método,
 *  atrasar ou enfileirar a execução de uma solicitação e oferecer suporte a operações que podem ser desfeitas.
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
