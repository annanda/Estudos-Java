/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.blog.arruda.p2A.ex2;

import br.blog.arruda.p2A.ex1.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author arruda
 */
public class Exercicio02 {
 
    public static void main(String args[]){       
        
        //XML
        XMLDecoder xmlD =null;
        try {
            xmlD = new XMLDecoder(new FileInputStream("empregrados.xml"));
        } catch (FileNotFoundException ex) {
        }
        
        ArrayList<Empregado> listaEmpsXml = new ArrayList<Empregado>();
        
        listaEmpsXml = (ArrayList<Empregado> ) xmlD.readObject();        
        xmlD.close();
//        
//        Map<String, Double> mapEmpsXml = new Map<String, Double>();
//        
//        for(Empregado e:listaEmpsXml){
//            
//        }
//        
//        //BINARIO
//        ObjectOutputStream oos = null;
//        try {
//                oos = new ObjectOutputStream(new FileOutputStream("empregrados.bin"));
//                oos.writeObject(listaEmps);
//                oos.close();
//        } catch (FileNotFoundException ex) {
//        } catch (IOException ex) {
//        }
        
    }
}
