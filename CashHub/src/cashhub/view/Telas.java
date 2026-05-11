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
	private JComboBox<String> listaCategoria;
	private JButton btnSalvar;
	private JLabel lblTituloDescricao;
	private JLabel lblTituloValor;
	private JLabel lblTituloData;
	private JTextArea txtDescricao;
	private JPanel panelBotoes;
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
	private boolean ehDespesa = false;
	private boolean ehPagamentoFuturo = false;
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
	private JPanel panelTextoPagamentos;
	
	private JTextField txtPlanoPremium;
	private JDialog dialogConfiguracao;
	private JPanel contentPaneConfiguracao;
	private JComboBox boxMoedaBase;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JButton btnAlterarPlano;
    private CardLayout cardLayout;
    private JPanel panelTelas;
    private JButton btnPagamentoFuturo;
    private JTextField txtBuscaCategoria;
    private JTable tablePagamentos;
    private DefaultTableModel modeloPagamentos;

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

        // --- 1. CABEÇALHO (Logo + Filtro + Perfil) ---
        panelCabecalho = new JPanel(new BorderLayout());
        panelCabecalho.setBackground(new Color(216, 216, 216));
        panelCabecalho.setBorder(BorderFactory.createEmptyBorder(15, 25, 10, 25));

        // Painel para agrupar Logo e Filtro no canto esquerdo
        JPanel panelLogoBusca = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 0));
        panelLogoBusca.setBackground(new Color(216, 216, 216));

        lblLogo = new JLabel("CA$H HUB");
        lblLogo.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblLogo.setForeground(new Color(31, 33, 38));

        // Configuração do Filtro
        txtBuscaCategoria = new JTextField(15);
        txtBuscaCategoria.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        txtBuscaCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) { carregarTabela(); }
        });

        panelLogoBusca.add(lblLogo);
        panelLogoBusca.add(new JLabel("Filtrar:"));
        panelLogoBusca.add(txtBuscaCategoria);

        // Painel de Perfil (Lado Direito)
        panelPerfil = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        panelPerfil.setBackground(new Color(216, 216, 216));
        lblUsuario = new JLabel("Gustavo Dornellas");
        btnPerfil = new JButton("");
        btnPerfil.setBackground(new Color(31, 33, 38));
        btnPerfil.setPreferredSize(new Dimension(30, 30));
        panelPerfil.add(lblUsuario);
        panelPerfil.add(btnPerfil);

        panelCabecalho.add(panelLogoBusca, BorderLayout.WEST);
        panelCabecalho.add(panelPerfil, BorderLayout.EAST);
        panelExtrato.add(panelCabecalho, BorderLayout.NORTH);

        // --- 2. ÁREA CENTRAL (Tabelas e Balanço) ---
        panelPrincipalExtrato = new JPanel(new BorderLayout(15, 0));
        panelPrincipalExtrato.setBackground(new Color(216, 216, 216));
        panelPrincipalExtrato.setBorder(BorderFactory.createEmptyBorder(5, 25, 25, 25));

        // LADO ESQUERDO: Histórico
        JPanel panelCentroExtrato = new JPanel(new BorderLayout(0, 15));
        panelCentroExtrato.setBackground(new Color(216, 216, 216));

        JPanel panelTitulo = new JPanel(new BorderLayout());
        panelTitulo.setBackground(new Color(216, 216, 216));
        lblTituloExtrato = new JLabel("Histórico de Transações");
        lblTituloExtrato.setFont(new Font("ABeeZee", Font.BOLD, 30));
        lblSubtituloExtrato = new JLabel("Acompanhe todas as entradas e saídas registradas.");
        panelTitulo.add(lblTituloExtrato, BorderLayout.NORTH);
        panelTitulo.add(lblSubtituloExtrato, BorderLayout.SOUTH);
        panelCentroExtrato.add(panelTitulo, BorderLayout.NORTH);

        // Tabela Principal
        String[] colunas = { "Data", "Categoria", "Descrição", "Tipo", "Valor" };
        table = new JTable(new DefaultTableModel(colunas, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        });
        // Estética igual ao seu print
        table.setRowHeight(38);
        table.getTableHeader().setBackground(new Color(31, 33, 38));
        table.getTableHeader().setForeground(Color.WHITE);
        table.getColumnModel().getColumn(3).setCellRenderer(new TipoRenderer());
        table.getColumnModel().getColumn(4).setCellRenderer(new ValorRenderer());

        panelCentroExtrato.add(new JScrollPane(table), BorderLayout.CENTER);

        // Botoes CRUD Embaixo da Tabela Principal
        JPanel panelAcoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelAcoes.setBackground(new Color(216, 216, 216));
        JButton btnEditar = new JButton("Editar");
        btnEditar.addActionListener(e -> {
            int linhaSelecionada = table.getSelectedRow();

            if (linhaSelecionada != -1) {
                // 1. Identifica o objeto original no Repositório
                int modelIndex = table.convertRowIndexToModel(linhaSelecionada);
                Gasto gastoExistente = Repositorio.getLista().get(modelIndex);

                // 2. Abre diálogos para capturar os novos valores
                String novaDescricao = JOptionPane.showInputDialog("Nova Descrição:", gastoExistente.getDescricao());
                
                // Se o usuário não cancelou a janela de descrição
                if (novaDescricao != null && !novaDescricao.trim().isEmpty()) {
                    
                    String novoValorStr = JOptionPane.showInputDialog("Novo Valor (R$):", Math.abs(gastoExistente.getValor()));
                    
                    if (novoValorStr != null) {
                        try {
                            // 3. Converte e aplica as novas informações ao objeto
                            double novoValor = Double.parseDouble(novoValorStr.replace(",", "."));
                            
                            // Mantém o sinal de negativo se o gasto original era uma despesa
                            if (gastoExistente.getValor() < 0) {
                                novoValor = Math.abs(novoValor) * -1;
                            }

                            gastoExistente.setDescricao(novaDescricao);
                            gastoExistente.setValor(novoValor);

                            // 4. Atualiza a visualização das telas
                            carregarTabela();
                            atualizarDashboard();
                            
                            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");

                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Erro: Valor numérico inválido.");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma linha para editar.");
            }
        });
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(e -> {
            // 1. Verifica qual linha está selecionada na tabela
            int linhaSelecionada = table.getSelectedRow();

            if (linhaSelecionada != -1) {
                // 2. Confirmação de segurança para evitar exclusões acidentais
                int confirmacao = JOptionPane.showConfirmDialog(null, 
                        "Tem certeza que deseja excluir esta transação?", 
                        "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);

                if (confirmacao == JOptionPane.YES_OPTION) {
                    /** * 3. Localização do objeto: 
                     * Convertemos o índice da linha da tabela para o índice real do modelo,
                     * isso garante que a exclusão funcione mesmo se a tabela estiver filtrada ou ordenada.
                     */
                    int modelIndex = table.convertRowIndexToModel(linhaSelecionada);
                    
                    // 4. Remove o item da lista global
                    Repositorio.getLista().remove(modelIndex);

                    // 5. Sincroniza a interface e o banco de dados (Repositorio)
                    carregarTabela();      // Atualiza o extrato
                    atualizarDashboard(); // Atualiza os totais no dashboard
                    
                    JOptionPane.showMessageDialog(null, "Registro removido com sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir.");
            }
        });
        btnExcluir.setBackground(new Color(149, 0, 0));
        btnExcluir.setForeground(Color.WHITE);
        panelAcoes.add(btnEditar);
        panelAcoes.add(btnExcluir);
        panelCentroExtrato.add(panelAcoes, BorderLayout.SOUTH);

        // LADO DIREITO: Balanço e Agendados
        JPanel panelLadoDireito = new JPanel(new GridLayout(2, 1, 0, 15));
        panelLadoDireito.setBackground(new Color(216, 216, 216));
        panelLadoDireito.setPreferredSize(new Dimension(230, 0));

        // Balanço
        panelBalanco = new JPanel(new GridLayout(5, 1, 0, 5));
        panelBalanco.setBackground(new Color(31, 33, 38));
        panelBalanco.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        txtRExtrato = new JTextField("R$ 0,00");
        txtRExtrato.setEditable(false);
        txtRExtrato.setBackground(new Color(31, 33, 38));
        txtRExtrato.setForeground(Color.WHITE);
        txtRExtrato.setFont(new Font("ABeeZee", Font.BOLD, 28));
        lblValorGanhoMesExtrato = new JLabel("R$ 0,00");
        lblValorGanhoMesExtrato.setForeground(new Color(34, 166, 62));
        lblDespesasMesExtrato = new JLabel("R$ 0,00");
        lblDespesasMesExtrato.setForeground(new Color(220, 45, 45));
        panelBalanco.add(new JLabel("Balanço do mês") {{ setForeground(Color.LIGHT_GRAY); }});
        panelBalanco.add(txtRExtrato);
        panelBalanco.add(new JLabel("Ganhos:") {{ setForeground(Color.LIGHT_GRAY); }});
        panelBalanco.add(lblValorGanhoMesExtrato);
        panelBalanco.add(lblDespesasMesExtrato);

        // Pagamentos Mensais (O SEGREDO DO ERRO ESTÁ AQUI)
        panelPagamentos = new JPanel(new BorderLayout());
        panelPagamentos.setBackground(new Color(31, 33, 38));
        panelPagamentos.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        modeloPagamentos = new DefaultTableModel(new String[]{"Data", "Descrição", "Valor", "Status"}, 0);
        tablePagamentos = new JTable(modeloPagamentos); // 1. Criar a tabela primeiro
        tablePagamentos.getColumnModel().getColumn(0).setPreferredWidth(75);  // Data
        tablePagamentos.getColumnModel().getColumn(1).setPreferredWidth(100); // Descrição
        tablePagamentos.getColumnModel().getColumn(2).setPreferredWidth(70);  // Valor
        tablePagamentos.getColumnModel().getColumn(3).setPreferredWidth(70);  // Status

        // Desativa o redimensionamento automático para as colunas respeitarem os tamanhos acima
        tablePagamentos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 

        // Garante que a tabela ocupe todo o espaço do scroll
        tablePagamentos.setFillsViewportHeight(true);        
        tablePagamentos.setBackground(new Color(45, 47, 52));
        tablePagamentos.setForeground(Color.WHITE);
        
        tablePagamentos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, 
                    boolean isSelected, boolean hasFocus, int row, int column) {
                
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                try {
                    // 1. Pega a data da coluna 0 (ex: 10/05/2026)
                    String dataStr = table.getValueAt(row, 0).toString();
                    String[] p = dataStr.split("/");
                    LocalDate vencimento = LocalDate.of(Integer.parseInt(p[2]), Integer.parseInt(p[1]), Integer.parseInt(p[0]));
                    LocalDate hoje = LocalDate.now();

                    // 2. Define a cor baseada na regra de negócio
                    if (vencimento.isBefore(hoje)) {
                        // VENCIDO: Vermelho
                        c.setForeground(new Color(255, 100, 100));
                        if (column == 3) value = "Vencido"; 
                    } else if (vencimento.isBefore(hoje.plusDays(5))) {
                        // PRÓXIMO (até 5 dias): Amarelo/Laranja
                        c.setForeground(new Color(255, 200, 50));
                        if (column == 3) value = "Urgente";
                    } else {
                        // EM DIA: Azul claro ou Verde
                        c.setForeground(new Color(100, 200, 255));
                        if (column == 3) value = "Em dia";
                    }

                    // Mantém o fundo escuro do painel
                    c.setBackground(new Color(45, 47, 52));
                    
                    // Centraliza o texto nas colunas de Data e Status
                    if (column == 0 || column == 3) {
                        setHorizontalAlignment(CENTER);
                    } else {
                        setHorizontalAlignment(LEFT);
                    }

                } catch (Exception ex) {
                    c.setForeground(Color.WHITE);
                }
                
                return c;
            }
        });
        
        // AGORA configurar as colunas (Depois que ela já existe)
        tablePagamentos.getColumnModel().getColumn(0).setPreferredWidth(80);
        tablePagamentos.getColumnModel().getColumn(1).setPreferredWidth(120);

        panelTextoPagamentos = new JPanel(new GridLayout(2, 1));
        panelTextoPagamentos.setBackground(new Color(31, 33, 38));
        lblPagamentos = new JLabel("Pagamentos Mensais");
        lblPagamentos.setForeground(Color.WHITE);
        lblPagamentosDesc = new JLabel("Gerencie seus pagamentos");
        lblPagamentosDesc.setForeground(Color.GRAY);
        panelTextoPagamentos.add(lblPagamentos);
        panelTextoPagamentos.add(lblPagamentosDesc);

        btnGerenciarPagamentos = new JButton("Gerenciar Pagamentos");
        
        btnGerenciarPagamentos.addActionListener(e -> {
            int linha = tablePagamentos.getSelectedRow();
            
            if (linha != -1) {
                String desc = tablePagamentos.getValueAt(linha, 1).toString();
                
                int resposta = JOptionPane.showConfirmDialog(null, 
                        "Deseja marcar '" + desc + "' como pago?", 
                        "Confirmar Pagamento", JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.YES_OPTION) {
                    // Procura na lista e altera o estado
                    for (Gasto g : Repositorio.getLista()) {
                        if (g.getDescricao().equals(desc) && g.isAgendado()) {
                            g.setAgendado(false); // Agora ele vira histórico
                            g.setPago(true);      // Status de pago
                            break;
                        }
                    }
                    // Atualiza tudo
                    carregarTabela(); 
                    atualizarDashboard();
                    JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um pagamento na lista lateral.");
            }
        });
        
        panelPagamentos.add(panelTextoPagamentos, BorderLayout.NORTH);
        panelPagamentos.add(new JScrollPane(tablePagamentos), BorderLayout.CENTER);
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

    	    // --- 1. INICIALIZAÇÃO DOS COMPONENTES (Evita o NullPointerException) ---
    	    panelSaldo = new JPanel(new BorderLayout());
    	    panelSaldo.setBackground(new Color(216, 216, 216));

    	    // Cabeçalho
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
    	    btnPerfil.setBackground(new Color(31, 33, 38));
    	    btnPerfil.setPreferredSize(new Dimension(30, 30));
    	    btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	    btnPerfil.setFocusPainted(false);
    	    btnPerfil.setBorder(null);

    	    // Formulário e Inputs
    	    lblTItuloTipoTrasacao = new JLabel("Tipo de Transação");
    	    
    	    btnAdicionar = new JButton("Adicionar");
    	    btnAdicionar.setBackground(new Color(0, 128, 0));
    	    btnAdicionar.setForeground(Color.WHITE);

    	    btnRetirar = new JButton("Retirar");
    	    btnRetirar.setBackground(new Color(149, 0, 0));
    	    btnRetirar.setForeground(Color.WHITE);

    	    btnPagamentoFuturo = new JButton("Pagamento Futuro");
    	    btnPagamentoFuturo.setForeground(Color.WHITE);
    	    btnPagamentoFuturo.setBackground(new Color(0, 112, 127));

    	    txtValor = new JTextField("EX: R$ 2000");
    	    txtValor.setFont(new Font("ABeeZee", Font.PLAIN, 15));
    	    txtValor.setForeground(new Color(216, 216, 216));
    	    txtValor.setBorder(null);

    	    txtData = new JTextField("EX: 22/04/2026");
    	    txtData.setFont(new Font("ABeeZee", Font.PLAIN, 15));
    	    txtData.setForeground(new Color(216, 216, 216));
    	    txtData.setBorder(null);

    	    String[] categorias = {
    	        "Renda", "Agendado", "Alimentação", "Educação", "Autocuidado", "Transporte", "Lazer", 
    	        "Saúde", "Viagens", "Pets", "Manutenção", "Moradia", "Outros"
    	    };
    	    
    	    btnAdicionar.addActionListener(e -> {
    	        ehDespesa = false;
    	        ehPagamentoFuturo = false; // Não é agendado
    	        txtValor.setForeground(new Color(140, 170, 140));
    	        listaCategoria.setSelectedItem("Renda"); // Muda automaticamente
    	    });

    	    btnRetirar.addActionListener(e -> {
    	        ehDespesa = true;
    	        ehPagamentoFuturo = false; // Não é agendado
    	        txtValor.setForeground(new Color(170, 140, 140));
    	        listaCategoria.setSelectedItem("Outros"); // Reseta para o padrão de gasto
    	    });

    	    btnPagamentoFuturo.addActionListener(e -> {
    	        ehDespesa = true; // Geralmente um pagamento futuro é uma saída
    	        ehPagamentoFuturo = true;
    	        txtValor.setForeground(new Color(0, 112, 127)); // Cor do azul petróleo
    	        listaCategoria.setSelectedItem("Agendado"); //
    	    });
    	    
    	    listaCategoria = new JComboBox<>(new DefaultComboBoxModel<>(categorias));
    	    listaCategoria.setBackground(Color.WHITE);
    	    listaCategoria.setFont(new Font("ABeeZee", Font.PLAIN, 15));
    	    listaCategoria.setBorder(null);

    	    txtDescricao = new JTextArea();
    	    lblTituloAdicionarRegistro = new JLabel("ADICIONAR NOVO REGISTRO");
    	    lblTituloAdicionarRegistro.setFont(new Font("ABeeZee", Font.BOLD, 20));
    	    lblTituloAdicionarRegistro.setForeground(new Color(31, 33, 38));

    	    txtValor.addFocusListener(new FocusAdapter() {
    	        @Override
    	        public void focusGained(FocusEvent e) {
    	            if (txtValor.getText().equals("EX: R$ 2000")) {
    	                txtValor.setText("");
    	                txtValor.setForeground(Color.BLACK);
    	            }
    	        }
    	        @Override
    	        public void focusLost(FocusEvent e) {
    	            if (txtValor.getText().isEmpty()) {
    	                txtValor.setForeground(Color.LIGHT_GRAY);
    	                txtValor.setText("EX: R$ 2000");
    	            }
    	        }
    	    });

    	    txtData.addFocusListener(new FocusAdapter() {
    	        @Override
    	        public void focusGained(FocusEvent e) {
    	            if (txtData.getText().equals("EX: 22/04/2026")) {
    	                txtData.setText("");
    	                txtData.setForeground(new Color(31, 33, 38));
    	            }
    	        }
    	        @Override
    	        public void focusLost(FocusEvent e) {
    	            if (txtData.getText().isEmpty()) {
    	                txtData.setForeground(Color.LIGHT_GRAY);
    	                txtData.setText("EX: 22/04/2026");
    	            }
    	        }
    	    });

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
    	    panelRegistro.add(lblTituloAdicionarRegistro, BorderLayout.NORTH);

    	    panelFormulario = new JPanel(new GridLayout(10, 1, 0, 8));
    	    panelFormulario.setBackground(new Color(216, 216, 216));
    	    
    	    panelTipo = new JPanel(new GridLayout(1, 3, 20, 0));
    	    panelTipo.setBackground(new Color(216, 216, 216));
    	    panelTipo.add(btnAdicionar);
    	    panelTipo.add(btnRetirar);
    	    panelTipo.add(btnPagamentoFuturo);

    	    panelFormulario.add(new JLabel("Tipo de Transação"));
    	    panelFormulario.add(panelTipo);
    	    panelFormulario.add(new JLabel("Valor:"));
    	    panelFormulario.add(txtValor);
    	    panelFormulario.add(new JLabel("Data:"));
    	    panelFormulario.add(txtData);
    	    panelFormulario.add(new JLabel("Categoria:")); // Label da Categoria
    	    panelFormulario.add(listaCategoria);          // Lista Suspensa
    	    panelFormulario.add(new JLabel("Descrição:"));
    	    panelFormulario.add(new JScrollPane(txtDescricao));

    	    panelRegistro.add(panelFormulario, BorderLayout.CENTER);

    	    // Botões Inferiores (Salvar/Cancelar)
    	    panelBotoes = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
    	    panelBotoes.setBackground(new Color(216, 216, 216));

    	    btnCancelar = new JButton("Cancelar");
    	    btnCancelar.setPreferredSize(new Dimension(100, 30));
    	    btnCancelar.setBackground(new Color(73, 73, 73));
    	    btnCancelar.setForeground(Color.WHITE);
    	    btnCancelar.addActionListener(e -> {
    	        txtValor.setText("EX: R$ 2000");
    	        txtValor.setForeground(new Color(216, 216, 216));
    	        txtData.setText("EX: 22/04/2026");
    	        txtData.setForeground(new Color(216, 216, 216));
    	        txtDescricao.setText("");
    	        listaCategoria.setSelectedIndex(0);
    	        ehDespesa = false;
    	    });

    	    btnSalvar = new JButton("Salvar Transação");
    	    btnSalvar.setPreferredSize(new Dimension(170, 30));
    	    btnSalvar.setBackground(new Color(31, 33, 38));
    	    btnSalvar.setForeground(Color.WHITE);
    	    btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	     
    	    btnSalvar.addActionListener(new ActionListener() {
    	        public void actionPerformed(ActionEvent e) {
    	            try {
    	                String desc = txtDescricao.getText();
    	                String categoriaSelecionada = (String) listaCategoria.getSelectedItem();
    	                
    	                // Limpa formatação de moeda se houver e converte
    	                String valorTexto = txtValor.getText().replace("R$", "").replace(" ", "").replace(",", ".");
    	                double valor = Double.parseDouble(valorTexto);

    	                if (ehDespesa) {
    	                    valor = Math.abs(valor) * -1;
    	                }

    	                String dataTexto = txtData.getText();
    	                String[] partes = dataTexto.split("/");
    	                if (partes.length != 3) throw new Exception("Data incompleta");

    	                int dia = Integer.parseInt(partes[0]);
    	                int mes = Integer.parseInt(partes[1]);
    	                int ano = Integer.parseInt(partes[2]);

    	                // Criação do objeto com a categoria selecionada
    	                cashhub.model.Categoria cat = new cashhub.model.Categoria(0, categoriaSelecionada);
    	                Gasto novo = new Gasto(0, valor, desc, ano, mes, dia, cat, false);
    	                
    	                novo.setAgendado(ehPagamentoFuturo); // Aqui você "avisa" se é agendado ou não
    	                	
    	                Repositorio.salvar(novo);
    	                
    	                // Atualiza a interface
    	                atualizarDashboard();
    	                carregarTabela();

    	                JOptionPane.showMessageDialog(null, "Registro de " + categoriaSelecionada + " salvo!");
    	                
    	                // Volta para o dashboard e limpa campos
    	                cardLayout.show(panelTelas, "dashboard");
    	                txtValor.setText("EX: R$ 2000");
    	                txtValor.setForeground(new Color(216, 216, 216));
    	                txtData.setText("EX: 22/04/2026");
    	                txtData.setForeground(new Color(216, 216, 216));
    	                txtDescricao.setText("");
    	                listaCategoria.setSelectedIndex(0);
    	                ehDespesa = false;

    	            } catch (Exception ex) {
    	                JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
    	            }
    	        }
    	    });
    	    
    	    panelBotoes.add(btnCancelar);
    	    panelBotoes.add(btnSalvar);
    	    panelRegistro.add(panelBotoes, BorderLayout.SOUTH);
    	    panelCorpo.add(panelRegistro, BorderLayout.CENTER);
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
	    DefaultTableModel modelo = (DefaultTableModel) table.getModel();
	    modelo.setRowCount(0);

	    // Recupera o filtro de busca
	    String busca = (txtBuscaCategoria != null) ? txtBuscaCategoria.getText().toLowerCase() : "";

	    for (Gasto g : Repositorio.getLista()) {
	        // FILTRO: Se NÃO for agendado, entra aqui
	        if (!g.isAgendado()) { 
	            String nomeCat = (g.getCategoria() != null) ? g.getCategoria().getNome() : "Outros";

	            if (nomeCat.toLowerCase().contains(busca)) {
	                String tipo = (g.getValor() > 0) ? "Entrada" : "Saída";
	                String valorFormatado = String.format("R$ %.2f", Math.abs(g.getValor()));
	                if (g.getValor() < 0) valorFormatado = "- " + valorFormatado;

	                modelo.addRow(new Object[] {
	                    String.format("%02d/%02d/%d", g.getDia(), g.getMes(), g.getAno()),
	                    nomeCat,
	                    g.getDescricao(),
	                    tipo,
	                    valorFormatado
	                });
	            }
	        }
	    }

	    // Processa os totais financeiros para os Labels do Extrato
	    double ganhos = Repositorio.calcularTotalGanhos(); 
	    double despesas = Repositorio.calcularTotalDespesas();  
	    double saldoTotal = ganhos - despesas; 

	    lblValorGanhoMesExtrato.setText(String.format("R$ %.2f", ganhos)); 
	    lblDespesasMesExtrato.setText(String.format("R$ %.2f", despesas)); 
	    txtRExtrato.setText(String.format("R$ %.2f", saldoTotal)); 
	    
	    // Chama a atualização da tabela da direita
	    carregarTabelaPagamentos();
	}

	/**
	 * Atualiza a tabela de pagamentos mensais (Direita).
	 * Filtra para exibir apenas transações que SÃO agendadas.
	 */
	public void carregarTabelaPagamentos() {
	    if (modeloPagamentos == null) return;
	    
	    modeloPagamentos.setRowCount(0); 

	    for (Gasto g : Repositorio.getLista()) {
	        // Regra: Se o gasto FOR agendado, ele entra nesta tabela
	        if (g.isAgendado()) {
	            modeloPagamentos.addRow(new Object[] {
	                String.format("%02d/%02d/%d", g.getDia(), g.getMes(), g.getAno()),
	                g.getDescricao(),
	                String.format("R$ %.2f", Math.abs(g.getValor())),
	                "Pendente" 
	            });
	        }
	    }
	}
	
		class TipoRenderer extends DefaultTableCellRenderer {
   		 @Override
    		public Component getTableCellRendererComponent(JTable table, Object value, 
          		  boolean isSelected, boolean hasFocus, int row, int column) {
        		super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        		setHorizontalAlignment(CENTER);
        
       		 String tipo = value == null ? "" : value.toString();
       		 if ("Entrada".equalsIgnoreCase(tipo)) {
            setForeground(new Color(34, 139, 34)); // Verde
       		 } else {
            setForeground(new Color(200, 30, 30)); // Vermelho
       		 }
      		  return this;
    		}
	}		
	
		class ValorRenderer extends DefaultTableCellRenderer {
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, 
		            boolean isSelected, boolean hasFocus, int row, int column) {
		        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        setHorizontalAlignment(RIGHT);
		        
		        Object tipoObj = table.getValueAt(row, 3);
		        String tipo = tipoObj == null ? "" : tipoObj.toString();
		        
		        if ("Entrada".equalsIgnoreCase(tipo)) {
		            setForeground(new Color(34, 139, 34));
		        } else {
		            setForeground(new Color(200, 30, 30));
		        }
		        return this;
		    }
		}
}		