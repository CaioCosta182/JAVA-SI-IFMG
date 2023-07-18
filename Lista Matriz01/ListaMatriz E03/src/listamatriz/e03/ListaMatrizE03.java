/*
Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna)
do maior valor.
 */
package listamatriz.e03;
import java.util.Scanner;
public class ListaMatrizE03 {
    public static void main(String[] args) {
        int tamanho = 4;
        int[][] matriz = new int[tamanho][tamanho];
        int linhaMaiorValor = 0;
        int colunaMaiorValor = 0;
        int maiorValor = Integer.MIN_VALUE;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaiorValor = i;
                    colunaMaiorValor = j;
                }
            }
        }
        
        System.out.println("Matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Localização do maior valor:");
        System.out.println("Linha: " + (linhaMaiorValor + 1));
        System.out.println("Coluna: " + (colunaMaiorValor + 1));
        
    }
    
}
