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
public class Sorveteria {
    public static void main(String[] args) {
        String opcao;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o número da opção desejada: \n1-Casquinha \n2-Sundae \n3-Milk Shake");
        opcao = leitor.nextLine();
        
        switch (opcao){
             
            case "Casquinha":
                System.out.println("A casquinha custa R$2,00");
                break;
            case "Sundae":
                System.out.println("O sundae custa R$5,00");
                break;
            case "Milk Shake":
                System.out.println("O Milk Shake custa R$7,00");
                break;
            default:
                System.out.println("Não existe esse código");
        }
        
        
    }
}
