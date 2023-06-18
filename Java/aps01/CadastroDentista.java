/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unit.aps01;

import java.util.Date;

/**
 *
 * @author Jorge Luiz
 */
public class CadastroDentista {
    private int cro;
    private String nome;
    private Date nacimento, cadastro;

    /**
     * @return the cro
     */
    public int getCro() {
        return cro;
    }

    /**
     * @param cro the cro to set
     */
    public void setCro(int cro) {
        this.cro = cro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nacimento
     */
    public Date getNacimento() {
        return nacimento;
    }

    /**
     * @param nacimento the nacimento to set
     */
    public void setNacimento(Date nacimento) {
        this.nacimento = nacimento;
    }

    /**
     * @return the cadastro
     */
    public Date getCadastro() {
        return cadastro;
    }

    /**
     * @param cadastro the cadastro to set
     */
    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }
}
