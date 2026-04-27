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
	private JButton btnDashboard;
	private JButton btnExtrato;
	private JButton btnAdicionarSaldo;
	private JButton btnConfiguracoes;
	private JButton btnAjuda;
	private JPanel panel_1;
	private JLabel lblTituloTipoTransacoes;
	private JButton btnAdicionar;
	private JButton btnRetirar;
	private JLabel lblTituloAddRegistro;
	private JButton btnCancelar;
	private JTextField txtBoasPraticas;
	private JLabel lblTituloBoasPraticas;
	private boolean ehDespesa = false;
	private JPanel panelnformacoes;
	private JLabel lblNome;
	private JLabel lblNewLabel;
	private JLabel lblNomeSistema;

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
		
		panel_1 = new JPanel();
		panel_1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(216, 216, 216));
		panel_1.setBounds(130, -2, 544, 451);
		contentPane.add(panel_1);
		
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
		txtValor.setBounds(36, 151, 283, 20);
		panel_1.add(txtValor);
		txtValor.setColumns(10);
		
		lblTituloDescricao = new JLabel("Descrição:");
		lblTituloDescricao.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloDescricao.setBounds(36, 293, 87, 14);
		panel_1.add(lblTituloDescricao);
		lblTituloDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblTituloValor = new JLabel("Valor:");
		lblTituloValor.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloValor.setBounds(36, 128, 87, 14);
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
		lblTituloTipoTransacoes.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		lblTituloTipoTransacoes.setBounds(36, 184, 208, 14);
		panel_1.add(lblTituloTipoTransacoes);
		
		
		btnAdicionar = new JButton("Adicionar"); 
		btnAdicionar.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { // Define o que acontece quando o botão é clicado
				ehDespesa = false; // Define que a operação não é uma despesa (é um ganho)
			}
		});
		btnAdicionar.setHorizontalAlignment(SwingConstants.TRAILING);
		btnAdicionar.setForeground(new Color(216, 216, 216));
		btnAdicionar.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		btnAdicionar.setBackground(new Color(0, 128, 0));
		btnAdicionar.setBounds(37, 210, 105, 23);
		panel_1.add(btnAdicionar);
		
	
		btnRetirar = new JButton("Retirar"); 
		btnRetirar.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { // Define o que acontece quando o botão é clicado
				ehDespesa = true; // Define que a operação é uma despesa
			}
		});
		btnRetirar.setHorizontalAlignment(SwingConstants.TRAILING);
		btnRetirar.setForeground(new Color(216, 216, 216));
		btnRetirar.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		btnRetirar.setBackground(new Color(166, 0, 4));
		btnRetirar.setBounds(163, 210, 105, 23);
		panel_1.add(btnRetirar);
		
		lblTituloAddRegistro = new JLabel("ADICIONAR NOVO REGISTRO");
		lblTituloAddRegistro.setForeground(new Color(31, 33, 38));
		lblTituloAddRegistro.setFont(new Font("ABeeZee", Font.BOLD, 20));
		lblTituloAddRegistro.setBounds(36, 66, 283, 23);
		panel_1.add(lblTituloAddRegistro);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBorder(null);
		btnCancelar.setForeground(new Color(216, 216, 216));
		btnCancelar.setBackground(new Color(73, 73, 73));
		btnCancelar.setBounds(36, 415, 89, 23);
		panel_1.add(btnCancelar);
		
		lblTituloBoasPraticas = new JLabel("Boas Praticas");
		lblTituloBoasPraticas.setFont(new Font("ABeeZee", Font.PLAIN, 15));
		lblTituloBoasPraticas.setForeground(new Color(31, 33, 38));
		lblTituloBoasPraticas.setBounds(392, 124, 96, 14);
		panel_1.add(lblTituloBoasPraticas);
		
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
		
		panelnformacoes = new JPanel();
		panelnformacoes.setLayout(null);
		panelnformacoes.setBorder(null);
		panelnformacoes.setBackground(new Color(216, 216, 216));
		panelnformacoes.setBounds(328, 12, 193, 35);
		panel_1.add(panelnformacoes);
		
		lblNome = new JLabel("Gustavo Dornellas");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setForeground(new Color(31, 33, 38));
		lblNome.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		lblNome.setBounds(0, 0, 149, 17);
		panelnformacoes.add(lblNome);
		
		lblNewLabel = new JLabel("Plano premium");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblNewLabel.setBounds(38, 13, 111, 14);
		panelnformacoes.add(lblNewLabel);
		
		lblNomeSistema = new JLabel("CA$H HUB");
		lblNomeSistema.setForeground(new Color(31, 33, 38));
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNomeSistema.setBounds(36, 12, 168, 28);
		panel_1.add(lblNomeSistema);
		
		btnSalvar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            // 1. Coleta os dados básicos
		            String desc = txtDescricao.getText();
		            double valor = Double.parseDouble(txtValor.getText());

		            // 2. Ajusta o sinal se for despesa
		            if (ehDespesa) {
		                valor = valor * -1;
		            }

		            // 3. Processa a Data do txtData
		            String dataTexto = txtData.getText();
		            String[] partes = dataTexto.split("/");
		            
		            // Verifica se a data tem as 3 partes (dia/mes/ano)
		            if (partes.length != 3) {
		                throw new Exception("Data incompleta");
		            }

		            int dia = Integer.parseInt(partes[0]);
		            int mes = Integer.parseInt(partes[1]);
		            int ano = Integer.parseInt(partes[2]);

		            // 4. Cria e Salva o objeto
		            Gasto novo = new Gasto(0, valor, desc, ano, mes, dia, null, false);
		            Repositorio.salvar(novo);

		            // 5. Atualiza as telas que estiverem abertas
		            if (TelaExtrato.frameAberto != null) {
		                TelaExtrato.frameAberto.carregarTabela();
		            }

		            if (TelaPrincipal.frameAberto != null) {
		                TelaPrincipal.frameAberto.atualizarDashboard();
		            }

		            // 6. Finaliza a operação
		            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
		            dispose();

		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Erro: Verifique se o Valor e a Data contêm apenas números.");
		        } catch (Exception ex) {
		            JOptionPane.showMessageDialog(null, "Erro no formato da data! Use o padrão: DD/MM/AAAA");
		        }
		    }
		});
	}
}
