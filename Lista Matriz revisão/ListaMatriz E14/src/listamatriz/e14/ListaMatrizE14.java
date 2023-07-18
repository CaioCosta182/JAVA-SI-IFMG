/*
 Faça um programa que leia uma matriz de números inteiros de dimensões 4x5 e imprima a
soma dos valores de cada linha e a soma de todos os elementos da matriz.
Entrada
10, 3, 5, 8
9, 2, 4, 5
7, 5, 10, 0
9, 3, 5, 8
1, 4, 8, 2 
Saída:26, 20, 22, 25, 15   
104
 */
package listamatriz.e14;
import java.util.Scanner;
public class ListaMatrizE14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int m[][] = new int [5][4];
        int somaL[] = new int[5];
        int somaTotal = 0;
        
        System.out.print("Informe os valores da matriz (4x5):");
        for(int i = 0; i <5; i++){
            for(int j = 0; j < 4; j++){
            m[i][j] = teclado.nextInt();
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
            somaL[i] += m[i][j];
            
            }
            somaTotal += somaL[i];
        }
        System.out.print("Soma das linhas: ");
        for(int i = 0; i< 5; i++){
            System.out.print(somaL[i]);
            if(i < 4){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Soma total: "+ somaTotal);
    }
    
}
