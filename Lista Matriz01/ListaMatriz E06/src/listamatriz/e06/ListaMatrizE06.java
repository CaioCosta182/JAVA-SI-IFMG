/*
Leia uma matriz 5 x 5. Leia também um valor X. O programa devera fazer umabusca desse valor na matriz e,
ao final, escrever a localização (linha e coluna) ouuma mensagem de “não encontrado”.
 */
package listamatriz.e06;
import java.util.Scanner;
public class ListaMatrizE06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int tamanho = 5;
        int[][] matriz = new int[tamanho][tamanho];
        
        Scanner scanner = new Scanner(System.in);
        
        // Leitura da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Leitura do valor X
        System.out.print("Digite o valor a ser buscado: ");
        int valorBusca = scanner.nextInt();
        
        // Busca do valor na matriz
        boolean encontrado = false;
        int linhaEncontrado = -1;
        int colunaEncontrado = -1;
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (matriz[i][j] == valorBusca) {
                    encontrado = true;
                    linhaEncontrado = i;
                    colunaEncontrado = j;
                    break;
                }
            }
        }
        
        // Exibição do resultado
        if (encontrado) {
            System.out.println("O valor " + valorBusca + " foi encontrado na posição: linha " + (linhaEncontrado + 1) + ", coluna " + (colunaEncontrado + 1));
        } else {
            System.out.println("O valor " + valorBusca + " não foi encontrado na matriz.");
        }        // TODO code application logic here
    }
    
}
