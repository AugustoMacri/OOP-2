import java.util.Random;
import java.util.Scanner;


public class Director {
    
    Scanner sc = new Scanner(System.in);
    Personagem personagem; 

    public Director(){
        personagem = new Personagem();
    }
    

    public void reset(){
        personagem = new Personagem();
    };

    
    public Personagem criaPersonagem(){
        int opcao;
        boolean continuar = true;

        while(continuar){

            System.out.println("------------------------------------");
            System.out.println("      Criação de Personagem         ");
            System.out.println("------------------------------------");
            System.out.println("Escolha  uma opção");
            System.out.println("1.Escolher nome");
            System.out.println("2.Escolher classe");
            System.out.println("3.Escolher equipamento");
            System.out.println("4.Gerar atributos aleatóriamente");
            System.out.println("5.Concluir Personagem");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                nome();
                break;
                case 2:
                classe();
                break;
                case 3:
                equipamento();
                break;
                case 4:
                atributos();
                break;
                case 5:
                continuar = false;
                break;
            }
        }
        System.out.println(personagem);
        return personagem;
            
    }

    public void nome(){
        String nomePersonagem;
        System.out.println("Digite o nome do personagem");
        nomePersonagem = sc.nextLine();
        personagem.setNome(nomePersonagem);
    }

    public void classe(){
        int opcao;
        System.out.println("Escolha a classe de seu personagem:");
        System.out.println("1.Mago");
        System.out.println("2.Bárbaro");
        System.out.println("3.Cavaleiro");
        System.out.println("4.Assassino");
        System.out.println("5.Paladino");
        opcao = sc.nextInt();

        switch(opcao){
            case 1:
                personagem.setClasse("Mago");
                break;
            case 2:
                personagem.setClasse("Bárbaro");
                break;
            case 3:
                personagem.setClasse("Cavaleiro");
                break;
            case 4:
                personagem.setClasse("Assassino");
                break;
            case 5:
                personagem.setClasse("Paladino");
                break;
        }
    }

    public void equipamento(){
        int opcao;
        System.out.println("Escolha um equipamento:");
        System.out.println("1.Cajado");
        System.out.println("2.Machado");
        System.out.println("3.Espada");
        System.out.println("4.Punhal");
        System.out.println("5.Espadas bastardas");
        opcao = sc.nextInt();
        switch(opcao){
            case 1:
                personagem.setEquipamento("Cajado");
                break;
            case 2:
                personagem.setEquipamento("Machado"); 
                break;
            case 3:
                personagem.setEquipamento("Espada");
                break;
            case 4:
                personagem.setEquipamento("Punhal");
                break;
            case 5:
                personagem.setEquipamento("Espada Bastardas");
                break;
        }

    }

    public void atributos(){
        Random val = new Random();
        personagem.setVida(val.nextInt(10));
        personagem.setDef(val.nextInt(10));
        personagem.setForca(val.nextInt(10));
        System.out.println("Atributos de personagem gerados aleatoriamente!");

    }
    

}
