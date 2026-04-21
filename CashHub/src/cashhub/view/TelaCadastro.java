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

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtValor;
	private JTextField txtData;
	private JButton btnNewButton;
	private JLabel lblTituloDescricao;
	private JLabel lblValor;
	private JLabel lblData;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(120, 61, 199, 20);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(119, 94, 200, 20);
		contentPane.add(txtValor);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(120, 136, 199, 20);
		contentPane.add(txtData);
		
		btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(230, 167, 89, 23);
		contentPane.add(btnNewButton);
		
		lblTituloDescricao = new JLabel("Descrição:");
		lblTituloDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloDescricao.setBounds(23, 64, 87, 14);
		contentPane.add(lblTituloDescricao);
		
		lblValor = new JLabel("Valor:");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setBounds(22, 97, 87, 14);
		contentPane.add(lblValor);
		
		lblData = new JLabel("Data:");
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setBounds(23, 139, 87, 14);
		contentPane.add(lblData);

	}
}
