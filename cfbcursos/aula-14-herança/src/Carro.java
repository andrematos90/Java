public class Carro{
    private String nome;
    private String modelo;
    private boolean ligado;
    private boolean blindado;
    private boolean destruido;
    private int avariado;

    public Carro(String nome){
        this.nome = nome;
        this.modelo = "desconhecido";
        this. ligado = false;
        this.blindado = false;
        this.avariado = 0;

    }

    public String getNome(){
        return this.nome;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public boolean getBlindado(){
        return this.ligado;
    }

    public void setBlindado(boolean blindado){
        this.ligado =  blindado;
    }

    public void anda(){
        if(ligado){
            System.out.printf("%n%d andou!", this.nome);
        }
    }

    public boolean getDestruido(){
        return this.destruido;
    }

    public void setDestruido(){
        if(this.blindado == false || this.avariado == 100){
            this.destruido = true;
        }
    }

    public int getAvariado(){
        return this.avariado;
    }

    public void setAvariado(int avariado){
        this.avariado = avariado;
    }

    public void info(){

        System.out.println("-------------------------------");
        System.out.printf("nome: %s%n", this.nome);
        System.out.printf("modelo: %s%n", this.modelo);
        System.out.printf("ligado: %s%n", this.ligado? "sim": "nao");
        System.out.printf("blindado: %s%n", this.blindado? "sim" : "nao");
        System.out.printf("avarias: %d%n", this.avariado);
        System.out.println(getAvariado());
        System.out.print("-------------------------------");
    }
}