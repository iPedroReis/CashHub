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
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaConfiguracao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPlanoPremium;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfiguracao frame = new TelaConfiguracao();
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
	public TelaConfiguracao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPerfil = new JPanel();
		panelPerfil.setBorder(new LineBorder(new Color(31, 33, 38)));
		panelPerfil.setBackground(new Color(216, 216, 216));
		panelPerfil.setBounds(-2, -5, 375, 116);
		contentPane.add(panelPerfil);
		panelPerfil.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Gustavo Dornellas");
		lblNewLabel_3.setFont(new Font("ABeeZee", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(121, 35, 183, 19);
		panelPerfil.add(lblNewLabel_3);
		
		JLabel lblTituloMembro = new JLabel("Membro desde fev 2026");
		lblTituloMembro.setForeground(Color.GRAY);
		lblTituloMembro.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblTituloMembro.setBounds(121, 57, 183, 14);
		panelPerfil.add(lblTituloMembro);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal tela = new TelaPrincipal();
				tela.setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 11, 25, 25);
		panelPerfil.add(btnVoltar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setForeground(new Color(31, 33, 38));
		panel_1.setLayout(null);
		panel_1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		panel_1.setBackground(new Color(216, 216, 216));
		panel_1.setBounds(3, 110, 367, 362);
		contentPane.add(panel_1);
		
		JLabel lblTituloPreferencias = new JLabel("Preferências do Usuário");
		lblTituloPreferencias.setForeground(new Color(31, 33, 38));
		lblTituloPreferencias.setFont(new Font("ABeeZee", Font.BOLD, 15));
		lblTituloPreferencias.setBounds(10, 23, 205, 14);
		panel_1.add(lblTituloPreferencias);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(216, 216, 216));
		panel_2.setBounds(10, 132, 347, 99);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTituloNotificaesAlertas = new JLabel("Notificações & Alertas");
		lblTituloNotificaesAlertas.setBounds(10, 11, 167, 18);
		panel_2.add(lblTituloNotificaesAlertas);
		lblTituloNotificaesAlertas.setForeground(new Color(31, 33, 38));
		lblTituloNotificaesAlertas.setFont(new Font("ABeeZee", Font.BOLD, 15));
		
		JLabel lblTituloLembreteContas = new JLabel("Lembrete de contas");
		lblTituloLembreteContas.setForeground(new Color(31, 33, 38));
		lblTituloLembreteContas.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloLembreteContas.setBounds(10, 37, 132, 14);
		panel_2.add(lblTituloLembreteContas);
		
		JLabel lblTituloPagamentosMensais = new JLabel("Notifique pagamentos mensais");
		lblTituloPagamentosMensais.setFont(new Font("ABeeZee", Font.PLAIN, 11));
		lblTituloPagamentosMensais.setForeground(new Color(128, 128, 128));
		lblTituloPagamentosMensais.setBounds(10, 51, 202, 14);
		panel_2.add(lblTituloPagamentosMensais);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setMaximumSize(new Dimension(30, 30));
		chckbxNewCheckBox.setPreferredSize(new Dimension(30, 30));
		chckbxNewCheckBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxNewCheckBox.setForeground(new Color(31, 33, 38));
		chckbxNewCheckBox.setBackground(new Color(216, 216, 216));
		chckbxNewCheckBox.setBounds(307, 37, 23, 23);
		panel_2.add(chckbxNewCheckBox);
		
		JLabel lblTituloAlertaLimite = new JLabel("Alerta de limite de orçamento");
		lblTituloAlertaLimite.setForeground(new Color(31, 33, 38));
		lblTituloAlertaLimite.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloAlertaLimite.setBounds(10, 71, 187, 14);
		panel_2.add(lblTituloAlertaLimite);
		
		JLabel lblTituloGastos80 = new JLabel("Notifique quando gastos excederem 80%");
		lblTituloGastos80.setForeground(Color.GRAY);
		lblTituloGastos80.setFont(new Font("ABeeZee", Font.PLAIN, 11));
		lblTituloGastos80.setBounds(10, 85, 223, 14);
		panel_2.add(lblTituloGastos80);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setPreferredSize(new Dimension(30, 30));
		chckbxNewCheckBox_1.setMaximumSize(new Dimension(30, 30));
		chckbxNewCheckBox_1.setForeground(new Color(31, 33, 38));
		chckbxNewCheckBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxNewCheckBox_1.setBackground(new Color(216, 216, 216));
		chckbxNewCheckBox_1.setBounds(307, 67, 23, 23);
		panel_2.add(chckbxNewCheckBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(216, 216, 216));
		panel_3.setBounds(10, 48, 347, 68);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JComboBox boxMoedaBase = new JComboBox();
		boxMoedaBase.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		boxMoedaBase.setForeground(new Color(31, 33, 38));
		boxMoedaBase.setModel(new DefaultComboBoxModel(new String[] {"BRL - Real (R$)", "USD - Dólar ($)", "EUR - Euro (€)"}));
		boxMoedaBase.setBounds(10, 35, 327, 22);
		panel_3.add(boxMoedaBase);
		boxMoedaBase.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxMoedaBase.setBackground(new Color(216, 216, 216));
		
		JLabel lblTituloMoeda = new JLabel("Moeda Base");
		lblTituloMoeda.setForeground(new Color(31, 33, 38));
		lblTituloMoeda.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloMoeda.setBounds(10, 21, 83, 14);
		panel_3.add(lblTituloMoeda);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(216, 216, 216));
		panel_4.setBounds(10, 242, 347, 109);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTituloGerenciamentoDePlano = new JLabel("Gerenciamento de Plano");
		lblTituloGerenciamentoDePlano.setBounds(10, 11, 184, 18);
		panel_4.add(lblTituloGerenciamentoDePlano);
		lblTituloGerenciamentoDePlano.setForeground(new Color(31, 33, 38));
		lblTituloGerenciamentoDePlano.setFont(new Font("ABeeZee", Font.BOLD, 15));
		
		txtPlanoPremium = new JTextField();
		txtPlanoPremium.setEditable(false);
		txtPlanoPremium.setBackground(new Color(191, 203, 143));
		txtPlanoPremium.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		txtPlanoPremium.setForeground(new Color(31, 33, 38));
		txtPlanoPremium.setText("Plano Premium");
		txtPlanoPremium.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlanoPremium.setBounds(10, 38, 113, 22);
		panel_4.add(txtPlanoPremium);
		txtPlanoPremium.setColumns(10);
		
		JButton btnAlterarPlano = new JButton("Alterar Plano");
		btnAlterarPlano.setForeground(new Color(31, 33, 38));
		btnAlterarPlano.setBackground(new Color(0, 128, 64));
		btnAlterarPlano.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlterarPlano.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		btnAlterarPlano.setBounds(224, 75, 113, 23);
		panel_4.add(btnAlterarPlano);

	}
}
