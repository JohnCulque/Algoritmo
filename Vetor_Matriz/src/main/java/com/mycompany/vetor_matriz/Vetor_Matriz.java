/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetor_matriz;

/**
 *
 * @author john.bsculque
 */
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Vetor_Matriz {

    public static void main(String[] args) {
       
        
        int v[] = new int[6];
        String n;
        String linha="";
        int max=v[0];
        double soma=0;
        int prod=1;
        double media=0;
        for(int i = 0; i <v.length; i++){
         n = JOptionPane.showInputDialog("Digite um valor: ");
         
         v[i] = Integer.parseInt(n); 
         soma += v[i];
         prod *= v[i];
         media = soma/v.length;
        }
        for(int i = 0; i <v.length; i++){
              if(v[i] > max ){
                  max = v[i];
              }
        }
        int min = max;
        
        for(int i = 0; i <v.length; i++){
              if(v[i] < min ){
                  min = v[i];
              }
        }
        
        linha = linha + "Valor Maximo:  "+max+
                      "\nValor Minimo:  "+min+
                      "\nSoma:  "+soma+
                      "\nProduto: "+prod+
                      "\nMedia: "+media;
        
        JOptionPane.showMessageDialog(null,linha);
    }
}
