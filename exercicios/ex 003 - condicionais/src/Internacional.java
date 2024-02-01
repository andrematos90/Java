public class Internacional {
   private  int assentoEconomico = 30;
   private int assentoExecutivo = 20;
   private int assentoPrimeira = 10; 

   public int getAssentoEconomico(){
    return this.assentoEconomico - 25;
   }

   public int getAssentoExecutivo(){
    return this.assentoExecutivo - 19;
   }

   public int getAssentoPrimeira(){
    return this.assentoPrimeira - 10;
   }
}
