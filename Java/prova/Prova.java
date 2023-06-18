/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova;

/**
 *
 * @author Acer
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Moradores> listaMoradores = new ArrayList<Moradores>();
        ArrayList<Perguntas> listaPerguntas = new ArrayList<Perguntas>();
        
        Moradores moradores = new Moradores();
        do {
            System.out.println("Nome do morador: ");
            moradores.setNome(entrada.next());
            System.out.println("Bloco: ");
            moradores.setBloco(entrada.next());
            System.out.println("Apartamento: ");
            moradores.setApartamento(entrada.nextInt());
            listaMoradores.add(moradores);
            
            } 
        while (moradores.getApartamento() > 0);
        
        Perguntas perguntas = new Perguntas();
        do {
            System.out.println("ID da pergunta: ");
            perguntas.setId(entrada.nextInt());
            System.out.println("Texto da pergunta: " + "\n" +
                               "Você é a favor da reforma da academia? [S/N");
            String resposta = entrada.next();
            if (resposta.equalsIgnoreCase("S")) {
                perguntas.setTextoPergunta(true);
            } else {
                perguntas.setTextoPergunta(false);
            }
            listaPerguntas.add(perguntas);
            
        } while (perguntas.getId() > 0);
        
        System.out.println("Lista: " + listaPerguntas.toString());
        
        for (int i = 0; i < listaMoradores.size(); i++) {
            System.out.println("Morador: " + listaMoradores.toString());
        }
        
    }
}
