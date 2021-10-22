/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Prova 1  P1 PI Pratica

        Lucas Kikkawa Perpetua - 11201810415

        Questão 1

 */

import java.util.Scanner;

/**

 *

 * @author lucas.kikkawa

 */

public class Questao1 {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

// imprimir o menor resto por 2 dos 3 números lidos

        int n1,n2,n3,menor_resto,resto=2;

        int resto_n1,resto_n2,resto_n3;

        Scanner buf = new Scanner(System.in);

        System.out.println("Digite o valor do n1:");

        n1 = buf.nextInt();

        System.out.println("Digite o valor do n2:");

        n2 = buf.nextInt();

        System.out.println("Digite o valor do n3:");

        n3 = buf.nextInt();

        resto_n1 = n1%resto;

        resto_n2 = n2%resto;

        resto_n3 = n3%resto;

        if (resto_n1<resto_n2 && resto_n1<resto_n3){

            menor_resto = resto_n1;

        }

        else if (resto_n2<resto_n3){

            menor_resto = resto_n2;

        }

        else{

            menor_resto = resto_n3;

        }

        System.out.println(menor_resto);

    }

}

//Questão 2

import java.util.Scanner;

/**

 *

 * @author lucas.kikkawa

 */

public class Questao2 {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

// divisores, ou seja, numeros q o resto seja 0.

        int r,qtd_div_par=0,qtd_div_impar=0,divisor;

        Scanner buf = new Scanner(System.in);

        System.out.println("Digite um número inteiro");

        r = buf.nextInt();

        if(r>0){

            for(int i=1;i<=r;i++){

                if(r%i==0){

                    if(i%2==0){

                        qtd_div_par++;

                    }

                    else{

                        qtd_div_impar++;

                    }

                }

            }

        }

        System.out.println("Qde de divisores pares: "+qtd_div_par);

        System.out.println("Qde de divisores impares: "+qtd_div_impar);

    }

}

//Questão 3

import java.util.Scanner;

/**

 *

 * @author lucas.kikkawa

 */

public class Questao3 {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

// input idade, sexo(masc ou femin)

/* output total inscritos,porc candid mascul,porc candid femin,

media idade dentre os femininos,menor idade masculino.

break = quando a idade for 0

sexo = 1(masc) ou 2(fem)

media_fem = acumulador_idade/qtd_fem

*/

        int idade=1,qtd_candid=0,total_idade_fem=0;

        int sexo,menor_idade=100,total_candid=0;

        float med_idade_fem=0f,porc_masc=0f,porc_fem=0f,qtd_masc=0f,qtd_fem=0f;

        Scanner buf = new Scanner(System.in);

        while(idade>0){

            System.out.println("Digite a idade do candidato:");

            idade = buf.nextInt();

            if(idade>0){

                total_candid++; // já é um candidato válido

                System.out.println("Digite o sexo do candidato:");

                sexo = buf.nextInt();

                if (sexo==2){

                    qtd_fem++; // incrementa candidato feminino

                    total_idade_fem += idade; // incrementa acumulador idade fem

                }

                else{

                    qtd_masc++; // incrementa candidato masculino

                    if(menor_idade>idade){

                        menor_idade=idade;

                    }

                }

                med_idade_fem = total_idade_fem/qtd_fem;

                porc_masc = (float)qtd_masc/total_candid;

                porc_fem = (float)(qtd_fem/total_candid);

            }

        }

        System.out.println("Total de inscritos: "+total_candid);

        System.out.printf("Candidatos do sexo masculino: %.0f",porc_masc*100);

        System.out.print("%\n");

        System.out.printf("Candidatos do sexo feminino: %.0f",porc_fem*100);

        System.out.print("%\n");

        System.out.println("Média das idades (feminino): "+med_idade_fem);

        System.out.println("menor idade (masculino): "+menor_idade);

    }

}