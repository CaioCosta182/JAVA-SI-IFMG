/*Elabore um programa que leia valores para um vetor de 10 posições. Calcular e exibir a soma
dos elementos armazenados nas posições ímpares.*/
package lista.matriz;
import java.util.Scanner;
public class ListaMatriz {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
            int v[] = new int[10];
            int soma = 0;
            
            for(int i = 0; i < 10; i++){
                System.out.print((i +1) + ":");
                v[i] = teclado.nextInt();
            }
            for(int i = 1; i < 10; i +=2){
            soma = soma + v[i];
            }
            System.out.print("A soma é:" + soma);
    }
    
}
