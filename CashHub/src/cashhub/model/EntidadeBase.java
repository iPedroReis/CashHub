package cashhub.model;

public abstract class EntidadeBase {
	private int id;
	
	public EntidadeBase(int id) {
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String obterResumo() {
		return "ID: " + id;
	}
}
