public class App {
    public static void main(String[] args) throws Exception {
        Carro variavelCarro = new Carro("Skyline", "Nissan", 2000);
        variavelCarro.exibirInfo();
        variavelCarro.setAno(1999);
        variavelCarro.exibirInfo();
    }
}
