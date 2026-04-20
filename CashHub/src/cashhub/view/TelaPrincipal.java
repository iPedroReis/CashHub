package cashhub.view;

import java.awt.EventQueue;
import java.time.LocalDate;
import java.util.ArrayList; // Importante para a lista
import javax.swing.JFrame;
import javax.swing.JOptionPane; // Para o balão de alerta
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cashhub.model.Gasto;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; // Importa a sua classe Gasto


public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Simulando a lista que virá do "banco de dados" ou da tela de cadastro
	// No futuro, isso pode ficar em uma classe separada para o grupo todo usar
	public static ArrayList<Gasto> listaGlobalDeGastos = new ArrayList<>();
	private JTextField txtFieldPesquisar;
	private JTextField txtR;

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
		setBounds(100, 100, 700, 500); // Aumentei um pouco para caber o seu protótipo
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 216, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(130, 400));
		panel.setBackground(new Color(31, 33, 38));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		JButton btnExtrato = new JButton("      Extrato");
		btnExtrato.setHorizontalAlignment(SwingConstants.LEFT);
		btnExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnExtrato.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnExtrato.setBounds(0, 129, 130, 30);
		btnExtrato.setForeground(new Color(216, 216, 216));
		btnExtrato.setBackground(new Color(31, 33, 38));
		panel.add(btnExtrato);
		
		JButton btnAdicionarSaldo = new JButton("      Adicionar Saldo");
		btnAdicionarSaldo.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdicionarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdicionarSaldo.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnAdicionarSaldo.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnAdicionarSaldo.setBounds(0, 163, 130, 30);
		btnAdicionarSaldo.setForeground(new Color(216, 216, 216));
		btnAdicionarSaldo.setBackground(new Color(31, 33, 38));
		panel.add(btnAdicionarSaldo);
		
		JButton btnConfiguracoes = new JButton("      Configurações");
		btnConfiguracoes.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfiguracoes.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnConfiguracoes.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnConfiguracoes.setBounds(0, 197, 130, 30);
		btnConfiguracoes.setForeground(new Color(216, 216, 216));
		btnConfiguracoes.setBackground(new Color(31, 33, 38));
		panel.add(btnConfiguracoes);
		
		JLabel lblCashHub = new JLabel("");
		lblCashHub.setBounds(-17, -7, 118, 91);
		lblCashHub.setIcon(new ImageIcon("C:\\Users\\Gustavo\\Downloads\\CashHub (3).png"));
		panel.add(lblCashHub);
		
		JButton btnDashboard = new JButton("     Dashboard");
		btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		btnDashboard.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnDashboard.setForeground(new Color(216, 216, 216));
		btnDashboard.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnDashboard.setBackground(new Color(31, 33, 38));
		btnDashboard.setBounds(0, 95, 130, 30);
		panel.add(btnDashboard);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(216, 216, 216));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNomeSistema = new JLabel("CA$H HUB");
		lblNomeSistema.setBackground(new Color(216, 216, 216));
		lblNomeSistema.setBounds(36, 12, 90, 15);
		panel_1.add(lblNomeSistema);
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNomeSistema.setForeground(new Color(31, 33, 38));
		
		JLabel lblImagemSearch = new JLabel("");
		lblImagemSearch.setBounds(343, -3, 24, 43);
		panel_1.add(lblImagemSearch);
		lblImagemSearch.setIcon(new ImageIcon("C:\\Users\\Gustavo\\Downloads\\search (1).png"));
		
		txtFieldPesquisar = new JTextField();
		txtFieldPesquisar.setEditable(false);
		txtFieldPesquisar.setBackground(new Color(31, 33, 38));
		txtFieldPesquisar.setBounds(160, 5, 208, 28);
		panel_1.add(txtFieldPesquisar);
		txtFieldPesquisar.setColumns(10);
		
		JPanel panelTranasacoes = new JPanel();
		panelTranasacoes.setBackground(new Color(31, 33, 38));
		panelTranasacoes.setBounds(28, 340, 484, 100);
		panel_1.add(panelTranasacoes);
		panelTranasacoes.setPreferredSize(new Dimension(50, 100));
		panelTranasacoes.setLayout(null);
		
		JLabel lbltransacoes = new JLabel("Ultimas Transações");
		lbltransacoes.setFont(new Font("ABeeZee", Font.PLAIN, 15));
		lbltransacoes.setForeground(new Color(216, 216, 216));
		lbltransacoes.setBackground(new Color(31, 33, 38));
		lbltransacoes.setBounds(10, 11, 139, 14);
		panelTranasacoes.add(lbltransacoes);
		
		JLabel lblImagemArrow = new JLabel("");
		lblImagemArrow.setIcon(new ImageIcon("C:\\Users\\Gustavo\\Downloads\\right-arrow.png"));
		lblImagemArrow.setBounds(450, 8, 25, 23);
		panelTranasacoes.add(lblImagemArrow);
		
		JButton btnExtratoCompleto = new JButton("Visualizar extrato completo");
		btnExtratoCompleto.setBorder(null);
		btnExtratoCompleto.setFont(new Font("ABeeZee", Font.PLAIN, 11));
		btnExtratoCompleto.setBackground(new Color(31, 33, 38));
		btnExtratoCompleto.setForeground(new Color(216, 216, 216));
		btnExtratoCompleto.setBounds(257, 8, 227, 23);
		panelTranasacoes.add(btnExtratoCompleto);
		
		JPanel panelSaldo = new JPanel();
		panelSaldo.setBackground(new Color(31, 33, 38));
		panelSaldo.setBounds(28, 75, 484, 82);
		panel_1.add(panelSaldo);
		panelSaldo.setPreferredSize(new Dimension(50, 100));
		panelSaldo.setLayout(null);
		
		JButton btnAlterarSaldo = new JButton("Alterar Saldo");
		btnAlterarSaldo.setBorder(null);
		btnAlterarSaldo.setForeground(new Color(216, 216, 216));
		btnAlterarSaldo.setBackground(new Color(31, 33, 38));
		btnAlterarSaldo.setBounds(371, 48, 103, 23);
		panelSaldo.add(btnAlterarSaldo);
		
		txtR = new JTextField();
		txtR.setBorder(null);
		txtR.setFont(new Font("ABeeZee", Font.PLAIN, 20));
		txtR.setText("R$ 8.372,10");
		txtR.setForeground(new Color(216, 216, 216));
		txtR.setBackground(new Color(31, 33, 38));
		txtR.setBounds(10, 11, 209, 20);
		panelSaldo.add(txtR);
		txtR.setColumns(10);
		
		JPanel panelGanhos = new JPanel();
		panelGanhos.setBackground(new Color(31, 33, 38));
		panelGanhos.setBounds(28, 191, 126, 114);
		panel_1.add(panelGanhos);
		
		JPanel panelDespesas = new JPanel();
		panelDespesas.setBackground(new Color(31, 33, 38));
		panelDespesas.setBounds(199, 191, 126, 114);
		panel_1.add(panelDespesas);

		// 1. CHAMA A VALIDAÇÃO: Ela deve ser a última coisa no construtor
		verificarAlertasDeVencimento();
	}
	
	
	private void verificarAlertasDeVencimento() {
		LocalDate hoje = LocalDate.now();
		
		// Verificamos se a lista não está vazia para evitar erros
		if (listaGlobalDeGastos == null || listaGlobalDeGastos.isEmpty()) {
			return; 
		}

		for (Gasto g : listaGlobalDeGastos) {
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