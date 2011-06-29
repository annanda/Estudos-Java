/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.blog.arruda.p2A.ex1;

import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author arruda
 */
public class Exercicio01 {
 
    public static void main(String args[]){
         BufferedReader reader=null;
        try {
           reader = new BufferedReader(new FileReader("empregados.txt"));
        } catch (FileNotFoundException ex) {
            return;
        }
        
        ArrayList<Empregado> listaEmps = new ArrayList<Empregado>();
        String str;
        try {
            while((str = reader.readLine())!=null){
                String []infos = str.split(";");
                Empregado e = new Empregado(infos[0],infos[1],new Double(infos[2]));
                listaEmps.add(e);
            }
        } catch (IOException ex) {
        }
        
        
        //XML
        XMLEncoder xmlE =null;
        try {
            xmlE = new XMLEncoder(new FileOutputStream("empregrados.xml"));
        } catch (FileNotFoundException ex) {
        }
        xmlE.writeObject(listaEmps);
        xmlE.close();
        
        //BINARIO
        ObjectOutputStream oos = null;
        try {
                oos = new ObjectOutputStream(new FileOutputStream("empregrados.bin"));
                oos.writeObject(listaEmps);
                oos.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        
    }
}
