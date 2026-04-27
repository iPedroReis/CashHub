package cashhub.model;

public abstract class EntidadeBase {
	private int id; // Declara uma variável do tipo inteiro chamada "id"
	
	public EntidadeBase(int id) { // Declara o construtor da classe com parâmetro "id"
		this.id = id; // Atribui o valor do parâmetro "id" ao atributo da classe
	}
	
	
	public int getId() { // Método que retorna o valor do atributo "id"
		return id; // Retorna o valor armazenado em "id"
	}
	
	public void setId(int id) { // Método que altera o valor do atributo "id"
		this.id = id; // Atualiza o atributo "id" com o novo valor
	}
	
	public String obterResumo() { // Método que retorna um resumo em formato de texto
		return "ID: " + id; // Retorna uma String contendo o texto "ID: " junto com o valor do atributo "id"
	}
}
