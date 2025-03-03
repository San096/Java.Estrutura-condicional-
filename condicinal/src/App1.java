// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 

import java.util.*;

class App1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x =  sc.nextInt();

            if( x % 2 == 0){
                System.out.println("Par");
            }
            else{
                System.out.println("Ímpar");
            }



    }
}


