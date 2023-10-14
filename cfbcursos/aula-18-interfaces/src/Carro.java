public class Carro implements Veiculo{
    public boolean ligado = false;
    public String anda = "está parado";
    public int qt = 0;

    public boolean ligar(boolean ligado){
        return this.ligado = ligado;
    }
    public String anda(String anda){
        return this.anda = anda;
    }
    public int qtCombustivel(int qt){
        return this.qt = qt;
    }
    public void info(){
        System.out.printf("%s%n", this.ligado);
        System.out.printf("%s%n", this.anda);
        System.out.printf("%d%n", this.qt);  
    }
}
