package com.camillacarvalho.projetos;

import com.camillacarvalho.projetos.janelas.HomeController;
 
/**
 * Projeto Fatec Botucatu, ADS
 * @author Camilla Carvalho <camillacarvalho.c4@gmail.com>
 */
public class Projeto {
    public static void main(String[] args) {
        System.out.println("Hello Fatec >> Projeto Livraria by Camilla Carvalho.");
        new HomeController().setVisible(true);
    }
    
    public static void print(Object objeto){
        System.out.println(objeto);
    }
}
