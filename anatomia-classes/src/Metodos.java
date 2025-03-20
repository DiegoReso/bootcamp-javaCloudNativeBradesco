public class Metodos {
    public static void main(String[] args) {
        SmartTV televisao = new SmartTV();

        System.out.println(" TV ligada ? " + televisao.ligada);
        System.out.println(" Qual Canal ? " + televisao.canal);
        System.out.println(" Volume da TV ? " + televisao.volume);
        
        televisao.ligar();
        System.out.println(" TV ligada ? " + televisao.ligada);

        televisao.aumentarVolume();
        System.out.println(" Volume da TV ? " + televisao.volume);

        televisao.mudarCanal(10);
        System.out.println(" Qual Canal ? " + televisao.canal);

        televisao.aumentarCanal();
        System.out.println(" Qual Canal ? " + televisao.canal);
    }
}
