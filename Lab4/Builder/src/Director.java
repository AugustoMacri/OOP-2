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
            System.out.println("4.Escolher atributos");
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
        System.out.println(personagem); //porque caralhos isso aqui tá acontecendo 
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
        int pontos = 10;
        int[] campos = new int[3];
        String [] nomesCampos = {"Vida", "Forca", "Defesa"};

        for(int i=0; i<campos.length; i++){
            int qnt;
            System.out.println("Voce possui " + pontos + " disponiveis");
            System.out.println("Coloque quantos pontos deseja para sua " + nomesCampos[i]);
            qnt = sc.nextInt();
            if(qnt < pontos){
                System.out.println("Pontos atribuidos a " + nomesCampos[i]);
                campos[i] = qnt; 
                pontos-=qnt;
            }else if(qnt == pontos){
                System.out.println("Pontos atribuidos a" + nomesCampos[i]);
                campos[i] = qnt; 
                System.out.println("***Pontos acabaram***");
                pontos-=qnt;
            }else{
                System.out.println("Pontos insuficiente");
                campos[i] = 0; 
            }

        }


    }
    

}
