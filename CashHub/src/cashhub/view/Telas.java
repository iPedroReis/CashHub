package cashhub.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Box;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

import cashhub.model.Gasto;
import cashhub.model.Repositorio;

import javax.swing.table.DefaultTableModel;

import javax.swing.ImageIcon;
import java.awt.Image;

import javax.swing.JDialog;

public class Telas extends JFrame {

    private static final long serialVersionUID = 1L;
    
    private JPanel contentPane;
	private JTextField txtR;
	private JLabel lblValorGanhoMes;
	private JLabel lblDespesasMes;
	private JLabel lblTransacoes1;
	private JLabel lblValorTransacao1;
	private JLabel lblTransacoes2;
	private JLabel lblValorTransacao2;
	private JTextField txtValor;
	private JTextField txtData;
	private JButton btnSalvar;
	private JLabel lblTituloDescricao;
	private JLabel lblTituloValor;
	private JLabel lblTituloData;
	private JTextArea txtDescricao;
	private JPanel panelBotoes;
	private JPanel panelBoasPraticas;
	private JPanel panelCorpo;
	private JPanel panelRegistro;
	private JLabel lblTituloAdicionarRegistro;
	private JPanel panelTipo;
	private JPanel panelFormulario;
	private JLabel lblTItuloTipoTrasacao;
	private JPanel panelLateral;
	private JPanel panelDashboard;
	private JPanel panelCabecalho;
	private JPanel panelPerfil;
	private JPanel panelSaldo;
	private JPanel panelGanhos;
	private JPanel panelDespesasMes;
	private JPanel panelMovimentacao;
	private JButton btnDashboard;
	private JButton btnExtrato;
	private JButton btnSaldo;
	private JButton btnAdicionar;
	private JButton btnRetirar;
	private JButton btnCancelar;
	private JLabel lblTituloBoasPraticas;
	private boolean ehDespesa = false;
	private JLabel lblNomeSistema;
	private JLabel lblUsuario;
	private JButton btnPerfil;
	private JLabel lblTituloDespesasMes;
	private JLabel lblTituloGanhosMes;
	private JPanel panelTopoTransacoes;
	private JPanel panelTransacoes;
	private JPanel panelListaTransacoes;
	private JPanel panelTransacao1;
	private JPanel panelTransacao2;
	private JPanel panelExtrato;
	private JLabel lblTituloTransacoes;
	private JLabel lblLogo;
	private JButton btnVisualizarExtratoCompleto;
	private JButton btnAlterarSaldo;
	
	private JTextField txtRExtrato;
	private JTable table;
	private JLabel lblValorGanhoMesExtrato;
	private JLabel lblDespesasMesExtrato;
	private JPanel panelPrincipalExtrato;
	private JPanel panelBalanco;
	private JPanel panelPagamentos;
	private JScrollPane scrollPaneExtrato;
	private JButton btnGerenciarPagamentos;
	private JLabel lblTituloExtrato;
	private JLabel lblSubtituloExtrato;
	private JLabel lblBalancoTitulo;
	private JLabel lblTituloGanhosExtrato;
	private JLabel lblTituloDespesasExtrato;
	private JLabel lblPagamentos;
	private JLabel lblPagamentosDesc;
	
	private JTextField txtPlanoPremium;
	private JDialog dialogConfiguracao;
	private JPanel contentPaneConfiguracao;
	private JComboBox boxMoedaBase;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JButton btnAlterarPlano;
    private CardLayout cardLayout;
    private JPanel panelTelas;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Telas frame = new Telas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Telas() {
        setTitle("Ca$h Hub");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(897, 615);
        setMinimumSize(new Dimension(700, 500));
        setLocationRelativeTo(null);
        

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        menuLateral();
        telas();
    }

    private void menuLateral() {
    	
        panelLateral = new JPanel();
        panelLateral.setBackground(new Color(31, 33, 38));
        panelLateral.setPreferredSize(new Dimension(150, 0));
        panelLateral.setLayout(new BoxLayout(panelLateral, BoxLayout.Y_AXIS));
        
        ImageIcon iconLogo = new ImageIcon(
        	    getClass().getResource("/cashhub/view/imagens/CashHub (3).png")
        	);

        	Image imgLogo = iconLogo.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);

