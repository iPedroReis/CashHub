package cashhub.model;

public class Categoria extends EntidadeBase{ 
	
	private String nome; // Declara uma variável do tipo String chamada "nome"
	

	public Categoria(int id, String nome) { // Declara o construtor da classe "Categoria" com parâmetros "id" e "nome"
		super(id); // Pega id da entidade base
		this.nome = nome; // Atribui o valor do parâmetro "nome" ao atributo da classe
	}
	
	public String getNome() { // Método que retorna o valor do atributo "nome"
		return nome; // Retorna o valor armazenado em "nome"
	}
	
	
	public void setNome(String nome) { // Método que altera o valor do atributo "nome"
		this.nome = nome; // Atualiza o atributo "nome" com o novo valor
	}
}
