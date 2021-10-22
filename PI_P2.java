/*
Lucas Kikkawa Perpetua
        11201810415 PI P2
*/

//        Questão 1

import java.util.Scanner;
/**
 *
 * @author lucas.kikkawa
 */
public class Q1 {
    static Scanner buf = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    // criar um vetor em que [0] = menor, [1] = maior, faço bubble sort.
    // media padrao = (x[i] - x)2 <- x[i] é a posição atual e x é a media)
    // n-1 <- n = tamanho do vetor.
    public static void main(String[] args) {
        float resultado[] = new float[2],media,desv_padr,maior,menor;
        System.out.println("Digite a quantidade de números:");
        int n = buf.nextInt();
        float vet[] = new float[n];
        Preench(vet);
        resultado = Menor_Maior(vet);
        maior = resultado[1];menor = resultado[0];
        media = Media(vet);
        desv_padr = Desv_pad(vet,media);
        System.out.println("Menor número: "+menor);
        System.out.println("Maior número: "+maior);
        System.out.println("Média: "+media);
        System.out.println("Desvio Padrão: "+desv_padr);
    }

    public static void Preench(float v[]){
        for(int i = 0;i<v.length;i++){
            System.out.println("Digite o elemento na posição = ["+i+"]");
            v[i] = buf.nextInt();
        }
    }

    public static float[] Menor_Maior(float v[]){
        float aux=0;
        float result[] = new float[2];
        for(int n = 0;n<v.length;n++){ //bubble sort, [0] vai ser o menor.
            for(int i = 0;i<v.length-1;i++){
                if(v[i]>v[i+1]){
                    aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                }
            }
        }
        result[0] = v[0];result[1] = v[v.length-1];
        return result;
    }

    public static float Media(float v[]){
        float soma_media=0,media,tam = (float)v.length;
        for(int i = 0;i<v.length;i++){
            soma_media += v[i];
        }
        media = soma_media/tam;
        return media;
    }

    public static float Desv_pad(float v[],float med){
        float soma_desv_padr = 0,tam = v.length-1,result;
        for(int i = 0;i<v.length;i++){
            soma_desv_padr += Math.pow(v[i]-med, 2);
        }
        result = (float) Math.sqrt(soma_desv_padr/(tam));
        return result;
    }



}

//Questão 2

import java.util.Scanner;
/**
 *
 * @author lucas.kikkawa
 */
public class Q2 {
    static Scanner buf = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lin,col;
        System.out.println("Digite a quantidade de linhas:");
        lin = buf.nextInt();
        System.out.println("Digite a quantidade de colunas:");
        col = buf.nextInt();
        int matriz[][] = new int[lin][col];
        PreencheMatriz(matriz);
        System.out.println("Digite a linha i");
        int i = buf.nextInt();
        System.out.println("Digite a linha j");
        int j = buf.nextInt();
        Imprimir(matriz);
        System.out.println();
        trocaMatrizLinha(matriz,i,j);
        Imprimir(matriz);
    }

    public static void trocaMatrizLinha(int m[][],int i,int j){
        int aux;
        for(int x = 0;x<m.length;x++){
            aux = m[i][x];
            m[i][x] = m[j][x];
            m[j][x] = aux;
        }
    }

    public static void PreencheMatriz(int M[][]){
        for(int i=0;i<M.length;i++){
            for(int j = 0;j<M[0].length;j++){
                System.out.println("Digite o elemento na posição = ["+i+"]["+j+"]");
                M[i][j] = buf.nextInt();
            }
        }

    }

    public static void Imprimir(int m[][]){
        for(int i=0;i<m.length;i++){
            for(int j = 0;j<m[0].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

}

//Questão 3

/**
 *
 * @author lucas.kikkawa
 */
public class Q3 {
    static String dias[][] = new String[2][7];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dias[1][0] = "Domingo";
        dias[1][1] = "Segunda";
        dias[1][2] = "Terça";
        dias[1][3] = "Quarta";
        dias[1][4] = "Quinta";
        dias[1][5] = "Sexta";
        dias[1][6] = "Sabado";
        float media_cal;
        float matriz[][] = new float[4][8];
        int lin = matriz.length,col = matriz[0].length;
        PreencheMatriz(matriz,lin,col);
        TotalCaloriasPorDia(matriz,lin,col);
        TotalCaloriasPorRefeicao(matriz,lin,col);
        media_cal = MediaCaloriasDiaria(matriz,lin,col);
        System.out.println("Média diária de calorias consumidas: "+media_cal);
        CaloriasAbaixoMedia(matriz,lin,col,media_cal);
    }

    public static void PreencheMatriz(float M[][],int lin,int col){
        for(int i=0;i<lin-1;i++){
            for(int j = 0;j<col-1;j++){
                M[i][j] = (float)Math.random()*1000;
            }
        }

    }

    public static void TotalCaloriasPorDia(float M[][],int lin,int col){
        System.out.println("Calorias ingeridas por dia:");
        float soma_dia=0;
        for(int j=0;j<col-1;j++){
            for(int i = 0;i<lin-1;i++){
                soma_dia += M[i][j];
            }
            M[lin-1][j] = soma_dia;
            soma_dia = 0;
            System.out.printf("%s: %f\n",dias[1][j],M[lin-1][j]);
        }

    }

    public static void TotalCaloriasPorRefeicao(float M[][],int lin,int col){
        float soma_refeicao=0;
        for(int i=0;i<lin-1;i++){
            for(int j = 0;j<col-1;j++){
                soma_refeicao += M[i][j];
            }
            M[i][col-1] = soma_refeicao;
            soma_refeicao = 0;
        }
    }
    public static float MediaCaloriasDiaria(float M[][],int lin,int col){
        // soma_cal_tot/7 = numero de dias
        float soma_cal_tot=0,media;
        for(int j = 0;j<col-1;j++){
            soma_cal_tot += M[lin-1][j];
        }
        media = (float)soma_cal_tot/7;
        return media;
    }

    public static void CaloriasAbaixoMedia (float M[][],int lin,int col,float media){
        //m[2][7],[0][j] armazena se é abaixo ou n,[1][j] armazena os dias correspondentes.
        for(int j = 0;j<col-1;j++){
            if(M[lin-1][j]<media){
                dias[0][j] = "sim";
            }
            else{
                dias[0][j] = "nao";
            }
        }
        System.out.println("Dia(s) em que a ingestão de calorias foi(ram) abaixo da média diária:");
        for(int j = 0;j<dias[0].length;j++){
            if(dias[0][j].equals("sim")){
                System.out.print(dias[1][j]);
                if(j!=dias[0].length-1){
                    System.out.print(", ");
                }
            }


        }

    }
}