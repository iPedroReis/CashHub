package cashhub.model;

public class Gasto extends EntidadeBase { // Declara a classe "Gasto" que herda da classe "EntidadeBase"
	
	private double valor; // Declara uma variável do tipo double chamada "valor"
	private String descricao; // Declara uma variável do tipo String chamada "descricao"
	private int ano; //Declara uma variável do tipo inteiro chamada "ano"
	private int mes; // Declara uma variável do tipo inteiro chamada "mes"
	private int dia; // Declara uma variável do tipo inteiro chamada "dia"
	private Categoria categoria; // Declara um objeto do tipo "Categoria" 
	private boolean pago; // Declara uma variável do tipo boolean (true, false)
	
	
	public Gasto(int id, double valor, String descricao, int ano, int mes, int dia, Categoria categoria, boolean pago) { 
	// Declara o construtor da classe com todos os atributos como parâmetros
		super(id);  // pega o id da entidade base
		this.valor = valor; // Atribui o valor ao atributo "valor"
		this.descricao = descricao; // Atribui o valor ao atributo "descricao"
		this.ano = ano; // Atribui o valor ao atributo "ano"
		this.mes = mes; // Atribui o valor ao atributo "mes"
		this.dia = dia; // Atribui o valor ao atributo "dia"
		this.categoria = categoria; // Atribui o objeto ao atributo "categoria"
		this.pago = pago; // Atribui o valor ao atributo "pago"
	}	
	
	
	@Override
	public String obterResumo() { // Sobrescreve o método "obterResumo" da entidade
		return "Gasto [" + getDescricao() + "] - R$ " + getValor(); // Retorna um resumo do gasto com descrição e valor
	}
	
	public double getValor() { // Método que retorna o valor do atributo "valor"
		return valor;		   // Retorna o valor armazenado
	}
	
	public int getAno() { // Método que retorna o valor do atributo "ano"
		return ano; // Retorna o valor armazenado
	}
	
	
	public int getMes() { // Método que retorna o valor do atributo "mes"
		return mes; // Retorna o valor armazenado
	}
	
	public int getDia() { // Método que retorna o valor do atributo "dia"
		return dia; // Retorna o valor armazenado
	}
	
	
	public void setValor(double valor) { // Método que altera o valor do atributo "valor"
		if (valor > 0) { // Verifica se o valor é positivo
			this.valor = valor; // Atualiza o atributo com valor válido
		} else {
			System.out.println("Erro: Valor deve ser positivo."); // Exibe mensagem de erro no console
		}
	}
	
	public void setAno (int ano) { // Método que altera o valor do atributo "ano"
		if (ano >= 2026 && ano <= 2100) { // Verifica se o ano está dentro do intervalo permitido
			this.ano = ano; // Atualiza o atributo com valor válido
		} else {
			System.out.println("Erro: Ano inválido. O sistema aceita a partir de 2026."); // Exibe mensagem de erro no console
		}
	}
	
	public void setMes (int mes) { // Método que altera o valor do atributo "mes"
		if (mes >= 1 && mes <= 12) { // Verifica se o mês está dentro do intervalo válido
			this.mes = mes; // Atualiza o atributo com valor válido
		} else {
			System.out.println("Erro: Mês inválido."); // Exibe mensagem de erro no console
		}	
		
	}
	
	public void setDia (int dia) {// Método que altera o valor do atributo "dia"
		if (dia < 1 || dia > 31) { // Verifica se o dia está fora do intervalo válido
			throw new IllegalArgumentException("Erro: Dia inválido (deve ser entre 1 e 31)."); // Lança uma exceção informando erro
		}
		
		if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && dia > 30) { // Verifica meses que possuem apenas 30 dias
			throw new IllegalArgumentException("Erro: Este mês possui apenas 30 dias.");	// Lança uma exceção informando erro
		} 
		
		else if (this.mes == 2 && dia > 28) { // Verifica se é fevereiro e o dia é inválido
			throw new IllegalArgumentException("Erro: Fevereiro possui apenas 28 dias (ou 29 em anos bissextos)."); // Lança uma exceção informando erro
		} else { // Caso seja válido
			this.dia = dia; // Atualiza o atributo "dia"
		}
	}


	public String getDescricao() { // Método que retorna o valor do atributo "descricao"
		return descricao; // Retorna o valor armazenado
	}


	public void setDescricao(String descricao) { // Método que altera o valor do atributo "descricao"
		this.descricao = descricao; // Atualiza o atributo
	}


	public Categoria getCategoria() { // Método que retorna o objeto "categoria"

		return categoria; // Retorna o valor armazenado
	}


	public void setCategoria(Categoria categoria) { // Método que altera o objeto "categoria"
		this.categoria = categoria; // Atualiza o atributo
	}


	public boolean isPago() { // Método que retorna o valor do atributo "pago"
		return pago; // Retorna o valor armazenado
	}


	public void setPago(boolean pago) { // Método que altera o valor do atributo "pago"
		this.pago = pago; // Atualiza o atributo
	}
	
	public String identificarStatus (int diaAtual, int mesAtual, int anoAtual) { // Método que identifica o status do gasto com base na data atual
		// 1. Vence Hoje:
		if (this.ano == anoAtual && this.mes == mesAtual && this.dia == diaAtual) { // Verifica se a data do gasto é igual à data atual
			return "Vence Hoje"; // Retorna status "Vence Hoje"
		}
		
		// 2. Vencido:
		if (this.ano < anoAtual || 
			(this.ano == anoAtual && this.mes < mesAtual ||
			(this.ano == anoAtual && this.mes == mesAtual && this.dia < diaAtual))) {
			return "Vencido";
			// Verifica se a data do gasto já passou
		}
		
		// 3. Pendente: (Se for no futuro)
		return "Pendente"; // Retorna "Pendente" se a data ainda não chegou
	}
}
