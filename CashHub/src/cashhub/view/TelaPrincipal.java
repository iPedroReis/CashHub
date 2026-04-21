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

public class TelaPrincipal extends JFrame {

	public static TelaPrincipal frameAberto;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldPesquisar;
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
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(130, 400));
		panel.setBackground(new Color(31, 33, 38));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		JButton btnDashboard = new JButton("      Dashboard");
		btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		btnDashboard.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnDashboard.setForeground(new Color(216, 216, 216));
		btnDashboard.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnDashboard.setBackground(new Color(31, 33, 38));
		btnDashboard.setBounds(5, 95, 120, 30);
		panel.add(btnDashboard);
		
		JButton btnExtrato = new JButton("       Extrato");
		btnExtrato.setHorizontalAlignment(SwingConstants.LEFT);
		btnExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnExtrato.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnExtrato.setBounds(5, 130, 120, 30);
		btnExtrato.setForeground(new Color(216, 216, 216));
		btnExtrato.setBackground(new Color(31, 33, 38));
		panel.add(btnExtrato);
		
		JButton btnAdicionarSaldo = new JButton("       Saldo");
		btnAdicionarSaldo.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdicionarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro tela = new TelaCadastro();
			    // Torna ela visível
			    tela.setVisible(true);				
			}
		});
		btnAdicionarSaldo.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnAdicionarSaldo.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnAdicionarSaldo.setBounds(5, 165, 120, 30);
		btnAdicionarSaldo.setForeground(new Color(216, 216, 216));
		btnAdicionarSaldo.setBackground(new Color(31, 33, 38));
		panel.add(btnAdicionarSaldo);
		
		JButton btnConfiguracoes = new JButton("       Configurações");
		btnConfiguracoes.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfiguracoes.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnConfiguracoes.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnConfiguracoes.setBounds(5, 200, 120, 30);
		btnConfiguracoes.setForeground(new Color(216, 216, 216));
		btnConfiguracoes.setBackground(new Color(31, 33, 38));
		panel.add(btnConfiguracoes);
		
		JButton btnAjuda = new JButton("       Ajuda");
		btnAjuda.setHorizontalAlignment(SwingConstants.LEFT);
		btnAjuda.setForeground(new Color(216, 216, 216));
		btnAjuda.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnAjuda.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnAjuda.setBackground(new Color(31, 33, 38));
		btnAjuda.setBounds(5, 408, 120, 30);
		panel.add(btnAjuda);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(216, 216, 216));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNomeSistema = new JLabel("CA$H HUB");
		lblNomeSistema.setBounds(36, 12, 90, 15);
		panel_1.add(lblNomeSistema);
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNomeSistema.setForeground(new Color(31, 33, 38));
		
		txtFieldPesquisar = new JTextField();
		txtFieldPesquisar.setForeground(new Color(216, 216, 216));
		txtFieldPesquisar.setEditable(false);
		txtFieldPesquisar.setBackground(new Color(31, 33, 38));
		txtFieldPesquisar.setBounds(160, 5, 208, 28);
		panel_1.add(txtFieldPesquisar);
		
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
		
		JButton btnAlterarSaldo = new JButton("Alterar Saldo");
		btnAlterarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TelaCadastro tela = new TelaCadastro();
				    // Torna ela visível
				    tela.setVisible(true);				
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

		LocalDate hoje = LocalDate.now();
	    
	    Gasto g1 = new Gasto(1, 100.0, "Salário", hoje.getYear(), hoje.getMonthValue(), hoje.getDayOfMonth(), null, false);
	    Gasto g2 = new Gasto(2, -50.0, "Café", hoje.getYear(), hoje.getMonthValue(), hoje.getDayOfMonth(), null, false);
	    
	    Repositorio.salvar(g1);
	    Repositorio.salvar(g2);

	    setTitle("Ca$h Hub - Dashboard");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	    atualizarDashboard();
	    verificarAlertasDeVencimento();
	}
		
	
	public void atualizarDashboard() {
		double ganhos = Repositorio.calcularTotalGanhos();
		lblValorGanhoMes.setText(String.format("R$ %.2f", ganhos));
		
	    double despesas = Repositorio.calcularTotalDespesas();
	    lblDespesasMes.setText(String.format("R$ %.2f", despesas));
	    
	    double saldoFinal = ganhos - despesas;
	    txtR.setText(String.format("R$ %.2f", saldoFinal));	
	    
	    Gasto ultimoGanho = Repositorio.getUltimoGanho();
	    if (ultimoGanho != null) {
	        lblTransacoes1.setText(ultimoGanho.getDescricao());
	        lblValorTransacao1.setText(String.format("R$ %.2f", ultimoGanho.getValor()));
	    } else {
	        lblTransacoes1.setText("Nenhum ganho registrado");
	        lblValorTransacao1.setText("R$ 0,00");
	    }

	    Gasto ultimaDespesa = Repositorio.getUltimaDespesa();
	    if (ultimaDespesa != null) {
	        lblTransacoes2.setText(ultimaDespesa.getDescricao());
	        lblValorTransacao2.setText(String.format("R$ %.2f", Math.abs(ultimaDespesa.getValor())));
	    } else {
	        lblTransacoes2.setText("Nenhuma despesa registrada");
	        lblValorTransacao2.setText("R$ 0,00");
	    }
	}
	
	private void verificarAlertasDeVencimento() {
		LocalDate hoje = LocalDate.now();
		if (Repositorio.getLista() == null || Repositorio.getLista().isEmpty()) {
			return;
		}

		for (Gasto g : Repositorio.getLista()) {
			String status = g.identificarStatus(hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear());
	        if (status.equals("Vencido") || status.equals("Vence Hoje")) {
	            JOptionPane.showMessageDialog(this, 
	                "ALERTA: O gasto '" + g.getDescricao() + "' está " + status + "!",
	                "Sistema de Alertas Ca$h Hub",
	                JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}