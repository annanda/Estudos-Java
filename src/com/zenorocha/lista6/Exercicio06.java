/*
 * Lista 6
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 *
 * Implementado por Zeno Rocha
 * Em 29/06/2011
 *
 * --------------------------------------------------------------------------------------------
 *
 * Exercício 6
 *
 *	Seja uma classe Produto com atributos nome (string), código (int) e preço (double), faça
 *      um programa que instancie alguns produtos (ex: 3 produtos), armazenando suas
 *      referências em um array. Em seguida, armazene os dados desses três produtos em um
 *      arquivo via serialização binária.
 *
 */

package com.zenorocha.lista6;

import com.zenorocha.lista6.Produto;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Exercicio06 {

    public static void main (String args[]) {
        
        Produto p1 = new Produto("Produto - 1", 1, 10.5);
        Produto p2 = new Produto("Produto - 2", 2, 13.2);
        Produto p3 = new Produto("Produto - 3", 3, 15);

        ArrayList<Produto> lista = new ArrayList();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        try {

            ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("produto.dat")));

            output.writeObject(lista);
            output.close();

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }




    }

}

