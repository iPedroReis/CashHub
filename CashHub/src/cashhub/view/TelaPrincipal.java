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
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BorderFactory;

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
		btnDashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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

		btnExtrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		
		JButton btnAdicionarSaldo = new JButton("       Saldo");
		btnAdicionarSaldo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		

		JButton btnAjuda = new JButton("       Ajuda");
		btnAjuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		btnVisualizarExtratoCompleto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVisualizarExtratoCompleto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaExtrato tela = new TelaExtrato();
                tela.setVisible(true);
			}
		});
		
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(444, 8, 30, 23);
		panelTranasacoes.add(btnNewButton);
		
		JPanel panelSaldo = new JPanel();
		panelSaldo.setBackground(new Color(31, 33, 38));
		panelSaldo.setBounds(28, 75, 484, 82);
		panel_1.add(panelSaldo);
		GridBagLayout gbl_panelSaldo = new GridBagLayout();
		gbl_panelSaldo.columnWidths = new int[]{237, 226, 0};
		gbl_panelSaldo.rowHeights = new int[]{68, 0, 0, 0};
		gbl_panelSaldo.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelSaldo.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelSaldo.setLayout(gbl_panelSaldo);
		
		txtR = new JTextField();
		txtR.setBorder(null);
		txtR.setFont(new Font("ABeeZee", Font.PLAIN, 23));
		txtR.setText("R$ 8.372,10");
		txtR.setForeground(new Color(216, 216, 216));
		txtR.setBackground(new Color(31, 33, 38));
		GridBagConstraints gbc_txtR = new GridBagConstraints();
		gbc_txtR.fill = GridBagConstraints.BOTH;
		gbc_txtR.insets = new Insets(0, 0, 5, 5);
		gbc_txtR.gridx = 0;
		gbc_txtR.gridy = 0;
		panelSaldo.add(txtR, gbc_txtR);
		txtR.setBorder(BorderFactory.createEmptyBorder(5, 7, 0, 0));
		
		
		JButton btnAlterarSaldo = new JButton("Alterar Saldo");
		btnAlterarSaldo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		GridBagConstraints gbc_btnAlterarSaldo = new GridBagConstraints();
		gbc_btnAlterarSaldo.anchor = GridBagConstraints.EAST;
		gbc_btnAlterarSaldo.insets = new Insets(0, 0, 5, 0);
		gbc_btnAlterarSaldo.fill = GridBagConstraints.VERTICAL;
		gbc_btnAlterarSaldo.gridx = 1;
		gbc_btnAlterarSaldo.gridy = 1;
		panelSaldo.add(btnAlterarSaldo, gbc_btnAlterarSaldo);
		
		JPanel panelGanhos = new JPanel();
		panelGanhos.setBackground(new Color(31, 33, 38));
		panelGanhos.setBounds(30, 179, 193, 82);
		panel_1.add(panelGanhos);
		GridBagLayout gbl_panelGanhos = new GridBagLayout();
		gbl_panelGanhos.columnWidths = new int[]{114, 0};
		gbl_panelGanhos.rowHeights = new int[]{16, 17, 0, 0};
		gbl_panelGanhos.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelGanhos.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelGanhos.setLayout(gbl_panelGanhos);

		
		JLabel lblTituloGanhosMes = new JLabel("Ganhos do mês:");
		lblTituloGanhosMes.setForeground(new Color(216, 216, 216));
		lblTituloGanhosMes.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		GridBagConstraints gbc_lblTituloGanhosMes = new GridBagConstraints();
		gbc_lblTituloGanhosMes.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTituloGanhosMes.insets = new Insets(0, 0, 5, 0);
		gbc_lblTituloGanhosMes.gridx = 0;
		gbc_lblTituloGanhosMes.gridy = 0;
		panelGanhos.add(lblTituloGanhosMes, gbc_lblTituloGanhosMes);
		lblTituloGanhosMes.setBorder(BorderFactory.createEmptyBorder(5, 7, 0, 0));

		
		lblValorGanhoMes = new JLabel("R$ 0,00");
		lblValorGanhoMes.setForeground(new Color(0, 128, 0));
		lblValorGanhoMes.setFont(new Font("ABeeZee", Font.BOLD, 14));
		GridBagConstraints gbc_lblValorGanhoMes = new GridBagConstraints();
		gbc_lblValorGanhoMes.anchor = GridBagConstraints.WEST;
		gbc_lblValorGanhoMes.gridx = 0;
		gbc_lblValorGanhoMes.gridy = 2;
		panelGanhos.add(lblValorGanhoMes, gbc_lblValorGanhoMes);
		lblValorGanhoMes.setBorder(BorderFactory.createEmptyBorder(0, 7, 0, 0));
		
		JPanel panelDespesasMes = new JPanel();
		panelDespesasMes.setBackground(new Color(31, 33, 38));
		panelDespesasMes.setBounds(248, 179, 193, 82);
		panel_1.add(panelDespesasMes);
		GridBagLayout gbl_panelDespesasMes = new GridBagLayout();
		gbl_panelDespesasMes.columnWidths = new int[]{127, 0};
		gbl_panelDespesasMes.rowHeights = new int[]{16, 33, 17, 0};
		gbl_panelDespesasMes.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelDespesasMes.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelDespesasMes.setLayout(gbl_panelDespesasMes);
		
		JLabel lblTituloDespesasMes = new JLabel("Despesas do mês:");
		lblTituloDespesasMes.setForeground(new Color(216, 216, 216));
		lblTituloDespesasMes.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		GridBagConstraints gbc_lblTituloDespesasMes = new GridBagConstraints();
		gbc_lblTituloDespesasMes.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTituloDespesasMes.insets = new Insets(0, 0, 5, 0);
		gbc_lblTituloDespesasMes.gridx = 0;
		gbc_lblTituloDespesasMes.gridy = 0;
		panelDespesasMes.add(lblTituloDespesasMes, gbc_lblTituloDespesasMes);
		lblTituloDespesasMes.setBorder(BorderFactory.createEmptyBorder(5, 7, 0, 0));
		

		lblDespesasMes = new JLabel("R$ 0,00");
		lblDespesasMes.setBackground(new Color(166, 0, 4));
		lblDespesasMes.setForeground(new Color(149, 0, 0));
		lblDespesasMes.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblDespesasMes = new GridBagConstraints();
		gbc_lblDespesasMes.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDespesasMes.anchor = GridBagConstraints.NORTH;
		gbc_lblDespesasMes.gridx = 0;
		gbc_lblDespesasMes.gridy = 2;
		panelDespesasMes.add(lblDespesasMes, gbc_lblDespesasMes);
		lblDespesasMes.setBorder(BorderFactory.createEmptyBorder(0, 7, 0, 0));
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBounds(10, 13, 524, 51);
		panel_1.add(panelCabecalho);
		panelCabecalho.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNomeSistema = new JLabel("CA$H HUB");
		panelCabecalho.add(lblNomeSistema, BorderLayout.CENTER);
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNomeSistema.setForeground(new Color(31, 33, 38));
		
		
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
			}
		}
	}
}