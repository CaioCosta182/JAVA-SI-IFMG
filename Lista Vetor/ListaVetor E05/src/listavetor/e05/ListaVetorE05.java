/*
 Leia dois vetores de 4 posições. Verifique e escreva se um é anagrama de outro. Ex:
ARARA -> ARARA – são anagramas
 */
package listavetor.e05;
import java.util.Scanner;
public class ListaVetorE05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String A[] = new String[5], b[] = new String[5];
        
        System.out.println("Informe a primeira palavra com 5 letras");
        for(int i = 0; i < 5; i++){
        A[i] = teclado.next();
        }
        System.out.println("Informe a segunda palavra com 5 letras");
        for(int i = 0; i < 5; i++){
        b[i] = teclado.next();
        }
        for(int i=0; i < 5; i++){
        if((A[i] ).equals(b[i])){
        System.out.print("é anagrama");
        break;
        }
        else{
                System.out.println("Não é anagrama:");
                }
        }
    }
    
}
