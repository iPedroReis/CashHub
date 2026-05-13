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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * Interface principal do sistema Ca$h Hub.
 * Responsável pela gestão das telas via CardLayout e interação com o Repositório.
 */
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
	private JLabel lblUsuarioDash;
	private JLabel lblUsuarioExtrato;
	private JLabel lblUsuarioSaldo;
	private JLabel lblUsuarioPopUp;
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
	private JButton btnExcluir;
	private JTextField txtRExtrato;
	private JTable table;
	private JLabel lblValorGanhoMesExtrato;
	private JLabel lblDespesasMesExtrato;
	private JPanel panelPrincipalExtrato;
	private JPanel panelBalanco;
	private JPanel panelPagamentos;
	private JScrollPane scrollPaneExtrato;
	private JButton btnPagarAgora;
	private JLabel lblTituloExtrato;
	private JLabel lblSubtituloExtrato;
	private JLabel lblBalancoTitulo;
	private JLabel lblTituloGanhosExtrato;
	private JLabel lblTituloDespesasExtrato;
	private JLabel lblTituloPagamentosFuturos;
	private JLabel lblPagamentosDesc;
	private JPanel panelTextoPagamentos;
	private JPanel panelEdicao;
	private JPanel panelAcoes;
	private JPanel panelLadoDireito;
	private JButton btnEditar;
	private JTextField txtPlanoPremium;
	private JDialog dialogConfiguracao;
	private JPanel contentPaneConfiguracao;
	private JComboBox boxMoedaBase;
	private JCheckBox checkbxLimite;
	private JCheckBox checkbxLembrete;
	private JButton btnAlterarPlano;
    private CardLayout cardLayout;
    private JPanel panelTelas;
    private JButton btnPagamentoFuturo;
    private JTextField txtBuscaCategoria;
    private JTable tablePagamentos;
    private DefaultTableModel modeloPagamentos;
    private JButton btnVoltar;
    private JPanel panelCabecalhoConfig;
    private JTextField txtEditarNome;
    private JButton btnSalvarNome;
    private JLabel lblTituloNomeConta;
    private JLabel lblTituloMembro;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_4;
    private JLabel lblTituloMoeda;
    private JLabel lblTituloPreferencias;
    private JLabel lblTituloGerenciamentoDePlano;
    private JLabel lblTituloAlertaLimite;
    private JLabel lblTituloGastos80;
    private JLabel lblTituloPagamentosMensais;
    private JLabel lblTituloLembreteContas;
    private JLabel lblTituloNotificaesAlertas;
    private JPanel panelBusca;
    private JLabel lblLogoMenu;
    
    
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

    /**
     * Construtor da JFrame principal.
     * Configura dimensões, centralização e inicializa os componentes de UI.
     */
    
    private JPanel telaIdentificacao() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(216, 216, 216));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel lblMsg = new JLabel("Bem-vindo! Qual o seu nome?");
        lblMsg.setFont(new Font("ABeeZee", Font.BOLD, 18));
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(lblMsg, gbc);

        JTextField txtNomeEntrada = new JTextField(15);
        gbc.gridy = 1;
        panel.add(txtNomeEntrada, gbc);

        JButton btnEntrar = new JButton("Entrar no Sistema");
        btnEntrar.setBackground(new Color(31, 33, 38));
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.addActionListener(e -> {
            if (!txtNomeEntrada.getText().trim().isEmpty()) {
                String nome = txtNomeEntrada.getText();
                lblUsuarioDash.setText(nome);
                lblUsuarioExtrato.setText(nome);
                lblUsuarioSaldo.setText(nome);
                cardLayout.show(panelTelas, "dashboard"); // Vai para o Dashboard
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira seu nome.");
            }
        });
        gbc.gridy = 2;
        panel.add(btnEntrar, gbc);

        return panel;
    }
    
    
    public Telas() {
    	    setTitle("Ca$h Hub");
    	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    setSize(897, 615);
    	    setLocationRelativeTo(null);
    	    
    	    this.contentPane = new JPanel();
    	    this.contentPane.setLayout(new BorderLayout());
    	    setContentPane(this.contentPane);

    	    menuLateral(); 
    	    telas();
    	}
   
    /**
     * Configuração do menu de navegação lateral.
     * Inclui lógica de responsividade para redimensionamento de botões e fontes.
     */
    private void menuLateral() {
    	
        panelLateral = new JPanel();
        panelLateral.setBackground(new Color(31, 33, 38));
        panelLateral.setPreferredSize(new Dimension(150, 0));
        panelLateral.setLayout(new BoxLayout(panelLateral, BoxLayout.Y_AXIS));
        
        ImageIcon iconLogo = new ImageIcon(
        	    getClass().getResource("/cashhub/view/imagens/logo com fundo e cor bege.png")
        	);
        	
        Image imgLogo = iconLogo.getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH);
        lblLogoMenu = new JLabel(new ImageIcon(imgLogo));
        lblLogoMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        	
        	
        
        btnDashboard = new JButton("Dashboard");
        btnDashboard.setFocusPainted(false);
        btnDashboard.setBackground(new Color(31, 33, 38));
        btnDashboard.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        btnDashboard.setForeground(new Color(216, 216, 216));
        btnDashboard.setPreferredSize(new Dimension(130, 32));
        btnDashboard.setMaximumSize(new Dimension(130, 32));
        btnDashboard.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnDashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        ImageIcon iconDashboard = new ImageIcon(
        	    getClass().getResource("/cashhub/view/imagens/dashboard.png")
        	);
        	Image imgDashboard = iconDashboard.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        btnDashboard.setIcon(new ImageIcon(imgDashboard));
        btnDashboard.setBorder(
        		BorderFactory.createCompoundBorder(
        				new LineBorder(new Color(216, 216, 216)),
        				BorderFactory.createEmptyBorder(0, 10, 0, 0)
        )
        );
        btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
        btnDashboard.setIconTextGap(10);
        
        btnDashboard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelTelas, "dashboard");
            }
        });
        
        // Listener de redimensionamento: Ajusta a largura do menu e escala botões/fontes proporcionalmente
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
        
        // Ajuste dinâmico de fontes para os labels de destaque do Dashboard
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent e) {

                int largura = getWidth();

                int fonte = largura / 25;

                if (fonte < 30) {
                    fonte = 30;
                }

                if (fonte > 60) {
                    fonte = 60;
                }

                lblTituloGanhosMes.setFont(new Font("ABeeZee", Font.PLAIN, fonte));
                lblTituloDespesasMes.setFont(new Font("ABeeZee", Font.PLAIN, fonte));

                lblValorGanhoMes.setFont(new Font("ABeeZee", Font.BOLD, fonte));
                lblDespesasMes.setFont(new Font("ABeeZee", Font.BOLD, fonte));
            }
        });

        btnExtrato = new JButton("Extrato");
        btnExtrato.setFocusPainted(false);
        btnExtrato.setBackground(new Color(31, 33, 38));
        btnExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        btnExtrato.setForeground(new Color(216, 216, 216));
        btnExtrato.setPreferredSize(new Dimension(130, 32));
        btnExtrato.setMaximumSize(new Dimension(130, 32));
        btnExtrato.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnExtrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ImageIcon iconExtrato = new ImageIcon(
        	    getClass().getResource("/cashhub/view/imagens/extrato.png")
        	);
        	Image imgExtrato = iconExtrato.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        btnExtrato.setIcon(new ImageIcon(imgExtrato));
        btnExtrato.setBorder(
        		BorderFactory.createCompoundBorder(
        				new LineBorder(new Color(216, 216, 216)),
        				BorderFactory.createEmptyBorder(0, 10, 0, 0)
        )
        );
        btnExtrato.setHorizontalAlignment(SwingConstants.LEFT);
        btnExtrato.setIconTextGap(10);
        btnExtrato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelTelas, "extrato");
            }
        });

        btnSaldo = new JButton("Saldo");
        btnSaldo.setFocusPainted(false);
        ImageIcon iconSaldo = new ImageIcon(
        	    getClass().getResource("/cashhub/view/imagens/saldo.png")
        	);
        	Image imgSaldo = iconSaldo.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        	btnSaldo.setIcon(new ImageIcon(imgSaldo));
        btnSaldo.setBorder(
        		BorderFactory.createCompoundBorder(
        				new LineBorder(new Color(216, 216, 216)),
        				BorderFactory.createEmptyBorder(0, 10, 0, 0)
        )
        );
        btnSaldo.setHorizontalAlignment(SwingConstants.LEFT);
        btnSaldo.setIconTextGap(10);        
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

    /**
     * Inicializa o container principal de telas utilizando CardLayout para navegação.
     */
    private void telas() {
    	cardLayout = new CardLayout();
        panelTelas = new JPanel(cardLayout);

        panelTelas.add(telaIdentificacao(), "identificacao"); 
        panelTelas.add(telaDashboard(), "dashboard");
        panelTelas.add(telaSaldo(), "cadastro");
        panelTelas.add(telaExtrato(), "extrato");

        contentPane.add(panelTelas, BorderLayout.CENTER);

        cardLayout.show(panelTelas, "identificacao"); 
    }

    /**
     * Monta a tela de Dashboard com balanço consolidado e resumo de transações.
     */
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

        lblUsuarioDash = new JLabel("Gustavo Dornellas");
        lblUsuarioDash.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        lblUsuarioDash.setForeground(new Color(31, 33, 38));
        panelPerfil.add(lblUsuarioDash);

        btnPerfil = new JButton();
        ImageIcon iconConfiguracao = new ImageIcon(
            getClass().getResource("/cashhub/view/imagens/configuracoes.png")
        );
        Image imgConfiguracao = iconConfiguracao.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        btnPerfil.setIcon(new ImageIcon(imgConfiguracao));
        btnPerfil.setFocusPainted(false);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        btnAlterarSaldo.setFocusPainted(false);
        btnAlterarSaldo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                    cardLayout.show(panelTelas, "cadastro");
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
        btnVisualizarExtratoCompleto.setFocusPainted(false);
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
		
        LocalDate hoje = LocalDate.now();
        
        
        atualizarDashboard();
        
        panelTransacoes.add(panelListaTransacoes, BorderLayout.CENTER);

        panelCorpo.add(panelTransacoes, BorderLayout.SOUTH);

        panelDashboard.add(panelCorpo, BorderLayout.CENTER);
        
        return panelDashboard;
    }

    /**
     * Monta a tela de Extrato com histórico completo e painel lateral de pagamentos mensais.
     */
    private JPanel telaExtrato() {
        panelExtrato = new JPanel(new BorderLayout());
        panelExtrato.setBackground(new Color(216, 216, 216));

        panelCabecalho = new JPanel(new BorderLayout());
        panelCabecalho.setBackground(new Color(216, 216, 216));
        panelCabecalho.setBorder(BorderFactory.createEmptyBorder(15, 25, 10, 25));

        panelBusca = new JPanel(new BorderLayout(20, 0));
        panelBusca.setBackground(new Color(216, 216, 216));

        lblLogo = new JLabel("CA$H HUB");
        lblLogo.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblLogo.setForeground(new Color(31, 33, 38));

        JPanel panelCampoBusca = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelCampoBusca.setBackground(new Color(216, 216, 216));

        txtBuscaCategoria = new JTextField();
        txtBuscaCategoria.setText("Filtrar por categoria");
        txtBuscaCategoria.setBackground(Color.WHITE);
        txtBuscaCategoria.setForeground(Color.GRAY);
        txtBuscaCategoria.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        txtBuscaCategoria.setPreferredSize(new Dimension(220, 28));

        txtBuscaCategoria.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (txtBuscaCategoria.getText().equals("Filtrar por categoria")) {
                    txtBuscaCategoria.setText("");
                    txtBuscaCategoria.setForeground(new Color(31, 33, 38));
                }
            }

            public void focusLost(FocusEvent e) {
                if (txtBuscaCategoria.getText().isEmpty()) {
                    txtBuscaCategoria.setText("Filtrar por categoria");
                    txtBuscaCategoria.setForeground(Color.GRAY);
                }
            }
        });

        txtBuscaCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carregarTabela();
            }
        });

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent e) {

                int larguraBusca = getWidth() / 5;

                if (larguraBusca < 180) {
                    larguraBusca = 180;
                }

                if (larguraBusca > 350) {
                    larguraBusca = 350;
                }

                txtBuscaCategoria.setPreferredSize(new Dimension(larguraBusca, 28));

                txtBuscaCategoria.revalidate();
                txtBuscaCategoria.repaint();
            }
        });

        panelCampoBusca.add(txtBuscaCategoria);

        panelBusca.add(lblLogo, BorderLayout.WEST);

        panelBusca.add(panelCampoBusca, BorderLayout.CENTER);

        panelPerfil = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        panelPerfil.setBackground(new Color(216, 216, 216));

        lblUsuarioExtrato = new JLabel("Gustavo Dornellas");
        lblUsuarioExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        lblUsuarioExtrato.setForeground(new Color(31, 33, 38));

        btnPerfil = new JButton();

        ImageIcon iconConfiguracao = new ImageIcon(
            getClass().getResource("/cashhub/view/imagens/configuracoes.png")
        );

        Image imgConfiguracao = iconConfiguracao.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);

        btnPerfil.setIcon(new ImageIcon(imgConfiguracao));
        btnPerfil.setFocusPainted(false);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btnPerfil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                configuracaoPopup();
            }
        });

        panelPerfil.add(lblUsuarioExtrato);
        panelPerfil.add(btnPerfil);

        panelCabecalho.add(panelBusca, BorderLayout.CENTER);

        panelCabecalho.add(panelPerfil, BorderLayout.EAST);

        panelExtrato.add(panelCabecalho, BorderLayout.NORTH);
        panelPrincipalExtrato = new JPanel(new BorderLayout(15, 0));
        panelPrincipalExtrato.setBackground(new Color(216, 216, 216));
        panelPrincipalExtrato.setBorder(BorderFactory.createEmptyBorder(5, 25, 25, 25));

        JPanel panelCentroExtrato = new JPanel(new BorderLayout(0, 15));
        panelCentroExtrato.setBackground(new Color(216, 216, 216));

        JPanel panelTitulo = new JPanel(new BorderLayout());
        panelTitulo.setBackground(new Color(216, 216, 216));
        lblTituloExtrato = new JLabel("Histórico de Transações");
        lblTituloExtrato.setForeground(new Color(31, 33, 38));
        lblTituloExtrato.setFont(new Font("ABeeZee", Font.BOLD, 30));
        lblSubtituloExtrato = new JLabel("Acompanhe todas as entradas e saídas registradas.");
        lblSubtituloExtrato.setForeground(new Color(31, 33, 38));
        lblSubtituloExtrato.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        panelTitulo.add(lblTituloExtrato, BorderLayout.NORTH);
        panelTitulo.add(lblSubtituloExtrato, BorderLayout.SOUTH);
        panelCentroExtrato.add(panelTitulo, BorderLayout.NORTH);

        String[] colunas = { "Data", "Categoria", "Descrição", "Tipo", "Valor" };
        table = new JTable(new DefaultTableModel(colunas, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        });
        table.setRowHeight(38);
        table.getTableHeader().setBackground(new Color(31, 33, 38));
        table.getTableHeader().setForeground(Color.WHITE);
        table.getColumnModel().getColumn(3).setCellRenderer(new TipoRenderer());
        table.getColumnModel().getColumn(4).setCellRenderer(new ValorRenderer());
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);

        table.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        table.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        table.getColumnModel().getColumn(2).setCellRenderer(centralizado);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setFont(new Font("ABeeZee", Font.PLAIN, 11));
        panelCentroExtrato.add(scrollPane, BorderLayout.CENTER);

        panelAcoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelAcoes.setBackground(new Color(216, 216, 216));
        btnEditar = new JButton("Editar");
        btnEditar.setBackground(new Color(255, 255, 255));
        btnEditar.setFont(new Font("ABeeZee", Font.PLAIN, 12));
        
        // Lógica de Edição: Abre diálogo para alteração de atributos do objeto Gasto selecionado
        btnEditar.addActionListener(e -> {
            int linhaSelecionada = table.getSelectedRow();

            if (linhaSelecionada != -1) {
                int modelIndex = table.convertRowIndexToModel(linhaSelecionada);
                Gasto gastoExistente = Repositorio.getLista().get(modelIndex);

                JTextField editDesc = new JTextField(gastoExistente.getDescricao());
                JTextField editValor = new JTextField(String.valueOf(Math.abs(gastoExistente.getValor())));
                
                String dataFormatada = String.format("%02d/%02d/%d", gastoExistente.getDia(), gastoExistente.getMes(), gastoExistente.getAno());
                JTextField editData = new JTextField(dataFormatada);

                String[] categoriasParaEditar = {
                			    "💰 Renda", 
                			    "🗓️ Agendado", 
                			    "🍴 Alimentação", 
                			    "📚 Educação", 
                			    "❤️ Autocuidado", 
                			    "🚗 Transporte", 
                			    "🎭 Lazer", 
                			    "🏥 Saúde", 
                			    "✈️ Viagens", 
                			    "🐾 Pets", 
                			    "🔧 Manutenção", 
                			    "🏠 Moradia", 
                			    "⚙️ Outros"
                			};
         
                JComboBox<String> editCat = new JComboBox<>(new DefaultComboBoxModel<>(categoriasParaEditar));
                
                if (gastoExistente.getCategoria() != null) {
                    editCat.setSelectedItem(gastoExistente.getCategoria().getNome());
                } else {
                    editCat.setSelectedItem("Outros");
                }

                panelEdicao = new JPanel(new GridLayout(0, 1, 5, 5));
                panelEdicao.add(new JLabel("Descrição:"));
                panelEdicao.add(editDesc);
                panelEdicao.add(new JLabel("Valor (R$):"));
                panelEdicao.add(editValor);
                panelEdicao.add(new JLabel("Data (DD/MM/AAAA):"));
                panelEdicao.add(editData);
                panelEdicao.add(new JLabel("Categoria:"));
                panelEdicao.add(editCat);

                int result = JOptionPane.showConfirmDialog(null, panelEdicao, 
                        "Editar Transação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                	try {
                	    String novaDesc = editDesc.getText();
                	    double novoValorAbsoluto = Double.parseDouble(editValor.getText().replace(",", "."));
                	    String novaCatNome = (String) editCat.getSelectedItem();

                	    /**
                	     * Aplicação da Regra de Negócio: Lógica de Sinais Financeiros[cite: 272].
                	     * O sistema define que apenas a categoria "Renda" representa uma Entrada (valor positivo). 
                	     * Todas as demais classificações são tratadas como Saída (valor negativo), 
                	     * garantindo a consistência do balanço mensal[cite: 272, 311].
                	     */
                	    if (novaCatNome.equals("💰 Renda")) {
                	        // Define o valor como positivo para entradas de capital
                	        gastoExistente.setValor(Math.abs(novoValorAbsoluto));
                	    } else {
                	        // Define o valor como negativo para todas as outras categorias de despesa
                	        gastoExistente.setValor(Math.abs(novoValorAbsoluto) * -1);
                	    }

                	    // Sincronização dos dados do objeto com os campos da interface gráfica
                	    gastoExistente.setDescricao(novaDesc);
                	    String[] partesData = editData.getText().split("/");
                	    gastoExistente.setDia(Integer.parseInt(partesData[0]));
                	    gastoExistente.setMes(Integer.parseInt(partesData[1]));
                	    gastoExistente.setAno(Integer.parseInt(partesData[2]));
                	    gastoExistente.setCategoria(new cashhub.model.Categoria(0, novaCatNome));

                	    /**
                	     * Atualização da Interface Semafórica[cite: 51, 242].
                	     * Recarrega a tabela e o dashboard para refletir a mudança de tipo (Entrada/Saída)
                	     * e a sinalização por cores instantaneamente em todos os painéis[cite: 382].
                	     */
                	    carregarTabela();      
                	    atualizarDashboard();  
                	    
                	    JOptionPane.showMessageDialog(null, "Transação atualizada com sucesso!");

                	} catch (Exception ex) {
                	    /**
                	     * Tratamento de exceções para garantir a estabilidade do sistema contra
                	     * erros de entrada de dados ou formatação numérica[cite: 380, 418].
                	     */
                	    JOptionPane.showMessageDialog(null, "Erro ao salvar edição: " + ex.getMessage());
                	}
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma linha para editar.");
            }
        });
        	
        btnExcluir = new JButton("Excluir");
        btnExcluir.setFocusPainted(false);
        btnExcluir.setFont(new Font("ABeeZee", Font.PLAIN, 12));
        
        // Remoção lógica: Filtra a lista do repositório para remover o item que corresponde aos critérios
        btnExcluir.addActionListener(e -> {
        	int linhaSelecionada = table.getSelectedRow();

            if (linhaSelecionada != -1) {
                String dataTabela = table.getValueAt(linhaSelecionada, 0).toString();
                String descTabela = table.getValueAt(linhaSelecionada, 2).toString();

                int confirmacao = JOptionPane.showConfirmDialog(null, 
                        "Deseja excluir: " + descTabela + "?", 
                        "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);

                if (confirmacao == JOptionPane.YES_OPTION) {
                    
                    Repositorio.getLista().removeIf(g -> 
                        !g.isAgendado() && 
                        g.getDescricao().equals(descTabela) &&
                        String.format("%02d/%02d/%d", g.getDia(), g.getMes(), g.getAno()).equals(dataTabela)
                    );

                    carregarTabela();      
                    atualizarDashboard(); 
                    
                    JOptionPane.showMessageDialog(null, "Registro removido!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma transação no histórico.");
            }
        });
        btnExcluir.setBackground(new Color(149, 0, 0));
        btnExcluir.setForeground(Color.WHITE);
        panelAcoes.add(btnEditar);
        panelAcoes.add(btnExcluir);
        panelCentroExtrato.add(panelAcoes, BorderLayout.SOUTH);

        panelLadoDireito = new JPanel(new GridLayout(2, 1, 0, 15));
        panelLadoDireito.setBackground(new Color(216, 216, 216));
        panelLadoDireito.setPreferredSize(new Dimension(230, 0));

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

        panelPagamentos = new JPanel(new BorderLayout());
        panelPagamentos.setBackground(new Color(31, 33, 38));
        panelPagamentos.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        modeloPagamentos = new DefaultTableModel(new String[]{"Data", "Descrição", "Valor", "Status"}, 0) {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tablePagamentos = new JTable(modeloPagamentos);
        
        tablePagamentos.getColumnModel().getColumn(0).setPreferredWidth(75);
        tablePagamentos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablePagamentos.getColumnModel().getColumn(2).setPreferredWidth(70);
        tablePagamentos.getColumnModel().getColumn(3).setPreferredWidth(70);

        tablePagamentos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
        tablePagamentos.setFillsViewportHeight(true);        
        tablePagamentos.setBackground(new Color(45, 47, 52));
        tablePagamentos.setForeground(Color.WHITE);
        
        // Renderizador dinâmico para a tabela de pagamentos: Altera cores com base na proximidade do vencimento
        tablePagamentos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, 
                    boolean isSelected, boolean hasFocus, int row, int column) {
                
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                try {
                    String dataStr = table.getValueAt(row, 0).toString();
                    String[] p = dataStr.split("/");
                    LocalDate vencimento = LocalDate.of(Integer.parseInt(p[2]), Integer.parseInt(p[1]), Integer.parseInt(p[0]));
                    LocalDate hoje = LocalDate.now();

                    if (vencimento.isBefore(hoje)) {
                        c.setForeground(new Color(255, 100, 100));
                        if (column == 3) value = "Vencido"; 
                    } else if (vencimento.isBefore(hoje.plusDays(5))) {
                        c.setForeground(new Color(255, 200, 50));
                        if (column == 3) value = "Urgente";
                    } else {
                        c.setForeground(new Color(100, 200, 255));
                        if (column == 3) value = "Em dia";
                    }

                    c.setBackground(new Color(45, 47, 52));
                    
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
        
        tablePagamentos.getColumnModel().getColumn(0).setPreferredWidth(80);
        tablePagamentos.getColumnModel().getColumn(1).setPreferredWidth(120);

        panelTextoPagamentos = new JPanel(new GridLayout(2, 1));
        panelTextoPagamentos.setBackground(new Color(31, 33, 38));
        lblTituloPagamentosFuturos = new JLabel("Pagamentos Futuros");
        lblTituloPagamentosFuturos.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        lblTituloPagamentosFuturos.setForeground(Color.WHITE);
        lblPagamentosDesc = new JLabel("Gerencie seus pagamentos");
        lblPagamentosDesc.setFont(new Font("ABeeZee", Font.PLAIN, 11));
        lblPagamentosDesc.setForeground(Color.GRAY);
        panelTextoPagamentos.add(lblTituloPagamentosFuturos);
        panelTextoPagamentos.add(lblPagamentosDesc);

        btnPagarAgora = new JButton("Pagar agora");
        btnPagarAgora.setForeground(new Color(31, 33, 38));
        btnPagarAgora.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        btnPagarAgora.setBackground(new Color(255, 255, 255));
        
        // Efetivação de pagamento: Transforma um registro Agendado em um Gasto efetivo
        btnPagarAgora.addActionListener(e -> {
            int linha = tablePagamentos.getSelectedRow();
            
            if (linha != -1) {
                String desc = tablePagamentos.getValueAt(linha, 1).toString();
                
                int resposta = JOptionPane.showConfirmDialog(null, 
                        "Deseja marcar '" + desc + "' como pago?", 
                        "Confirmar Pagamento", JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.YES_OPTION) {
                    for (Gasto g : Repositorio.getLista()) {
                        if (g.getDescricao().equals(desc) && g.isAgendado()) {
                            g.setAgendado(false);
                            g.setPago(true);
                            break;
                        }
                    }
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
        panelPagamentos.add(btnPagarAgora, BorderLayout.SOUTH);

        panelLadoDireito.add(panelBalanco);
        panelLadoDireito.add(panelPagamentos);

        panelPrincipalExtrato.add(panelCentroExtrato, BorderLayout.CENTER);
        panelPrincipalExtrato.add(panelLadoDireito, BorderLayout.EAST);
        panelExtrato.add(panelPrincipalExtrato, BorderLayout.CENTER);

        carregarTabela();
        return panelExtrato;
    }
    
    /**
     * Monta a tela de Cadastro de novos registros (Saldo).
     * Inclui tratamento de placeholders e lógica de negócio para diferenciação entre Entradas e Saídas.
     */
    private JPanel telaSaldo() {
        panelSaldo = new JPanel(new BorderLayout());
        panelSaldo.setBackground(new Color(216, 216, 216));

        panelCabecalho = new JPanel(new BorderLayout());
        panelCabecalho.setBackground(new Color(216, 216, 216));
        panelCabecalho.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));

        lblLogo = new JLabel("CA$H HUB");
        lblLogo.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblLogo.setForeground(new Color(31, 33, 38));

        lblUsuarioSaldo = new JLabel("Gustavo Dornellas");
        lblUsuarioSaldo.setFont(new Font("ABeeZee", Font.PLAIN, 14));
        lblUsuarioSaldo.setForeground(new Color(31, 33, 38));

        btnPerfil = new JButton();
        ImageIcon iconConfiguracao = new ImageIcon(getClass().getResource("/cashhub/view/imagens/configuracoes.png"));
        Image imgConfiguracao = iconConfiguracao.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        btnPerfil.setIcon(new ImageIcon(imgConfiguracao));
        btnPerfil.setFocusPainted(false);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnPerfil.addActionListener(e -> configuracaoPopup());

       
        panelPerfil = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        panelPerfil.setBackground(new Color(216, 216, 216));
        panelPerfil.add(lblUsuarioSaldo);
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

        panelFormulario = new JPanel(new GridLayout(10, 1, 0, 8));
        panelFormulario.setBackground(new Color(216, 216, 216));
        
        panelTipo = new JPanel(new GridLayout(1, 3, 20, 0));
        panelTipo.setBackground(new Color(216, 216, 216));

        btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setFocusPainted(false);
        btnAdicionar.setBackground(new Color(0, 128, 0));
        btnAdicionar.setForeground(Color.WHITE);

        btnRetirar = new JButton("Retirar");
        btnRetirar.setFocusPainted(false);
        btnRetirar.setBackground(new Color(149, 0, 0));
        btnRetirar.setForeground(Color.WHITE);

        btnPagamentoFuturo = new JButton("Pagamento Futuro");
        btnPagamentoFuturo.setFocusPainted(false);
        btnPagamentoFuturo.setForeground(Color.WHITE);
        btnPagamentoFuturo.setBackground(new Color(0, 112, 127));

        panelTipo.add(btnAdicionar);
        panelTipo.add(btnRetirar);
        panelTipo.add(btnPagamentoFuturo);

        txtValor = new JTextField("EX: R$ 2000");
        txtValor.setFont(new Font("ABeeZee", Font.PLAIN, 15));
        txtValor.setForeground(new Color(216, 216, 216));
        txtValor.setBorder(null);

        txtData = new JTextField("EX: 22/04/2026");
        txtData.setFont(new Font("ABeeZee", Font.PLAIN, 15));
        txtData.setForeground(new Color(216, 216, 216));
        txtData.setBorder(null);

        String[] categorias = {"💰 Renda", "🗓️ Agendado", "🍴 Alimentação", "📚 Educação", "❤️ Autocuidado", "🚗 Transporte", "🎭 Lazer", "🏥 Saúde", "✈️ Viagens", "🐾 Pets", "🔧 Manutenção", "🏠 Moradia", "⚙️ Outros"};
        listaCategoria = new JComboBox<>(new DefaultComboBoxModel<>(categorias));
        listaCategoria.setBackground(Color.WHITE);
        listaCategoria.setFont(new Font("ABeeZee", Font.PLAIN, 15));
        listaCategoria.setBorder(null);

        txtDescricao = new JTextArea();

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

        btnAdicionar.addActionListener(e -> {
            ehDespesa = false; ehPagamentoFuturo = false;
            txtValor.setForeground(new Color(140, 170, 140));
            listaCategoria.setSelectedItem("💰 Renda");
        });
        btnRetirar.addActionListener(e -> {
            ehDespesa = true; ehPagamentoFuturo = false;
            txtValor.setForeground(new Color(170, 140, 140));
            listaCategoria.setSelectedItem("⚙️ Outros");
        });
        btnPagamentoFuturo.addActionListener(e -> {
            ehDespesa = true; ehPagamentoFuturo = true;
            txtValor.setForeground(new Color(0, 112, 127));
            listaCategoria.setSelectedItem("🗓️ Agendado");
        });

        panelFormulario.add(new JLabel("Tipo de Transação"));
        panelFormulario.add(panelTipo);
        panelFormulario.add(new JLabel("Valor:"));
        panelFormulario.add(txtValor);
        panelFormulario.add(new JLabel("Data:"));
        panelFormulario.add(txtData);
        panelFormulario.add(new JLabel("Categoria:"));
        panelFormulario.add(listaCategoria);
        panelFormulario.add(new JLabel("Descrição:"));
        panelFormulario.add(new JScrollPane(txtDescricao));

        panelRegistro.add(panelFormulario, BorderLayout.CENTER);

        panelBotoes = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        panelBotoes.setBackground(new Color(216, 216, 216));

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setFocusPainted(false);
        btnCancelar.setFont(new Font("ABeeZee", Font.PLAIN, 11));
        btnCancelar.setPreferredSize(new Dimension(100, 30));
        btnCancelar.setBackground(new Color(73, 73, 73));
        btnCancelar.setForeground(Color.WHITE);
        
        btnSalvar = new JButton("Salvar Transação");
        btnSalvar.setFocusPainted(false);
        btnSalvar.setFont(new Font("ABeeZee", Font.PLAIN, 11));
        btnSalvar.setPreferredSize(new Dimension(170, 30));
        btnSalvar.setBackground(new Color(31, 33, 38));
        btnSalvar.setForeground(Color.WHITE);

        // Ação de Salvar: Valida inputs e instancia novo objeto Gasto para o Repositório
        btnSalvar.addActionListener(e -> {
            try {
                String desc = txtDescricao.getText();
                String catSel = (String) listaCategoria.getSelectedItem();
                
                // Tratamento do texto para número
                String valorTexto = txtValor.getText().replace("R$", "").replace(" ", "").replace(",", ".");
                double valor = Double.parseDouble(valorTexto);

                // --- VALIDAÇÃO DA REGRA DE NEGÓCIO (Integridade de Registro) ---
                if (valor == 0) {
                    JOptionPane.showMessageDialog(null, "O valor da transação não pode ser zero.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return; // Interrompe o método e não salva
                }
                // ---------------------------------------------------------------

                if (ehDespesa) valor = Math.abs(valor) * -1;

                String[] p = txtData.getText().split("/");
                if (p.length != 3) throw new Exception("Formato de data inválido!");
                
                // Criação do objeto com os dados validados
                Gasto novo = new Gasto(0, valor, desc, Integer.parseInt(p[2]), Integer.parseInt(p[1]), Integer.parseInt(p[0]), new cashhub.model.Categoria(0, catSel), false);
                novo.setAgendado(ehPagamentoFuturo);
                
                // Persistência e atualização da View
                Repositorio.salvar(novo);
                atualizarDashboard(); 
                carregarTabela();

                JOptionPane.showMessageDialog(null, "Registro de '" + catSel + "' salvo com sucesso!", "Ca$h Hub", JOptionPane.INFORMATION_MESSAGE);

                // Retorno automático para a tela principal
                cardLayout.show(panelTelas, "dashboard");
                
                // Limpeza dos campos (Reset para o estado inicial)
                txtValor.setText("EX: R$ 2000");
                txtValor.setForeground(new Color(216, 216, 216));
                txtData.setText("EX: 22/04/2026");
                txtData.setForeground(new Color(216, 216, 216));
                txtDescricao.setText("");
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, insira apenas números no campo Valor.", "Erro de Formatação", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
            }
        });

        panelBotoes.add(btnCancelar);
        panelBotoes.add(btnSalvar);
        panelRegistro.add(panelBotoes, BorderLayout.SOUTH);
        panelCorpo.add(panelRegistro, BorderLayout.CENTER);
        panelSaldo.add(panelCorpo, BorderLayout.CENTER);
        
        btnCancelar.addActionListener(e -> {
            txtValor.setText("EX: R$ 2000");
            txtValor.setForeground(new Color(216, 216, 216));
            
            txtData.setText("EX: 22/04/2026");
            txtData.setForeground(new Color(216, 216, 216));
            
            txtDescricao.setText("");
            
            if (listaCategoria != null) {
                listaCategoria.setSelectedIndex(0);
            }

            ehDespesa = false;
            ehPagamentoFuturo = false;
        });

        return panelSaldo;
    }
    
    /**
     * Inicializa o JDialog de configurações para edição de perfil e preferências do usuário.
     */
    private void configuracaoPopup() {
        dialogConfiguracao = new JDialog(this, "Configurações", true);
        dialogConfiguracao.setSize(383, 511);
        dialogConfiguracao.setLocationRelativeTo(this);
        dialogConfiguracao.setResizable(false);

        contentPaneConfiguracao = new JPanel();
        contentPaneConfiguracao.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPaneConfiguracao.setBackground(new Color(216, 216, 216));
        contentPaneConfiguracao.setLayout(null);
        dialogConfiguracao.setContentPane(contentPaneConfiguracao);
        
        panelCabecalhoConfig = new JPanel();
        panelCabecalhoConfig.setBounds(0, 0, 375, 116);
        panelCabecalhoConfig.setLayout(null);
        contentPaneConfiguracao.add(panelCabecalhoConfig);
        
       
        
        txtEditarNome = new JTextField(lblUsuarioDash.getText());
        txtEditarNome.setFont(new Font("ABeeZee", Font.PLAIN, 21));
        txtEditarNome.setBounds(121, 35, 200, 30);
        panelCabecalhoConfig.add(txtEditarNome);
        
        btnSalvarNome = new JButton("Salvar Nome");
        btnSalvarNome.setFocusPainted(false);
        btnSalvarNome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSalvarNome.setBounds(121, 75, 110, 25);
        btnSalvarNome.setFont(new Font("ABeeZee", Font.PLAIN, 11));
        btnSalvarNome.setBackground(new Color(31, 33, 38));
        btnSalvarNome.setForeground(Color.WHITE);
        btnSalvarNome.addActionListener(e -> {
            String novoNome = txtEditarNome.getText();
            if (!novoNome.trim().isEmpty()) {
                if (lblUsuarioDash != null) lblUsuarioDash.setText(novoNome);
                if (lblUsuarioExtrato != null) lblUsuarioExtrato.setText(novoNome);
                if (lblUsuarioSaldo != null) lblUsuarioSaldo.setText(novoNome);
                
                JOptionPane.showMessageDialog(dialogConfiguracao, "Nome atualizado!");
            }
        });
        panelCabecalhoConfig.add(btnSalvarNome);       

        panelPerfil = new JPanel();
        panelPerfil.setBorder(new LineBorder(new Color(31, 33, 38)));
        panelPerfil.setBackground(new Color(216, 216, 216));
        panelPerfil.setBounds(-2, -5, 375, 116);
        panelPerfil.setLayout(null);
        contentPaneConfiguracao.add(panelPerfil);

        lblTituloNomeConta = new JLabel("Gustavo Dornellas");
        lblTituloNomeConta.setFont(new Font("ABeeZee", Font.PLAIN, 21));
        lblTituloNomeConta.setBounds(121, 35, 183, 19);
        panelPerfil.add(lblTituloNomeConta);

        lblTituloMembro = new JLabel("Membro desde fev 2026");
        lblTituloMembro.setForeground(Color.GRAY);
        lblTituloMembro.setFont(new Font("ABeeZee", Font.PLAIN, 12));
        lblTituloMembro.setBounds(121, 57, 183, 14);
        panelPerfil.add(lblTituloMembro);

        btnVoltar = new JButton();
        btnVoltar.setBounds(10, 11, 25, 25);
        btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ImageIcon iconVoltar = new ImageIcon(
                getClass().getResource("/cashhub/view/imagens/seta-esquerda.png")
            );
            Image imgVoltar = iconVoltar.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
            btnVoltar.setIcon(new ImageIcon(imgVoltar));
            btnVoltar.setFocusPainted(false);
            btnVoltar.setBorderPainted(false);
            btnVoltar.setContentAreaFilled(false);
            btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogConfiguracao.dispose();
            }
        });
        panelPerfil.add(btnVoltar);

        panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        panel_1.setBackground(new Color(216, 216, 216));
        panel_1.setBounds(3, 110, 367, 362);
        contentPaneConfiguracao.add(panel_1);

        lblTituloPreferencias = new JLabel("Preferências do Usuário");
        lblTituloPreferencias.setForeground(new Color(31, 33, 38));
        lblTituloPreferencias.setFont(new Font("ABeeZee", Font.BOLD, 15));
        lblTituloPreferencias.setBounds(10, 23, 205, 14);
        panel_1.add(lblTituloPreferencias);

        panel_3 = new JPanel();
        panel_3.setBackground(new Color(216, 216, 216));
        panel_3.setBounds(10, 48, 347, 68);
        panel_1.add(panel_3);
        panel_3.setLayout(null);

        lblTituloMoeda = new JLabel("Moeda Base");
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

        panel_2 = new JPanel();
        panel_2.setBackground(new Color(216, 216, 216));
        panel_2.setBounds(10, 132, 347, 99);
        panel_1.add(panel_2);
        panel_2.setLayout(null);

        lblTituloNotificaesAlertas = new JLabel("Notificações & Alertas");
        lblTituloNotificaesAlertas.setBounds(10, 11, 167, 18);
        lblTituloNotificaesAlertas.setForeground(new Color(31, 33, 38));
        lblTituloNotificaesAlertas.setFont(new Font("ABeeZee", Font.BOLD, 15));
        panel_2.add(lblTituloNotificaesAlertas);

        lblTituloLembreteContas = new JLabel("Lembrete de contas");
        lblTituloLembreteContas.setForeground(new Color(31, 33, 38));
        lblTituloLembreteContas.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        lblTituloLembreteContas.setBounds(10, 37, 132, 14);
        panel_2.add(lblTituloLembreteContas);

        lblTituloPagamentosMensais = new JLabel("Notifique pagamentos mensais");
        lblTituloPagamentosMensais.setFont(new Font("ABeeZee", Font.PLAIN, 11));
        lblTituloPagamentosMensais.setForeground(Color.GRAY);
        lblTituloPagamentosMensais.setBounds(10, 51, 202, 14);
        panel_2.add(lblTituloPagamentosMensais);

        checkbxLembrete = new JCheckBox("");
        checkbxLembrete.setBackground(new Color(216, 216, 216));
        checkbxLembrete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        checkbxLembrete.setBounds(307, 37, 23, 23);
        checkbxLembrete.setSelected(true);
        panel_2.add(checkbxLembrete);

        lblTituloAlertaLimite = new JLabel("Alerta de limite de orçamento");
        lblTituloAlertaLimite.setForeground(new Color(31, 33, 38));
        lblTituloAlertaLimite.setFont(new Font("ABeeZee", Font.PLAIN, 13));
        lblTituloAlertaLimite.setBounds(10, 71, 187, 14);
        panel_2.add(lblTituloAlertaLimite);

        lblTituloGastos80 = new JLabel("Notifique quando gastos excederem 80%");
        lblTituloGastos80.setForeground(Color.GRAY);
        lblTituloGastos80.setFont(new Font("ABeeZee", Font.PLAIN, 11));
        lblTituloGastos80.setBounds(10, 85, 223, 14);
        panel_2.add(lblTituloGastos80);

        checkbxLimite = new JCheckBox("");
        checkbxLimite.setBackground(new Color(216, 216, 216));
        checkbxLimite.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        checkbxLimite.setBounds(307, 67, 23, 23);
        panel_2.add(checkbxLimite);

        panel_4 = new JPanel();
        panel_4.setBackground(new Color(216, 216, 216));
        panel_4.setBounds(10, 242, 347, 109);
        panel_1.add(panel_4);
        panel_4.setLayout(null);

        lblTituloGerenciamentoDePlano = new JLabel("Gerenciamento de Plano");
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
    
    /**
     * Sincroniza os componentes do Dashboard com os dados calculados pelo Repositório.
     */
    public void atualizarDashboard() {
		double ganhos = Repositorio.calcularTotalGanhos();
		lblValorGanhoMes.setText(String.format("R$ %.2f", ganhos));
		
	    double despesas = Repositorio.calcularTotalDespesas();
	    lblDespesasMes.setText(String.format("R$ %.2f", despesas));
	    
	    double saldoFinal = ganhos - despesas;
	    txtR.setText(String.format("R$ %.2f", saldoFinal));
	    
	    Gasto ultimoGanho = Repositorio.getUltimoGanho();
	    if (ultimoGanho != null) {
	        lblTransacoes1.setText(ultimoGanho.getDescricao());
	        lblValorTransacao1.setText(String.format("R$ %.2f", ultimoGanho.getValor()));
	    } else {
	        lblTransacoes1.setText("Nenhum ganho registrado");
	        lblValorTransacao1.setText("R$ 0,00");
	    }

	    Gasto ultimaDespesa = Repositorio.getUltimaDespesa();
	    if (ultimaDespesa != null) {
	        lblTransacoes2.setText(ultimaDespesa.getDescricao());
	        lblValorTransacao2.setText(String.format("R$ %.2f", Math.abs(ultimaDespesa.getValor())));
	    } else {
	        lblTransacoes2.setText("Nenhuma despesa registrada");
	        lblValorTransacao2.setText("R$ 0,00");
	    }
	}
   
	
	/**
	 * Varre o repositório em busca de gastos com status de atraso ou vencimento iminente.
	 * Dispara JOptionPanes informativos para o usuário.
	 */
	private void verificarAlertasDeVencimento() {
		LocalDate hoje = LocalDate.now();
		if (Repositorio.getLista() == null || Repositorio.getLista().isEmpty()) {
			return;
		}

		for (Gasto g : Repositorio.getLista()) {
			String status = g.identificarStatus(hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear());

	        if (status.equals("Vencido") || status.equals("Vence Hoje")) {
	            JOptionPane.showMessageDialog(this,
	                "ALERTA: '" + g.getDescricao() + "' " + status + "!",
	                "Sistema de Alertas Ca$h Hub",
	                JOptionPane.WARNING_MESSAGE);
	        }
	    }
	}	
	
	/**
	 * Preenche a JTable de histórico com dados do repositório.
	 * Aplica filtros de busca por categoria e atualiza labels de balanço do extrato.
	 */
	public void carregarTabela() {
	    DefaultTableModel modelo = (DefaultTableModel) table.getModel();
	    modelo.setRowCount(0);

	    String busca = "";

	    if (txtBuscaCategoria != null && !txtBuscaCategoria.getText().equals("Filtrar por categoria")) {
	        busca = txtBuscaCategoria.getText().toLowerCase();
	    }
	    for (Gasto g : Repositorio.getLista()) {
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

	    double ganhos = Repositorio.calcularTotalGanhos(); 
	    double despesas = Repositorio.calcularTotalDespesas();  
	    double saldoTotal = ganhos - despesas; 

	    lblValorGanhoMesExtrato.setText(String.format("R$ %.2f", ganhos)); 
	    lblDespesasMesExtrato.setText(String.format("R$ %.2f", despesas)); 
	    txtRExtrato.setText(String.format("R$ %.2f", saldoTotal)); 
	    
	    carregarTabelaPagamentos();
	}

	/**
	 * Preenche a JTable lateral de pagamentos agendados.
	 */
	public void carregarTabelaPagamentos() {
	    if (modeloPagamentos == null) return;
	    modeloPagamentos.setRowCount(0);
	    
	    LocalDate hoje = LocalDate.now();

	    for (Gasto g : Repositorio.getLista()) {
	        if (g.isAgendado()) {
	        	String statusReal = g.identificarStatus(hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear());
	        	
	            modeloPagamentos.addRow(new Object[] {
	                String.format("%02d/%02d/%d", g.getDia(), g.getMes(), g.getAno()),
	                g.getDescricao(),
	                String.format("R$ %.2f", Math.abs(g.getValor())),
	                statusReal
	            });
	        }
	    }
	}
	
	/**
	 * Renderizador customizado para a coluna 'Tipo'.
	 * Aplica coloração semafórica (Verde/Vermelho).
	 */
	class TipoRenderer extends DefaultTableCellRenderer {
   		 @Override
    		public Component getTableCellRendererComponent(JTable table, Object value, 
          		  boolean isSelected, boolean hasFocus, int row, int column) {
        		super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        		setHorizontalAlignment(CENTER);
        
       		 String tipo = value == null ? "" : value.toString();
       		 if ("Entrada".equalsIgnoreCase(tipo)) {
            setForeground(new Color(34, 139, 34));
       		 } else {
            setForeground(new Color(200, 30, 30));
       		 }
      		  return this;
    		}
	}		
	
	/**
	 * Renderizador customizado para a coluna 'Valor'.
	 * Segue a coloração definida pela coluna 'Tipo'.
	 */
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