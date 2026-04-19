package cashhub.model;

public class Usuario extends EntidadeBase {

	private String email;
	private String nome;
	
	
	public Usuario(int id, String email, String nome) {
		super(id);
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
	
	public void setNome(String nome) {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			System.out.println("Erro: O nome não pode ser vazio.");
		}
	}
}
