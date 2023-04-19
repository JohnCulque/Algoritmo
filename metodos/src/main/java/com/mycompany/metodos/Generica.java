/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

import java.util.Arrays;

/**
 *
 * @author john.bsculque
 */
public class Generica {
    public int pesquisar(int vetor[], int valor){
     
        int pos=-1;
        for (int  i = 0;  i < vetor.length;  i++) {
            if(vetor[i]==valor){
                pos=i;
                break;
            }       
        }
       return pos;
    }
    public String pesquisarString(int vetor[], int valor){
     
        String linha = "";
        for (int  i = 0;  i < vetor.length;  i++) {
            if(vetor[i]==valor){
                linha += i+",";              
            }
        }
       return linha.length()>0?linha.substring(0,linha.length()-1): "não encontrado";
    }
    
    public double retornarArea(FiguraGeometrica a,double base,double alt, int op){        
        double area=-1;
        switch (op){
       
            case 1:
                area = a.areaQuadrado(base);
                break;
            case 2:
               area = a.areaRetangulo(base, alt);
               break;
            case 3:
                area = a.areaTriangulo(base, alt);
                break;
        }
        
        return area;
    }
    public int buscarValor(int v[]){
    
      Arrays.sort(v);
      return v[0];
    }
    public int buscarmaiorValor(int v[]){
    
      Arrays.sort(v);
      return v[13];
    }
    
    public double mediaArit(int v[]){
      
        int soma = 0;
        int media =0;
        for (int  i=0 ; i < v.length; i++) {
          soma += v[i];   
        }
        
        media = soma/v.length;
        return media;  
    }
}
