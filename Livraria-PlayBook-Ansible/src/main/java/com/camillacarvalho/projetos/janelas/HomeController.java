package com.camillacarvalho.projetos.janelas;

import com.camillacarvalho.projetos.Projeto;
import com.camillacarvalho.projetos.entidades.Categoria;
import com.camillacarvalho.projetos.entidades.Emprestimo;
import com.camillacarvalho.projetos.entidades.Livro;
import com.camillacarvalho.projetos.entidades.Usuario;
import com.camillacarvalho.projetos.persistencia.ArmazenarDados;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JTable;

/**
 *
 * @author Camilla Carvalho, Fatec Botucatu 2022
 */
public class HomeController extends javax.swing.JFrame {

    /**
     * CARREGAR os OBJs das TELAS DE APRESENTAÇÃO em VARIÁVEIS para controlarmos
     * seus estados
     */
    //private Home home = new Home();
    private CadastroLogin cadastroLogin = null;
    private CadastroUsuarios cadastroUsuarios = null;
    private CadastroCategorias cadastroFonecedores = null;

    private static String mensagemTela = "Seja muito bem-vinda(o)!";
    public boolean loginIsAdmin = false;

    // LISTAS
    private List<Categoria> listaCategorias;
    public static List<Usuario> listaUsuarios;
    private List<Livro> listaLivros;
    private List<Emprestimo> listaEmprestimos;

    /**
     * Criar a Home
     */
    public HomeController() {
        cadastroLogin = new CadastroLogin();
        initComponents();
        trocarTela("login");
        HomeController.carregarTabelaUsuarios();

        // usuarios
        //HomeController.carregarDadosUsuarios();
        //cadastroUsuarios = new CadastroUsuarios();
        // clientes
        //HomeController.carregarDadosClientes();
        // fornecedores
        //HomeController.carregarDadosFornecedores();
        //cadastroFonecedores = new CadastroCategorias();
        // produtos
        //HomeController.carregarDadosProdutos();
    }

    private static void carregarDadosClientes() {
        print("carregarDadosClientes()");
        File file = new File("projetolivraria.clientes.persistencia.db");

// TODO 
        print("carregarDadosClientes() size: ");

        //setListaClientes(listaClientesTmp);
    }

    /**
     * Salvar os Dados dos Usuarios
     */
    @SuppressWarnings("null")
    public static void salvarDadosUsuarios() {
        File file = new File("projetolivraria.usuarios.persistencia.db");

        @SuppressWarnings("UnusedAssignment")
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream(file));
            //out.writeObject(listaUsuarios);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }

