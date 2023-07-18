/*
 O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar
uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC =
peso/altura2. Desenvolva um programa que leia o peso e a altura de um adulto e mostre sua
condição de acordo com a tabela abaixo.
 */
package e06lista01java;
import java.util.Scanner;

public class E06Lista01JAVA {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double peso, altura, imc;
        
        System.out.print("Informe o seu peso: ");
        peso = teclado.nextDouble();
        System.out.print("Informe sua altura: ");
        altura =  teclado.nextDouble();
        
        imc = peso / (altura * altura);
        
        if(imc < 18.5){
            System.out.print("Abaixo do peso indicado. ");
     }else if(imc >= 18.5 && imc < 25){
            System.out.print("Peso ideal. ");
     }else if(imc >= 25 && imc < 30){
            System.out.print("Sobre peso.");
     }else if(imc >=30 && imc < 35){
            System.out.print("Obesidade grau 01.");
     }else if(imc >=35 && imc <40){
            System.out.print("Obesidade grau 02. ");
     }else{
            System.out.print("Obesidade extrema. ");
     }
        
        
    }
    
}
