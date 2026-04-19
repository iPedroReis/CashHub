package cashhub.model;

public class Gasto extends EntidadeBase {
	
	private double valor;
	private String descricao;
	private int ano;
	private int mes;
	private int dia;
	private Categoria categoria;
	private boolean pago;
	
	
	public Gasto(int id, double valor, String descricao, int ano, int mes, int dia, Categoria categoria, boolean pago) {
		super(id);
		this.valor = valor;
		this.descricao = descricao;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.categoria = categoria;
		this.pago = pago;
	}	
	
	
	@Override
	public String obterResumo() {
		return "Gasto [" + getDescricao() + "] - R$ " + getValor();
	}
	
	public double getValor() {
		return valor;		
	}
	
	public int getAno() {
		return ano;
	}
	
	
	public int getMes() {
		return mes;
	}
	
	public int getDia() {
		return dia;
	}
	
	
	public void setValor(double valor) {
		if (valor > 0) {
			this.valor = valor;
		} else {
			System.out.println("Erro: Valor deve ser positivo.");
		}
	}
	
	public void setAno (int ano) {
		if (ano >= 2026 && ano <= 2100) {
			this.ano = ano;
		} else {
			System.out.println("Erro: Ano inválido. O sistema aceita a partir de 2026.");
		}
	}
	
	public void setMes (int mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		} else {
			System.out.println("Erro: Mês inválido.");
		}	
		
	}
	
	public void setDia (int dia) {
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("Erro: Dia inválido (deve ser entre 1 e 31).");
		}
		
		if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && dia > 30) {
			throw new IllegalArgumentException("Erro: Este mês possui apenas 30 dias.");	
		} 
		
		else if (this.mes == 2 && dia > 28) {
			throw new IllegalArgumentException("Erro: Fevereiro possui apenas 28 dias (ou 29 em anos bissextos).");
		} else {
			this.dia = dia;
		}
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public boolean isPago() {
		return pago;
	}


	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	public String identificarStatus (int diaAtual, int mesAtual, int anoAtual) {
		// 1. Vence Hoje:
		if (this.ano == anoAtual && this.mes == mesAtual && this.dia == diaAtual) {
			return "Vence Hoje";
		}
		
		// 2. Vencido:
		if (this.ano < anoAtual ||
			(this.ano == anoAtual && this.mes < mesAtual ||
			(this.ano == anoAtual && this.mes == mesAtual && this.dia < diaAtual))) {
			return "Vencido";
		}
		
		// 3. Pendente: (Se for no futuro)
		return "Pendente";
	}
}
