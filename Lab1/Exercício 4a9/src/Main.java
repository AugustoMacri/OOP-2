import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Resoluções resolucoes = new Resoluções();
        Scanner sc = new Scanner(System.in);
        
        
        do{
            System.out.println("Opção (1) - Exercícios de 4 a 7");
            System.out.println("Opção (2) - Exercício 8");
            int opcao = sc.nextInt();

            switch(opcao){
                case 1: resolucoes.Exercicios4_7();;
                break;
                case 2: resolucoes.proximaOlimpiada();
            }
        }while(true);


    }
}
