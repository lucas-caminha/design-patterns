package patterns.observer;

import patterns.command.Pedido;

/*
 * O padrão Observer é comumente utilizado por diversas bibliotecas que trabalham com eventos.
 * Muitas tecnologias em Java, como o Spring e o CDI, possuem componentes que nos auxiliam a trabalhar com eventos.
 */
public interface AcaoAposGerarPedido {
	void executarAcao(Pedido pedido);
}
