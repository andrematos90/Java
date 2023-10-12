public class App1 {
    public static void main(String[] args) {

        //Personagem.vivo = true;
    

        Personagem superHomem = new Personagem();

        superHomem.setHumano(false);
        superHomem.setCidade("Pequenópolis");
        superHomem.setDobem(true);
        superHomem.setTemPoder(true);
        //superHomem.vivo = true;


        Personagem dartVader = new Personagem();
        dartVader.setHumano(true);
        dartVader.setDobem(false);
        dartVader.setTemPoder(true);

        System.out.print(Personagem.qtPesonagensGerados);
        //System.out.println(dartVader.vivo);

       
    }
}
