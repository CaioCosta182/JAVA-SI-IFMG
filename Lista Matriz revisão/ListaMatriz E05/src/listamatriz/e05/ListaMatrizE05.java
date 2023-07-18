/*
 Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos
elementos de mesmo índice, colocando o resultado em um terceiro vetor. Mostre o vetor
resultante.
Entrada: A = {4, 6, 9, 2, 0, 12, 2, 10, 8, 2}
B = {6, 3, 8, 5, 1, 0, 8, 4, 1, 6}
Saída:
C = {24, 18, 72, 10, 0, 0, 16, 40, 8, 12}
 */
package listamatriz.e05;
import java.util.Scanner;

public class ListaMatrizE05 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int a[] = new int[10], b[] = new int[10], c[] = new int[10];
        
        System.out.println("Informe os valores do vetor A: ");
        for(int i = 0; i < 10; i++){
            System.out.print((i+1) + ": ");
            a[i] = teclado.nextInt();
        }
        System.out.println("Informe os valores do vetor B: ");
        for(int i = 0; i < 10; i++){
            System.out.print((i+1) + ": ");
            b[i] = teclado.nextInt();
        }
        for(int i = 0; i < 10; i++){
            c[i] = a[i] * b[i];
        }
        System.out.print("C=");
        for(int i = 0; i < 10; i++){
            System.out.print(c[i] + ", ");
        }
        System.out.println();
    }
    
}
