public class  CarroCombate extends Carro{
    
    private int qtArmamento;

    public CarroCombate(String nome){
        super(nome); // chama o construtor da classe base
       
    }

    public int getQtArmamento(){
        return this.qtArmamento;
    }

    public void setQtArmamento(int qtArmamento){
        this.qtArmamento = qtArmamento;
    }

   
}