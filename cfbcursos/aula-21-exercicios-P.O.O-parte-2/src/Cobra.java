public class Cobra extends Animal{
    public boolean peconhenta;

    public Cobra(String especie, boolean peconhenta){
        super(especie);
        this.peconhenta = peconhenta;
    }

    @Override
     public  void atacar(Animal atacado){
        if(this.getVivo() ){
            if(peconhenta != true)
            System.out.printf("%s atacouuuuuuu %s%n", this.getEspecie(), atacado.getEspecie());
            else{
            System.out.printf("%s atacou %s%n", this.getEspecie(), atacado.getEspecie());
            System.out.printf("%s morreu%n", atacado.getEspecie());
            }
        }
        
    }
}