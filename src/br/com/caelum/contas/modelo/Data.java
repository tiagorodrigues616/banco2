package br.com.caelum.contas.modelo;

public class Data {
	
	// atributos 
	public int dia;
	public int mes;
	public int ano;
	
	
	// métodos negociais
	void formataData(int dia, int mes, int ano) { 
		if (!validaData(dia, mes, ano)) {
			System.out.println("A data: "+dia+"/"+mes+"/"+ano + " é inválida!");
		} else {
			this.dia =+ dia;
			this.mes =+ mes;
			this.ano =+ ano; 
		}
	}
	
	public boolean validaData (int dia, int mes, int ano) {
		// operador relacional 
		if (ano <= 0 || mes <=0) {
			return false;
		} 
		
		int ultimoDiaMes = 31; //por padrão
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			ultimoDiaMes = 30;
		} else if (mes == 2){
			// pegou o resto da divisão do ano
			if (ano % 4 == 0) {
				ultimoDiaMes = 29;
			}else {
				ultimoDiaMes = 28;
			}
		}
		if (dia > ultimoDiaMes) {
			return false;
		}
		return true;
	}
	}
