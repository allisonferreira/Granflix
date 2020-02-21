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
public class IMC {
    public static void main(String[] args) {
    Double altura, peso, sexo, imc;


    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe a sua altura:");
    altura = leitor.nextDouble();

    System.out.println("Informe o seu peso:");
    peso = leitor.nextDouble();

    System.out.println("Informe o seu sexo: \n Sendo:\n1-mulher\n2-homem");
    sexo = leitor.nextDouble();

    imc= peso/ (2* altura);

    if(sexo == 1){
        if(imc < 19.1){
            System.out.println("Abaixo do peso");
        }else if( imc >=19.1 && imc <25.8){
            System.out.println("Peso normal");
        }else if(imc >= 25.8 && imc <27.3){
            System.out.println("Marginalmente acima do peso");
        }else if(imc >= 27.3 && imc < 32.3){
            System.out.println("Acima do peso ideal");
        }else{
            System.out.println("Obesa");
        }
       
    }else{
        if(imc < 20.7){
            System.out.println("Abaixo do peso");
        }else if( imc >=20.7 && imc <26.4){
            System.out.println("Peso normal");
        }else if(imc >= 26.4 && imc <27.8){
            System.out.println("Marginalmente acima do peso");
        }else if(imc >= 27.8 && imc < 31.1){
            System.out.println("Acima do peso ideal");
        }else{
            System.out.println("Obeso");
        }
    }


}
}
