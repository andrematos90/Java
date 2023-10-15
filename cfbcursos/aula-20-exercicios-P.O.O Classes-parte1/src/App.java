public class App {
    public static void main(String[] args){
        Leao leao = new Leao("leao");
        Coelho coelho = new Coelho("coelhoso");

        leao.atacar(coelho);
        leao.setFamilia("Felino");
        leao.info();


    }
}
