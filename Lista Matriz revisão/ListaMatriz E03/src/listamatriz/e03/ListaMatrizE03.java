/*
 Faça um programa em Java que leia 10 valores inteiros e armazene-os num vetor. Depois, gere
um segundo vetor que deve ser o dobro do primeiro. Imprima na tela os 2 vetores.
Entrada: v1 = {4, 6, 9, 2, 0, 12, 2, 10, 7, 3}
 */
package listamatriz.e03;

import java.util.Scanner;

public class ListaMatrizE03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[10] , r[] = new int[10];
        
        System.out.println("Informe os valores do vetor: ");
        for(int i = 0; i < 10; i++){
            System.out.print((i +1) + ":");
            v[i] = teclado.nextInt();
              r[i] = v[i] * 2;
        }
        for(int i = 0; i < 10; i++){
          
            System.out.print(v[i] +" ");
            
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            
             System.out.print(r[i] + " ");
        }
    }
    
}
