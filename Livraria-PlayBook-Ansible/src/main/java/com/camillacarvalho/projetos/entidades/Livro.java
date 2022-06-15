package com.camillacarvalho.projetos.entidades;

/**
 * Modelo: Livro
 * @author Camilla Carvalho
 */
public class Livro {
     private int idLivro;
     private String titulo;
     private String isbn;
     private String assunto;
     private String autores;
     private int exemplar;
     
     public Livro(int _idLivro, String _titulo, String _isbn, String _assunto, String _autores, int _exemplar){
        idLivro = _idLivro;
        titulo = _titulo;
        isbn = _isbn;
        assunto = _assunto;
        autores = _autores;
        exemplar = _exemplar;
     }
     
    /**
     * @return the idLivro
     */
    public int getIdLivro() {
        return idLivro;
    }

    /**
     * @param idLivro the idLivro to set
     */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    /**
     * @return the autores
     */
    public String getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * @return the exemplar
     */
    public int getExemplar() {
        return exemplar;
    }

    /**
     * @param exemplar the exemplar to set
     */
    public void setExemplar(int exemplar) {
        this.exemplar = exemplar;
    }
     
}
