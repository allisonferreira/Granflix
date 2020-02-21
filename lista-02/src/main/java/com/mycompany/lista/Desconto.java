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
public class Desconto {
    public static void main(String[] args) {
    Integer valor, codigo, total;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Qual o valor do seu produto?");
    valor = leitor.nextInt();

    System.out.println("Qual o seu código?");
    codigo = leitor.nextInt();

     switch (codigo){
      
        case 1: System.out.println("Produto sem desconto: R$" + valor + "\n Produto com desconto: R$" + (valor -(valor*0.05)));   
            break;
        
        case 2:
         System.out.println("Produto sem desconto: R$" + valor 
         +"\n Produto com desconto: R$"+ (valor - (valor*0.1)));   
            break;
        
        case 3:
         System.out.println("Produto sem desconto: R$" + valor 
         +"\n Produto com desconto: R$"+ (valor - (valor*0.2)));   
            break;
            
        case 4:
         System.out.println("Produto sem desconto: R$" + valor 
         +"\n Produto com desconto: R$"+ (valor - (valor*0.5)));   
            break;
    
        default:
        System.out.println("Código inválido");
            break;
    }
}
}
