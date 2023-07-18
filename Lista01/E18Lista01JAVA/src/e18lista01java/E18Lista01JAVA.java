/*
 A fábrica da Vôlquis produz uma determinada quantidade de automóveis por dia. Faça um
programa para ler a quantidade produzida diariamente ao longo de um período (em dias)
informado pelo usuário, e depois informe:
A quantidade produzida nesse período
A média diária de produção
A menor produção diária do período
A maior produção diária do período
*/
package e18lista01java;

import java.util.Scanner;

public class E18Lista01JAVA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int carros = 0, dias, totalProducao = 0, media = 0, menorP = 99999, maiorP = -99999, menorDia = 99999, maiorDia = -99999;
        
        System.out.print("Informe o periodo em que a fábrica esteve em operação, em dias: ");
        dias = teclado.nextInt();
        
        for(int i = 1; i <= dias; i++){
        System.out.print("Informe a quantidade de carros produzidos no "+ i +"º dia: ");
        carros = teclado.nextInt();
        media = media +carros;
        totalProducao = totalProducao + carros;
        if(carros >= maiorP){
        maiorP = carros;
        maiorDia = i;
        }if(carros <= menorP){
        menorP = carros;
        menorDia = i;
        }
        }
        media = media/dias;
        System.out.println("Foram produzidos durante o periodo informado "+ totalProducao +" carros.");
        System.out.println("A média diária de produção foi de "+ media + " carros: ");
        System.out.println("A menor produção diária foi no " + menorDia + "º dia, com " + menorP + " carros produzidos.");
        System.out.println("A maior produção diária foi no " + maiorDia + "º dia, com " + maiorP +" carros produzidos.");
    }
    
}
