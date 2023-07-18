/*
Faça um algoritmo que construa uma matriz 50 por 50 de números reais edepois de construída, 
colocar o conteúdo de sua diagonal principal dentrodeum vetor e depois do vetor montado, imprimir o vetor. */
package listamatriz.e04;

public class ListaMatrizE04 {
    public static void main(String[] args) {

        int tamanho = 5;
        double[][] matriz = new double[tamanho][tamanho];
        double[] vetorDiagonal = new double[tamanho];
        
        // Constrói a matriz com números reais aleatórios
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = Math.random(); // Números reais aleatórios entre 0 e 1
            }
        }
        
        // Extrai a diagonal principal e armazena no vetor
        for (int i = 0; i < tamanho; i++) {
            vetorDiagonal[i] = matriz[i][i];
        }
        
        // Imprime o vetor resultante
        System.out.println("Vetor diagonal:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorDiagonal[i]);
    }
    
}
}
