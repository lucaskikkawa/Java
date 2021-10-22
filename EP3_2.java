/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;
import java.util.Scanner;
/**
 *
 * @author lucas.kikkawa
 */
public class EP3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int peso;
        float IMC,altura;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a sua altura:");
        altura = in.nextFloat();
        System.out.println("Digite o seu peso:");
        peso = in.nextInt();
        altura = altura/100; // converte cm para m
        IMC = peso/(altura*altura);
        if (IMC<=18.5){
            System.out.println("Magro");            
        }
        else if (IMC>18.5 && IMC<=25){
            System.out.println("Saudável");
        }
        else if (IMC>25 && IMC<=30){
            System.out.println("Acima do peso");
        }
        else if (IMC>30 && IMC<=35){
            System.out.println("Obeso");
        }
        else {
            System.out.println("Morbidez");
        }
            
    }
    
}
