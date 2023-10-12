public class Personagem {
    private boolean humano;
    private Boolean temPoder;
    private String cidade;
    private boolean doBem;
    static boolean vivo;
    static int qtPesonagensGerados;

    public Personagem(){
        this.humano = false;
        this.temPoder = false;
        this.cidade = "desconhecida";
        this.doBem = false;
        //this.vivo = false; atributos static nao usam o this
        vivo = false;
        qtPesonagensGerados++;
    }

    public boolean getHumano(){
        return this.humano;
    }

    public void setHumano(boolean humano){
        this.humano = humano;
    }

    public boolean getTemPoder(){
        return this.temPoder;
    }

    public void setTemPoder(boolean temPoder){
        this.temPoder = temPoder;
    }

    public String  getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public boolean getDoBem(){
        return this.doBem;
    }

    public void setDobem(boolean doBem){
        this.doBem = doBem;
    }

   
}
