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
public class CauculadoraPizza {
    
    public static void main(String[] args) {
    String sabor;
    Integer valor, qtdPessoas, maximo, total, valorMaximo;

    Scanner leitor = new Scanner(System.in);
    Scanner leitor2 = new Scanner(System.in);
    
    System.out.println("Qual é o valor da pizza?");
    valor = leitor.nextInt();
   
    System.out.println("Qual é o sabor da pizza?");
    sabor = leitor2.nextLine();

    System.out.println("Quantas pessoas irão rachar a conta?");
    qtdPessoas = leitor.nextInt();
   
    System.out.println("Qual o valor máximo que aceitam pagar?");
    maximo = leitor.nextInt();


    total= valor/qtdPessoas;

    valorMaximo = qtdPessoas * maximo;

    if(total <= maximo){
       System.out.println("A pizza de " + sabor + "será dividida entre "
        + qtdPessoas + " pessoas. R$" + total + "para cada.");
    }else{
       System.out.println("Deu ruim no racha. A pizza deveria custar no máximo R$" + valorMaximo);
    }
   }
    
}
