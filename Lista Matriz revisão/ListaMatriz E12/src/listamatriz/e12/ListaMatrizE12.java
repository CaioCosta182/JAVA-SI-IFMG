/*
Faça um programa que leia 10 valores e armazene-os num vetor. Calcule e exiba na tela os 3
maiores elementos do vetor.
Entrada: v1 = {4, 6, 9, 2, 0, 12, 2, 10, 7, 1}
Saída:
12, 10, 9
 */
package listamatriz.e12;
import java.util.Scanner;
public class ListaMatrizE12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int v[]= new int [10], v2[] = new int[3];
        
        System.out.println("Informe os valores do vetor: ");
        for(int i = 0; i < 10; i++){
        System.out.print((i+1)+":");
        v[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
            for(int i = 0; i < 3; i++){
            v2[i] = v[9-i];
            }
            System.out.println("Dos números informados no vetor, os 3 maiores são:");
            System.out.print("{");
            for(int i = 0; i < 3; i++){
            System.out.print(v2[i]);
            if(i<2){
            System.out.print(", ");
            }
          }
            System.out.print("}\n");
    }
    
}
