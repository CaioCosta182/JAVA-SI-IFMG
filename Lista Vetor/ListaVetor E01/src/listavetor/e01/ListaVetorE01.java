/*
Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera fazer
uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ousenão foi encontrado.
 */
package listavetor.e01;
import java.util.Scanner;
public class ListaVetorE01 {
    public static void main(String[] args) {
        
        int v[] = new int[5];
        int busca;
        boolean encontrado = false;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Infome os valores do vetor: ");
        for(int i = 0; i < 5; i++){
            v[i] = teclado.nextInt();
        }
        System.out.println("Informe o valor da variável que deseja buscar: ");
        busca = teclado.nextInt();
        
        for(int i = 0; i < 5; i++){
        if(v[i] == busca){
        System.out.println("O valor " + busca + " foi encontrado nos índices: " + i + " do vetor informado. ");
        encontrado = true;
        }
        }
        if(!encontrado){
        System.out.println("O valor " + busca +" não foi encontrado no vetor informado !!! ");
        
        
        }
        
        
    }
    
}
