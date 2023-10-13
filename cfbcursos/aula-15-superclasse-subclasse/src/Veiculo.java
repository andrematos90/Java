public class Veiculo{
    private String modelo;
    private int autonomia;
    private boolean ligado;

    public Veiculo(String modelo){
        this.modelo = modelo;
        this.autonomia = 0;
        this.ligado = false;
    }

    public String getModelo(){
        return this.modelo;
    }


    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAutonomia(){
        return this.autonomia;
    }

    public void setAutonomia(int autonomia){
        this.autonomia = autonomia;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void info(){
        System.out.printf("modelo: %s%n", this.modelo);
        System.out.printf("autonomia: %s%n", this.autonomia);
        System.out.printf("ligado: %s%n", (this.ligado)? "sim":"nao");
    }
}