/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.blog.arruda.p2A.ex2;

import br.blog.arruda.p2A.ex1.*;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author arruda
 */
public class Exercicio02 {

    public static void main(String args[]) {

//        //XML
        XMLDecoder xmlD = null;
        try {
            xmlD = new XMLDecoder(new FileInputStream("empregrados.xml"));
        } catch (FileNotFoundException ex) {
        }

        ArrayList<Empregado> listaEmpsXml = new ArrayList<Empregado>();

        listaEmpsXml = (ArrayList<Empregado>) xmlD.readObject();
        xmlD.close();

        Map<String, Empregado> hashEmps = new TreeMap<String, Empregado> ();

        for (Empregado emp : listaEmpsXml) {
            hashEmps.put(emp.getCodigo(), emp);
        }
        Iterator i = hashEmps.keySet().iterator();
        while (i.hasNext()) {
            String codigo = (String) i.next();
            Empregado ee = (Empregado) hashEmps.get(codigo);
            System.out.println(codigo + ":" + ee.getNome());
        }

//        System.out.println(hashEmps.get("digdin").getNome());

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
