//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
//ordem crescente ou decrescente. 


import java.util.*;

class app2{
    public static void main (String[] arg){

        Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero:");
    int x = sc.nextInt();
    System.out.println("Digite outro numeor :");
    int y = sc.nextInt();

    if(x % y == 0 || y % x ==0){
        System.out.println("SÃO MUKTIPLOS");

    }

    else{
        System.out.println("NÃO SÃO MÚLTIPLOS");    
    }



    }
}