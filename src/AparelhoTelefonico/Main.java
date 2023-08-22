package AparelhoTelefonico;

public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.adicionarContato("Ana",  84545454);
        aparelhoTelefonico.adicionarContato("Jonatas",  84545454);
        aparelhoTelefonico.adicionarContato("Rebeca",  84545454);

        aparelhoTelefonico.exibirContatos();
        aparelhoTelefonico.ligarContato("Rebeca");
        aparelhoTelefonico.iniciarCorrerioVoz();
    }
}
