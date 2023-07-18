/*
 *Escreva um algoritmo que leia um vetor de 10 posições de números inteiros e imprima-o na
tela. Em seguida, gerar 2 vetores a partir dele, um contendo os elementos de posições ímpares
do vetor e o outro os elementos de posições pares. Imprimi-los no final.
Entrada: V = {4, 6, 9, 2, 0, 12, 2, 10, 8, 2}
Saída:
P = {4, 9, 0, 2, 8}
I = {6, 2, 12, 10, 2}
 */
package listamatriz.e06;
import java.util.Scanner;
    
public class ListaMatrizE06 {
            public static void main(String[] args) {
                
                Scanner teclado = new Scanner(System.in);
                int v[] = new int[10], p[] = new int[5], imp[] = new int[5];
                int x = 0, y = 0;
                System.out.println("Informe o valor do vetor: ");
                for(int i = 0; i < 10; i++){
                    System.out.print((i+1) + ": ");
                    v[i] = teclado.nextInt();
                }
                System.out.print("V ={ ");
                for(int i = 0; i < 10; i++ ){
                    System.out.print(v[i]);
                    if (i < 9) {
                System.out.print(", ");
            }
                    
                }
                System.out.print("} ");
                
                for(int i = 0; i < 10; i+=2){
                    p[x] = v[i];
                     x++;
                }
                for(int i =1; i< 10; i+=2){
                    imp[y] = v[i];
                    y++;
                }
                System.out.println();
                System.out.println("Vetor preenchido com os valores dos índices pares do vetor V: ");
                System.out.print("P ={ ");
                for(int i = 0; i < 5; i++){
                    System.out.print(p[i]);
                     if (i < 4) {
                System.out.print(", ");
            }
                }
                System.out.print("} ");
                System.out.println();
                
                System.out.println("Vetor preenchido com os valores dos índices ímpares do vetor V: ");
                System.out.print("I ={ ");
                for(int i = 0; i < 5; i++){
                    System.out.print(imp[i]);
                     if (i < 4) {
                System.out.print(", ");
            }
                }
                System.out.print("} ");
                System.out.println();
    }
    
}
