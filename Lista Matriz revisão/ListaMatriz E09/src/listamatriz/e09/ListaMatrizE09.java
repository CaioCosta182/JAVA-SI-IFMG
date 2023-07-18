/*
 Faça um programa que leia uma sequência de 10 números e armazene-os num vetor. Informe o
total de ocorrências do último número lido.
Entrada: V = {12, 38, 4, 23, 5, 6, 7, 4, 12, 4}
Saída: O número 4 foi informado 3 vezes
 */
package listamatriz.e09;
import java.util.Scanner;

public class ListaMatrizE09 {
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            int v[] = new int[10];
            int ocor = 0, cont = 0;
            
            System.out.println("Informe os valores do vetor: ");
            for(int i = 0; i < 10; i++){
                System.out.print((i +1) + ":");
                v[i] = teclado.nextInt();
                if(v[i]==v[9]){
                    ocor=v[i];
                }
            }
            for(int i = 0; i < 10; i++){
                if(v[i] == ocor){
                 cont++;
                }
            }
            System.out.print("O valor " + ocor + " foi informado "+ cont +" vezes!!!");
    }
    
}
