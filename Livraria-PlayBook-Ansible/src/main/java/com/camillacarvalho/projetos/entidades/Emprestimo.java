package com.camillacarvalho.projetos.entidades;

import com.camillacarvalho.projetos.janelas.HomeController;
import java.sql.Date;

/**
 * Modelo: Emprestimo
 * @author Camilla Carvalho
 */
public class Emprestimo {

    private int idEmprestimo;
    private Date emprestimo;
    private Date devolucao;
    private int qtddDiasDevolucao;
    private int usuario;
    private int livro;

    /**
     * 
     * @param _idEmprestimo
     * @param _emprestimo
     * @param _devolucao
     * @param _usuario
     * @param _livro 
     */
    public Emprestimo(int _idEmprestimo, Date _emprestimo, Date _devolucao, int _usuario, int _livro) {
        idEmprestimo = _idEmprestimo;
        emprestimo = _emprestimo;
        devolucao = _devolucao;
        usuario = _usuario;
        livro = _livro;
    }

    public Emprestimo(int _usuario, int _livro, int _diasDevolucao) {
        idEmprestimo = HomeController.listaUsuarios.size();
        emprestimo = new Date(System.currentTimeMillis());
        devolucao = emprestimo;
        usuario = _usuario;
        livro = _livro;
        qtddDiasDevolucao = _diasDevolucao;
    }
    
    public Emprestimo() {}
    
    /**
     * @return the idEmprestimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * @param idEmprestimo the idEmprestimo to set
     */
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    /**
     * @return the emprestimo
     */
    public Date getEmprestimo() {
        return emprestimo;
    }

    /**
     * @param emprestimo the emprestimo to set
     */
    public void setEmprestimo(Date emprestimo) {
        this.emprestimo = emprestimo;
    }

    /**
     * @return the devolucao
     */
    public Date getDevolucao() {
        return devolucao;
    }

    /**
     * @param devolucao the devolucao to set
     */
    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    /**
     * @return the usuario
     */
    public int getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the livro
     */
    public int getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(int livro) {
        this.livro = livro;
    }

    /**
     * @return the qtddDiasDevolucao
     */
    public int getQtddDiasDevolucao() {
        return qtddDiasDevolucao;
    }

}
