public class Tenista extends Atleta{

    public Tenista(String nome, int idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }
    
    public void jogar(){
        System.out.println("\nJogando Tênis");
    }

    public void Aquecer(int tempoMinutos){
        System.out.printf("%s jogou por %d minutos", getNome(), tempoMinutos);
    }

    
}
