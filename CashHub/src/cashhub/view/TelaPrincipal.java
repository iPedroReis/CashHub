package cashhub.view;

import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import cashhub.model.Gasto;
import cashhub.model.Repositorio;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class TelaPrincipal extends JFrame {

	public static TelaPrincipal frameAberto;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtR;
	private JLabel lblValorGanhoMes;
	private JLabel lblDespesasMes;
	private JLabel lblTransacoes1;
	private JLabel lblValorTransacao1;
	private JLabel lblTransacoes2;
	private JLabel lblValorTransacao2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaPrincipal() {
				
		setBackground(new Color(216, 216, 216));
		setTitle("Ca$h Hub - Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 216, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		frameAberto = this;
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLateral = new JPanel();
		panelLateral.setPreferredSize(new Dimension(130, 400));
		panelLateral.setBackground(new Color(31, 33, 38));
		contentPane.add(panelLateral, BorderLayout.WEST);
		panelLateral.setLayout(null);
		
		JButton btnDashboard = new JButton("      Dashboard");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		btnDashboard.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnDashboard.setForeground(new Color(216, 216, 216));
		btnDashboard.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnDashboard.setBackground(new Color(31, 33, 38));
		btnDashboard.setBounds(5, 95, 120, 30);
		panelLateral.add(btnDashboard);
		
		JButton btnExtrato = new JButton("       Extrato");
		btnExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaExtrato tela = new TelaExtrato();
				tela.setVisible(true);
			}
		});
		btnExtrato.setHorizontalAlignment(SwingConstants.LEFT);
		btnExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnExtrato.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnExtrato.setBounds(5, 130, 120, 30);
		btnExtrato.setForeground(new Color(216, 216, 216));
		btnExtrato.setBackground(new Color(31, 33, 38));
		panelLateral.add(btnExtrato);
		
		
		//Alterado
		JButton btnAdicionarSaldo = new JButton("       Saldo");
		btnAdicionarSaldo.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdicionarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Define o que acontece quando o botão é clicado
				TelaCadastro tela = new TelaCadastro(); // Cria um objeto da classe "TelaCadastro
			    tela.setVisible(true);		// Torna a nova tela visível		
			}
		});
		btnAdicionarSaldo.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnAdicionarSaldo.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnAdicionarSaldo.setBounds(5, 165, 120, 30);
		btnAdicionarSaldo.setForeground(new Color(216, 216, 216));
		btnAdicionarSaldo.setBackground(new Color(31, 33, 38));
		panelLateral.add(btnAdicionarSaldo);
		
		JButton btnConfiguracoes = new JButton("       Configurações");
		btnConfiguracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConfiguracao tela = new TelaConfiguracao();
				tela.setVisible(true);
			}
		});
		btnConfiguracoes.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfiguracoes.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnConfiguracoes.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnConfiguracoes.setBounds(5, 200, 120, 30);
		btnConfiguracoes.setForeground(new Color(216, 216, 216));
		btnConfiguracoes.setBackground(new Color(31, 33, 38));
		panelLateral.add(btnConfiguracoes);
		
		JButton btnAjuda = new JButton("       Ajuda");
		btnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjuda.setHorizontalAlignment(SwingConstants.LEFT);
		btnAjuda.setForeground(new Color(216, 216, 216));
		btnAjuda.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnAjuda.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnAjuda.setBackground(new Color(31, 33, 38));
		btnAjuda.setBounds(5, 408, 120, 30);
		panelLateral.add(btnAjuda);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(216, 216, 216));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNomeSistema = new JLabel("CA$H HUB");
		lblNomeSistema.setBounds(28, 13, 168, 28);
		panel_1.add(lblNomeSistema);
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNomeSistema.setForeground(new Color(31, 33, 38));
		
		JPanel panelTranasacoes = new JPanel();
		panelTranasacoes.setBackground(new Color(31, 33, 38));
		panelTranasacoes.setBounds(28, 326, 484, 114);
		panel_1.add(panelTranasacoes);
		panelTranasacoes.setLayout(null);
		
		JLabel lblTituloTransacoes = new JLabel("Ultimas Transações");
		lblTituloTransacoes.setFont(new Font("ABeeZee", Font.PLAIN, 15));
		lblTituloTransacoes.setForeground(new Color(216, 216, 216));
		lblTituloTransacoes.setBounds(10, 11, 139, 14);
		panelTranasacoes.add(lblTituloTransacoes);
		
		JButton btnVisualizarExtratoCompleto = new JButton("Visualizar extrato completo");
		btnVisualizarExtratoCompleto.setForeground(new Color(216, 216, 216));
		btnVisualizarExtratoCompleto.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnVisualizarExtratoCompleto.setBorder(null);
		btnVisualizarExtratoCompleto.setBackground(new Color(31, 33, 38));
		btnVisualizarExtratoCompleto.setBounds(305, 3, 145, 30);
		panelTranasacoes.add(btnVisualizarExtratoCompleto);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(216, 216, 216));
		panel_2.setBounds(10, 36, 463, 30);
		panelTranasacoes.add(panel_2);
		panel_2.setLayout(null);
		
		lblTransacoes1 = new JLabel("Salário - Itau");
		lblTransacoes1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTransacoes1.setBounds(37, 8, 146, 14);
		panel_2.add(lblTransacoes1);
		
		lblValorTransacao1 = new JLabel("R$: 0,00");
		lblValorTransacao1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblValorTransacao1.setForeground(new Color(0, 128, 0));
		lblValorTransacao1.setBackground(new Color(255, 255, 255));
		lblValorTransacao1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblValorTransacao1.setBounds(358, 9, 95, 14);
		panel_2.add(lblValorTransacao1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(216, 216, 216));
		panel_2_1.setBounds(10, 77, 463, 30);
		panelTranasacoes.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		lblTransacoes2 = new JLabel("Café - Starbucks");
		lblTransacoes2.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTransacoes2.setBounds(36, 8, 146, 14);
		panel_2_1.add(lblTransacoes2);
		
		lblValorTransacao2 = new JLabel("R$: 0,00");
		lblValorTransacao2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblValorTransacao2.setForeground(new Color(149, 0, 0));
		lblValorTransacao2.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblValorTransacao2.setBackground(Color.WHITE);
		lblValorTransacao2.setBounds(358, 8, 95, 14);
		panel_2_1.add(lblValorTransacao2);
		
		JPanel panelSaldo = new JPanel();
		panelSaldo.setBackground(new Color(31, 33, 38));
		panelSaldo.setBounds(28, 75, 484, 82);
		panel_1.add(panelSaldo);
		panelSaldo.setLayout(null);
		
		txtR = new JTextField();
		txtR.setBorder(null);
		txtR.setFont(new Font("ABeeZee", Font.PLAIN, 23));
		txtR.setText("R$ 8.372,10");
		txtR.setForeground(new Color(216, 216, 216));
		txtR.setBackground(new Color(31, 33, 38));
		txtR.setBounds(10, 11, 209, 20);
		panelSaldo.add(txtR);
		
		
		//Alterado
		JButton btnAlterarSaldo = new JButton("Alterar Saldo");
		btnAlterarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // Define o que acontece quando o botão é clicado
					TelaCadastro tela = new TelaCadastro(); // Cria um objeto da classe "TelaCadastro"
				    tela.setVisible(true);	// Torna a nova tela visível			
			}
		});
		btnAlterarSaldo.setForeground(new Color(216, 216, 216));
		btnAlterarSaldo.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAlterarSaldo.setBorder(null);
		btnAlterarSaldo.setBackground(new Color(73, 73, 73));
		btnAlterarSaldo.setBounds(373, 51, 101, 20);
		panelSaldo.add(btnAlterarSaldo);
		
		JPanel panelGanhos = new JPanel();
		panelGanhos.setBackground(new Color(31, 33, 38));
		panelGanhos.setBounds(28, 179, 168, 124);
		panel_1.add(panelGanhos);
		panelGanhos.setLayout(null);
		
		JLabel lblTituloGanhosMes = new JLabel("Ganhos do mês:");
		lblTituloGanhosMes.setBounds(10, 48, 136, 16);
		lblTituloGanhosMes.setForeground(new Color(216, 216, 216));
		lblTituloGanhosMes.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		panelGanhos.add(lblTituloGanhosMes);
		
		lblValorGanhoMes = new JLabel("R$ 0,00");
		lblValorGanhoMes.setBounds(10, 73, 148, 17);
		lblValorGanhoMes.setForeground(new Color(0, 128, 0));
		lblValorGanhoMes.setFont(new Font("ABeeZee", Font.BOLD, 14));
		panelGanhos.add(lblValorGanhoMes);
		
		JPanel panelDespesasMes = new JPanel();
		panelDespesasMes.setBackground(new Color(31, 33, 38));
		panelDespesasMes.setBounds(248, 179, 168, 124);
		panel_1.add(panelDespesasMes);
		panelDespesasMes.setLayout(null);
		
		JLabel lblTituloDespesasMes = new JLabel("Despesas do mês:");
		lblTituloDespesasMes.setBounds(10, 43, 148, 16);
		lblTituloDespesasMes.setForeground(new Color(216, 216, 216));
		lblTituloDespesasMes.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		panelDespesasMes.add(lblTituloDespesasMes);
		

		lblDespesasMes = new JLabel("R$ 0,00");
		lblDespesasMes.setBackground(new Color(166, 0, 4));
		lblDespesasMes.setBounds(9, 68, 148, 17);
		lblDespesasMes.setForeground(new Color(149, 0, 0));
		lblDespesasMes.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelDespesasMes.add(lblDespesasMes);
		
		JPanel panelnformacoes = new JPanel();
		panelnformacoes.setBorder(null);
		panelnformacoes.setBackground(new Color(216, 216, 216));
		panelnformacoes.setBounds(339, 13, 193, 35);
		panel_1.add(panelnformacoes);
		panelnformacoes.setLayout(null);
		
		JLabel lblNome = new JLabel("Gustavo Dornellas");
		lblNome.setBounds(0, 0, 149, 17);
		panelnformacoes.add(lblNome);
		lblNome.setForeground(new Color(31, 33, 38));
		lblNome.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel lblNewLabel = new JLabel("Plano premium");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setBounds(38, 13, 111, 14);
		panelnformacoes.add(lblNewLabel);
		
		
		//Alterado
		LocalDate hoje = LocalDate.now(); // Obtém a data atual do sistema
	    
	    Gasto g1 = new Gasto(2, -50.0, "Conta de Luz", hoje.getYear(), hoje.getMonthValue(), hoje.getDayOfMonth(), null, false);
	 // Cria um objeto "Gasto" representando uma despesa (valor negativo)
	    
	    Repositorio.salvar(g1); // Salva o objeto "g1" no repositório

	    setTitle("Ca$h Hub - Dashboard"); // Define o título da janela
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define que o programa será encerrado ao fechar a janela
	 
	    atualizarDashboard(); // Atualiza os dados exibidos na tela
	    verificarAlertasDeVencimento(); // Verifica alertas de vencimento de gastos
	    //até aqui
	}
		
	//Alterado
	public void atualizarDashboard() { // Método responsável por atualizar as informações exibidas na tela
		double ganhos = Repositorio.calcularTotalGanhos(); // Obtém o total de ganhos do repositório
		lblValorGanhoMes.setText(String.format("R$ %.2f", ganhos)); // Atualiza o texto do label com o valor dos ganhos formatado
		
	    double despesas = Repositorio.calcularTotalDespesas(); // Obtém o total de despesas do repositório
	    lblDespesasMes.setText(String.format("R$ %.2f", despesas)); // Atualiza o texto do label com o valor das despesas formatado
	    
	    double saldoFinal = ganhos - despesas; // Calcula o saldo final subtraindo despesas de ganhos
	    txtR.setText(String.format("R$ %.2f", saldoFinal));	// Atualiza o campo de saldo com o valor formatado
	    
	    Gasto ultimoGanho = Repositorio.getUltimoGanho(); // Obtém o último ganho registrado
	    if (ultimoGanho != null) { // Verifica se existe um ganho
	        lblTransacoes1.setText(ultimoGanho.getDescricao()); // Exibe a descrição do último ganho
	        lblValorTransacao1.setText(String.format("R$ %.2f", ultimoGanho.getValor())); // Exibe o valor do último ganho formatado
	    } else { // Caso não exista ganho
	        lblTransacoes1.setText("Nenhum ganho registrado"); // Exibe mensagem padrão
	        lblValorTransacao1.setText("R$ 0,00"); // Define valor padrão
	    }

	    Gasto ultimaDespesa = Repositorio.getUltimaDespesa(); // Obtém a última despesa registrada
	    if (ultimaDespesa != null) { // Verifica se existe uma despesa
	        lblTransacoes2.setText(ultimaDespesa.getDescricao()); // Exibe a descrição da última despesa
	        lblValorTransacao2.setText(String.format("R$ %.2f", Math.abs(ultimaDespesa.getValor()))); // Exibe o valor da despesa em formato positivo
	    } else { // Caso não exista despesa
	        lblTransacoes2.setText("Nenhuma despesa registrada"); // Exibe mensagem padrão
	        lblValorTransacao2.setText("R$ 0,00"); // Define valor padrão
	    }
	}
	
	private void verificarAlertasDeVencimento() { // Método que verifica gastos vencidos ou que vencem hoje
		LocalDate hoje = LocalDate.now(); // Obtém a data atual
		if (Repositorio.getLista() == null || Repositorio.getLista().isEmpty()) { // Verifica se a lista está nula ou vazia
			return; // Encerra o método caso não haja dados
		}

		for (Gasto g : Repositorio.getLista()) { // Percorre todos os gastos da lista
			String status = g.identificarStatus(hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear()); 
			// Obtém o status do gasto com base na data atual

	        if (status.equals("Vencido") || status.equals("Vence Hoje")) { // Verifica se o gasto está vencido ou vence hoje
	            JOptionPane.showMessageDialog(this, // Exibe uma caixa de mensagem na tela
	                "ALERTA: '" + g.getDescricao() + "' " + status + "!", // Define a mensagem exibida
	                "Sistema de Alertas Ca$h Hub", // Define o título da mensagem
	                JOptionPane.WARNING_MESSAGE); // Define o tipo de alerta como aviso
	          //Até aqui
			}
		}
	}
}