public class Carro{
    public String montadora;
    public String modelo;
    public String motor;
    public int cavalos;
    private final String  chassi;

    public Carro(String montadora, String modelo, String chassi){
        this.montadora = montadora;
        this.modelo = modelo;
        this.chassi = chassi;
        this.motor = "indefinido";
        this.cavalos = 0;
    }

    public String getChassi(){
        return this.chassi;
    }


    public void info(){
        
        System.out.printf("Montadora: %s%n", this.montadora);
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Motor: %s%n", this.motor);
        System.out.printf("Potencia(cv): %s%n", this.cavalos);
        System.out.printf("N° Chassi: %s%n", this.chassi);
        System.out.println("---------------------------------------------------------------------");
    }
}