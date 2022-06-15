package com.camillacarvalho.projetos.persistencia;

import com.camillacarvalho.projetos.Projeto;
import com.camillacarvalho.projetos.entidades.Emprestimo;
import com.camillacarvalho.projetos.entidades.Livro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Armazenar Dados no SQLite
 *
 * @author Camilla Carvalho, Fatec Botucatu 2022
 */
public class ArmazenarDados {

    private static String url = null;
    private static String nomeTabela = null;
    private static Connection conn = null;

    /**
     * Criar SQLite para Armazenar Dados
     *
     * @param _url URL SQLite (ex:jdbc:sqlite:exemplo.db)
     * @param _nomeTabela Tabela
     * @throws Exception
     */
    public ArmazenarDados(String _url, String _nomeTabela) throws Exception {

        // Testar se variáveis de entrada estão nulas
        if (_url == null || _nomeTabela == null) {
            throw new Exception("A URL e o Nome da Tabela não podem ser nulos!");
        } else {
            ArmazenarDados.url = _url;
            ArmazenarDados.nomeTabela = _nomeTabela;
        }

        // Caregar Classe SQLite 
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.print(ex + "\n");
        }

        // Iniciar BD
        openDB();

        // INI: Iniciar as tabelas e dados de acordo com variável "nomeTabela"
        String sql = sqlInitDB();
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        Projeto.print("Database iniciada com sucesso!\n");
        // FIM: Iniciar as tabelas e dados de acordo com variável "nomeTabela"

        // Testar Tabela Livro
        if (ArmazenarDados.nomeTabela.equalsIgnoreCase("Livro")) {
            testarLivrosDB();
        }

