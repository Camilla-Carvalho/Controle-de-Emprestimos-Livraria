package com.camillacarvalho.projetos.persistencia;

import static javax.swing.JOptionPane.*;
import java.sql.*;

public class Avtaler {

    private static String url = "jdbc:sqlite:usuario.db", nomeTabela = "Usuario";
    private static Connection conn = null;

    public static void main(String[] args) { //throws ClassNotFoundException {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.print("#############################\n");
            System.out.print(ex + "\n");
            System.out.print("#############################\n");
        }

        String utTxt = "";
        openDB();  // Kontakter databasen 

        try {
            Statement stmt = conn.createStatement();
            // Opprette databasen gjøres først!
            nomeTabela = "Usuario";
            url = "jdbc:sqlite:" + nomeTabela + ".db";
            String sql = sqlInitDB(); // Spørring def i hjelpemetode
            stmt.executeUpdate(sql);
            utTxt = "Databasen initen - ok!" + "\n";

            // Lister ut alle personer i databasen
            // String sql = "select * from Person;";      
            sql = "select * from " + nomeTabela + " ;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
//        int nr           = rs.getInt("Nr");
//        String dato   = rs.getString("Dato");
//        String sted = rs.getString("Sted");
//        String beskrivelse = rs.getString("Beskrivelse");
                utTxt += rs.getRow() + "\n";
            }
        } catch (SQLException e) {
            utTxt = "Databasespørring feilet!";
        }
        showMessageDialog(null, utTxt);
        closeDB();
    }

    // Kobler opp til databasen.
    private static void openDB() {
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Oppkobling til databasen " + url + " feilet." + "\n" + e.toString());
        }
    }

    // Lukker forbindelsen til databasen.
    private static void closeDB() {
        try {
            conn.close();
        } catch (SQLException e) {
        }
    }

    private static String sqlInitDB() {

        String tabela = "", insert = "";

        switch (nomeTabela) {
            case ("Usuario"):
                tabela = "drop table if exists " + nomeTabela + "; create table " + nomeTabela + "(idUsuario integer primary key, login varchar(45), senha varchar(45), categoria int);";
                insert = "insert into " + nomeTabela + " values ( 1, DateTime('now'), 'admin', 'admin');"
                        + "insert into " + nomeTabela + " values ( 2, DateTime('now'), 'camillinda', 'camillinda123');"
                        + "insert into " + nomeTabela + " values ( 3, DateTime('now'), 'vinicius', 'vinicius123');"
                        + "insert into " + nomeTabela + " values ( 4, DateTime('now'), 'joao', 'joao123');";
                break;
            case ("Categoria"):
                tabela = "drop table if exists " + nomeTabela + "; create table " + nomeTabela + "(idCategoria integer primary key, descricao varchar(45), periodo int);";
                break;
            case ("Livro"):
                tabela = "drop table if exists " + nomeTabela + "; create table " + nomeTabela + "(idLivro integer primary key, titulo varchar(45), isbn varchar(15), assunto varchar(45), autores varchar(150), exemplar integer);";
                insert = " " + "insert into " + nomeTabela + " values ( 1, '2019-09-09 09:00:00', 'admin', 'admin');";
                break;
            case ("Emprestimo"):
                tabela = "drop table if exists " + nomeTabela + "; create table " + nomeTabela + "(idEmprestimo integer primary key, emprestimo date, devolucao date, usuario int, livro int);";
                break;
            default:
            //throw new AssertionError();
        }
        return tabela + " " + insert;

//      
//      return       "drop table if exists Avtale; create table Avtale(Nr integer primary key, Dato varchar(50), Sted varchar(50), Beskrivelse varchar(50) );"
//  + "insert into Avtale values ( 1, '2019-09-09 09:00:00', 'Oslo', 'Gruppearbeid');"
//  + "insert into Avtale values ( 2, '2019-07-07 07:00:00', 'Fredrikstad', 'Signere kontrakt');"
//  + "insert into Avtale values ( 3, '2019-12-05 11:30:00', 'Bø', 'Pub med gutta');"
//  + "insert into Avtale values ( 4, '2019-06-09 07:45:00', 'Oslo', 'Gruppearbeid');"
//  + "insert into Avtale values ( 5, '2019-08-11 12:00:00', 'Bergen', 'Basketball trening');";
    }

}
