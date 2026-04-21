package cashhub.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cashhub.model.Gasto;
import cashhub.model.Repositorio;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JComboBox;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtValor;
	private JTextField txtData;
	private JButton btnSalvar;
	private JLabel lblTituloDescricao;
	private JLabel lblTituloValor;
	private JLabel lblTituloData;
	private JPanel panel;
	private JLabel lblIMGConfiguracoes;
	private JLabel lblIMGConfiguracoes_1;
	private JLabel lblIMGSaldo;
	private JLabel lblIMGExtrato;
	private JLabel lblIMGDashboard;
	private JButton btnDashboard;
	private JButton btnExtrato;
	private JButton btnAdicionarSaldo;
	private JButton btnConfiguracoes;
	private JButton btnAjuda;
	private JLabel lblCashHub;
	private JPanel panel_1;
	private JButton btnNewButton_1;
	private JLabel lblNomeSistema;
	private JTextField textField;
	private JLabel lblTituloTipoTransacoes;
	private JButton btnAdicionar;
	private JLabel lblNewLabel;
	private JButton btnRetirar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnCancelar;
	private JTextField txtBoasPraticas;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, -1, 130, 451);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(130, 400));
		panel.setBackground(new Color(31, 33, 38));
		contentPane.add(panel);
		
		lblIMGConfiguracoes = new JLabel("");
		lblIMGConfiguracoes.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/interrogation.png")));
		lblIMGConfiguracoes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIMGConfiguracoes.setBounds(11, 411, 20, 24);
		panel.add(lblIMGConfiguracoes);
		
		lblIMGConfiguracoes_1 = new JLabel("");
		lblIMGConfiguracoes_1.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/settings.png")));
		lblIMGConfiguracoes_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIMGConfiguracoes_1.setBounds(13, 203, 20, 24);
		panel.add(lblIMGConfiguracoes_1);
		
		lblIMGSaldo = new JLabel("");
		lblIMGSaldo.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/add.png")));
		lblIMGSaldo.setBounds(12, 168, 20, 24);
		panel.add(lblIMGSaldo);
		
		lblIMGExtrato = new JLabel("");
		lblIMGExtrato.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/time-past.png")));
		lblIMGExtrato.setBounds(12, 133, 20, 24);
		panel.add(lblIMGExtrato);
		
		lblIMGDashboard = new JLabel("");
		lblIMGDashboard.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/layout-fluid.png")));
		lblIMGDashboard.setBounds(9, 100, 21, 21);
		panel.add(lblIMGDashboard);
		
		btnDashboard = new JButton("      Dashboard");
		btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		btnDashboard.setForeground(new Color(216, 216, 216));
		btnDashboard.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnDashboard.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnDashboard.setBackground(new Color(31, 33, 38));
		btnDashboard.setBounds(5, 95, 120, 30);
		panel.add(btnDashboard);
		
		btnExtrato = new JButton("       Extrato");
		btnExtrato.setHorizontalAlignment(SwingConstants.LEFT);
		btnExtrato.setForeground(new Color(216, 216, 216));
		btnExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnExtrato.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnExtrato.setBackground(new Color(31, 33, 38));
		btnExtrato.setBounds(5, 130, 120, 30);
		panel.add(btnExtrato);
		
		btnAdicionarSaldo = new JButton("       Saldo");
		btnAdicionarSaldo.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdicionarSaldo.setForeground(new Color(216, 216, 216));
		btnAdicionarSaldo.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnAdicionarSaldo.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		btnAdicionarSaldo.setBackground(new Color(31, 33, 38));
		btnAdicionarSaldo.setBounds(5, 165, 120, 30);
		panel.add(btnAdicionarSaldo);
		
		btnConfiguracoes = new JButton("       Configurações");
		btnConfiguracoes.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfiguracoes.setForeground(new Color(216, 216, 216));
		btnConfiguracoes.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnConfiguracoes.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnConfiguracoes.setBackground(new Color(31, 33, 38));
		btnConfiguracoes.setBounds(5, 200, 120, 30);
		panel.add(btnConfiguracoes);
		
		btnAjuda = new JButton("       Ajuda");
		btnAjuda.setHorizontalAlignment(SwingConstants.LEFT);
		btnAjuda.setForeground(new Color(216, 216, 216));
		btnAjuda.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnAjuda.setBorder(new LineBorder(new Color(216, 216, 216)));
		btnAjuda.setBackground(new Color(31, 33, 38));
		btnAjuda.setBounds(5, 408, 120, 30);
		panel.add(btnAjuda);
		
		lblCashHub = new JLabel("");
		lblCashHub.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/CashHub (3).png")));
		lblCashHub.setBounds(-17, -7, 118, 91);
		panel.add(lblCashHub);
		
		panel_1 = new JPanel();
		panel_1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(216, 216, 216));
		panel_1.setBounds(130, -2, 544, 451);
		contentPane.add(panel_1);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/arrow-trend-down (1).png")));
		lblNewLabel_1.setBounds(171, 150, 21, 21);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/arrow-trend-up (1).png")));
		lblNewLabel.setBounds(43, 149, 21, 21);
		panel_1.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/search (2).png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(31, 33, 38));
		btnNewButton_1.setBounds(331, 8, 36, 23);
		panel_1.add(btnNewButton_1);
		
		lblNomeSistema = new JLabel("CA$H HUB");
		lblNomeSistema.setForeground(new Color(31, 33, 38));
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNomeSistema.setBounds(36, 12, 90, 15);
		panel_1.add(lblNomeSistema);
		
		textField = new JTextField();
		textField.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		textField.setForeground(new Color(216, 216, 216));
		textField.setBorder(null);
		textField.setBackground(new Color(31, 33, 38));
		textField.setBounds(160, 5, 208, 28);
		panel_1.add(textField);
		
		txtDescricao = new JTextField();
		txtDescricao.setForeground(new Color(31, 33, 38));
		txtDescricao.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		txtDescricao.setBorder(null);
		txtDescricao.setBounds(36, 310, 283, 72);
		panel_1.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		btnSalvar = new JButton("Salvar Transação");
		btnSalvar.setBorder(null);
		btnSalvar.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		btnSalvar.setBackground(new Color(31, 33, 38));
		btnSalvar.setForeground(new Color(216, 216, 216));
		btnSalvar.setBounds(146, 415, 173, 23);
		panel_1.add(btnSalvar);
		
		txtData = new JTextField();
		txtData.setForeground(new Color(31, 33, 38));
		txtData.setBorder(null);
		txtData.setBounds(191, 260, 128, 20);
		panel_1.add(txtData);
		txtData.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setForeground(new Color(31, 33, 38));
		txtValor.setBorder(null);
		txtValor.setBounds(36, 207, 283, 20);
		panel_1.add(txtValor);
		txtValor.setColumns(10);
		
		lblTituloDescricao = new JLabel("Descrição:");
		lblTituloDescricao.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloDescricao.setBounds(36, 293, 87, 14);
		panel_1.add(lblTituloDescricao);
		lblTituloDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblTituloValor = new JLabel("Valor:");
		lblTituloValor.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloValor.setBounds(36, 184, 87, 14);
		panel_1.add(lblTituloValor);
		lblTituloValor.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblTituloData = new JLabel("Data:");
		lblTituloData.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloData.setBounds(191, 240, 52, 14);
		panel_1.add(lblTituloData);
		lblTituloData.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblTituloCategoria = new JLabel("Categoria:");
		lblTituloCategoria.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloCategoria.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloCategoria.setBounds(36, 241, 90, 14);
		panel_1.add(lblTituloCategoria);
		
		lblTituloTipoTransacoes = new JLabel("Tipo de Transação");
		lblTituloTipoTransacoes.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloTipoTransacoes.setFont(new Font("ABeeZee", Font.PLAIN, 15));
		lblTituloTipoTransacoes.setBounds(36, 111, 208, 14);
		panel_1.add(lblTituloTipoTransacoes);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setHorizontalAlignment(SwingConstants.TRAILING);
		btnAdicionar.setForeground(new Color(216, 216, 216));
		btnAdicionar.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		btnAdicionar.setBackground(new Color(0, 128, 0));
		btnAdicionar.setBounds(37, 148, 105, 23);
		panel_1.add(btnAdicionar);
		
		btnRetirar = new JButton("Retirar");
		btnRetirar.setHorizontalAlignment(SwingConstants.TRAILING);
		btnRetirar.setForeground(new Color(216, 216, 216));
		btnRetirar.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		btnRetirar.setBackground(new Color(166, 0, 4));
		btnRetirar.setBounds(163, 148, 105, 23);
		panel_1.add(btnRetirar);
		
		lblNewLabel_2 = new JLabel("ADICIONAR NOVO REGISTRO");
		lblNewLabel_2.setForeground(new Color(31, 33, 38));
		lblNewLabel_2.setFont(new Font("ABeeZee", Font.BOLD, 20));
		lblNewLabel_2.setBounds(36, 66, 283, 23);
		panel_1.add(lblNewLabel_2);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBorder(null);
		btnCancelar.setForeground(new Color(216, 216, 216));
		btnCancelar.setBackground(new Color(73, 73, 73));
		btnCancelar.setBounds(36, 415, 89, 23);
		panel_1.add(btnCancelar);
		
		lblNewLabel_3 = new JLabel("Boas Praticas");
		lblNewLabel_3.setFont(new Font("ABeeZee", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(new Color(31, 33, 38));
		lblNewLabel_3.setBounds(392, 124, 96, 14);
		panel_1.add(lblNewLabel_3);
		
		txtBoasPraticas = new JTextField();
		txtBoasPraticas.setBorder(null);
		txtBoasPraticas.setEditable(false);
		txtBoasPraticas.setForeground(new Color(31, 33, 38));
		txtBoasPraticas.setBounds(358, 112, 163, 269);
		panel_1.add(txtBoasPraticas);
		txtBoasPraticas.setColumns(10);
		
		JComboBox BoxCategoria = new JComboBox();
		BoxCategoria.setForeground(new Color(31, 33, 38));
		BoxCategoria.setBorder(null);
		BoxCategoria.setBounds(36, 260, 128, 20);
		panel_1.add(BoxCategoria);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String desc = txtDescricao.getText();
		        double valor = Double.parseDouble(txtValor.getText()); // Converte texto em número
		        
		        // 2. Criar o objeto Gasto (usando a data de hoje para simplificar o teste)
		        LocalDate hoje = LocalDate.now();
		        Gasto novo = new Gasto(0, valor, desc, hoje.getYear(), hoje.getMonthValue(), hoje.getDayOfMonth(), null, false);
		        
		        // 3. Salvar no Repositóri
		        Repositorio.salvar(novo);
		        
		        
		        if (TelaPrincipal.frameAberto != null) {
		            TelaPrincipal.frameAberto.atualizarDashboard();
		        }

		        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
		        dispose(); // Fecha a tela de cadastro
		        
		        
		        // 4. Fechar a janela de cadastro
		        dispose();
		        
		        // MENSAGEM DE SUCESSO
		        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
				
			}
		});

	}
}
