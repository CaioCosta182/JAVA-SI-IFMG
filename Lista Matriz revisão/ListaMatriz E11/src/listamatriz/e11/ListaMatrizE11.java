/*
Faça um programa em Java, que leia dois vetores ordenados, de 5 posições cada. Gere um
terceiro vetor, também ordenado, com todos os elementos dos vetores anteriores.
Entrada: v1 = {1, 4, 5, 9, 111}
v2 = (3, 3, 5, 8, 300}
Saída:
v3 = {1, 3, 3, 4, 5, 5, 8, 9, 111, 300}
 */
package listamatriz.e11;
import java.util.Scanner;

public class ListaMatrizE11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int v1[] = new int[5], v2[] = new int[5], v3[] = new int[10];
        
        System.out.println("Informe o valor do primeiro vetor: ");
        for(int i = 0; i < 5; i++){
            if(i < 5){
            System.out.print(": ");
            }
            v1[i]= teclado.nextInt();
        }
        
        System.out.println("Informe o valor do segundo vetor: ");
        for(int i = 0; i < 5; i++){
            if(i < 5){
            System.out.print(": ");
            }
            v2[i]= teclado.nextInt();
        }
        for(int i = 0; i < 5; i++){
        v3[i] = v1[i];
        v3[5+i]= v2[i];
        }
        
         for (int i = 0; i < 10 - 1; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (v3[i] > v3[j]) {
                    int temp = v3[i];
                    v3[i] = v3[j];
                    v3[j] = temp;
                }
            }
        }
        
        System.out.println("O valor do vetor que mescla os dois informados é:");
        System.out.print("V3 = {");
        for(int i = 0; i < 10; i++){
            System.out.print(v3[i]);
            if(i<9){
            System.out.print(",");
            }
        }
        System.out.print("}");
        
    }
    
}
