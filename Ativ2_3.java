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
public class Ativ2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a medida A do triangulo: ");
        A = input.nextInt();
        System.out.println("Digite a medida B do triangulo: ");
        B = input.nextInt();
        System.out.println("Digite a medida C do triangulo: ");
        C = input.nextInt();
        if ((A<B+C)&&(B<A+C) &&(C<A+B)){
            if (A==B && B==C){
                System.out.println("triangulo equilatero");
          
            }
            else if (A==B ||B==C || C==A){
                System.out.println("triangulo isosceles");
         
            }
            else {
                System.out.println("triangulo escaleno");
                
            }
        }
        else {
            System.out.println("os lados nao formam um triangulo");
        }
    }
    
}
