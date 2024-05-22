package br.com.caelum.contas.modelo;

public class Conta {
	
	// atributos declarados e alterados para Private 
	private int numConta;
	private String numAgencia;
	protected double saldo;
	private String nomeTitular;
	private Data dtAbertura;
	private double valor;
	private static int identificador;
	
	
	//métodos construtores
	
	public Conta() {
		// Faça com que sua classe Conta possa receber, opcionalmente, o nome do titular da Conta durante a criação do objeto.
	}
	
	Conta(int numConta, String numAgencia, double saldo, String nomeTitular) {
		this.setNumero(numConta);
		this.setAgencia(numAgencia);
		this.setSaldo(saldo);
		this.setTitular(nomeTitular);
		Conta.identificador = Conta.identificador + 1;			
	}
	
	// Criando os métodos set e get
	public static int getIdentificador(){
		return Conta.identificador;
	}
	
	public int getNumero() {
		return this.numConta;
	}
	
	public void setNumero(int numConta) {
		this.numConta = numConta;
	}
	
	public String getAgencia() {
		return this.numAgencia;
	}
	
	public void setAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return this.nomeTitular;
	}
	
	public void setTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public Data getdtAbertura() {
		return this.dtAbertura;
	}
	
	public void setdtAbertura(Data dtAbertura) {
		this.dtAbertura = dtAbertura;
		
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	// Métodos saca, deposita, calcula rendimento e recuperDadosParaImpressao
	public void saca(double valor) {
		if (this.saldo < valor) {
			//return false;
		} else {
			this.saldo = this.saldo - valor;
			//return true;
		}
	}
	
	public void deposita(double quantidade) {
		// Seria a mesma coisa que saldo = saldo + quantidade  
		this.saldo = this.saldo + quantidade;
	}
	
	double calculaRendimento() { 
		double rendimento = this.saldo * 0.1;
		return rendimento;
	}
	
	public String recuperDadosParaImpressao () {
		// Nesse exemplo está sendo criado um array que atribui uma string a uma variável sem a necessidade de usar o sysout;
		String dados = "\nTitular: " + this.nomeTitular;
		
		dados += "\nNumero da conta: "+this.getNumero()+"\n";
		dados += "Numero da agência: "+this.numAgencia+"\n";
		dados += "Saldo atual: "+this.saldo+"\n";
		dados += "Rendimento: "+this.calculaRendimento()+"\n";
		//dados += "Data: " + this.dtAbertura.dia + "/" + this.dtAbertura.mes + "/" + this.dtAbertura.ano ;
		
		// imprime data
		return dados;
	}
	
	/*public boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if(retirou == false) {
			return false;
		}else {
			destino.deposita(valor);
			return true;
		}
	}*/
	
	public Object getTipo() {
		// TODO Auto-generated method stub
		return "Conta";
	}
	
	
}