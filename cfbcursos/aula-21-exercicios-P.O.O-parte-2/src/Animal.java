public class Animal implements SerVivo{

    private String especie;
    private String familia;
    private boolean vivo;
    private int patas;

    public Animal(String especie){
        this.especie = especie;
        this.familia = "indefinida";
        this.vivo = true;
        this.patas = 0;

    }

    public String getEspecie(){
        return this.especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getFamilia(){
        return this.familia;
    }

    public void setFamilia(String familia){
        this.familia = familia;
    }

    public boolean getVivo(){
        return this.vivo;
    }

    public void setvivo(boolean vivo){
        this.vivo = vivo;
    }

    public int getPatas(){
        return this.patas;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }

    public  void atacar(Animal atacado){
        if(this.vivo){
            System.out.printf("%s ataftrtcou %s%n", this.especie, atacado.especie);
        }
    }

    public void comer(String comida){
        if(this.vivo){
            System.out.printf("%s comeu %s!%n", this.especie, comida);
        }
    };
    public void mover(){
        if(this.vivo){
            System.out.printf("%s se moveu!", this.especie);
        }
    };
    public void info(){
        System.out.printf("Especie........: %s%n", this.especie);
        System.out.printf("Familia........: %s%n", this.familia);
        System.out.printf("Vivo...........: %s%n", this.vivo ? "Sim":"Nao");
        System.out.printf("Numero de patas: %d%n", this.patas);
    };
 
}