package RepodutorMusicial;

import java.util.ArrayList;
import java.util.List;

public class RepodutorMusicial {

    private List<Musica> musicas;

    private boolean reproduzindo;

    public RepodutorMusicial() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(String nome, String artitaNome, String albunNome, String classific){
        musicas.add(new Musica(nome, artitaNome, albunNome, classific));
    }

    public List<Musica> pesquisarArtista(String artitas){
        return musicas.stream()
                .filter(m -> m.getArtitaNome().equals(artitas))
                .toList();
    }

    public void play(String nome){
         String musica = musicas.stream()
                .filter(m -> m.getNome().equals(nome))
                .toString();
         System.out.println("Tocando Musica" + musica);
    }

    public void pausar(String nome){
        String musica = musicas.stream()
                .filter(m -> m.getNome().equals(nome))
                .toString();
        System.out.println("Musica" + musica + "Pausada");
    }




}
