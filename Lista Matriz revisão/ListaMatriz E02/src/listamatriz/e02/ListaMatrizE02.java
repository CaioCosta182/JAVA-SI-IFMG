/*Elabore um programa que leia valores para um vetor de 10 posições. Calcular e exibir a média
dos elementos armazenados nas posições pares.
Entrada: v = {4, 6, 9, 2, 0, 12, 2, 10, 7, 3}*/

package listamatriz.e02;
import java.util.Scanner;

public class ListaMatrizE02 {
       public static void main(String[] args) {
      
           Scanner teclado = new Scanner(System.in);
           int v[] = new int[10];
           int soma = 0;
           
           System.out.println("Informe os valores do vetor:");
           for(int i = 0; i <10; i++){
               System.out.print((i +1) + ":");
               v[i] = teclado.nextInt();
           }
           for(int i =0; i<10; i+=2){
               soma = soma + v[i];
           }
           System.out.println("A soma dos valores nas posições pares é: " + soma);
    }
    
}
