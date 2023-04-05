public class Corredor extends Atleta{

    public Corredor(String nome, int idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }
    
    public void jogar(){
        System.out.println("\nCorrendo");
    }

    public void Aquecer(int tempoMinutos){
        System.out.printf("%s correu por %d minutos", getNome(), tempoMinutos);
    }

    

}
