//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();

        if ( x < 0){
            System.out.println("Negativo");
        }
        else{
            System.out.println("Não negativo");
        }   
    }
}
