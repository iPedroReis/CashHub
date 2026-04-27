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

public class TelaConfiguracao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBounds(100, 100, 383, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(31, 33, 38), 1, true));
		panel.setBackground(new Color(216, 216, 216));
		panel.setForeground(new Color(31, 33, 38));
		panel.setBounds(-2, -5, 372, 127);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setForeground(new Color(31, 33, 38));
		panel_1.setLayout(null);
		panel_1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		panel_1.setBackground(new Color(216, 216, 216));
		panel_1.setBounds(0, 121, 367, 332);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Preferências do Usuário");
		lblNewLabel.setForeground(new Color(31, 33, 38));
		lblNewLabel.setFont(new Font("ABeeZee", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 205, 14);
		panel_1.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBackground(new Color(216, 216, 216));
		comboBox.setBounds(10, 76, 265, 22);
		panel_1.add(comboBox);
		
		JLabel lblNotificaesAlertas = new JLabel("Notificações & Alertas");
		lblNotificaesAlertas.setForeground(new Color(31, 33, 38));
		lblNotificaesAlertas.setFont(new Font("ABeeZee", Font.BOLD, 15));
		lblNotificaesAlertas.setBounds(10, 132, 191, 14);
		panel_1.add(lblNotificaesAlertas);
		
		JLabel lblGerenciamentoDePlano = new JLabel("Gerenciamento de Plano");
		lblGerenciamentoDePlano.setForeground(new Color(31, 33, 38));
		lblGerenciamentoDePlano.setFont(new Font("ABeeZee", Font.BOLD, 15));
		lblGerenciamentoDePlano.setBounds(10, 242, 191, 14);
		panel_1.add(lblGerenciamentoDePlano);

	}
}
