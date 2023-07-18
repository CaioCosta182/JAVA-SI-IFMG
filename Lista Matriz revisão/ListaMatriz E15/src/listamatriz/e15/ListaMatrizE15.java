/*
 *Faça um programa que gere uma matriz 4 x 4 e encontre a soma de sua diagonal principal.
Entrada
10-, 3, 5, 8
9, -2-, 4, 5
7, 5, -10-, 0
9, 3, 5, -8-
Saída:
30
 */
package listamatriz.e15;
import java.util.Scanner;
public class ListaMatrizE15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int M[][] = new int[4][4], soma = 0;
        
        System.out.print("Informe os valores da matriz: ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++ ){
                M[i][j] = teclado.nextInt();
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++ ){
                if(i== j){
                soma += M[i][j];
                }
            }
        }
        System.out.print(soma);
    }
    
}
