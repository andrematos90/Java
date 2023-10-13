public class Aviao extends Veiculo {
    private String fabricante;
    private String categoria;
    
    public Aviao(String modelo, String fabricante, String categoria){
        super(modelo);
        this.fabricante = fabricante;
        this.categoria = categoria;
    }

    public void info(){

        super.info(); // chama o método info mas da classe pai para exibir o resto das informações

        System.out.printf("fabricante: %s%n", this.fabricante);
        System.out.printf("categoria: %s%n", this.categoria);
    }
}
