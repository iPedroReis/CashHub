package cashhub.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaExtrato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField txtR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExtrato frame = new TelaExtrato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaExtrato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(130, 400));
		panel.setBackground(new Color(31, 33, 38));
		panel.setBounds(0, 0, 130, 451);
		contentPane.add(panel);
		
		JButton btnDashboard = new JButton("      Dashboard");
		btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		btnDashboard.setForeground(new Color(216, 216, 216));
		btnDashboard.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnDashboard.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnDashboard.setBackground(new Color(31, 33, 38));
		btnDashboard.setBounds(5, 95, 120, 30);
		panel.add(btnDashboard);
		
		JButton btnExtrato = new JButton("       Extrato");
		btnExtrato.setHorizontalAlignment(SwingConstants.LEFT);
		btnExtrato.setForeground(new Color(216, 216, 216));
		btnExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnExtrato.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnExtrato.setBackground(new Color(31, 33, 38));
		btnExtrato.setBounds(5, 130, 120, 30);
		panel.add(btnExtrato);
		
		JButton btnAdicionarSaldo = new JButton("       Saldo");
		btnAdicionarSaldo.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdicionarSaldo.setForeground(new Color(216, 216, 216));
		btnAdicionarSaldo.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnAdicionarSaldo.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnAdicionarSaldo.setBackground(new Color(31, 33, 38));
		btnAdicionarSaldo.setBounds(5, 165, 120, 30);
		panel.add(btnAdicionarSaldo);
		
		JButton btnConfiguracoes = new JButton("       Configurações");
		btnConfiguracoes.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfiguracoes.setForeground(new Color(216, 216, 216));
		btnConfiguracoes.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnConfiguracoes.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnConfiguracoes.setBackground(new Color(31, 33, 38));
		btnConfiguracoes.setBounds(5, 200, 120, 30);
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
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(216, 216, 216));
		panel_1.setBounds(130, 0, 761, 451);
		contentPane.add(panel_1);
		
		JLabel lblNomeSistema = new JLabel("CA$H HUB");
		lblNomeSistema.setForeground(new Color(31, 33, 38));
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNomeSistema.setBounds(17, 17, 125, 23);
		panel_1.add(lblNomeSistema);
		
		textField = new JTextField();
		textField.setForeground(new Color(216, 216, 216));
		textField.setEditable(false);
		textField.setBackground(new Color(31, 33, 38));
		textField.setBounds(169, 14, 327, 28);
		panel_1.add(textField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(31, 33, 38));
		panel_2.setBounds(12, 128, 529, 28);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTituloTabela = new JLabel("   DATA               CATEGORIA               DESCRIÇÃO               TIPO              VALOR");
		lblTituloTabela.setForeground(new Color(216, 216, 216));
		lblTituloTabela.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloTabela.setFont(new Font("ABeeZee", Font.BOLD, 13));
		lblTituloTabela.setBounds(2, 7, 522, 16);
		panel_2.add(lblTituloTabela);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(31, 33, 38));
		panel_2_1.setBounds(12, 410, 529, 28);
		panel_1.add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(31, 33, 38));
		panel_3.setBounds(565, 128, 184, 120);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Balanço do mês");
		lblNewLabel.setForeground(new Color(216, 216, 216));
		lblNewLabel.setFont(new Font("ABeeZee", Font.PLAIN, 16));
		lblNewLabel.setBounds(11, 9, 160, 16);
		panel_3.add(lblNewLabel);
		
		txtR = new JTextField();
		txtR.setText("R$ 8.372,10");
		txtR.setForeground(new Color(216, 216, 216));
		txtR.setFont(new Font("ABeeZee", Font.PLAIN, 20));
		txtR.setBorder(null);
		txtR.setBackground(new Color(31, 33, 38));
		txtR.setBounds(12, 32, 160, 20);
		panel_3.add(txtR);
		
		JLabel lblValorGanhoMes = new JLabel("R$ 0,00");
		lblValorGanhoMes.setForeground(new Color(0, 128, 0));
		lblValorGanhoMes.setFont(new Font("ABeeZee", Font.BOLD, 13));
		lblValorGanhoMes.setBounds(57, 70, 115, 17);
		panel_3.add(lblValorGanhoMes);
		
		JLabel lblTituloGanhos = new JLabel("Ganhos:");
		lblTituloGanhos.setForeground(new Color(216, 216, 216));
		lblTituloGanhos.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblTituloGanhos.setBounds(10, 70, 46, 14);
		panel_3.add(lblTituloGanhos);
		
		JLabel lblTituloDespesas = new JLabel("Despesas:");
		lblTituloDespesas.setForeground(new Color(216, 216, 216));
		lblTituloDespesas.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblTituloDespesas.setBounds(11, 93, 69, 14);
		panel_3.add(lblTituloDespesas);
		
		JLabel lblDespesasMes = new JLabel("R$ 0,00");
		lblDespesasMes.setForeground(new Color(149, 0, 0));
		lblDespesasMes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDespesasMes.setBackground(new Color(166, 0, 4));
		lblDespesasMes.setBounds(71, 92, 101, 17);
		panel_3.add(lblDespesasMes);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(31, 33, 38));
		panel_4.setBounds(565, 261, 184, 177);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Pagamentos Mensais");
		lblNewLabel_1.setForeground(new Color(216, 216, 216));
		lblNewLabel_1.setFont(new Font("ABeeZee", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 6, 160, 21);
		panel_4.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Gerenciar Pagamentos");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(216, 216, 216));
		btnNewButton.setForeground(new Color(31, 33, 38));
		btnNewButton.setBounds(12, 143, 160, 21);
		panel_4.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(539, 155, -524, 250);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(216, 216, 216));
		table.setForeground(new Color(31, 33, 38));
		table.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		table.setBounds(12, 155, 527, 257);
		panel_1.add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Histórico de Transações");
		lblNewLabel_2.setForeground(new Color(31, 33, 38));
		lblNewLabel_2.setFont(new Font("ABeeZee", Font.BOLD, 30));
		lblNewLabel_2.setBounds(12, 67, 422, 22);
		panel_1.add(lblNewLabel_2);
		
		JPanel panelnformacoes = new JPanel();
		panelnformacoes.setLayout(null);
		panelnformacoes.setBorder(null);
		panelnformacoes.setBackground(new Color(216, 216, 216));
		panelnformacoes.setBounds(556, 12, 193, 35);
		panel_1.add(panelnformacoes);
		
		JLabel lblNome = new JLabel("Gustavo Dornellas");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setForeground(new Color(31, 33, 38));
		lblNome.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		lblNome.setBounds(0, 0, 149, 17);
		panelnformacoes.add(lblNome);
		
		JLabel lblNewLabel_3 = new JLabel("Plano premium");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(38, 13, 111, 14);
		panelnformacoes.add(lblNewLabel_3);

	}
}
