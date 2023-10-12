public class App {
    public static void main(String[] args) {

        //instanciado diretamente a classe carro
        Carro carro1  = new Carro("Dwingo");
        carro1.setLigado(true);
        carro1.info();

        /*instanciado a classe derivada "CarroCombate", que possuir todos o atributos e 
        métodos da classe "Carro"*/

        CarroCombate tanque = new CarroCombate("leopard");
        
        tanque.setQtArmamento(5);
        tanque.info();
        
    }
}
