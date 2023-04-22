//O objetivo desse programa é criar um personagem de um jogo de RPG
import java.util.Scanner;

import package1.Gamificar;


public class Menu {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------");
        System.out.println("      MENU         ");
        System.out.println("-------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("1) Criar Personagem");
        System.out.println("2) Gamificar");
        
        Scanner sc = new Scanner(System.in);
        Director diretor = new Director();
        int op = sc.nextInt();
        sc.nextLine();
                
        switch(op){
            case 1:
                diretor.criaPersonagem();
                break;
                
            case 2:
                Gamificar janela = new Gamificar();
                janela.chamada(); //caso selecione a op 2, clique na janela que abrira para mover o personagem  pelo mapa
                break;
        }

    }
}
