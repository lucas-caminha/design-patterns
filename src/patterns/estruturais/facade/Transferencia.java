package patterns.estruturais.facade;

public class Transferencia {

	public boolean executar(Conta conta, Conta destino, double valor) {
		if (valor <= conta.getSaldo()) {
			destino.depositar(valor);
			conta.retirar(valor);
			return true;
		}
		return false;
	}
	
}
