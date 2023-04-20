public class CriaPersonagem implements Builder{

    protected Personagem personagem;
    private String nome;
    private String classe;
    private String equipamento;
    private int vida;
    private int forca;
    private int def;

    public CriaPersonagem(String nome, String classe, String equipamento, int vida, int forca, int def) {
        this.personagem = new Personagem(equipamento, nome, classe, forca, vida, def);
    }
    

    public void reset(){
        personagem = new Personagem(equipamento, nome, classe, forca, vida, def);
    }

    public void nome(String nome){
        personagem.setNome(nome);
    }

    public void classe(String classe){
        personagem.setClasse(classe);
    }

    public void equipamento(String equipamento){
        personagem.setEquipamento(equipamento);
    }

    public void atributos(int vida, int forca, int def){
        personagem.setVida(vida);
        personagem.setForca(forca); 
        personagem.setDef(def);
    }

    public Personagem retornaPersonagem(){
        return personagem;
    }


}
