/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista;

import java.util.Scanner;

/**
 *
 * @author allis
 */
public class Boletim {
    public static void main(String[] args) {
    Double nota1, nota2, nota3, mediaNotas;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe a sua primeira nota.");
    nota1 = leitor.nextDouble();

    System.out.println("Informe a sua segunta nota.");
    nota2 = leitor.nextDouble();

    System.out.println("Informe a sua terceira nota.");
    nota3 = leitor.nextDouble();

    mediaNotas = (nota1 + nota2 + nota3) / 3;

    if(mediaNotas >=7){
        System.out.println("Passou direto.");
    }else if(mediaNotas < 7 && mediaNotas >= 5){
        System.out.println("Têm direito de fazer uma prova de recuperação");
        
    }else{
        System.out.println("Reprovado direto");
        
    }

}
}
