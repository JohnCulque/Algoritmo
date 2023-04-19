/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.metodos;

/**
 *
 * @author john.bsculque
 */
public class Metodos {

    public static void main(String[] args) {
        int v[] = {0,9,2,-2,3,4,33,2,4,533,2,4,11,4,5};
        Generica oG = new Generica();
        //int achou = oG.pesquisar(v, 4);
        //System.out.println(achou);
        
        
        //String achouString = oG.pesquisarString(v, 4);
        
        //System.out.println(achouString);
        
      //FiguraGeometrica oQ = new FiguraGeometrica();
     // double area = oG.retornarArea(oQ, 9, 100, 3);
      //  System.out.println(area);
      //  
        int pesquisa = oG.buscarValor(v);
        System.out.println(pesquisa);
        
        int maior = oG.buscarmaiorValor(v);
        System.out.println(maior);
        
       double media = oG.mediaArit(v);
        System.out.println(media);
    }
}
