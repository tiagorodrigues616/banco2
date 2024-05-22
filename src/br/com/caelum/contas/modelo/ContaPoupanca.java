package br.com.caelum.contas.modelo;
import br.com.caelum.contas.*;

public class ContaPoupanca extends Conta {
	
	@Override
	public String getTipo() {
		
		return super.getTipo() + " Poupança";
		//return "Conta Poupança";
	}

}
