package cashhub.model;

/**
 * Representa o operador do sistema Ca$h Hub.
 * Armazena as informações de perfil necessárias para a personalização 
 * da interface e identificação do proprietário dos dados financeiros[cite: 91, 334].
 */
public class Usuario extends EntidadeBase {

	private String email;
	private String nome;

	/**
	 * Construtor para inicialização do perfil do usuário.
	 * @param id Identificador único herdado da superclasse EntidadeBase[cite: 330].
	 * @param email Endereço de correio eletrônico para contato ou login.
	 * @param nome Nome de exibição utilizado nos cabeçalhos do software.
	 */
	public Usuario(int id, String email, String nome) {
		super(id); // Inicializa o identificador na classe raiz da hierarquia
		this.email = email;
		this.nome = nome;
	}	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * Altera o nome do usuário garantindo a integridade da informação.
	 * Aplica uma validação para impedir que campos vazios ou nulos 
	 * comprometam a unidade visual da aplicação[cite: 275].
	 */
	public void setNome(String nome) {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			System.out.println("Erro: O nome não pode ser vazio.");
		}
	}
}