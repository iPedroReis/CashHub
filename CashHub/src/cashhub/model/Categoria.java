package cashhub.model;

/**
 * Representa a classificação dos registros financeiros (ex: Alimentação, Lazer).
 * Essencial para a organização e filtragem de transações no repositório.
 */
public class Categoria extends EntidadeBase { 
	
	private String nome;

	/**
	 * Construtor da classe Categoria.
	 * @param id Identificador único herdado da EntidadeBase.
	 * @param nome Nome descritivo da categoria para exibição na interface.
	 */
	public Categoria(int id, String nome) {
		super(id); // Inicializa o identificador na classe raiz da hierarquia
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
