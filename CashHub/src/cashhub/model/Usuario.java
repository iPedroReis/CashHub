package cashhub.model;

public class Usuario extends EntidadeBase { // Declara a classe "Usuario" que herda da classe "EntidadeBase"

	private String email; // Declara uma variável do tipo String chamada "email"
	private String nome; // Declara uma variável do tipo String chamada "nome"

	
	
	public Usuario(int id, String email, String nome) { // Declara o construtor da classe com parâmetros "id", "email" e "nome"
		super(id); // chama id da classe entidade
		this.email = email; // Atribui o valor ao atributo "email"
		this.nome = nome; // Atribui o valor ao atributo "nome"
	}	
	
	public String getEmail() { // Método que retorna o valor do atributo "email"
		return email; // Retorna o valor armazenado
	}
	
	public void setEmail(String email) { // Método que altera o valor do atributo "email"
		this.email = email; // Atualiza o atributo com o novo valor
	}
	
	public String getNome() { // Método que retorna o valor do atributo "nome"
		return nome; // Retorna o valor armazenado
	}
	
	public void setNome(String nome) { // Método que altera o valor do atributo "nome"
		if (nome != null && !nome.isEmpty()) { // Verifica se o nome não é nulo e não está vazio
			this.nome = nome; // Atualiza o atributo com valor válido
		} else {
			System.out.println("Erro: O nome não pode ser vazio."); // Exibe mensagem de erro no console
		}
	}
}
