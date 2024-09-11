/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Aluno> lista = new ArrayList<>();
        
        
        lista.add(new Aluno("Matheus", 20));
        lista.add(new Aluno("Matheus", 19));
        lista.add(new Aluno("Matheus", 22));
        lista.add(new Aluno("Iago", 21));
        lista.add(new Aluno("Romeo", 19));
        lista.add(new Aluno("Difante", 19));
        lista.add(new Aluno("Vicenzo", 19));
        lista.add(new Aluno("Gabriela", 17));
        
        //Collections.sort(lista);
        Ordenacao.pente(lista);
        
        for(Aluno aluno : lista){
            System.out.println(aluno);
        }
        
    }
}
