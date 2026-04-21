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

public class TelaPrincipal extends JFrame {

	public static TelaPrincipal frameAberto;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldPesquisar;
	private JTextField txtR;
	private JLabel lblValorGanhoMes; // Transformado em atributo para ser acessível

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
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnExtrato.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnExtrato.setBounds(5, 130, 120, 30);
		btnExtrato.setForeground(new Color(216, 216, 216));
		btnExtrato.setBackground(new Color(31, 33, 38));
		panel.add(btnExtrato);
		
		JButton btnAdicionarSaldo = new JButton("Adicionar Saldo");
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
		
		JButton btnConfiguracoes = new JButton("Configurações");
		btnConfiguracoes.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnConfiguracoes.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnConfiguracoes.setBounds(5, 200, 120, 30);
		btnConfiguracoes.setForeground(new Color(216, 216, 216));
		btnConfiguracoes.setBackground(new Color(31, 33, 38));
		panel.add(btnConfiguracoes);
		
		JLabel lblCashHub = new JLabel("");
		lblCashHub.setBounds(-17, -7, 118, 91);
		lblCashHub.setIcon(new ImageIcon("C:\\Users\\Gustavo\\Downloads\\CashHub (3).png"));
		panel.add(lblCashHub);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnDashboard.setForeground(new Color(216, 216, 216));
		btnDashboard.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnDashboard.setBackground(new Color(31, 33, 38));
		btnDashboard.setBounds(5, 95, 120, 30);
		panel.add(btnDashboard);
		
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
		txtFieldPesquisar.setEditable(false);
		txtFieldPesquisar.setBackground(new Color(31, 33, 38));
		txtFieldPesquisar.setBounds(160, 5, 208, 28);
		panel_1.add(txtFieldPesquisar);
		
		JPanel panelTranasacoes = new JPanel();
		panelTranasacoes.setBackground(new Color(31, 33, 38));
		panelTranasacoes.setBounds(28, 340, 484, 100);
		panel_1.add(panelTranasacoes);
		panelTranasacoes.setLayout(null);
		
		JLabel lbltransacoes = new JLabel("Ultimas Transações");
		lbltransacoes.setFont(new Font("ABeeZee", Font.PLAIN, 15));
		lbltransacoes.setForeground(new Color(216, 216, 216));
		lbltransacoes.setBounds(10, 11, 139, 14);
		panelTranasacoes.add(lbltransacoes);
		
		JButton btnVisualizarExtratoCompleto = new JButton("Visualizar extrato completo");
		btnVisualizarExtratoCompleto.setForeground(new Color(216, 216, 216));
		btnVisualizarExtratoCompleto.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnVisualizarExtratoCompleto.setBorder(null);
		btnVisualizarExtratoCompleto.setBackground(new Color(31, 33, 38));
		btnVisualizarExtratoCompleto.setBounds(306, 11, 168, 30);
		panelTranasacoes.add(btnVisualizarExtratoCompleto);
		
		JPanel panelSaldo = new JPanel();
		panelSaldo.setBackground(new Color(31, 33, 38));
		panelSaldo.setBounds(28, 75, 484, 82);
		panel_1.add(panelSaldo);
		panelSaldo.setLayout(null);
		
		txtR = new JTextField();
		txtR.setBorder(null);
		txtR.setFont(new Font("ABeeZee", Font.PLAIN, 20));
		txtR.setText("R$ 8.372,10");
		txtR.setForeground(new Color(216, 216, 216));
		txtR.setBackground(new Color(31, 33, 38));
		txtR.setBounds(10, 11, 209, 20);
		panelSaldo.add(txtR);
		
		JButton btnAlterarSaldo = new JButton("Alterar Saldo");
		btnAlterarSaldo.setForeground(new Color(216, 216, 216));
		btnAlterarSaldo.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAlterarSaldo.setBorder(null);
		btnAlterarSaldo.setBackground(new Color(73, 73, 73));
		btnAlterarSaldo.setBounds(373, 51, 101, 20);
		panelSaldo.add(btnAlterarSaldo);
		
		JPanel panelGanhos = new JPanel();
		panelGanhos.setBackground(new Color(192, 192, 192));
		panelGanhos.setBounds(28, 191, 126, 114);
		panel_1.add(panelGanhos);
		
		JLabel lblTituloGanhosMes = new JLabel("Ganhos do mês:");
		lblTituloGanhosMes.setFont(new Font("Dialog", Font.PLAIN, 12));
		panelGanhos.add(lblTituloGanhosMes);
		
		lblValorGanhoMes = new JLabel("R$ 0,00");
		lblValorGanhoMes.setForeground(new Color(0, 128, 0));
		lblValorGanhoMes.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelGanhos.add(lblValorGanhoMes);
		
		JPanel panelDespesasMes = new JPanel();
		panelDespesasMes.setBackground(new Color(215, 215, 215));
		panelDespesasMes.setBounds(181, 191, 126, 114);
		panel_1.add(panelDespesasMes);
		
		JLabel lblTituloDespesasMes = new JLabel("Despesas do mês:");
		lblTituloDespesasMes.setFont(new Font("Dialog", Font.PLAIN, 12));
		panelDespesasMes.add(lblTituloDespesasMes);
		
		JLabel lblDespesasMes = new JLabel("R$ 0,00");
		lblDespesasMes.setForeground(new Color(128, 0, 64));
		lblDespesasMes.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelDespesasMes.add(lblDespesasMes);

		atualizarDashboard();
		verificarAlertasDeVencimento();
	}
	
	public void atualizarDashboard() {
		double ganhos = Repositorio.calcularTotalGanhos();
		lblValorGanhoMes.setText(String.format("R$ %.2f", ganhos));
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