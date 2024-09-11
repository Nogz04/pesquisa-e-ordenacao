/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
public class Ordenacao {
    
    public static void pente(ArrayList<Aluno> lista){
        int distancia = lista.size();
        Aluno tmp;
        int i;
        boolean houveTroca;
        
        do {
            
            distancia = (int) (distancia / 1.3);
            if(distancia < 1) 
                distancia = 1;
            
            houveTroca = false;
            for(i = 0; i < lista.size() - distancia; i++){
                if(lista.get(i).compareTo(lista.get(i+distancia)) > 0){
                    
                    houveTroca = true;
                    
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+distancia));
                    lista.set(i+distancia, tmp);
                }
            }
        } while(distancia > 1 || houveTroca);
    }
    
    
    public static void bolha(ArrayList<Aluno> lista){
        
        Aluno tmp;
        int i;
        boolean houveTroca;
        
        do {
            houveTroca = false;
            for(i = 0; i < lista.size() - 1; i++){
                if(lista.get(i).compareTo(lista.get(i+1)) > 0){
                    
                    houveTroca = true;
                    
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, tmp);
                }
            }
        } while(houveTroca);
        
    }
    
}
