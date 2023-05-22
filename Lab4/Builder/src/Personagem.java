public class Personagem {
    public String equipamento;
    public String nome;
    public String classe;
    public int forca;
    public int vida;
    public int def;

    public Personagem(String equipamento, String nome, String classe, int forca, int vida, int def) {
        this.equipamento = equipamento;
        this.nome = nome;
        this.classe = classe;
        this.forca = forca;
        this.vida = vida;
        this.def = def;
    }


    public Personagem(){
        
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDef() {
        return def;
    }

    
    public void setDef(int def) {
        this.def = def;
    }


    @Override
    public String toString() {
        return "Personagem [Nome = " + nome + " | Equipamento = " + equipamento + " | Classe = " + classe + " | Forca = " + forca
                + " | Vida = " + vida + " | Def=" + def + "]";
    }
    
    

    

}
