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
public class Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número:");
        num = input.nextInt();
        if (num%3 == 0){
            System.out.println(num*num);
        }
        else {
            System.out.println(num*2);
        }
    }
    
}
