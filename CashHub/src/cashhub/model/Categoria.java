package cashhub.model;

public class Categoria extends EntidadeBase{
	
	private String nome;
	

	public Categoria(int id, String nome) {
		super(id); // Pega id da entidade base
		this.nome = nome; 
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