        // Fechar BD
        closeDB();
    }

    /**
     * Abrir uma nova conexão com o 'sqlite db'
     */
    private static void openDB() {
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("A conexão com o Banco de Dados '" + url + "' falhou!\nErro: " + e.toString());
        }
    }

    /**
     * Fechar a conexão atual com o 'sqlite db'
     */
    private static void closeDB() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("A desconexão com o Banco de Dados '" + url + "' falhou!\nErro: " + e.toString());
        }
    }

    /**
     * Iniciar as tabelas e os dados do Banco de Dados
     *
     * @return String da SQL a ser executado
     */
    private static String sqlInitDB() {
        String tabela = "", insert = "";

        switch (nomeTabela) {
            case ("Usuario"):
                tabela = "drop table if exists " + nomeTabela + "; create table " + nomeTabela + "(idUsuario integer primary key, login varchar(45), login varchar(45), senha varchar(45), categoria int);";
                insert = " " + "insert into " + nomeTabela + " values ( 1, DateTime('now'), 'admin', 'admin', 1);"
                        + "insert into " + nomeTabela + " values ( 2, DateTime('now'), 'camillinda', 'camillinda123', 5);";
                break;
            case ("Categoria"):
                tabela = "drop table if exists " + nomeTabela + "; create table " + nomeTabela + "(idCategoria integer primary key, descricao varchar(45), periodo int);";
                insert = " "
                        + "insert into " + nomeTabela + " values ( 1, 'Administrador', 'admin');"
                        + "insert into " + nomeTabela + " values ( 2, 'Assinatura Básica', 3);"
                        + "insert into " + nomeTabela + " values ( 3, 'Assinatura Padrão', 7);"
                        + "insert into " + nomeTabela + " values ( 4, 'Assinatura Premium', 15);"
                        + "insert into " + nomeTabela + " values ( 5, 'Assinatura Mega Premium', 30);";
                break;
            case ("Livro"):
                tabela = "drop table if exists " + nomeTabela + "; create table " + nomeTabela + "(idLivro integer primary key, titulo varchar(45), isbn varchar(15), assunto varchar(45), autores varchar(150), exemplar int); ";
                insert = " "
                        + "insert into Livro values(1, 'Dom Quixote de la Mancha', '978-8571062504', 'Poético e humanista', 'Miguel de Cervantes', 34);"
                        + "insert into " + nomeTabela + " values(2, 'Orgulho e Preconceito', '978-8572328753', 'Romance de amor', 'Jane Austen', 23);"
                        + "insert into " + nomeTabela + " values(3, 'Orgulho e Preconceito',  '978-8572328753', 'Romance de amor', 'Jane Austen', 3);"
                        + "insert into " + nomeTabela + " values(4, 'O doente imaginário', '978-8573264517', 'Aventura', 'Molière',  1);"
                        + "insert into " + nomeTabela + " values(5, 'Mindset: A nova psicologia do sucesso', '978-8547000240', 'Psicologia', 'Carol S. Dweck', 1);"
                        + "insert into " + nomeTabela + " values(6, 'Hábitos atômicos: Um método fácil e comprovado de criar bons hábitos e se livrar dos maus', '978-8550807560', 'Autoajuda', 'James Clear', 1);"
                        + "insert into " + nomeTabela + " values(7, 'A teia de Charlotte', '978-8578272968', 'Aventura', 'Valter Lellis Siqueira', 2);"
                        + "insert into " + nomeTabela + " values(8, 'Torto arado', '978-6580309313', 'Drama Literatura e Ficção', 'Itamar Vieira Junior', 1);"
                        + "insert into " + nomeTabela + " values(9, 'O poder da ação', '978-8545200345', 'Transformação pessoal', 'Paulo Vieira', 23);"
                        + "insert into " + nomeTabela + " values(10, 'Foco na prática', '978-8545201755', 'Transformação pessoal', 'Paulo Vieira', 3);"
                        + "insert into " + nomeTabela + " values(11, 'O poder da ação', '978-8545200345', 'Transformação pessoal', 'Paulo Vieira', 23);"
                        + "insert into " + nomeTabela + " values(12, 'Eu e esse meu coração', '978-8555391217', 'Romance contemporâneo', 'C. C. Hunter', 1);"
                        + "insert into " + nomeTabela + " values(13, 'Teto para dois', '978-8551005415', 'Humor Literatura e Ficção', 'Beth O´Leary', 1);"
                        + "insert into " + nomeTabela + " values(14, 'Era uma vez um coração partido', '978-8582356487', 'Horror Literatura e Ficção', 'Stephanie Garber', 1);"
                        + "insert into " + nomeTabela + " values(15, 'A hipótese do amor', '978-6555653304', 'Ficção feminina', 'Ali Hazelwood', 3);"
                        + "insert into " + nomeTabela + " values(16, 'Leitura de verão', '978-6559240630', 'Comédia Romântica', 'Emily Henry', 1);"
                        + "insert into " + nomeTabela + " values(18, 'Antifrágil', '978-8576848974', 'Negócios e economia', 'Nassim Nicholas Taleb', 1);";

                //Logger.log(LogTag.JFR, LogLevel.INFO, "Tabela LIVROS OK!");
                break;
            case ("Emprestimo"):
                tabela = "drop table if exists " + nomeTabela + "; create table " + nomeTabela + "(idEmprestimo integer primary key, emprestimo date, devolucao date, usuario int, livro int);";
                break;
            default:
            //throw new AssertionError();
        }
        return tabela + " " + insert;
    }

    private void testarLivrosDB() {
        String utTxt = "";
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from Livro";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int nr = rs.getInt("idLivro");
                String dato = rs.getString("titulo");
//                String sted = rs.getString("Sted");
//                String beskrivelse = rs.getString("Beskrivelse");
                utTxt += nr + ", " + dato + "\n";
            }
        } catch (SQLException e) {
            utTxt = "Falha na conexão com a Base de Dados!";
        } finally {
            System.out.println(utTxt);
        }
    }

    /**
     * Criar uma Lista de objetos Livro e mapear os dados da tabela Livro
     *
     * @return List(Livro) Lista de obbetos Livro
     */
    public List<Livro> readORMLivros() {

        List<Livro> listaLivros = new ArrayList<Livro>();

        String utTxt = "";
        try {
            openDB();
            Statement stmt = conn.createStatement();
            String sql = "select * from Livro";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                listaLivros.add(
                        new Livro(
                                rs.getInt("idLivro"),
                                rs.getString("titulo"),
                                rs.getString("isbn"),
                                rs.getString("assunto"),
                                rs.getString("autores"),
                                rs.getInt("exemplar")
                        ));
            }
        } catch (SQLException e) {
            utTxt = "Falha na conexão com a Base de Dados!";
        } finally {
            System.out.println(utTxt);
            closeDB();
        }
        return listaLivros;
    }

    public List<Emprestimo> readORMEmprestimos() {
        List<Emprestimo> listaEmprstimos = new ArrayList<Emprestimo>();

        String utTxt = "";
        try {
            openDB();
            Statement stmt = conn.createStatement();
            String sql = "select * from Emprestimo";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                listaEmprstimos.add(
                        new Emprestimo(
                                rs.getInt("idEmprestimo"),
                                rs.getDate("emprestimo"),
                                rs.getDate("devolucao"),
                                rs.getInt("usuario"),
                                rs.getInt("livro")
                        ));
            }
        } catch (SQLException e) {
            utTxt = "Falha na conexão com a Base de Dados!";
        } finally {
            System.out.println(utTxt);
            closeDB();
        }
        return listaEmprstimos;
    }
    
    public int createORMEmprestimo(Emprestimo _emprestimo){
        int utTxt = 0;
        try {
            openDB();
            Statement stmt = conn.createStatement();
            String sql = "insert into Emprestimo (emprestimo, devolucao, usuario, livro) values"
                    + "(DateTime('now'), DateTime('now'), '"+_emprestimo.getUsuario()+"', '"+_emprestimo.getLivro()+"')";
            utTxt = stmt.executeUpdate(sql);
            
            Projeto.print("Insert Ok de Emprestimo!");
        } catch (SQLException e) {
            Projeto.print("Falha na conexão com a Base de Dados!");
        } finally {
            closeDB();
        }
        return utTxt;
    }
}