        	JLabel lblLogoMenu = new JLabel(new ImageIcon(imgLogo));
        	lblLogoMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        	
        	
        
        btnDashboard = new JButton("Dashboard"); // Botão do Dashboard
        btnDashboard.setFocusPainted(false); // Desativa a faixa azul quando inicia o sistema
        btnDashboard.setBorder(new LineBorder(new Color(216, 216, 216)));
        btnDashboard.setBackground(new Color(31, 33, 38));
        btnDashboard.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        btnDashboard.setForeground(new Color(216, 216, 216));
        btnDashboard.setPreferredSize(new Dimension(130, 32));
        btnDashboard.setMaximumSize(new Dimension(130, 32));
        btnDashboard.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnDashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnDashboard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelTelas, "dashboard");
            }
        });
        
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent e) {

                int larguraJanela = getWidth();

                int larguraMenu = larguraJanela / 7;

                if (larguraMenu < 150) {
                    larguraMenu = 150;
                }

                if (larguraMenu > 270) {
                    larguraMenu = 270;
                }

                panelLateral.setPreferredSize(new Dimension(larguraMenu, 0));

                int larguraBotao = larguraMenu - 30;
                int alturaBotao = larguraMenu / 5;

                if (alturaBotao < 32) {
                    alturaBotao = 32;
                }

                if (alturaBotao > 45) {
                    alturaBotao = 45;
                }

                Dimension tamanhoBotao = new Dimension(larguraBotao, alturaBotao);

                btnDashboard.setPreferredSize(tamanhoBotao);
                btnDashboard.setMaximumSize(tamanhoBotao);

                btnExtrato.setPreferredSize(tamanhoBotao);
                btnExtrato.setMaximumSize(tamanhoBotao);

                btnSaldo.setPreferredSize(tamanhoBotao);
                btnSaldo.setMaximumSize(tamanhoBotao);

                contentPane.revalidate();
                contentPane.repaint();
                
                int fonteBotao = larguraMenu / 12;

                if (fonteBotao < 14) {
                    fonteBotao = 14;
                }

                if (fonteBotao > 22) {
                    fonteBotao = 22;
                }

                Font fonteMenu = new Font("Tahoma", Font.PLAIN, fonteBotao);

                btnDashboard.setFont(fonteMenu);
                btnExtrato.setFont(fonteMenu);
                btnSaldo.setFont(fonteMenu);
            }
        });
        
        addComponentListener(new java.awt.event.ComponentAdapter() { // Altera o tamanho da fonte dos ganhos e das despesas
            public void componentResized(java.awt.event.ComponentEvent e) {

                int largura = getWidth(); //Pega o tamanho da janela

                int fonte = largura / 25; // Transforma a largura da janela em tamanho de fonte.

                if (fonte < 30) { // tamanho minimo da fonte
                    fonte = 30;
                }

                if (fonte > 60) { //tamanho maximo da fonte
                    fonte = 60;
                }

                lblTituloGanhosMes.setFont(new Font("ABeeZee", Font.PLAIN, fonte));
                lblTituloDespesasMes.setFont(new Font("ABeeZee", Font.PLAIN, fonte));

                lblValorGanhoMes.setFont(new Font("ABeeZee", Font.BOLD, fonte));
                lblDespesasMes.setFont(new Font("ABeeZee", Font.BOLD, fonte));
            }
        });

        // BOTÃO EXTRATO
        btnExtrato = new JButton("Extrato");
        btnExtrato.setBorder(new LineBorder(new Color(216, 216, 216)));
        btnExtrato.setBackground(new Color(31, 33, 38));
        btnExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        btnExtrato.setForeground(new Color(216, 216, 216));
        btnExtrato.setPreferredSize(new Dimension(130, 32));
        btnExtrato.setMaximumSize(new Dimension(130, 32));
        btnExtrato.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnExtrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnExtrato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelTelas, "extrato");
            }
        });

        // BOTÃO SALDO
        btnSaldo = new JButton("Saldo");
        btnSaldo.setBorder(new LineBorder(new Color(216, 216, 216)));
        btnSaldo.setBackground(new Color(31, 33, 38));
        btnSaldo.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        btnSaldo.setForeground(new Color(216, 216, 216));
        btnSaldo.setPreferredSize(new Dimension(130, 32));
        btnSaldo.setMaximumSize(new Dimension(130, 32));
        btnSaldo.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSaldo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSaldo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelTelas, "cadastro");
            }
        });


        // CENTRALIZAÇÃO VERTICAL
        panelLateral.add(Box.createVerticalStrut(30));
        panelLateral.add(lblLogoMenu);
        panelLateral.add(Box.createVerticalStrut(50));

        panelLateral.add(btnDashboard);
        panelLateral.add(Box.createVerticalStrut(10));

        panelLateral.add(btnExtrato);
        panelLateral.add(Box.createVerticalStrut(10));

        panelLateral.add(btnSaldo);

        panelLateral.add(Box.createVerticalGlue());

        contentPane.add(panelLateral, BorderLayout.WEST);
    }

    private void telas() {
        cardLayout = new CardLayout();
        panelTelas = new JPanel(cardLayout);

        panelTelas.add(telaDashboard(), "dashboard");
        panelTelas.add(telaSaldo(), "cadastro");
        panelTelas.add(telaExtrato(), "extrato");

        contentPane.add(panelTelas, BorderLayout.CENTER);

        cardLayout.show(panelTelas, "dashboard");
    }

    private JPanel telaDashboard() {
        panelDashboard = new JPanel(new BorderLayout());
        panelDashboard.setBackground(new Color(216, 216, 216));

        panelCabecalho = new JPanel(new BorderLayout());
        panelCabecalho.setBackground(new Color(216, 216, 216));
        panelCabecalho.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));

        lblNomeSistema = new JLabel("CA$H HUB");
        lblNomeSistema.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNomeSistema.setForeground(new Color(31, 33, 38));
        panelCabecalho.add(lblNomeSistema, BorderLayout.WEST);

        panelPerfil = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        panelPerfil.setBackground(new Color(216, 216, 216));

        lblUsuario = new JLabel("Gustavo Dornellas");
        lblUsuario.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        lblUsuario.setForeground(new Color(31, 33, 38));
        panelPerfil.add(lblUsuario);

        btnPerfil = new JButton("");
        btnPerfil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                configuracaoPopup();
            }
        });

        btnPerfil.setBackground(new Color(31, 33, 38));
        btnPerfil.setPreferredSize(new Dimension(30, 30));
        btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panelPerfil.add(btnPerfil);

        panelCabecalho.add(panelPerfil, BorderLayout.EAST);
        panelDashboard.add(panelCabecalho, BorderLayout.NORTH);

        panelCorpo = new JPanel(new BorderLayout(0, 15));
        panelCorpo.setBackground(new Color(216, 216, 216));
        panelCorpo.setBorder(BorderFactory.createEmptyBorder(10, 25, 25, 25));

        panelSaldo = new JPanel(new BorderLayout());
        panelSaldo.setBackground(new Color(31, 33, 38));
        panelSaldo.setPreferredSize(new Dimension(0, 80));
        panelSaldo.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        txtR = new JTextField();
        txtR.setText("R$ 0,00");
        txtR.setEditable(false);
        txtR.setBorder(null);
        txtR.setFont(new Font("ABeeZee", Font.PLAIN, 24));
        txtR.setForeground(new Color(216, 216, 216));
        txtR.setBackground(new Color(31, 33, 38));
        panelSaldo.add(txtR, BorderLayout.NORTH);
        

        btnAlterarSaldo = new JButton("Alterar Saldo");
        btnAlterarSaldo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) { // Define o que acontece quando o botão é clicado
                    cardLayout.show(panelTelas, "cadastro"); // Torna o panel visivel
        	}
        });
        btnAlterarSaldo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAlterarSaldo.setForeground(new Color(216, 216, 216));
        btnAlterarSaldo.setBackground(new Color(73, 73, 73));
        btnAlterarSaldo.setBorder(null);
        btnAlterarSaldo.setPreferredSize(new Dimension(120, 30));
        
        panelSaldo.add(btnAlterarSaldo, BorderLayout.EAST);

        panelCorpo.add(panelSaldo, BorderLayout.NORTH);

        
        
        panelMovimentacao = new JPanel(new GridLayout(1, 2, 25, 0));
        panelMovimentacao.setBackground(new Color(216, 216, 216));
        panelMovimentacao.setPreferredSize(new Dimension(0, 130));

        panelGanhos = new JPanel(new BorderLayout());
        panelGanhos.setBackground(new Color(31, 33, 38));
        panelGanhos.setPreferredSize(new Dimension(210, 150));
        panelGanhos.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        lblTituloGanhosMes = new JLabel("Ganhos do mês:");
        lblTituloGanhosMes.setForeground(new Color(216, 216, 216));
        lblTituloGanhosMes.setFont(new Font("ABeeZee", Font.PLAIN, 30));
        panelGanhos.add(lblTituloGanhosMes, BorderLayout.NORTH);

        lblValorGanhoMes = new JLabel("R$ 0,00");
        lblValorGanhoMes.setVerticalAlignment(SwingConstants.BOTTOM);
        lblValorGanhoMes.setForeground(new Color(0, 128, 0));
        lblValorGanhoMes.setFont(new Font("ABeeZee", Font.BOLD, 30));
        panelGanhos.add(lblValorGanhoMes, BorderLayout.CENTER);

        panelDespesasMes = new JPanel(new BorderLayout());
        panelDespesasMes.setBackground(new Color(31, 33, 38));
        panelDespesasMes.setPreferredSize(new Dimension(210, 150));
        panelDespesasMes.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        lblTituloDespesasMes = new JLabel("Despesas do mês:");
        lblTituloDespesasMes.setForeground(new Color(216, 216, 216));
        lblTituloDespesasMes.setFont(new Font("ABeeZee", Font.PLAIN, 30));
        panelDespesasMes.add(lblTituloDespesasMes, BorderLayout.NORTH);

        lblDespesasMes = new JLabel("R$ 0,00");
        lblDespesasMes.setVerticalAlignment(SwingConstants.BOTTOM);
        lblDespesasMes.setForeground(new Color(149, 0, 0));
        lblDespesasMes.setFont(new Font("Tahoma", Font.BOLD, 30));
        panelDespesasMes.add(lblDespesasMes, BorderLayout.CENTER);

        panelMovimentacao.add(panelGanhos);
        panelMovimentacao.add(panelDespesasMes);

        panelCorpo.add(panelMovimentacao, BorderLayout.CENTER);

        panelTransacoes = new JPanel(new BorderLayout(0, 10));
        panelTransacoes.setBackground(new Color(31, 33, 38));
        panelTransacoes.setPreferredSize(new Dimension(0, 120));
        panelTransacoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelTopoTransacoes = new JPanel(new BorderLayout());
        panelTopoTransacoes.setBackground(new Color(31, 33, 38));

        lblTituloTransacoes = new JLabel("Últimas Transações");
        lblTituloTransacoes.setFont(new Font("ABeeZee", Font.PLAIN, 15));
        lblTituloTransacoes.setForeground(new Color(216, 216, 216));
        panelTopoTransacoes.add(lblTituloTransacoes, BorderLayout.WEST);

        btnVisualizarExtratoCompleto = new JButton("Visualizar extrato completo");
        btnVisualizarExtratoCompleto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnVisualizarExtratoCompleto.setForeground(new Color(216, 216, 216));
        btnVisualizarExtratoCompleto.setFont(new Font("Dialog", Font.PLAIN, 11));
        btnVisualizarExtratoCompleto.setBorder(null);
        btnVisualizarExtratoCompleto.setBackground(new Color(31, 33, 38));
        btnVisualizarExtratoCompleto.addActionListener(e -> cardLayout.show(panelTelas, "extrato"));
        panelTopoTransacoes.add(btnVisualizarExtratoCompleto, BorderLayout.EAST);

        panelTransacoes.add(panelTopoTransacoes, BorderLayout.NORTH);

        panelListaTransacoes = new JPanel(new GridLayout(2, 1, 0, 8));
        panelListaTransacoes.setBackground(new Color(31, 33, 38));

        panelTransacao1 = new JPanel(new BorderLayout());
        panelTransacao1.setBackground(new Color(216, 216, 216));
        panelTransacao1.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        lblTransacoes1 = new JLabel("Nenhum ganho registrado");
        lblTransacoes1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        panelTransacao1.add(lblTransacoes1, BorderLayout.WEST);

        lblValorTransacao1 = new JLabel("R$ 0,00");
        lblValorTransacao1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblValorTransacao1.setForeground(new Color(0, 128, 0));
        lblValorTransacao1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        panelTransacao1.add(lblValorTransacao1, BorderLayout.EAST);

        panelTransacao2 = new JPanel(new BorderLayout());
        panelTransacao2.setBackground(new Color(216, 216, 216));
        panelTransacao2.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        lblTransacoes2 = new JLabel("Nenhuma despesa registrada");
        lblTransacoes2.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        panelTransacao2.add(lblTransacoes2, BorderLayout.WEST);

        lblValorTransacao2 = new JLabel("R$ 0,00");
        lblValorTransacao2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblValorTransacao2.setForeground(new Color(149, 0, 0));
        lblValorTransacao2.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        panelTransacao2.add(lblValorTransacao2, BorderLayout.EAST);

        panelListaTransacoes.add(panelTransacao1);
        panelListaTransacoes.add(panelTransacao2);
		
        LocalDate hoje = LocalDate.now(); // Obtém a data atual do sistema
        
        Gasto g1 = new Gasto(2, -50.0, "Conta de Luz", hoje.getYear(), hoje.getMonthValue(), hoje.getDayOfMonth(), null, false); // Cria um objeto "Gasto" representando uma despesa (valor negativo)
       
        Repositorio.salvar(g1); // Salva o objeto "g1" no repositório
        
        atualizarDashboard(); // Atualiza os dados exibidos na tela
	    verificarAlertasDeVencimento(); // Verifica alertas de vencimento de gastos
        
        panelTransacoes.add(panelListaTransacoes, BorderLayout.CENTER);

        panelCorpo.add(panelTransacoes, BorderLayout.SOUTH);

        panelDashboard.add(panelCorpo, BorderLayout.CENTER);
        
        return panelDashboard;
    }

    private JPanel telaExtrato() {
        panelExtrato = new JPanel(new BorderLayout());
        panelExtrato.setBackground(new Color(216, 216, 216));

        panelCabecalho = new JPanel(new BorderLayout());
        panelCabecalho.setBackground(new Color(216, 216, 216));
        panelCabecalho.setBorder(BorderFactory.createEmptyBorder(15, 25, 10, 25));

        lblLogo = new JLabel("CA$H HUB");
        lblLogo.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblLogo.setForeground(new Color(31, 33, 38));

        panelPerfil = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        panelPerfil.setBackground(new Color(216, 216, 216));

        lblUsuario = new JLabel("Gustavo Dornellas");
        lblUsuario.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        lblUsuario.setForeground(new Color(31, 33, 38));

        btnPerfil = new JButton("");
        btnPerfil.setBackground(new Color(31, 33, 38));
        btnPerfil.setPreferredSize(new Dimension(30, 30));
        btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        panelPerfil.add(lblUsuario);
        panelPerfil.add(btnPerfil);

        panelCabecalho.add(lblLogo, BorderLayout.WEST);
        panelCabecalho.add(panelPerfil, BorderLayout.EAST);

        panelExtrato.add(panelCabecalho, BorderLayout.NORTH);

        panelPrincipalExtrato = new JPanel(new BorderLayout(15, 0));
        panelPrincipalExtrato.setBackground(new Color(216, 216, 216));
        panelPrincipalExtrato.setBorder(BorderFactory.createEmptyBorder(5, 25, 25, 25));

        JPanel panelCentroExtrato = new JPanel(new BorderLayout(0, 15));
        panelCentroExtrato.setBackground(new Color(216, 216, 216));

        JPanel panelTituloExtrato = new JPanel(new BorderLayout());
        panelTituloExtrato.setBackground(new Color(216, 216, 216));

        lblTituloExtrato = new JLabel("Histórico de Transações");
        lblTituloExtrato.setForeground(new Color(31, 33, 38));
        lblTituloExtrato.setFont(new Font("ABeeZee", Font.BOLD, 30));

        lblSubtituloExtrato = new JLabel("Acompanhe todas as entradas e saídas registradas.");
        lblSubtituloExtrato.setForeground(new Color(90, 90, 90));
        lblSubtituloExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 14));

        panelTituloExtrato.add(lblTituloExtrato, BorderLayout.NORTH);
        panelTituloExtrato.add(lblSubtituloExtrato, BorderLayout.SOUTH);

        panelCentroExtrato.add(panelTituloExtrato, BorderLayout.NORTH);

        String[] colunas = { "Data", "Categoria", "Descrição", "Tipo", "Valor" }; // Cria um array de Strings com os nomes das colunas da tabela
		DefaultTableModel modelo = new DefaultTableModel(colunas, 0) { // Cria um modelo de tabela com as colunas definidas e zero linhas iniciais
			private static final long serialVersionUID = 1L; // Define um identificador de versão para a classe

			@Override
			public boolean isCellEditable(int row, int column) { // Sobrescreve o método que controla a edição das células
				return false; // Impede que qualquer célula da tabela seja editada
			}
		};

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

        scrollPaneExtrato = new JScrollPane(table);
        scrollPaneExtrato.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        scrollPaneExtrato.setBorder(new LineBorder(new Color(31, 33, 38), 1, true));
        scrollPaneExtrato.getViewport().setBackground(new Color(250, 250, 250));
        scrollPaneExtrato.getVerticalScrollBar().setUnitIncrement(14);

        panelCentroExtrato.add(scrollPaneExtrato, BorderLayout.CENTER);

        JPanel panelLadoDireito = new JPanel(new GridLayout(2, 1, 0, 15));
        panelLadoDireito.setBackground(new Color(216, 216, 216));
        panelLadoDireito.setPreferredSize(new Dimension(230, 0));

        panelBalanco = new JPanel(new GridLayout(5, 1, 0, 5));
        panelBalanco.setBackground(new Color(31, 33, 38));
        panelBalanco.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        lblBalancoTitulo = new JLabel("Balanço do mês");
        lblBalancoTitulo.setForeground(new Color(216, 216, 216));
        lblBalancoTitulo.setFont(new Font("ABeeZee", Font.PLAIN, 16));

        txtRExtrato = new JTextField("R$ 0,00");
        txtRExtrato.setEditable(false);
        txtRExtrato.setBorder(null);
        txtRExtrato.setForeground(new Color(216, 216, 216));
        txtRExtrato.setFont(new Font("ABeeZee", Font.BOLD, 28));
        txtRExtrato.setBackground(new Color(31, 33, 38));

        lblTituloGanhosExtrato = new JLabel("Ganhos:");
        lblTituloGanhosExtrato.setForeground(new Color(216, 216, 216));
        lblTituloGanhosExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 12));

        lblValorGanhoMesExtrato = new JLabel("R$ 0,00");
        lblValorGanhoMesExtrato.setForeground(new Color(34, 166, 62));
        lblValorGanhoMesExtrato.setFont(new Font("ABeeZee", Font.BOLD, 17));

        lblTituloDespesasExtrato = new JLabel("Despesas:");
        lblTituloDespesasExtrato.setForeground(new Color(216, 216, 216));
        lblTituloDespesasExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 12));

        lblDespesasMesExtrato = new JLabel("R$ 0,00");
        lblDespesasMesExtrato.setForeground(new Color(220, 45, 45));
        lblDespesasMesExtrato.setFont(new Font("ABeeZee", Font.BOLD, 17));

        panelBalanco.add(lblBalancoTitulo);
        panelBalanco.add(txtRExtrato);
        panelBalanco.add(lblTituloGanhosExtrato);
        panelBalanco.add(lblValorGanhoMesExtrato);
        panelBalanco.add(lblDespesasMesExtrato);

        panelPagamentos = new JPanel(new BorderLayout());
        panelPagamentos.setBackground(new Color(31, 33, 38));
        panelPagamentos.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        JPanel panelTextoPagamentos = new JPanel(new GridLayout(2, 1));
        panelTextoPagamentos.setBackground(new Color(31, 33, 38));

        lblPagamentos = new JLabel("Pagamentos Mensais");
        lblPagamentos.setForeground(new Color(216, 216, 216));
        lblPagamentos.setFont(new Font("ABeeZee", Font.PLAIN, 17));

        lblPagamentosDesc = new JLabel("Gerencie seus pagamentos");
        lblPagamentosDesc.setForeground(new Color(216, 216, 216));
        lblPagamentosDesc.setFont(new Font("ABeeZee", Font.PLAIN, 12));

        panelTextoPagamentos.add(lblPagamentos);
        panelTextoPagamentos.add(lblPagamentosDesc);

        btnGerenciarPagamentos = new JButton("Gerenciar Pagamentos");
        btnGerenciarPagamentos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnGerenciarPagamentos.setBorder(null);
        btnGerenciarPagamentos.setBackground(new Color(216, 216, 216));
        btnGerenciarPagamentos.setForeground(new Color(31, 33, 38));
        btnGerenciarPagamentos.setFont(new Font("ABeeZee", Font.BOLD, 13));

        panelPagamentos.add(panelTextoPagamentos, BorderLayout.NORTH);
        panelPagamentos.add(btnGerenciarPagamentos, BorderLayout.SOUTH);

        panelLadoDireito.add(panelBalanco);
        panelLadoDireito.add(panelPagamentos);

        panelPrincipalExtrato.add(panelCentroExtrato, BorderLayout.CENTER);
        panelPrincipalExtrato.add(panelLadoDireito, BorderLayout.EAST);

        panelExtrato.add(panelPrincipalExtrato, BorderLayout.CENTER);

        carregarTabela();

        return panelExtrato;
    }
    
    private JPanel telaSaldo() {

    	panelSaldo = new JPanel(new BorderLayout());
        panelSaldo.setBackground(new Color(216, 216, 216));

        panelCabecalho = new JPanel(new BorderLayout());
        panelCabecalho.setBackground(new Color(216, 216, 216));
        panelCabecalho.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));

        lblLogo = new JLabel("CA$H HUB");
        lblLogo.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblLogo.setForeground(new Color(31, 33, 38));

        lblUsuario = new JLabel("Gustavo Dornellas");
        lblUsuario.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        lblUsuario.setForeground(new Color(31, 33, 38));

        btnPerfil = new JButton("");
        btnPerfil.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnPerfil.setBackground(new Color(31, 33, 38));
        btnPerfil.setPreferredSize(new Dimension(30, 30));
        btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnPerfil.setFocusPainted(false);
        btnPerfil.setBorder(null);

        panelPerfil = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        panelPerfil.setBackground(new Color(216, 216, 216));
        panelPerfil.add(lblUsuario);
        panelPerfil.add(btnPerfil);

        panelCabecalho.add(lblLogo, BorderLayout.WEST);
        panelCabecalho.add(panelPerfil, BorderLayout.EAST);

        panelSaldo.add(panelCabecalho, BorderLayout.NORTH);

        panelCorpo = new JPanel(new BorderLayout(30, 0));
        panelCorpo.setBackground(new Color(216, 216, 216));
        panelCorpo.setBorder(BorderFactory.createEmptyBorder(10, 35, 35, 35));

        panelRegistro = new JPanel(new BorderLayout(0, 20));
        panelRegistro.setBackground(new Color(216, 216, 216));

        lblTituloAdicionarRegistro = new JLabel("ADICIONAR NOVO REGISTRO");
        lblTituloAdicionarRegistro.setFont(new Font("ABeeZee", Font.BOLD, 20));
        lblTituloAdicionarRegistro.setForeground(new Color(31, 33, 38));

        panelRegistro.add(lblTituloAdicionarRegistro, BorderLayout.NORTH);

        panelFormulario = new JPanel(new GridLayout(8, 1, 0, 8));
        panelFormulario.setBackground(new Color(216, 216, 216));

        lblTItuloTipoTrasacao = new JLabel("Tipo de Transação");

        panelTipo = new JPanel(new GridLayout(1, 2, 20, 0));
        panelTipo.setBackground(new Color(216, 216, 216));

        btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 ehDespesa = false; // Define que a operação não é uma despesa (é um ganho)
        		 txtValor.setForeground(new Color(140, 170, 140)); // muda a cor para mostrar que é retirar saldo
        	}
        });
        btnAdicionar.setBackground(new Color(0, 128, 0));
        btnAdicionar.setForeground(Color.WHITE);

        btnRetirar = new JButton("Retirar");
        btnRetirar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {// Define o que acontece quando o botão é clicado
    				ehDespesa = true; // Define que a operação é uma despesa
    				txtValor.setForeground(new Color(170, 140, 140)); // muda a cor para mostrar que é retirar saldo
        	}
        });
        btnRetirar.setBackground(new Color(149, 0, 0));
        btnRetirar.setForeground(Color.WHITE);

        panelTipo.add(btnAdicionar);
        panelTipo.add(btnRetirar);

        lblTituloValor = new JLabel("Valor:");
        txtValor = new JTextField();
        txtValor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			
			
				 // Quando o usuário clica no campo some o texto ja escrito
		        if (txtValor.getText().equals("EX: R$ 2000")) {
		            txtValor.setText("");
		            txtValor.setForeground(Color.BLACK); // Muda a cor para cinza escuro quando o usuário digitar para melhor visualização
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        // Quando o usuário clica em outro lugar voltará o "EX: R$ 2000"
		        if (txtValor.getText().isEmpty()) {
		            txtValor.setForeground(Color.LIGHT_GRAY);
		            txtValor.setText("EX: R$ 2000");
		        }
			}
		});
        txtValor.setFont(new Font("ABeeZee", Font.PLAIN, 15));
		txtValor.setText("EX: R$ 2000");
		txtValor.setForeground(new Color(216, 216, 216));
		txtValor.setBorder(null);
		txtValor.setBounds(36, 211, 283, 20);
		txtValor.setColumns(10);
        
        lblTituloData = new JLabel("Data:");
		txtData = new JTextField();
		txtData.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				 // Quando o usuário clica no campo some o texto ja escrito
		        if (txtData.getText().equals("EX: 22/04/2026")) {
		            txtData.setText("");
		            txtData.setForeground(new Color(31, 33, 38)); // Muda a cor para cinza escuro quando o usuário digitar para melhor visualização
		        }
		    }
			
		    @Override
		    public void focusLost(FocusEvent e) {
		        // Quando o usuário clica em outro lugar voltará o "EX: 22/04/2026"
		        if (txtData.getText().isEmpty()) {
		            txtData.setForeground(Color.LIGHT_GRAY);
		            txtData.setText("EX: 22/04/2026");
		        }
			}
		});
		txtData.setFont(new Font("ABeeZee", Font.PLAIN, 15));
		txtData.setText("EX: 22/04/2026");
		txtData.setForeground(new Color(216, 216, 216));
		txtData.setBorder(null);
		txtData.setBounds(36, 262, 128, 20);
		txtData.setColumns(10);

        lblTituloDescricao = new JLabel("Descrição:");
        txtDescricao = new JTextArea();

        JScrollPane scrollDescricao = new JScrollPane(txtDescricao);
        scrollDescricao.setPreferredSize(new Dimension(400, 90));
        
        panelFormulario.add(lblTItuloTipoTrasacao);
        panelFormulario.add(panelTipo);
        panelFormulario.add(lblTituloValor);
        panelFormulario.add(txtValor);
        panelFormulario.add(lblTituloData);
        panelFormulario.add(txtData);
        panelFormulario.add(lblTituloDescricao);
        panelFormulario.add(new JScrollPane(txtDescricao));

        panelRegistro.add(panelFormulario, BorderLayout.CENTER);

        panelBotoes = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        panelBotoes.setBackground(new Color(216, 216, 216));

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnCancelar.addActionListener(new ActionListener() {
        		    public void actionPerformed(ActionEvent e) {
        		        txtValor.setText("EX: R$ 2000");
        		        txtValor.setForeground(new Color(216, 216, 216));

        		        txtData.setText("EX: 22/04/2026");
        		        txtData.setForeground(new Color(216, 216, 216));

        		        txtDescricao.setText("");

        		        ehDespesa = false;
        		    }
        		});
        	}
        });
        btnCancelar.setPreferredSize(new Dimension(100, 30));
        btnCancelar.setBackground(new Color(73, 73, 73));
        btnCancelar.setForeground(Color.WHITE);

		btnSalvar = new JButton("Salvar Transação");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        btnSalvar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try { // Inicia o tratamento de exceções
 		           
		            String desc = txtDescricao.getText(); // Obtém o texto digitado no campo de descrição
		            double valor = Double.parseDouble(txtValor.getText()); // Converte o texto do campo de valor para número decimal

		            
		            if (ehDespesa) { // Verifica se a operação é uma despesa
		                valor = valor * -1; // Converte o valor para negativo
		            }

		            
		            String dataTexto = txtData.getText(); // Obtém o texto digitado no campo de data
		            String[] partes = dataTexto.split("/"); // Divide a data em partes usando "/" como separador
		            
		            
		            if (partes.length != 3) { // Verifica se a data possui dia, mês e ano
		                throw new Exception("Data incompleta"); // Lança exceção caso a data esteja incompleta
		            }

		            int dia = Integer.parseInt(partes[0]); // Converte a primeira parte da data para inteiro (dia)
		            int mes = Integer.parseInt(partes[1]); // Converte a segunda parte da data para inteiro (mês)
		            int ano = Integer.parseInt(partes[2]); // Converte a terceira parte da data para inteiro (ano)

		           
		            Gasto novo = new Gasto(0, valor, desc, ano, mes, dia, null, false); // Cria um novo objeto "Gasto" com os dados informados
		            Repositorio.salvar(novo); // Salva o objeto no repositório

		            
		            if (TelaExtrato.frameAberto != null) { // Verifica se a tela de extrato está aberta
		                TelaExtrato.frameAberto.carregarTabela(); // Atualiza a tabela da tela de extrato
		            }

		            if (TelaPrincipal.frameAberto != null) { // Verifica se a tela principal está aberta
		                TelaPrincipal.frameAberto.atualizarDashboard(); // Atualiza o dashboard
		            }

		         
		            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!"); // Exibe mensagem de sucesso
		            cardLayout.show(panelTelas, "dashboard");

		        } catch (NumberFormatException ex) { // Captura erro de conversão de números
		            JOptionPane.showMessageDialog(null, "Erro: Verifique se o Valor e a Data contêm apenas números."); // Exibe mensagem de erro
		        } catch (Exception ex) { // Captura erro relacionado ao formato da data
		            JOptionPane.showMessageDialog(null, "Erro no formato da data! Use o padrão: DD/MM/AAAA"); // Exibe mensagem de erro
		        }
        		atualizarDashboard(); // Atualiza os dados exibidos para o dashboard
        		carregarTabela(); //atualiza os dados adicionados para a tabela
        		cardLayout.show(panelTelas, "dashboard"); // volta pra tela de dashboard
        		
        		txtValor.setText("EX: R$ 2000"); //volta o exemplo depois de salvar transação
        		txtValor.setForeground(new Color(216, 216, 216));

        		txtData.setText("EX: 22/04/2026"); //volta o exemplo depois de salvar transação
        		txtData.setForeground(new Color(216, 216, 216));

        		txtDescricao.setText(""); //remove o texto na descrição

        		ehDespesa = false; 
        	}
        });
        btnSalvar.setPreferredSize(new Dimension(170, 30));
        btnSalvar.setBackground(new Color(31, 33, 38));
        btnSalvar.setForeground(Color.WHITE);

        panelBotoes.add(btnCancelar);
        panelBotoes.add(btnSalvar);

        panelRegistro.add(panelBotoes, BorderLayout.SOUTH);

        panelBoasPraticas = new JPanel(new BorderLayout());
        panelBoasPraticas.setBackground(new Color(230, 230, 230));
        panelBoasPraticas.setPreferredSize(new Dimension(220, 0));
        panelBoasPraticas.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        lblTituloBoasPraticas = new JLabel("Boas Práticas");
        lblTituloBoasPraticas.setHorizontalAlignment(SwingConstants.CENTER);
        lblTituloBoasPraticas.setFont(new Font("ABeeZee", Font.PLAIN, 15));

        panelBoasPraticas.add(lblTituloBoasPraticas, BorderLayout.NORTH);

        panelCorpo.add(panelRegistro, BorderLayout.CENTER);
        panelCorpo.add(panelBoasPraticas, BorderLayout.EAST);

        panelSaldo.add(panelCorpo, BorderLayout.CENTER);

        return panelSaldo;
    }
    
    private void configuracaoPopup() {
        dialogConfiguracao = new JDialog(this, "Configurações", true); // Cria um estilo popUp ligado na tela principal
        dialogConfiguracao.setSize(383, 511); //tamanho que vai ser o popUp	
        dialogConfiguracao.setLocationRelativeTo(this); //deixa o popUp no meio da tela principal
        dialogConfiguracao.setResizable(false); // nao deixa mexer no tamanho

        contentPaneConfiguracao = new JPanel();
        contentPaneConfiguracao.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPaneConfiguracao.setBackground(new Color(216, 216, 216));
        contentPaneConfiguracao.setLayout(null);
        dialogConfiguracao.setContentPane(contentPaneConfiguracao);

        JPanel panelPerfil = new JPanel();
        panelPerfil.setBorder(new LineBorder(new Color(31, 33, 38)));
        panelPerfil.setBackground(new Color(216, 216, 216));
        panelPerfil.setBounds(-2, -5, 375, 116);
        panelPerfil.setLayout(null);
        contentPaneConfiguracao.add(panelPerfil);

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
        btnVoltar.setBounds(10, 11, 25, 25);
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogConfiguracao.dispose();
            }
        });
        panelPerfil.add(btnVoltar);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        panel_1.setBackground(new Color(216, 216, 216));
        panel_1.setBounds(3, 110, 367, 362);
        contentPaneConfiguracao.add(panel_1);

        JLabel lblTituloPreferencias = new JLabel("Preferências do Usuário");
        lblTituloPreferencias.setForeground(new Color(31, 33, 38));
        lblTituloPreferencias.setFont(new Font("ABeeZee", Font.BOLD, 15));
        lblTituloPreferencias.setBounds(10, 23, 205, 14);
        panel_1.add(lblTituloPreferencias);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(216, 216, 216));
        panel_3.setBounds(10, 48, 347, 68);
        panel_1.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblTituloMoeda = new JLabel("Moeda Base");
        lblTituloMoeda.setForeground(new Color(31, 33, 38));
        lblTituloMoeda.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        lblTituloMoeda.setBounds(10, 21, 83, 14);
        panel_3.add(lblTituloMoeda);

        boxMoedaBase = new JComboBox();
        boxMoedaBase.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        boxMoedaBase.setForeground(new Color(31, 33, 38));
        boxMoedaBase.setModel(new DefaultComboBoxModel(new String[] {
            "BRL - Real (R$)",
            "USD - Dólar ($)",
            "EUR - Euro (€)"
        }));
        
        boxMoedaBase.setBounds(10, 35, 327, 22);
        boxMoedaBase.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        boxMoedaBase.setBackground(new Color(216, 216, 216));
        panel_3.add(boxMoedaBase);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(216, 216, 216));
        panel_2.setBounds(10, 132, 347, 99);
        panel_1.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblTituloNotificaesAlertas = new JLabel("Notificações & Alertas");
        lblTituloNotificaesAlertas.setBounds(10, 11, 167, 18);
        lblTituloNotificaesAlertas.setForeground(new Color(31, 33, 38));
        lblTituloNotificaesAlertas.setFont(new Font("ABeeZee", Font.BOLD, 15));
        panel_2.add(lblTituloNotificaesAlertas);

        JLabel lblTituloLembreteContas = new JLabel("Lembrete de contas");
        lblTituloLembreteContas.setForeground(new Color(31, 33, 38));
        lblTituloLembreteContas.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        lblTituloLembreteContas.setBounds(10, 37, 132, 14);
        panel_2.add(lblTituloLembreteContas);

        JLabel lblTituloPagamentosMensais = new JLabel("Notifique pagamentos mensais");
        lblTituloPagamentosMensais.setFont(new Font("ABeeZee", Font.PLAIN, 11));
        lblTituloPagamentosMensais.setForeground(Color.GRAY);
        lblTituloPagamentosMensais.setBounds(10, 51, 202, 14);
        panel_2.add(lblTituloPagamentosMensais);

        chckbxNewCheckBox = new JCheckBox("");
        chckbxNewCheckBox.setBackground(new Color(216, 216, 216));
        chckbxNewCheckBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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

        chckbxNewCheckBox_1 = new JCheckBox("");
        chckbxNewCheckBox_1.setBackground(new Color(216, 216, 216));
        chckbxNewCheckBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        chckbxNewCheckBox_1.setBounds(307, 67, 23, 23);
        panel_2.add(chckbxNewCheckBox_1);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(216, 216, 216));
        panel_4.setBounds(10, 242, 347, 109);
        panel_1.add(panel_4);
        panel_4.setLayout(null);

        JLabel lblTituloGerenciamentoDePlano = new JLabel("Gerenciamento de Plano");
        lblTituloGerenciamentoDePlano.setBounds(10, 11, 184, 18);
        lblTituloGerenciamentoDePlano.setForeground(new Color(31, 33, 38));
        lblTituloGerenciamentoDePlano.setFont(new Font("ABeeZee", Font.BOLD, 15));
        panel_4.add(lblTituloGerenciamentoDePlano);

        txtPlanoPremium = new JTextField();
        txtPlanoPremium.setEditable(false);
        txtPlanoPremium.setBackground(new Color(191, 203, 143));
        txtPlanoPremium.setFont(new Font("ABeeZee", Font.PLAIN, 12));
        txtPlanoPremium.setForeground(new Color(31, 33, 38));
        txtPlanoPremium.setText("Plano Premium");
        txtPlanoPremium.setHorizontalAlignment(SwingConstants.CENTER);
        txtPlanoPremium.setBounds(10, 38, 113, 22);
        panel_4.add(txtPlanoPremium);

        btnAlterarPlano = new JButton("Alterar Plano");
        btnAlterarPlano.setForeground(new Color(31, 33, 38));
        btnAlterarPlano.setBackground(new Color(0, 128, 64));
        btnAlterarPlano.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAlterarPlano.setFont(new Font("ABeeZee", Font.PLAIN, 12));
        btnAlterarPlano.setBounds(224, 75, 113, 23);
        panel_4.add(btnAlterarPlano);

        dialogConfiguracao.setVisible(true);
    }
    
    public void atualizarDashboard() { // Método responsável por atualizar as informações exibidas na tela
		double ganhos = Repositorio.calcularTotalGanhos(); // Obtém o total de ganhos do repositório
		lblValorGanhoMes.setText(String.format("R$ %.2f", ganhos)); // Atualiza o texto do label com o valor dos ganhos formatado
		
	    double despesas = Repositorio.calcularTotalDespesas(); // Obtém o total de despesas do repositório
	    lblDespesasMes.setText(String.format("R$ %.2f", despesas)); // Atualiza o texto do label com o valor das despesas formatado
	    
	    double saldoFinal = ganhos - despesas; // Calcula o saldo final subtraindo despesas de ganhos
	    txtR.setText(String.format("R$ %.2f", saldoFinal));	// Atualiza o campo de saldo com o valor formatado
	    
	    Gasto ultimoGanho = Repositorio.getUltimoGanho(); // Obtém o último ganho registrado
	    if (ultimoGanho != null) { // Verifica se existe um ganho
	        lblTransacoes1.setText(ultimoGanho.getDescricao()); // Exibe a descrição do último ganho
	        lblValorTransacao1.setText(String.format("R$ %.2f", ultimoGanho.getValor())); // Exibe o valor do último ganho formatado
	    } else { // Caso não exista ganho
	        lblTransacoes1.setText("Nenhum ganho registrado"); // Exibe mensagem padrão
	        lblValorTransacao1.setText("R$ 0,00"); // Define valor padrão
	    }

	    Gasto ultimaDespesa = Repositorio.getUltimaDespesa(); // Obtém a última despesa registrada
	    if (ultimaDespesa != null) { // Verifica se existe uma despesa
	        lblTransacoes2.setText(ultimaDespesa.getDescricao()); // Exibe a descrição da última despesa
	        lblValorTransacao2.setText(String.format("R$ %.2f", Math.abs(ultimaDespesa.getValor()))); // Exibe o valor da despesa em formato positivo
	    } else { // Caso não exista despesa
	        lblTransacoes2.setText("Nenhuma despesa registrada"); // Exibe mensagem padrão
	        lblValorTransacao2.setText("R$ 0,00"); // Define valor padrão
	    }
	}
   
	
	private void verificarAlertasDeVencimento() { // Método que verifica gastos vencidos ou que vencem hoje
		LocalDate hoje = LocalDate.now(); // Obtém a data atual
		if (Repositorio.getLista() == null || Repositorio.getLista().isEmpty()) { // Verifica se a lista está nula ou vazia
			return; // Encerra o método caso não haja dados
		}

		for (Gasto g : Repositorio.getLista()) { // Percorre todos os gastos da lista
			String status = g.identificarStatus(hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear()); 
			// Obtém o status do gasto com base na data atual

	        if (status.equals("Vencido") || status.equals("Vence Hoje")) { // Verifica se o gasto está vencido ou vence hoje
	            JOptionPane.showMessageDialog(this, // Exibe uma caixa de mensagem na tela
	                "ALERTA: '" + g.getDescricao() + "' " + status + "!", // Define a mensagem exibida
	                "Sistema de Alertas Ca$h Hub", // Define o título da mensagem
	                JOptionPane.WARNING_MESSAGE); // Define o tipo de alerta como aviso
	        }
	    }
	}	
	
	public void carregarTabela() {
	    DefaultTableModel modelo = (DefaultTableModel) table.getModel(); // Obtém o modelo da tabela e faz o cast para DefaultTableModel
	    modelo.setRowCount(0); // Remove todas as linhas da tabela para evitar duplicação

	    for (Gasto g : Repositorio.getLista()) { // Percorre todos os gastos armazenados no repositório
	        String tipo = (g.getValor() > 0) ? "Entrada" : "Saída"; // Define o tipo como "Entrada" ou "Saída" com base no valor

	        String valorFormatado = String.format("R$ %.2f", Math.abs(g.getValor())); // Formata o valor absoluto para exibição com duas casas decimais
	        if (g.getValor() < 0) valorFormatado = "- " + valorFormatado; // Adiciona sinal negativo ao valor formatado se for despesa

	        modelo.addRow(new Object[] {  // Adiciona uma nova linha na tabela
	            String.format("%02d/%02d/%d", g.getDia(), g.getMes(), g.getAno()),  // Formata a data no padrão DD/MM/AAAA
	            "Geral", // Define a categoria como "Geral"
	            g.getDescricao(),  // Adiciona a descrição do gasto
	            tipo, // Adiciona o tipo (Entrada/Saída)
	            valorFormatado  // Adiciona o valor formatado
	        });
	    }

	    double ganhos = Repositorio.calcularTotalGanhos(); // Obtém o total de ganhos
	    double despesas = Repositorio.calcularTotalDespesas();  // Obtém o total de despesas
	    double saldoTotal = ganhos - despesas; // Calcula o saldo total

	    lblValorGanhoMesExtrato.setText(String.format("R$ %.2f", ganhos)); // Atualiza o label de ganhos
	    lblDespesasMesExtrato.setText(String.format("R$ %.2f", despesas)); // Atualiza o label de despesas
	    txtRExtrato.setText(String.format("R$ %.2f", saldoTotal)); // Atualiza o campo de saldo total

	}
	
	private static class TipoRenderer extends DefaultTableCellRenderer { // Declara uma classe interna estática que 
        // personaliza a renderização da coluna "Tipo"
		private static final long serialVersionUID = 1L; // Define o identificador de versão da classe
	
		@Override 
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) { // Sobrescreve o método responsável por renderizar cada célula da tabela
			super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Chama o comportamento padrão da renderização
			setHorizontalAlignment(CENTER); // Define o alinhamento do conteúdo da célula como centralizado
		
			String tipo = value == null ? "" : value.toString(); // Obtém o valor da célula e converte para String
			if (!isSelected) { // Verifica se a célula não está selecionada
				setBackground(new Color(250, 250, 250)); // Define a cor de fundo da célula
				if ("Entrada".equalsIgnoreCase(tipo)) { // Verifica se o tipo é "Entrada"
					setForeground(new Color(34, 139, 34)); // Define a cor do texto como verde
				} else { // Caso contrário
					setForeground(new Color(200, 30, 30)); // Define a cor do texto como vermelho
				}
			}
			return this; // Retorna o componente renderizado
		}
	}
	
	private static class ValorRenderer extends DefaultTableCellRenderer { // Declara uma classe interna estática que personaliza 
	         // a renderização da coluna "Valor"
		private static final long serialVersionUID = 1L; // Define o identificador de versão da classe
	
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, 
				int row, int column) { // Sobrescreve o método responsável por renderizar cada célula da tabela
			super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Chama o comportamento padrão da renderização
			setHorizontalAlignment(RIGHT); // Define o alinhamento do conteúdo da célula à direita
	
			Object tipoObj = table.getValueAt(row, 3); // Obtém o valor da coluna "Tipo" da mesma linha
			String tipo = tipoObj == null ? "" : tipoObj.toString(); // Converte o valor para String
			if (!isSelected) { // Verifica se a célula não está selecionada
				setBackground(new Color(250, 250, 250)); // Define a cor de fundo da célula
				if ("Entrada".equalsIgnoreCase(tipo)) { // Verifica se o tipo é "Entrada"
					setForeground(new Color(34, 139, 34)); // Define a cor do texto como verde
				} else { // Caso contrário
					setForeground(new Color(200, 30, 30)); // Define a cor do texto como vermelho
				}
			}
			return this; // Retorna o componente renderizado
	
	
	}
}
	
	
}