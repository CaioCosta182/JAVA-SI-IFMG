/*
 Faça um programa que leia um conjunto de 10 valores inteiros para um vetor A. Em seguida,
leia mais 10 valores inteiros para um vetor B. Seu programa deve substituir por 0, todos os
valores que existem no vetor A e que não existem no vetor B.
Entrada:
A = {10, 3, 5, 8, 9, 2, 4, 5, 7, 12}
B = {13, 5, 9, 6, 15, 2, 7, 20, 9, 10}
Saída:
A = {10, 0, 5, 0, 9, 2, 0, 5, 7, 0}
B = {13, 5, 9, 6, 15, 2, 7, 20, 9, 10}
 */
package listamatriz.e13;

import java.util.Scanner;

public class ListaMatrizE13 {
    public static void main(String[] args) {
        
        int a[] = new int[10], b[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe os valores do vetor A: ");
        for(int i =0; i<10; i++){
            System.out.print((i+1)+ ": ");
            a[i] = teclado.nextInt();
            
        }
        System.out.println("Informe os valores do vetor B: ");
        for(int i =0; i<10; i++){
            System.out.print((i+1)+ ": ");
            b[i] = teclado.nextInt();
            
        }
         for (int i = 0; i < 10; i++) {
            boolean existeNoB = false;
            for (int j = 0; j < 10; j++) {
                if (a[i] == b[j]) {
                    existeNoB = true;
                    break;
                }
            }
            if (!existeNoB) {
                a[i] = 0;
            }
        }
         System.out.print("Vetor A = {");
         for(int i = 0; i<10; i++){
         System.out.print(a[i]);
         if(i < 9){
             System.out.print(",");
         }
         }
         System.out.print("}");
         
         System.out.println();
         System.out.print("Vetor B = {");
         for(int i = 0; i<10; i++){
         System.out.print(b[i]);
         if(i < 9){
             System.out.print(",");
         }
         }
         System.out.print("}");
         System.out.println();
    }
}
        
    
    

