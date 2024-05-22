package br.com.caelum.contas.modelo;
import br.com.caelum.contas.*;

public class ContaCorrente extends Conta{
	
	@Override
	public String getTipo() {
		return super.getTipo() + " Corrente";
		//return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		super.saca(valor + 0.10);
	}

}
