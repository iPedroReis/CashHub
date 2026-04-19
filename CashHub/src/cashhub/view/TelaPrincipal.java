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
import java.awt.Dimension; // Importa a sua classe Gasto

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Simulando a lista que virá do "banco de dados" ou da tela de cadastro
	// No futuro, isso pode ficar em uma classe separada para o grupo todo usar
	public static ArrayList<Gasto> listaGlobalDeGastos = new ArrayList<>();

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
		setTitle("Ca$h Hub - Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500); // Aumentei um pouco para caber o seu protótipo
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(130, 400));
		panel.setBackground(new Color(128, 128, 128));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(10, 95, 105, 23);
		panel.add(btnDashboard);
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.setBounds(10, 129, 105, 23);
		panel.add(btnExtrato);
		
		JButton btnAdicionarSaldo = new JButton("Adicionar Saldo");
		btnAdicionarSaldo.setBounds(10, 163, 105, 23);
		panel.add(btnAdicionarSaldo);
		
		JButton btnConfiguracoes = new JButton("Configurações");
		btnConfiguracoes.setBounds(10, 197, 105, 23);
		panel.add(btnConfiguracoes);
		
		JLabel lblNomeSistema = new JLabel("CA$H HUB");
		lblNomeSistema.setBounds(32, 32, 63, 15);
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeSistema.setForeground(new Color(255, 255, 255));
		panel.add(lblNomeSistema);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_1, BorderLayout.CENTER);

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