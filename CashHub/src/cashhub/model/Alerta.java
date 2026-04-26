package cashhub.model;

public class Alerta extends EntidadeBase{

	private String mensagem; // Declara uma variável do tipo String chamada "mensagem"
    private int dia; // Declara uma variável do tipo inteiro chamada "dia"
	private int mes; // Declara uma variável do tipo inteiro chamada "mes"
	private int ano; // Declara uma variável do tipo inteiro chamada "ano"
	private String tipo; // Declara uma variável do tipo String chamada "tipo" para armazenar a categoria da mensagem
	
	
	
	public Alerta(int id, String mensagem, int dia, int mes, int ano, String tipo) { // Declara o construtor da classe "Alerta" 
		                                                                             //com parâmetros para inicializar os atributos
		super(id); // Chama o construtor da classe mãe passando o "id"
		this.mensagem = mensagem; // Atribui o valor do parâmetro "mensagem" ao atributo da classe
		this.dia = dia; // Atribui o valor do parâmetro "dia" ao atributo da classe
		this.mes = mes; // Atribui o valor do parâmetro "mes" ao atributo da classe
		this.ano = ano; // Atribui o valor do parâmetro "ano" ao atributo da classe
		this.tipo = tipo; // Atribui o valor do parâmetro "tipo" ao atributo da classe
	}
	
	public String getMensagem() { // Método que retorna o valor do atributo "mensagem"
		return mensagem; // Retorna o valor armazenado em "mensagem"
	}
	
	public void setMensagem(String mensagem) { // Método que altera o valor do atributo "mensagem"
		this.mensagem = mensagem; // Atualiza o atributo "mensagem" com o novo valor recebido
	}
	
	
	public int getAno() { // Método que retorna o valor do atributo "ano"
		return ano; // Retorna o valor armazenado em "ano"
	}
	
	
	public void setAno(int ano) { // Método que altera o valor do atributo "ano"
		if (ano >= 2026 && ano <= 2100) { // Verifica se o ano está dentro do intervalo permitido
			this.ano = ano; // Atualiza o atributo "ano" com o valor válido
		} else {
			throw new IllegalArgumentException("Ano iválido! Aceito de 2026 a 2100"); // Lança uma exceção informando que o ano é inválido
		}
	}
	
	public int getMes() { // Método que retorna o valor do atributo "mes"
		return mes; // Retorna o valor armazenado em "mes"
	}
	
	public void setMes (int mes) { // Método que altera o valor do atributo "mes"
		if (mes >= 1 && mes <= 12) { // Verifica se o mês está entre 1 e 12
			this.mes = mes; // Atualiza o atributo "mes" com o valor válido
		} else {
			throw new IllegalArgumentException("Mês inválido! Deve ser entre 1 e 12."); // Lança uma exceção informando que o mês é inválido
		}
	}
	
	public int getDia() { // Método que retorna o valor do atributo "dia"
		return dia; // Retorna o valor armazenado em "dia"
	}
	
	public void setDia (int dia) { // Método que altera o valor do atributo "dia"
		if (dia < 1 || dia > 31) { // Verifica se o dia está fora do intervalo geral válido
			throw new IllegalArgumentException("Dia inválido! Nenhum mês tem " + dia + " dias."); // Lança uma exceção informando que o dia é inválido
		}
		
		if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && dia >30) { // Verifica se o mês tem apenas 30 dias e 
			                                                                                  //o valor informado é maior
			throw new IllegalArgumentException("Dia inválido! Este mês tem apenas 30 dias."); // Lança uma exceção informando o erro
		}
		
		if (this.mes == 2 && dia > 28) { // Verifica se o mês é fevereiro e o dia é maior que 28
			throw new IllegalArgumentException("Dia iválido! Fevereiro tem apenas 28 dias."); // Lança uma exceção informando o erro
		}
		
		this.dia = dia; // Atualiza o atributo "dia" com o valor válido
		
	}

	public String getTipo() { // Método que retorna o valor do atributo "tipo"
		return tipo; // Retorna o valor armazenado em "tipo"
	}

	public void setTipo(String tipo) { // Método que altera o valor do atributo "tipo"
		this.tipo = tipo; // Atualiza o atributo "tipo" com o novo valor
	}
}
