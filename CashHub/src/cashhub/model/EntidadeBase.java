package cashhub.model;

/**
 * Classe abstrata que serve como base para todas as entidades do sistema.
 * Garante que todos os objetos do modelo possuam um identificador único e
 * define o contrato para exibição de resumos (Polimorfismo).
 */
public abstract class EntidadeBase {
	
	private int id;
	
	/**
	 * Construtor base para inicialização do identificador.
	 * @param id Identificador único da entidade.
	 */
	public EntidadeBase(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Fornece uma representação textual básica da entidade.
	 * Este método é projetado para ser sobrescrito nas subclasses (Polimorfismo),
	 * permitindo que cada tipo de objeto exiba seus dados específicos.
	 */
	public String obterResumo() {
		return "ID: " + id;
	}
}