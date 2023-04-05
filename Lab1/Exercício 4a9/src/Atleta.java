//classe abstrata não pode ser instanciada
public abstract class Atleta implements Comparable<Atleta>{
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Atleta(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void Aquecer(int tempoMinutos){
        
    }

    public abstract void jogar();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    

    @Override
    public String toString() {
        return "Atleta [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
    }

    @Override
    public int compareTo(Atleta a) {
        return this.nome.compareTo(a.getNome());
    }

}
