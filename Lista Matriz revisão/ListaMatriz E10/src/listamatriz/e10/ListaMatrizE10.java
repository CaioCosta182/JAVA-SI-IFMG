/*
 Faça um programa que leia 20 valores e armazene-os num vetor de inteiros. Imprima na tela o
vetor na ordem lida e depois em ordem crescente.
A seguir, um exemplo para um vetor de tamanho 5.
Entrada: v = {10, 4, 7, 1, 8}
Saída:
v = {10, 4, 7, 1, 8}
v = {1, 4, 7, 8, 10}
 */
package listamatriz.e10;
import java.util.Scanner;

public class ListaMatrizE10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int v1[] = new int[5], v2[] = new int[5];
        
        System.out.println("Informe os valores do vetor: ");
        for(int i = 0; i < 5; i++){
          System.out.print((i +1)+": ");
            v1[i] = teclado.nextInt();
            v2[i] = v1[i];
        }
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (v2[i] > v2[j]) {
                    int temp = v2[i];
                    v2[i] = v2[j];
                    v2[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("V1 = {");
        for(int i = 0; i < 5; i++){
            System.out.print(v1[i]);
            if( i < 4){
            System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();
        System.out.print("V2 = {");
        for(int i = 0; i < 5; i++){
            System.out.print(v2[i]);
            if( i < 4){
            System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();
    }
    
}
