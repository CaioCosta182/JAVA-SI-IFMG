/*
Escreva um algoritmo que leia um vetor inteiro de 12 posições e crie um segundo vetor,
substituindo os valores nulos por 1. Mostre os 2 vetores.
Entrada: V1 = {4, 0, 9, 2, 0, 12, 2, 0, 8, 2, 1, 7}
Saída:
V1 = {4, 0, 9, 2, 0, 12, 2, 0, 8, 2, 1, 7}
V2 = {4, 1, 9, 2, 1, 12, 2, 1, 8, 2, 1, 7}
 */
package listamatriz.e07;
import java.util.Scanner;

public class ListaMatrizE07 {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        int v1[] = new int[12],  v2[] = new int[12];
        
        System.out.println("Informe os valores do vetor: ");
        for(int i = 0; i < 12; i++){
             System.out.print((i+1) + ": ");
            v1[i] = teclado.nextInt();
        }
        for(int i =0; i < 12; i++){
            if(v1[i] != 0){
                v2[i] = v1[i];
            }else{
                v2[i] = 1;
            }
        }
        System.out.print("V1 = {");
        for(int i = 0; i < 12; i++){
            System.out.print(v1[i]);
             if (i < 11) {
                System.out.print(", ");
            }
        }System.out.print("}");
          System.out.println();
        
        System.out.println("Valores do vetor V1 substituindo valores nulos por 1:");
        System.out.print("V2 = {");
        for(int i = 0; i < 12; i++){
            System.out.print(v2[i]);
             if (i < 11) {
                System.out.print(", ");
            }
        }System.out.print("}");
        System.out.println();
    }
    
}