        mensagemTela = "Arquivo usuários salvo com sucesso!";
    }

    /**
     * Carregar Dados dos Usuarios
     */
    public static synchronized void carregarDadosUsuarios() {

        print("carregarDadosUsuarios()");

        File file = new File("projetolivraria.usuarios.persistencia.db");

        ObjectInputStream in = null;
        java.util.List<Usuario> listaUsuariosTmp = null;

        try {
            in = new ObjectInputStream(new FileInputStream(file));
            listaUsuariosTmp = (ArrayList<Usuario>) in.readObject();
            //listaUsuario = listaUsuariosTmp;
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }

        if (listaUsuariosTmp == null) {
            listaUsuariosTmp = new ArrayList<Usuario>();
        }

        //setListaUsuarios(listaUsuariosTmp);
    }

    protected static void print(String texto) {
        System.out.println(texto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOne = new javax.swing.JPanel();
        jPanelBaseLogin = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPanelLogin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonCadastroLogin = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSplitPanelOne = new javax.swing.JSplitPane();
        jPanelLadoA = new javax.swing.JPanel();
        panelViewUsuario = new javax.swing.JPanel();
        jButtonViewBooks = new javax.swing.JButton();
        jButtonEmprestimos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelViewAdmin = new javax.swing.JPanel();
        jButtonAdmCategorias = new javax.swing.JButton();
        jButtonAdmUsuarios = new javax.swing.JButton();
        jButtonAdmEmprestimos = new javax.swing.JButton();
        jButtonAdmLivros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelLadoB = new javax.swing.JPanel();
        jPanelBaseHome = new javax.swing.JPanel();
        jLabelCadastrosTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelBaseUsuarios = new javax.swing.JPanel();
        jScrollPaneUsuarios = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonNovoUsuario = new javax.swing.JButton();
        jLabelCadastrosTitulo1 = new javax.swing.JLabel();
        jPanelBaseClientes = new javax.swing.JPanel();
        jScrollPanelClientes = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonNovoClientes = new javax.swing.JButton();
        jLabelCadastrosTituloClientes = new javax.swing.JLabel();
        jPanelBaseFornecedores = new javax.swing.JPanel();
        jScrollPanelFornecedores = new javax.swing.JScrollPane();
        jTableClientes1 = new javax.swing.JTable();
        jButtonNovoFornecedores = new javax.swing.JButton();
        jLabelCadastrosTituloFornecedores = new javax.swing.JLabel();
        jPanelBaseProdutos = new javax.swing.JPanel();
        jScrollPanelProdutos = new javax.swing.JScrollPane();
        jTableClientes2 = new javax.swing.JTable();
        jButtonNovoProduto = new javax.swing.JButton();
        jLabelCadastrosTituloProdutos = new javax.swing.JLabel();
        jPanelVerLivros = new javax.swing.JPanel();
        jLabelCadastrosTitulo2 = new javax.swing.JLabel();
        jPanelEstanteLivros = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollLivros = new javax.swing.JScrollPane();
        panelShowLivros = new javax.swing.JPanel();
        jPanelVerLivrosEmprestimos = new javax.swing.JPanel();
        jLabelCadastrosTitulo3 = new javax.swing.JLabel();
        jPanelEstanteLivros1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollLivros1 = new javax.swing.JScrollPane();
        panelShowLivrosEmprestados = new javax.swing.JPanel();
        jPanelVerUsuarios = new javax.swing.JPanel();
        jLabelCadastrosTitulo4 = new javax.swing.JLabel();
        jPanelEstanteLivros2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollLivros2 = new javax.swing.JScrollPane();
        panelShowUsuarios = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemHome = new javax.swing.JMenuItem();
        jMeniItemLogout = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemFecharApp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        jPanelOne.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Login:");

        jLabel10.setText("Senha:");

        jTextFieldLogin.setText("admin");

        jButtonLogin.setText("Iniciar sessão!");
        jButtonLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldSenha.setText("admin");

        jLabel3.setText("Fatec Botucatu, ADS 2022");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel4.setText("Projeto PlayBook para Gestão de Livraria");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        buttonCadastroLogin.setText("Quero cadastrar meu login...");
        buttonCadastroLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBaseLoginLayout = new javax.swing.GroupLayout(jPanelBaseLogin);
        jPanelBaseLogin.setLayout(jPanelBaseLoginLayout);
        jPanelBaseLoginLayout.setHorizontalGroup(
            jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLoginLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBaseLoginLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastroLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBaseLoginLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelBaseLoginLayout.setVerticalGroup(
            jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLoginLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBaseLoginLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(47, 47, 47))
                    .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCadastroLogin)
                .addGap(36, 36, 36))
            .addGroup(jPanelBaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBaseLoginLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );

        jPanelOne.add(jPanelBaseLogin);

        jSplitPanelOne.setEnabled(false);
        jSplitPanelOne.setMaximumSize(new java.awt.Dimension(1900, 1024));
        jSplitPanelOne.setMinimumSize(new java.awt.Dimension(948, 323));

        jButtonViewBooks.setText("Ver Livros");
        jButtonViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewBooksActionPerformed(evt);
            }
        });

        jButtonEmprestimos.setText("Empréstimos");
        jButtonEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestimosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Ações:");

        javax.swing.GroupLayout panelViewUsuarioLayout = new javax.swing.GroupLayout(panelViewUsuario);
        panelViewUsuario.setLayout(panelViewUsuarioLayout);
        panelViewUsuarioLayout.setHorizontalGroup(
            panelViewUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(panelViewUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelViewUsuarioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelViewUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(jButtonViewBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        panelViewUsuarioLayout.setVerticalGroup(
            panelViewUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewUsuarioLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(panelViewUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelViewUsuarioLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jButtonViewBooks)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonEmprestimos)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        jButtonAdmCategorias.setText("Cadastrar Categorias");
        jButtonAdmCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmCategoriasActionPerformed(evt);
            }
        });

        jButtonAdmUsuarios.setText("Validar Usuários");
        jButtonAdmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmUsuariosActionPerformed(evt);
            }
        });

        jButtonAdmEmprestimos.setText("Validar Empréstimos");
        jButtonAdmEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmEmprestimosActionPerformed(evt);
            }
        });

        jButtonAdmLivros.setText("Cadastrar Livros");
        jButtonAdmLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmLivrosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Administrador");

        javax.swing.GroupLayout panelViewAdminLayout = new javax.swing.GroupLayout(panelViewAdmin);
        panelViewAdmin.setLayout(panelViewAdminLayout);
        panelViewAdminLayout.setHorizontalGroup(
            panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAdmEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonAdmLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdmCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdmUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelViewAdminLayout.setVerticalGroup(
            panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdmCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAdmUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdmLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdmEmprestimos)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanelLadoALayout = new javax.swing.GroupLayout(jPanelLadoA);
        jPanelLadoA.setLayout(jPanelLadoALayout);
        jPanelLadoALayout.setHorizontalGroup(
            jPanelLadoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLadoALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelViewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelLadoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLadoALayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelViewUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelLadoALayout.setVerticalGroup(
            jPanelLadoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLadoALayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(panelViewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanelLadoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLadoALayout.createSequentialGroup()
                    .addComponent(panelViewUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 225, Short.MAX_VALUE)))
        );

        jSplitPanelOne.setLeftComponent(jPanelLadoA);

        jPanelLadoB.setLayout(new javax.swing.OverlayLayout(jPanelLadoB));

        jPanelBaseHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadastrosTitulo.setText("Home >>");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("FATEC Botucatu, ADS  >>  Projeto para Gestão de Livraria");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setText("Desenvolvimento do Projeto: Camilla Carvalho");

        jLabel8.setText("Orientador: Osvaldo Cesar Pinheiro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBaseHomeLayout = new javax.swing.GroupLayout(jPanelBaseHome);
        jPanelBaseHome.setLayout(jPanelBaseHomeLayout);
        jPanelBaseHomeLayout.setHorizontalGroup(
            jPanelBaseHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jLabelCadastrosTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
                .addGap(120, 120, 120))
        );
        jPanelBaseHomeLayout.setVerticalGroup(
            jPanelBaseHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseHomeLayout.createSequentialGroup()
                .addComponent(jLabelCadastrosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLadoB.add(jPanelBaseHome);

        jPanelBaseUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPaneUsuarios.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jScrollPaneUsuariosPropertyChange(evt);
            }
        });

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableUsuarios.setDoubleBuffered(true);
        jTableUsuarios.setFillsViewportHeight(true);
        jTableUsuarios.setRowSelectionAllowed(false);
        jTableUsuarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableUsuariosFocusGained(evt);
            }
        });
        jTableUsuarios.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTableUsuariosInputMethodTextChanged(evt);
            }
        });
        jTableUsuarios.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableUsuariosPropertyChange(evt);
            }
        });
        jScrollPaneUsuarios.setViewportView(jTableUsuarios);

        jButtonNovoUsuario.setText("Novo Usuário");
        jButtonNovoUsuario.setActionCommand("");
        jButtonNovoUsuario.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButtonNovoUsuarioStateChanged(evt);
            }
        });
        jButtonNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoUsuarioActionPerformed(evt);
            }
        });

        jLabelCadastrosTitulo1.setText("Usuários");

        javax.swing.GroupLayout jPanelBaseUsuariosLayout = new javax.swing.GroupLayout(jPanelBaseUsuarios);
        jPanelBaseUsuarios.setLayout(jPanelBaseUsuariosLayout);
        jPanelBaseUsuariosLayout.setHorizontalGroup(
            jPanelBaseUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(jPanelBaseUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabelCadastrosTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addComponent(jButtonNovoUsuario)))
                .addContainerGap())
        );
        jPanelBaseUsuariosLayout.setVerticalGroup(
            jPanelBaseUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseUsuariosLayout.createSequentialGroup()
                .addGroup(jPanelBaseUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoUsuario)
                    .addComponent(jLabelCadastrosTitulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLadoB.add(jPanelBaseUsuarios);

        jPanelBaseClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableClientes.setEnabled(false);
        jScrollPanelClientes.setViewportView(jTableClientes);

        jButtonNovoClientes.setText("Novo Cliente");
        jButtonNovoClientes.setActionCommand("");
        jButtonNovoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoClientesActionPerformed(evt);
            }
        });

        jLabelCadastrosTituloClientes.setText("Clientes");

        javax.swing.GroupLayout jPanelBaseClientesLayout = new javax.swing.GroupLayout(jPanelBaseClientes);
        jPanelBaseClientes.setLayout(jPanelBaseClientesLayout);
        jPanelBaseClientesLayout.setHorizontalGroup(
            jPanelBaseClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(jPanelBaseClientesLayout.createSequentialGroup()
                        .addComponent(jLabelCadastrosTituloClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNovoClientes)))
                .addContainerGap())
        );
        jPanelBaseClientesLayout.setVerticalGroup(
            jPanelBaseClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseClientesLayout.createSequentialGroup()
                .addGroup(jPanelBaseClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoClientes)
                    .addComponent(jLabelCadastrosTituloClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLadoB.add(jPanelBaseClientes);

        jPanelBaseFornecedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableClientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableClientes1.setEnabled(false);
        jScrollPanelFornecedores.setViewportView(jTableClientes1);

        jButtonNovoFornecedores.setText("Novo Fornecedor");
        jButtonNovoFornecedores.setActionCommand("");
        jButtonNovoFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoFornecedoresActionPerformed(evt);
            }
        });

        jLabelCadastrosTituloFornecedores.setText("Fornecedores");

        javax.swing.GroupLayout jPanelBaseFornecedoresLayout = new javax.swing.GroupLayout(jPanelBaseFornecedores);
        jPanelBaseFornecedores.setLayout(jPanelBaseFornecedoresLayout);
        jPanelBaseFornecedoresLayout.setHorizontalGroup(
            jPanelBaseFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseFornecedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanelFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(jPanelBaseFornecedoresLayout.createSequentialGroup()
                        .addComponent(jLabelCadastrosTituloFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNovoFornecedores)))
                .addContainerGap())
        );
        jPanelBaseFornecedoresLayout.setVerticalGroup(
            jPanelBaseFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseFornecedoresLayout.createSequentialGroup()
                .addGroup(jPanelBaseFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoFornecedores)
                    .addComponent(jLabelCadastrosTituloFornecedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanelFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLadoB.add(jPanelBaseFornecedores);

        jPanelBaseProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableClientes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableClientes2.setEnabled(false);
        jScrollPanelProdutos.setViewportView(jTableClientes2);

        jButtonNovoProduto.setText("Novo Produto");
        jButtonNovoProduto.setActionCommand("");
        jButtonNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoProdutoActionPerformed(evt);
            }
        });

        jLabelCadastrosTituloProdutos.setText("Produtos");

        javax.swing.GroupLayout jPanelBaseProdutosLayout = new javax.swing.GroupLayout(jPanelBaseProdutos);
        jPanelBaseProdutos.setLayout(jPanelBaseProdutosLayout);
        jPanelBaseProdutosLayout.setHorizontalGroup(
            jPanelBaseProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(jPanelBaseProdutosLayout.createSequentialGroup()
                        .addComponent(jLabelCadastrosTituloProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNovoProduto)))
                .addContainerGap())
        );
        jPanelBaseProdutosLayout.setVerticalGroup(
            jPanelBaseProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseProdutosLayout.createSequentialGroup()
                .addGroup(jPanelBaseProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoProduto)
                    .addComponent(jLabelCadastrosTituloProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLadoB.add(jPanelBaseProdutos);

        jPanelVerLivros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadastrosTitulo2.setText("Visualizar Livros >>");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Os melhores livros para ler antes de morrer! ;)");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        panelShowLivros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jScrollLivros.setViewportView(panelShowLivros);

        javax.swing.GroupLayout jPanelEstanteLivrosLayout = new javax.swing.GroupLayout(jPanelEstanteLivros);
        jPanelEstanteLivros.setLayout(jPanelEstanteLivrosLayout);
        jPanelEstanteLivrosLayout.setHorizontalGroup(
            jPanelEstanteLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstanteLivrosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelEstanteLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstanteLivrosLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelEstanteLivrosLayout.setVerticalGroup(
            jPanelEstanteLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstanteLivrosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(jPanelEstanteLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstanteLivrosLayout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jScrollLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanelVerLivrosLayout = new javax.swing.GroupLayout(jPanelVerLivros);
        jPanelVerLivros.setLayout(jPanelVerLivrosLayout);
        jPanelVerLivrosLayout.setHorizontalGroup(
            jPanelVerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerLivrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEstanteLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jLabelCadastrosTitulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
                .addGap(120, 120, 120))
        );
        jPanelVerLivrosLayout.setVerticalGroup(
            jPanelVerLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerLivrosLayout.createSequentialGroup()
                .addComponent(jLabelCadastrosTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstanteLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLadoB.add(jPanelVerLivros);

        jPanelVerLivrosEmprestimos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadastrosTitulo3.setText("Visualizar Livros >>");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Minha lista de livros emprestados...");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        panelShowLivrosEmprestados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jScrollLivros1.setViewportView(panelShowLivrosEmprestados);

        javax.swing.GroupLayout jPanelEstanteLivros1Layout = new javax.swing.GroupLayout(jPanelEstanteLivros1);
        jPanelEstanteLivros1.setLayout(jPanelEstanteLivros1Layout);
        jPanelEstanteLivros1Layout.setHorizontalGroup(
            jPanelEstanteLivros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstanteLivros1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanelEstanteLivros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstanteLivros1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollLivros1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelEstanteLivros1Layout.setVerticalGroup(
            jPanelEstanteLivros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstanteLivros1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(jPanelEstanteLivros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstanteLivros1Layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jScrollLivros1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanelVerLivrosEmprestimosLayout = new javax.swing.GroupLayout(jPanelVerLivrosEmprestimos);
        jPanelVerLivrosEmprestimos.setLayout(jPanelVerLivrosEmprestimosLayout);
        jPanelVerLivrosEmprestimosLayout.setHorizontalGroup(
            jPanelVerLivrosEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerLivrosEmprestimosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVerLivrosEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVerLivrosEmprestimosLayout.createSequentialGroup()
                        .addComponent(jLabelCadastrosTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                        .addGap(120, 120, 120))
                    .addGroup(jPanelVerLivrosEmprestimosLayout.createSequentialGroup()
                        .addComponent(jPanelEstanteLivros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelVerLivrosEmprestimosLayout.setVerticalGroup(
            jPanelVerLivrosEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerLivrosEmprestimosLayout.createSequentialGroup()
                .addComponent(jLabelCadastrosTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstanteLivros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLadoB.add(jPanelVerLivrosEmprestimos);

        jPanelVerUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadastrosTitulo4.setText("Visualizar Livros >>");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Minha lista de livros emprestados...");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        panelShowUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jScrollLivros2.setViewportView(panelShowUsuarios);

        javax.swing.GroupLayout jPanelEstanteLivros2Layout = new javax.swing.GroupLayout(jPanelEstanteLivros2);
        jPanelEstanteLivros2.setLayout(jPanelEstanteLivros2Layout);
        jPanelEstanteLivros2Layout.setHorizontalGroup(
            jPanelEstanteLivros2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstanteLivros2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanelEstanteLivros2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstanteLivros2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollLivros2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelEstanteLivros2Layout.setVerticalGroup(
            jPanelEstanteLivros2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstanteLivros2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(jPanelEstanteLivros2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstanteLivros2Layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jScrollLivros2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanelVerUsuariosLayout = new javax.swing.GroupLayout(jPanelVerUsuarios);
        jPanelVerUsuarios.setLayout(jPanelVerUsuariosLayout);
        jPanelVerUsuariosLayout.setHorizontalGroup(
            jPanelVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVerUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabelCadastrosTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                        .addGap(120, 120, 120))
                    .addGroup(jPanelVerUsuariosLayout.createSequentialGroup()
                        .addComponent(jPanelEstanteLivros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelVerUsuariosLayout.setVerticalGroup(
            jPanelVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerUsuariosLayout.createSequentialGroup()
                .addComponent(jLabelCadastrosTitulo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstanteLivros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLadoB.add(jPanelVerUsuarios);

        jSplitPanelOne.setRightComponent(jPanelLadoB);

        jPanelOne.add(jSplitPanelOne);

        jMenuFile.setText("Arquivo");

        jMenuItemHome.setText("Home");
        jMenuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemHome);

        jMeniItemLogout.setText("Logout do Usuário");
        jMeniItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeniItemLogoutActionPerformed(evt);
            }
        });
        jMenuFile.add(jMeniItemLogout);
        jMenuFile.add(jSeparator2);

        jMenuItemFecharApp.setText("Fechar App");
        jMenuItemFecharApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFecharAppActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemFecharApp);

        jMenuBar.add(jMenuFile);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOne, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdmLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmLivrosActionPerformed
        carregarDadosClientes();
        //jScrollPanelClientes.setViewportView(carregarTabelaClientes());
        trocarTela("admLivros");
    }//GEN-LAST:event_jButtonAdmLivrosActionPerformed

    private void jButtonAdmCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmCategoriasActionPerformed
        //carregarDadosUsuarios();
        //jScrollPaneUsuarios.setViewportView(carregarTabelaUsuarios());
        trocarTela("admCategorias");
    }//GEN-LAST:event_jButtonAdmCategoriasActionPerformed

    private void jButtonAdmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmUsuariosActionPerformed
        //carregarDadosFornecedores();
        //jScrollPanelFornecedores.setViewportView(carregarTabelaFornecedores());
        trocarTela("admUsuarios");
    }//GEN-LAST:event_jButtonAdmUsuariosActionPerformed

    private void jButtonAdmEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmEmprestimosActionPerformed
        ///carregarDadosProdutos();
        //jScrollPanelProdutos.setViewportView(carregarTabelaProdutos());
        trocarTela("admEmprestimos");
    }//GEN-LAST:event_jButtonAdmEmprestimosActionPerformed

    private void jButtonNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoUsuarioActionPerformed
        cadastroUsuarios.setCamposEntrada();
        cadastroUsuarios.carregarDados();
        cadastroUsuarios.setVisible(true);
    }//GEN-LAST:event_jButtonNovoUsuarioActionPerformed

    private void jMenuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeActionPerformed
        trocarTela("home");
    }//GEN-LAST:event_jMenuItemHomeActionPerformed

    private void jButtonNovoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoClientesActionPerformed
//        cadastroClientes.setCamposEntrada();
//        cadastroClientes.carregarDados();
//        cadastroClientes.setVisible(true);
    }//GEN-LAST:event_jButtonNovoClientesActionPerformed

    private void jButtonNovoUsuarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButtonNovoUsuarioStateChanged

    }//GEN-LAST:event_jButtonNovoUsuarioStateChanged

    private void jScrollPaneUsuariosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPaneUsuariosPropertyChange

    }//GEN-LAST:event_jScrollPaneUsuariosPropertyChange

    private void jTableUsuariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableUsuariosFocusGained

    }//GEN-LAST:event_jTableUsuariosFocusGained

    private void jTableUsuariosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableUsuariosPropertyChange
        print(evt.toString());
    }//GEN-LAST:event_jTableUsuariosPropertyChange

    private void jTableUsuariosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTableUsuariosInputMethodTextChanged
        print(evt.toString());
    }//GEN-LAST:event_jTableUsuariosInputMethodTextChanged

    private void jMeniItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeniItemLogoutActionPerformed
        trocarTela("login");
    }//GEN-LAST:event_jMeniItemLogoutActionPerformed

    private void jMenuItemFecharAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFecharAppActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemFecharAppActionPerformed

    private void jButtonNovoFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoFornecedoresActionPerformed
        cadastroFonecedores.carregarDados();
        cadastroFonecedores.setVisible(true);
    }//GEN-LAST:event_jButtonNovoFornecedoresActionPerformed

    private void jButtonNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoProdutoActionPerformed

    }//GEN-LAST:event_jButtonNovoProdutoActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        for (Usuario u : listaUsuarios) {
            if (this.jTextFieldLogin.getText().equalsIgnoreCase(u.getLogin()) && this.jPasswordFieldSenha.getText().equalsIgnoreCase(u.getSenha())) {
                HomeController.print("Login do usuário: " + u.getLogin());
                trocarTela("Home");
            }
        }
