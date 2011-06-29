/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.blog.arruda.p2A.ex1;

/**
 *
 * @author arruda
 */
public class Empregado implements Comparable<Empregado> {
    private String nome;
    private String codigo;
    private double salario;

    public Empregado(String nome, String codigo, double salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }

    public Empregado() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Empregado t) {
        return this.nome.compareTo(t.getNome());
    }
    
            
}
