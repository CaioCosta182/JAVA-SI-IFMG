/*
Leia dois vetores de 20 posições e calcule um terceiro vetor contendo, nas posições pares os
valores do primeiro e nas posições ímpares os valores do segundo.
 */
package listavetor.e04;
import java.util.Scanner;
public class ListaVetorE04 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[5], b[] = new int[5], c[] = new int[10];
        
        System.out.println("Informe os valores do vetor: A ");
        for(int i = 0; i < 5; i++){
        a[i] = teclado.nextInt();
        }
        System.out.println("Informe os valores do vetor B: ");
        for(int i = 0; i < 5; i++){
        b[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < 5; i++ ){
       
            if(i % 2 == 0){
             c[i] = a[i];
        }else{
            
            c[i] = b[i];
             
        }
        }
        System.out.println("Valores do vetor C serão: ");
        for(int i = 0; i < 10; i++){
        System.out.print(c[i] + " ");
        }
    }
    
}