//        if (this.jTextFieldLogin.getText().equalsIgnoreCase("admin") && this.jPasswordFieldSenha.getText().equalsIgnoreCase("admin")) {
//            HomeController.print("admin:admin");
//            trocarTela("Home");
//        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void buttonCadastroLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroLoginActionPerformed
        new CadastroLogin().setVisible(true);
    }//GEN-LAST:event_buttonCadastroLoginActionPerformed

    private void jButtonViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewBooksActionPerformed
        trocarTela("verLivros");
    }//GEN-LAST:event_jButtonViewBooksActionPerformed

    private void jButtonEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestimosActionPerformed
        trocarTela("verEmprestimos");
    }//GEN-LAST:event_jButtonEmprestimosActionPerformed

    private void trocarTela(String tela) {
        ////
        if ("login".equals(tela)) {
            jPanelBaseLogin.setVisible(true);
            jSplitPanelOne.setVisible(false);
            jMenuBar.setVisible(false);
        } else {
            jPanelBaseLogin.setVisible(false);
            jSplitPanelOne.setVisible(true);
            jMenuBar.setVisible(true);
        }
        ////
//        if (this.loginIsAdmin) {
//            jButtonAdmCategorias.setVisible(true);
//            jButtonAdmLivros.setVisible(true);
//            //
//            jButtonNovoFornecedores.setVisible(false);
//            jButtonNovoProduto.setVisible(false);
//        } else {
//            jButtonAdmCategorias.setVisible(false);
//            jButtonAdmLivros.setVisible(false);
//            //
//            jButtonNovoFornecedores.setVisible(true);
//            jButtonNovoProduto.setVisible(true);
//        }
        ////
        if ("verLivros".equals(tela)) {
            carregarTabelaLivros();
            //
            jPanelBaseHome.setVisible(false);
            jPanelBaseUsuarios.setVisible(false);
            jPanelVerLivros.setVisible(true);
        } else if ("verEmprestimos".equals(tela)) {
            carregarTabelaEmprestimos();
            carregarViewEmprestimos();
            //
            jPanelBaseHome.setVisible(false);
            jPanelBaseUsuarios.setVisible(false);
            jPanelVerLivros.setVisible(false);
            jPanelVerLivrosEmprestimos.setVisible(true);
        } else if ("admUsuarios".equals(tela)) {
            
            carregarViewUsuarios();
            
            jPanelBaseHome.setVisible(false);
            jPanelBaseUsuarios.setVisible(false);
            jPanelBaseClientes.setVisible(false);
            jPanelBaseFornecedores.setVisible(false);
            jPanelBaseProdutos.setVisible(false);
            jPanelVerLivros.setVisible(false);
            jPanelVerLivrosEmprestimos.setVisible(false);
            
            jPanelVerUsuarios.setVisible(true);
            
        } else if ("produtos".equals(tela)) {
            //carregarTabelaFornecedores();
            jPanelBaseHome.setVisible(false);
            jPanelBaseUsuarios.setVisible(false);
            jPanelBaseClientes.setVisible(false);
            jPanelBaseFornecedores.setVisible(false);
            jPanelBaseProdutos.setVisible(true);
        } else {
            jPanelBaseHome.setVisible(true);
            jPanelBaseUsuarios.setVisible(false);
            jPanelBaseClientes.setVisible(false);
            jPanelBaseFornecedores.setVisible(false);
            jPanelBaseProdutos.setVisible(false);
        }
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HomeController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HomeController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HomeController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HomeController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HomeController().setVisible(true);
//            }
//        });
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastroLogin;
    private javax.swing.JButton jButtonAdmCategorias;
    private javax.swing.JButton jButtonAdmEmprestimos;
    private javax.swing.JButton jButtonAdmLivros;
    private javax.swing.JButton jButtonAdmUsuarios;
    private javax.swing.JButton jButtonEmprestimos;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonNovoClientes;
    private javax.swing.JButton jButtonNovoFornecedores;
    private javax.swing.JButton jButtonNovoProduto;
    private javax.swing.JButton jButtonNovoUsuario;
    private javax.swing.JButton jButtonViewBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCadastrosTitulo;
    private javax.swing.JLabel jLabelCadastrosTitulo1;
    private javax.swing.JLabel jLabelCadastrosTitulo2;
    private javax.swing.JLabel jLabelCadastrosTitulo3;
    private javax.swing.JLabel jLabelCadastrosTitulo4;
    private javax.swing.JLabel jLabelCadastrosTituloClientes;
    private javax.swing.JLabel jLabelCadastrosTituloFornecedores;
    private javax.swing.JLabel jLabelCadastrosTituloProdutos;
    private javax.swing.JMenuItem jMeniItemLogout;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemFecharApp;
    private javax.swing.JMenuItem jMenuItemHome;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBaseClientes;
    private javax.swing.JPanel jPanelBaseFornecedores;
    private javax.swing.JPanel jPanelBaseHome;
    private javax.swing.JPanel jPanelBaseLogin;
    private javax.swing.JPanel jPanelBaseProdutos;
    private javax.swing.JPanel jPanelBaseUsuarios;
    private javax.swing.JPanel jPanelEstanteLivros;
    private javax.swing.JPanel jPanelEstanteLivros1;
    private javax.swing.JPanel jPanelEstanteLivros2;
    private javax.swing.JPanel jPanelLadoA;
    private javax.swing.JPanel jPanelLadoB;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelOne;
    private javax.swing.JPanel jPanelVerLivros;
    private javax.swing.JPanel jPanelVerLivrosEmprestimos;
    private javax.swing.JPanel jPanelVerUsuarios;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollLivros;
    private javax.swing.JScrollPane jScrollLivros1;
    private javax.swing.JScrollPane jScrollLivros2;
    private javax.swing.JScrollPane jScrollPaneUsuarios;
    private javax.swing.JScrollPane jScrollPanelClientes;
    private javax.swing.JScrollPane jScrollPanelFornecedores;
    private javax.swing.JScrollPane jScrollPanelProdutos;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPanelOne;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableClientes1;
    private javax.swing.JTable jTableClientes2;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JPanel panelShowLivros;
    private javax.swing.JPanel panelShowLivrosEmprestados;
    private javax.swing.JPanel panelShowUsuarios;
    private javax.swing.JPanel panelViewAdmin;
    private javax.swing.JPanel panelViewUsuario;
    // End of variables declaration//GEN-END:variables
    
    public void carregarDadosLivros(){
        // TODO : carregar livros
            Logger.getLogger("Iniciar carregamento dos Livros");
            ArmazenarDados dadosLivros;
            try {
                dadosLivros = new ArmazenarDados("jdbc:sqlite:livros.db", "Livro") {};
                //dadosLivros
                this.listaLivros = dadosLivros.readORMLivros();
            } catch (Exception ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(this.listaLivros==null)
                this.listaLivros = new ArrayList<Livro>();
            Projeto.print("listaLivros.size: " + listaLivros.size());
    }
    
    private void carregarTabelaLivros() {
        carregarDadosLivros();
        try {
            JPanel content = new JPanel();
            for (Livro livro : this.listaLivros) {
                JPanel contentInn = new JPanel();
                contentInn.setLayout(new BoxLayout(contentInn, BoxLayout.PAGE_AXIS));
                contentInn.setName("livro_" + livro.getIdLivro());
                contentInn.setSize(500, 200);

                contentInn.add(new JLabel("Id: " + livro.getIdLivro()));

                JLabel titulo = new JLabel(livro.getTitulo());
                titulo.setFont(new Font("Arial", Font.BOLD, 16));
                contentInn.add(titulo);
                
                JLabel label1 = new JLabel("Assunto: " + livro.getAssunto());
                contentInn.add(label1);

                contentInn.add(new JLabel("Autores: " + livro.getAutores()));

                contentInn.add(new JLabel("ISBN: " + livro.getIsbn()));

                contentInn.add(new JLabel("Qtdd total: " + livro.getExemplar()));
                contentInn.add(new JLabel("Qtdd disponível: " + livro.getExemplar()));

                contentInn.add(new JSeparator());

                JButton emprestarBtt = new JButton("Emprestar Livro");

                if (listaEmprestimos == null) {
                    listaEmprestimos = new ArrayList<Emprestimo>();
                }

                for (Emprestimo emprestado : listaEmprestimos) {
                    if (emprestado.getLivro() == livro.getIdLivro()) {
                        emprestarBtt.setEnabled(false);
                        emprestarBtt.setText("Emprestado!");
                    }
                }

                emprestarBtt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        emprestarButtonPressed();
                    }

                    private void emprestarButtonPressed() {
                        Projeto.print("emprestarButtonPressed!");
                        int qtddeLivroEmprestada = verificarQtddeDesteLivroEmprestada();
                        if (qtddeLivroEmprestada <= livro.getExemplar()) {
                            emprestarLivro(livro.getIdLivro());
                            emprestarBtt.setEnabled(false);
                            emprestarBtt.setText("Emprestado!");
                        }
                    }

                    /**
                     * Pesquisar quantidade de empréstimos deste livro
                     *
                     * @return
                     */
                    private int verificarQtddeDesteLivroEmprestada() {
                        // TODO
                        return 0;
                    }

                    /**
                     *
                     * @param idLivro
                     */
                    private void emprestarLivro(int idLivro) {
                        ///
                        Projeto.print("Emprestar o Livro com id:" + idLivro + " para o usuário " + "user");

                        carregarTabelaEmprestimos();
                        Projeto.print("Lista Emprestimo tamanho: " + listaEmprestimos.size());

                        inserirTabelaEmprestimo(1, idLivro, 1);

                        carregarTabelaEmprestimos();
                        Projeto.print("Lista Emprestimo tamanho: " + listaEmprestimos.size());

                    }
                });
                contentInn.add(emprestarBtt);
                //
                content.add(contentInn);
            }
            jScrollLivros.setViewportView(content);
            //
        } catch (Exception ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @return
     */
    private List<Emprestimo> carregarTabelaEmprestimo() {

        if (listaEmprestimos == null) {
            listaEmprestimos = new ArrayList<Emprestimo>();
        }

        // TODO : carregar emprestimos
//        Logger.getLogger("Iniciar carregamento dos Emprestimos");
//        try {
//            ArmazenarDados dadosEmprestimo = new ArmazenarDados("jdbc:sqlite:emprestimos.db", "Emprestimo") {
//            };
//
//            //dadosLivros
//            listaEmprestimos = dadosEmprestimo.readORMEmprestimos();
//            Projeto.print("listaEmprestimos.size: " + listaEmprestimos.size());
//            
//        } catch (Exception ex) {
//            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //
        return listaEmprestimos;
    }

    /**
     *
     * @param idLivro
     * @param idUsuario
     * @param qtddDiasCategoria
     */
    private void inserirTabelaEmprestimo(int idUsuario, int idLivro, int qtddDiasCategoria) {
        // TODO : inserir emprestimo
        Logger.getLogger("Inserir linha na tabela Emprestimo");
//        try {
//            ArmazenarDados dadosEmprestimo = new ArmazenarDados("jdbc:sqlite:emprestimos.db", "Emprestimo") {
//            };
//
//            Emprestimo emprestimo = new Emprestimo(idUsuario, idLivro, 10);
//
//            //dadosLivros
//            int inserir = dadosEmprestimo.createORMEmprestimo(emprestimo);
//            
//            listaEmprestimos = dadosEmprestimo.readORMEmprestimos();
//            
//            Projeto.print("listaEmprestimos.size: " + listaEmprestimos.size());
//
//        } catch (Exception ex) {
//            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        listaEmprestimos.add(new Emprestimo(idUsuario, idLivro, qtddDiasCategoria));
    }

    private void carregarTabelaEmprestimos() {

        if (listaEmprestimos == null) {
            listaEmprestimos = new ArrayList<Emprestimo>();
        }

        Projeto.print("TODO: Carregar Emprestimos");
        // TODO : carregar emprestimos
//        Logger.getLogger("Iniciar carregamento dos Emprestimos");
//        try {
//            ArmazenarDados dadosEmprestimo = new ArmazenarDados("jdbc:sqlite:emprestimos.db", "Emprestimo") {
//            };
//
//            //dadosLivros
//            listaEmprestimos = dadosEmprestimo.readORMEmprestimos();
//            Projeto.print("listaEmprestimos.size: " + listaEmprestimos.size());
//            
//        } catch (Exception ex) {
//            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //
//        return listaEmprestimos;
    }
    
    private static void carregarTabelaUsuarios() {
        if (listaUsuarios == null) {
            listaUsuarios = new ArrayList<Usuario>();
            // Add admin!
            Usuario userAdm = new Usuario();
            userAdm.setIdUsuario(listaUsuarios.size() + 1);
            userAdm.setCategoria(1);
            userAdm.setLogin("admin");
            userAdm.setSenha("admin");
            listaUsuarios.add(userAdm);
        }
    }

    private void carregarViewEmprestimos() {

        carregarDadosLivros();
        
        Projeto.print("listaEmprestimos:" + listaEmprestimos.size());
        
        for (Emprestimo emprestado : listaEmprestimos) {
            
            carregarTabelaLivros();
            
            for (Livro livro : this.listaLivros) {
                if( livro.getIdLivro() == emprestado.getLivro() ){
                    Projeto.print("LIVRO: "+livro.getIdLivro()+"\n");
                    
                    JPanel p = new JPanel();
                    p.setSize(400, 50);
                    
                    JLabel label = new JLabel("[  Livro: "+livro.getTitulo()+"  | ");
                    label.setSize(400, 50);
                    //panelShowLivrosEmprestados.add( label );
                    p.add( label );
                    
                    label = new JLabel(" ISBN: "+livro.getIsbn()+"  | ");
                    label.setSize(400, 50);
                    //panelShowLivrosEmprestados.add( label );
                    p.add( label );

                    label = new JLabel(" Autores: "+livro.getAutores()+"  ]");
                    label.setSize(400, 50);
                    //panelShowLivrosEmprestados.add( label );
                    p.add( label );
                    
                    JSeparator s = new JSeparator();
                    s.setSize(400, 50);
                    //panelShowLivrosEmprestados.add( s );
                    p.add( s );
                    
                    panelShowLivrosEmprestados.add( p );
                }
            }
        }

        for (Livro livro : this.listaLivros) {
            JPanel contentInn = new JPanel();
            contentInn.setLayout(new BoxLayout(contentInn, BoxLayout.PAGE_AXIS));
            contentInn.setName("livro_" + livro.getIdLivro());
            contentInn.setSize(500, 200);

            contentInn.add(new JLabel("Id: " + livro.getIdLivro()));

            JLabel titulo = new JLabel(livro.getTitulo());
            titulo.setFont(new Font("Arial", Font.BOLD, 16));
            contentInn.add(titulo);

            JLabel label1 = new JLabel("Assunto: " + livro.getAssunto());
            contentInn.add(label1);

            contentInn.add(new JLabel("Autores: " + livro.getAutores()));

            contentInn.add(new JLabel("ISBN: " + livro.getIsbn()));

            contentInn.add(new JLabel("Qtdd total: " + livro.getExemplar()));
            contentInn.add(new JLabel("Qtdd disponível: " + livro.getExemplar()));

            contentInn.add(new JSeparator());

            JButton emprestarBtt = new JButton("Emprestar Livro");

            if (listaEmprestimos == null) {
                listaEmprestimos = new ArrayList<Emprestimo>();
            }

        }

    }
    /**
     * 
     */
    private void carregarViewUsuarios() {
        for(Usuario u : listaUsuarios){
            panelShowUsuarios.add(new JLabel("[ User: "+u.getLogin()+" ] "));
        }
    }

}
