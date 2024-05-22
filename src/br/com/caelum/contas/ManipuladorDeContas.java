package br.com.caelum.contas;
import br.com.caelum.contas.modelo.*;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas extends Conta{
	
	private Conta conta;
	
	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if(tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		}else if (tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		
		this.conta.setTitular(evento.getString("titular"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setAgencia(evento.getString("agencia"));
		
		/*
		this.conta = new Conta();
		this.conta.getAgencia("1234");
		this.conta.setNumero(56789);
		this.conta.setTitular("Batgirl");
		*/
	}
	
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}
	
	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		if (this.conta.getTipo().equals("Conta Corrente")) {
			this.conta.saca(valorDigitado);
		} else if (this.conta.getTipo().equals("Conta Poupança")) {
			this.conta.saca(valorDigitado);
		}
	}

}
