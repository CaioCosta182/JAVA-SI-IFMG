/*
 aça um programa em Java, que leia um vetor de 30 posições. Exiba na tela o vetor original e
um segundo vetor na ordem inversa ao primeiro.
A seguir, um exemplo para um vetor de 5 posições.
Exemplo: v1 = {3, 6, 2, 4, 1}
Saída:
v1 = {3, 6, 2, 4, 1}
v2 = {1, 4, 2, 6, 3}
 */
package listamatriz.e08;

import java.util.Scanner;

public class ListaMatrizE08 {
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       int v1[] = new int[5], v2[] = new int[5];
       
       System.out.println("Informe os valores do vetor: ");
       for(int i = 0; i < 5; i++){
           System.out.print((i +1) + ":");
           v1[i] = teclado.nextInt();
       }
       for(int i = 0; i < 5; i++){
           v2[i] = v1[4- i];
       
    }
       System.out.print("Ao inverter os valores e salvá-los no V2 o resultado será: ");
       System.out.println();
       System.out.print("V1={");
       for(int i = 0; i < 5; i++){
           System.out.print(v1[i]);
           if(i < 4){
               System.out.print(", ");
           }
       }
        System.out.print("}");
       System.out.println(); 
       
       System.out.print("V2={");
       
       for(int i = 0; i< 5; i++){
           System.out.print(v2[i]);
           if(i < 4){
           System.out.print(", ");
       }
       }
        System.out.print("}");
       System.out.println();
    
  }
}
