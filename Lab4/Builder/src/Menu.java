//O objetivo desse programa é criar um personagem de um jogo de RPG
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------");
        System.out.println("      MENU         ");
        System.out.println("-------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("1) Criar Personagem");
        System.out.println("2) Gamificar");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        Director diretor = new Director();
        
        switch(op){
            case 1:
                diretor.criaPersonagem();
        }

    }
}
