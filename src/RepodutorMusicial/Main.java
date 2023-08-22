package RepodutorMusicial;

public class Main {
    public static void main(String[] args) {
        RepodutorMusicial repodutorMusicial = new RepodutorMusicial();
        repodutorMusicial.adicionarMusica("So os loucos sabem", "charlieBrown jr", "so os loucos", "Rock");
        repodutorMusicial.adicionarMusica("Caminhos da Liberdade", "Vozes da Rua", "Além do Horizonte", "Rock");
        repodutorMusicial.adicionarMusica("Sob o Luar", "Eclipse Interior", "Noite Profunda", "Rock");
        repodutorMusicial.adicionarMusica("Viver com Intensidade", "Alma Aflame", "Chamas da Paixão", "Rock");

        System.out.println(repodutorMusicial.pesquisarArtista("charlieBrown jr"));
        System.out.println("Musica selecionada : " + repodutorMusicial.selecionarMusica("So os loucos sabem"));
        repodutorMusicial.play("So os loucos sabem");
        repodutorMusicial.pausar("So os loucos sabem");
    }
}
