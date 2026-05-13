package cashhub.model;

/**
 * Classe de modelo responsável pela gestão de notificações e alertas temporais.
 * Estende a EntidadeBase para herdar a identificação única do sistema.
 */
public class Alerta extends EntidadeBase {

    private String mensagem;
    private int dia;
    private int mes;
    private int ano;
    private String tipo;

    /**
     * Construtor para inicialização completa de um alerta.
     * @param id Identificador único herdado da superclasse.
     */
    public Alerta(int id, String mensagem, int dia, int mes, int ano, String tipo) {
        super(id);
        this.mensagem = mensagem;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.tipo = tipo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getAno() {
        return ano;
    }

    /**
     * Define o ano do alerta com validação de intervalo para o ciclo de vida do projeto.
     */
    public void setAno(int ano) {
        if (ano >= 2026 && ano <= 2100) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano iválido! Aceito de 2026 a 2100");
        }
    }

    public int getMes() {
        return mes;
    }

    /**
     * Define o mês garantindo que o valor esteja no intervalo padrão do calendário gregoriano.
     */
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido! Deve ser entre 1 e 12.");
        }
    }

    public int getDia() {
        return dia;
    }

    /**
     * Aplica regras de negócio para validação de dias, considerando a variação mensal.
     * Inclui verificações para meses de 30 dias e a limitação fixa de fevereiro.
     */
    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido! Nenhum mês tem " + dia + " dias.");
        }
        
        // Validação para meses que não possuem o dia 31
        if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && dia > 30) {
            throw new IllegalArgumentException("Dia inválido! Este mês tem apenas 30 dias.");
        }
        
        // Regra simplificada para o mês de fevereiro
        if (this.mes == 2 && dia > 28) {
            throw new IllegalArgumentException("Dia iválido! Fevereiro tem apenas 28 dias.");
        }
        
        this.dia = dia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}