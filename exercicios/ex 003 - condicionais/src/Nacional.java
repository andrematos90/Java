public class Nacional {  

    private  int assentoEconomico = 50;
    private  int assentoExecutivo = 30;
    private  int assentoPrimeira = 15;
    
    public int getAssentoEconomico(){
        return this.assentoEconomico - 50;
    }

    public int getAssentoExecutivo(){
        return this.assentoExecutivo - 25;
    }

    public int getAssentoPrimeira(){
        return this.assentoPrimeira - 10;
    }
     
}
