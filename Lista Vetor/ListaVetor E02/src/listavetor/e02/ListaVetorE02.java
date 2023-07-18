/*
Elabore um programa que leia 5 valores para um vetor A. Leia mais 5 valores para o vetor B. Calcula a soma de cada elemento de A 
com cada elemento de B e armazene no vetor C(também de tamanho 5). Imprima na tela os 3 arrays.
 */
package listavetor.e02;
import java.util.Scanner;
public class ListaVetorE02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int a[] = new int [5],  b[] = new int[5], c[] = new int[5];
        
        System.out.println("Informe os valores para o vetor A: ");
        for(int i = 0; i < 5; i++){
            a[i] = teclado.nextInt();
        }
        
        System.out.println("Informe os valores para o vetor B: ");
        for(int i = 0; i < 5; i++){
        b[i] = teclado.nextInt();
        }
        
         for(int i = 0; i < 5; i++){
           c[i]= a[i]+b[i];  
        }
         System.out.print("vetor A:");
         for(int i = 0; i < 5; i++){
           System.out.print(a[i]);  
        }
         System.out.println();
         System.out.print("Vetor B: ");
         for(int i = 0; i < 5; i++){
           System.out.print(b[i]);  
        }
         System.out.println();
         System.out.print("Vetor C:");
         for(int i = 0; i < 5; i++){
           System.out.print(c[i]);  
        }
        System.out.println();
    }
    
}
