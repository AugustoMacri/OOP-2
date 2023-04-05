public class Futebolista extends Atleta {

    public Futebolista(String nome, int idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }
    
    public void jogar(){
        System.out.println("\nJogando Futebol");
    }
    
    public void Aquecer(int tempoMinutos){
        System.out.printf("%s jogou por %d minutos", getNome(), tempoMinutos);
    }
        
    

}
