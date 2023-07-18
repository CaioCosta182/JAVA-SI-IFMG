/*
Faça um algoritmo que construa uma matriz de nome MAT de 10 linhas e15colunas contendo números inteiros.
Em seguida escreva a soma dos elementosde cada linha e se a soma dos elementos é par ou ímpar. 
Por fimescreva a somados elementos de cada coluna e se a soma dos elementos é par ou ímpar
 */
package listamatriz.e01;
import java.util.Scanner;
public class ListaMatrizE01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int [10][15];
        
                for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                matriz[i][j] = (int) (Math.random() * 10); // Números aleatórios entre 0 e 99
            }
        }
        
        // Calcula e exibe a soma dos elementos de cada linha
        System.out.println("Soma dos elementos de cada linha:");
        for (int i = 0; i < 10; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 15; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.print("Linha " + (i+1) + ": " + somaLinha);
            if (somaLinha % 2 == 0) {
                System.out.println(" (Par)");
            } else {
                System.out.println(" (Ímpar)");
            }
        }
        
        // Calcula e exibe a soma dos elementos de cada coluna
        System.out.println("Soma dos elementos de cada coluna:");
        for (int j = 0; j < 15; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 10; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.print("Coluna " + (j+1) + ": " + somaColuna);
            if (somaColuna % 2 == 0) {
                System.out.println(" (Par)");
            } else {
                System.out.println(" (Ímpar)");
            }
        }

    }
    
}
