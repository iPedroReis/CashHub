package cashhub.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TelaExtrato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtR;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				TelaExtrato frame = new TelaExtrato();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public TelaExtrato() {
		setTitle("Cash Hub - Extrato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 488);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JPanel panelMenu = new JPanel();
		panelMenu.setLayout(null);
		panelMenu.setPreferredSize(new Dimension(130, 400));
		panelMenu.setBackground(new Color(31, 33, 38));
		panelMenu.setBounds(0, 0, 130, 451);
		contentPane.add(panelMenu);

		JLabel lblNomeSistema = new JLabel("CA$H HUB");
		lblNomeSistema.setForeground(new Color(216, 216, 216));
		lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNomeSistema.setBounds(14, 24, 125, 28);
		panelMenu.add(lblNomeSistema);

		JButton btnDashboard = criarBotaoMenu("      Dashboard");
		btnDashboard.setBounds(5, 95, 120, 30);
		panelMenu.add(btnDashboard);

		JButton btnExtrato = criarBotaoMenu("       Extrato");
		btnExtrato.setBounds(5, 130, 120, 30);
		panelMenu.add(btnExtrato);

		JButton btnSaldo = criarBotaoMenu("       Saldo");
		btnSaldo.setBounds(5, 165, 120, 30);
		panelMenu.add(btnSaldo);

		JButton btnConfiguracoes = criarBotaoMenu("       Configurações");
		btnConfiguracoes.setBounds(5, 200, 120, 30);
		panelMenu.add(btnConfiguracoes);

		JButton btnAjuda = criarBotaoMenu("       Ajuda");
		btnAjuda.setBounds(5, 408, 120, 30);
		panelMenu.add(btnAjuda);

		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		panelPrincipal.setBackground(new Color(232, 232, 232));
		panelPrincipal.setBounds(130, 0, 761, 451);
		contentPane.add(panelPrincipal);

		JLabel lblTitulo = new JLabel("Histórico de Transações");
		lblTitulo.setForeground(new Color(31, 33, 38));
		lblTitulo.setFont(new Font("ABeeZee", Font.BOLD, 30));
		lblTitulo.setBounds(12, 52, 430, 40);
		panelPrincipal.add(lblTitulo);

		JLabel lblSubtitulo = new JLabel("Acompanhe todas as entradas e saídas registradas.");
		lblSubtitulo.setForeground(new Color(90, 90, 90));
		lblSubtitulo.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		lblSubtitulo.setBounds(12, 90, 430, 24);
		panelPrincipal.add(lblSubtitulo);

		JPanel panelInfo = new JPanel();
		panelInfo.setLayout(null);
		panelInfo.setBackground(new Color(232, 232, 232));
		panelInfo.setBorder(new LineBorder(new Color(180, 180, 180), 1, true));
		panelInfo.setBounds(515, 22, 234, 76);
		panelPrincipal.add(panelInfo);

		JLabel lblNome = new JLabel("Gustavo Dornellas");
		lblNome.setForeground(new Color(31, 33, 38));
		lblNome.setFont(new Font("ABeeZee", Font.BOLD, 16));
		lblNome.setBounds(14, 16, 195, 20);
		panelInfo.add(lblNome);

		JLabel lblPlano = new JLabel("Plano premium");
		lblPlano.setForeground(Color.GRAY);
		lblPlano.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		lblPlano.setBounds(14, 40, 130, 18);
		panelInfo.add(lblPlano);

		JPanel panelBalanco = new JPanel();
		panelBalanco.setBackground(new Color(31, 33, 38));
		panelBalanco.setLayout(null);
		panelBalanco.setBounds(548, 128, 201, 120);
		panelPrincipal.add(panelBalanco);

		JLabel lblBalancoTitulo = new JLabel("Balanço do mês");
		lblBalancoTitulo.setForeground(new Color(216, 216, 216));
		lblBalancoTitulo.setFont(new Font("ABeeZee", Font.PLAIN, 16));
		lblBalancoTitulo.setBounds(11, 9, 170, 16);
		panelBalanco.add(lblBalancoTitulo);

		txtR = new JTextField("R$ 8.372,10");
		txtR.setEditable(false);
		txtR.setBorder(null);
		txtR.setForeground(new Color(216, 216, 216));
		txtR.setFont(new Font("ABeeZee", Font.BOLD, 33));
		txtR.setBackground(new Color(31, 33, 38));
		txtR.setBounds(11, 28, 180, 34);
		panelBalanco.add(txtR);

		JLabel lblTituloGanhos = new JLabel("Ganhos:");
		lblTituloGanhos.setForeground(new Color(216, 216, 216));
		lblTituloGanhos.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblTituloGanhos.setBounds(11, 73, 50, 14);
		panelBalanco.add(lblTituloGanhos);

		JLabel lblValorGanhoMes = new JLabel("R$ 8.000,00");
		lblValorGanhoMes.setForeground(new Color(34, 166, 62));
		lblValorGanhoMes.setFont(new Font("ABeeZee", Font.BOLD, 13));
		lblValorGanhoMes.setBounds(66, 72, 120, 17);
		panelBalanco.add(lblValorGanhoMes);

		JLabel lblTituloDespesas = new JLabel("Despesas:");
		lblTituloDespesas.setForeground(new Color(216, 216, 216));
		lblTituloDespesas.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblTituloDespesas.setBounds(11, 93, 69, 14);
		panelBalanco.add(lblTituloDespesas);

		JLabel lblDespesasMes = new JLabel("R$ 0,00");
		lblDespesasMes.setForeground(new Color(220, 45, 45));
		lblDespesasMes.setFont(new Font("ABeeZee", Font.BOLD, 13));
		lblDespesasMes.setBounds(81, 92, 91, 17);
		panelBalanco.add(lblDespesasMes);

		JPanel panelPagamentos = new JPanel();
		panelPagamentos.setBackground(new Color(31, 33, 38));
		panelPagamentos.setLayout(null);
		panelPagamentos.setBounds(548, 261, 201, 177);
		panelPrincipal.add(panelPagamentos);

		JLabel lblPagamentos = new JLabel("Pagamentos Mensais");
		lblPagamentos.setForeground(new Color(216, 216, 216));
		lblPagamentos.setFont(new Font("ABeeZee", Font.PLAIN, 22));
		lblPagamentos.setBounds(12, 10, 177, 26);
		panelPagamentos.add(lblPagamentos);

		JLabel lblPagamentosDesc = new JLabel("Gerencie seus pagamentos");
		lblPagamentosDesc.setForeground(new Color(216, 216, 216));
		lblPagamentosDesc.setFont(new Font("ABeeZee", Font.PLAIN, 12));
		lblPagamentosDesc.setBounds(12, 43, 170, 17);
		panelPagamentos.add(lblPagamentosDesc);

		JButton btnGerenciarPagamentos = new JButton("Gerenciar Pagamentos");
		btnGerenciarPagamentos.setBorder(null);
		btnGerenciarPagamentos.setBackground(new Color(216, 216, 216));
		btnGerenciarPagamentos.setForeground(new Color(31, 33, 38));
		btnGerenciarPagamentos.setFont(new Font("ABeeZee", Font.BOLD, 13));
		btnGerenciarPagamentos.setBounds(12, 143, 177, 24);
		panelPagamentos.add(btnGerenciarPagamentos);

		String[] colunas = { "Data", "Categoria", "Descrição", "Tipo", "Valor" };
		DefaultTableModel modelo = new DefaultTableModel(colunas, 0) {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		modelo.addRow(new Object[] { "24/05/2026", "Alimentação", "Compra no mercado", "Saída", "-R$ 150,00" });
		modelo.addRow(new Object[] { "23/05/2026", "Salário", "Salário mensal", "Entrada", "R$ 7.500,00" });
		modelo.addRow(new Object[] { "22/05/2025", "Transporte", "Uber para o trabalho", "Saída", "-R$ 25,90" });
		modelo.addRow(new Object[] { "21/05/2025", "Moradia", "Conta de luz", "Saída", "-R$ 210,40" });
		modelo.addRow(new Object[] { "20/05/2025", "Investimentos", "Aplicação Tesouro Direto", "Entrada", "R$ 300,00" });
		modelo.addRow(new Object[] { "19/05/2025", "Alimentação", "Jantar fora", "Saída", "-R$ 89,90" });
		modelo.addRow(new Object[] { "18/05/2025", "Compras", "Roupa", "Saída", "-R$ 120,00" });
		modelo.addRow(new Object[] { "17/05/2025", "Outros", "Venda de item usado", "Entrada", "R$ 200,00" });

		table = new JTable(modelo);
		table.setRowHeight(38);
		table.setFont(new Font("ABeeZee", Font.PLAIN, 14));
		table.setForeground(new Color(35, 35, 35));
		table.setBackground(new Color(250, 250, 250));
		table.setGridColor(new Color(225, 225, 225));
		table.setShowVerticalLines(false);
		table.setSelectionBackground(new Color(230, 236, 245));
		table.setSelectionForeground(new Color(25, 25, 25));
		table.setAutoCreateRowSorter(true);

		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.getTableHeader().setBackground(new Color(31, 33, 38));
		table.getTableHeader().setForeground(new Color(240, 240, 240));
		table.getTableHeader().setFont(new Font("ABeeZee", Font.BOLD, 13));

		table.getColumnModel().getColumn(0).setPreferredWidth(140);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(110);

		table.getColumnModel().getColumn(3).setCellRenderer(new TipoRenderer());
		table.getColumnModel().getColumn(4).setCellRenderer(new ValorRenderer());

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 128, 527, 310);
		scrollPane.setBorder(new LineBorder(new Color(31, 33, 38), 1, true));
		scrollPane.getViewport().setBackground(new Color(250, 250, 250));
		scrollPane.getVerticalScrollBar().setUnitIncrement(14);
		panelPrincipal.add(scrollPane);
	}

	private JButton criarBotaoMenu(String texto) {
		JButton botao = new JButton(texto);
		botao.setHorizontalAlignment(SwingConstants.LEFT);
		botao.setForeground(new Color(216, 216, 216));
		botao.setFont(new Font("ABeeZee", Font.PLAIN, 13));
		botao.setBorder(new LineBorder(new Color(216, 216, 216), 1, true));
		botao.setBackground(new Color(31, 33, 38));
		return botao;
	}

	private static class TipoRenderer extends DefaultTableCellRenderer {
		private static final long serialVersionUID = 1L;

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			setHorizontalAlignment(CENTER);

			String tipo = value == null ? "" : value.toString();
			if (!isSelected) {
				setBackground(new Color(250, 250, 250));
				if ("Entrada".equalsIgnoreCase(tipo)) {
					setForeground(new Color(34, 139, 34));
				} else {
					setForeground(new Color(200, 30, 30));
				}
			}
			return this;
		}
	}

	private static class ValorRenderer extends DefaultTableCellRenderer {
		private static final long serialVersionUID = 1L;

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			setHorizontalAlignment(RIGHT);

			Object tipoObj = table.getValueAt(row, 3);
			String tipo = tipoObj == null ? "" : tipoObj.toString();
			if (!isSelected) {
				setBackground(new Color(250, 250, 250));
				if ("Entrada".equalsIgnoreCase(tipo)) {
					setForeground(new Color(34, 139, 34));
				} else {
					setForeground(new Color(200, 30, 30));
				}
			}
			return this;
		}
	}
}
