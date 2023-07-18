/*
 Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10elapossui.
 */
package listamatriz.e02;
import java.util.Scanner;
public class ListaMatrizE02 {
    public static void main(String[] args) {
int tamanho = 4;
        int[][] matriz = new int[tamanho][tamanho];
        int contador = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }
        
        System.out.println("A matriz possui " + contador + " valor(es) maior(es) que 10.");
        
       
    }
    
}
