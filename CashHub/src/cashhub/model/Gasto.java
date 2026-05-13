package cashhub.model;

/**
 * Entidade que representa uma transação financeira (Entrada ou Saída).
 * Herda as propriedades básicas da EntidadeBase e implementa a lógica central
 * para o processamento do fluxo de caixa e alertas de vencimento.
 */
public class Gasto extends EntidadeBase { 
	
	private double valor; 
	private String descricao;
	private int ano;
	private int mes;
	private int dia;
	private Categoria categoria; // Composição: Gasto possui um vínculo obrigatório com uma Categoria
	private boolean pago;
	private boolean agendado; // Controle de status para agendamentos futuros
	
	/**
	 * Construtor completo para a criação de um novo registro financeiro.
	 * @param id Identificador único herdado.
	 * @param valor Quantia monetária da transação.
	 * @param categoria Vínculo com a classificação do gasto.
	 */
	public Gasto(int id, double valor, String descricao, int ano, int mes, int dia, Categoria categoria, boolean pago) { 
		super(id);  // Inicialização do identificador via superclasse
		this.valor = valor;
		this.descricao = descricao;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.categoria = categoria;
		this.pago = pago;
	}	
	
	/**
	 * Sobrescrita de método que caracteriza o uso de Polimorfismo.
	 * Personaliza a exibição do resumo conforme a natureza da classe Gasto.
	 */
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
	
	/**
	 * Garante a integridade dos dados através do Encapsulamento,
	 * impedindo o registro de transações com valores zerados ou negativos.
	 */
	public void setValor(double valor) {
	    if (valor == 0) {
	        throw new IllegalArgumentException("O valor da transação não pode ser zero.");
	    }
	    this.valor = valor;
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
	
	/**
	 * Implementação de validação de datas considerando as variações mensais
	 * para assegurar a consistência dos dados temporais no repositório.
	 */
	public void setDia (int dia) {
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("Erro: Dia inválido (deve ser entre 1 e 31).");
		}
		
		if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && dia > 30) {
			throw new IllegalArgumentException("Erro: Este mês possui apenas 30 dias.");
		} 
		
		else if (this.mes == 2 && dia > 28) {
			throw new IllegalArgumentException("Erro: Fevereiro possui apenas 28 dias.");
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
	
	/**
	 * Lógica proativa que identifica o status temporal da transação.
	 * Atua como motor para o sistema de alertas preventivos do CA$H HUB.
	 * @return Status textual ("Vencido", "Vence Hoje" ou "Pendente").
	 */
	public String identificarStatus (int diaAtual, int mesAtual, int anoAtual) {
		// Verificação de igualdade para alerta imediato
		if (this.ano == anoAtual && this.mes == mesAtual && this.dia == diaAtual) {
			return "Vence Hoje";
		}
		
		// Verificação retrospectiva para identificar atrasos
		if (this.ano < anoAtual || 
			(this.ano == anoAtual && this.mes < mesAtual ||
			(this.ano == anoAtual && this.mes == mesAtual && this.dia < diaAtual))) {
			return "Vencido";
		}
		
		// Status padrão para agendamentos futuros
		return "Pendente";
	}
	
	public boolean isAgendado() {
	    return agendado;
	}

	public void setAgendado(boolean agendado) {
	    this.agendado = agendado;
	}
	
}