package patterns.estruturais.facade;

/*
 * Em determinados casos, n�s podemos precisar de um acesso simplificado a uma parte complexa ou grande do nosso sistema,
 * como autentica��o, acesso a sistema de arquivos, cache, etc. Uma classe de fachada, contendo apenas a funcionalidade desejada,
 * pode ser bastante �til.
 */
public class TesteTransferencia {
	
	public static void main(String[] args) {
		Conta conta = new Conta("p1", 500);
		Conta contaDestino = new Conta("p2", 200);
		
		Transferencia transferencia = new Transferencia();
		// PATTERN FACADE
		transferencia.executar(conta, contaDestino, 100);
		
		System.out.println(conta.getSaldo());
		System.out.println(contaDestino.getSaldo());
	}

}
