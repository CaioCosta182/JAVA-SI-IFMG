/*
Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. Escreva ao final o vetor obtido.
 */
package listavetor.e03;
import java.util.Scanner;
public class ListaVetorE03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[8];
                
        System.out.println("Informe o valor do vetor: ");
        for(int i = 0; i < 8; i++){
        v[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < 4; i++){
        int temp = v[i];
        v[i] = v[i + 4];
        v[i+4] = temp; 
        
        }
        for(int i = 0; i < 8; i++){
        System.out.print(v[i] + " ");
        }
        
    }
    
}
