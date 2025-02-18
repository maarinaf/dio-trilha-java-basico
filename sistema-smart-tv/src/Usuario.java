public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTV smartTV = new SmartTV();

        System.out.println("TV LIGADA? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status - TV LIGADA? " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("Volume atual: " + smartTV.volume);


        smartTV.diminuirVolume();
        System.out.println("Volume atual: " + smartTV.volume);


    }
}
