/*
Faça um programa que recebe 2 vetores A e B de tamanho 8. Em seguida, troque os valores
entre A e B, ou seja, passe os valores de A para B e os valores de B para A. Imprima os vetores
resultantes.
Entrada: A = {4, 6, 9, 2, 0, 12, 2, 10}
B = {6, 3, 8, 5, 1, 0, 8, 4}
Saída:
A = {6, 3, 8, 5, 1, 0, 8, 4}
B = {4, 6, 9, 2, 0, 12, 2, 10}
*/
package listamatriz.e04;
import java.util.Scanner;

public class ListaMatrizE04 {
   public static void main(String[] args) {
       
       int a[] = new int [8], b[] = new int [8], r[]= new int[8];
       
       Scanner teclado = new Scanner(System.in);

        System.out.println("Informe os valores do vetor A: ");
          for(int i = 0; i < 8; i++){
            System.out.print((i +1) + ":");
            a[i] = teclado.nextInt();
            r[i] = a[i];
          }
        System.out.println("Informe o valor do vetor B: ");
        for(int i =0 ; i < 8; i++){
        System.out.print((i+1) + ":");
        b[i] = teclado.nextInt();
        
    }
        for(int i = 0; i < 8; i++){
            a[i] = b[i];
        }
        for(int i = 0; i < 8; i++){
            b[i] = r[i];
        }
        System.out.println("Após inversão de valores entre o vetor A e B o resultado será: ");
        System.out.println("Valores do vetor A: ");
        for(int i = 0; i < 8; i++){
            System.out.print(a[i] + " "); 
        }
         System.out.println();
         System.out.println("Valores do vetor A: ");
         for(int i = 0; i < 8; i++){
            System.out.print(b[i] + " "); 
        }
        System.out.println();
    }
    
}
