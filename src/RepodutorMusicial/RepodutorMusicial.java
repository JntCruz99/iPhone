package RepodutorMusicial;

import java.util.ArrayList;
import java.util.List;

public class RepodutorMusicial {

    private List<Musica> musicas;


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

    public Musica selecionarMusica(String nome){
        return musicas.stream()
                .filter(m -> m.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }


    public void play(String nome){
         Musica musica = musicas.stream()
                .filter(m -> m.getNome().equals(nome))
                 .findFirst()
                 .orElse(null);
         System.out.println("Tocando Musica: " + musica.getNome());
    }

    public void pausar(String nome){
        Musica musica = musicas.stream()
                .filter(m -> m.getNome().equals(nome))
                .findFirst()
                .orElse(null);
        System.out.println("Musica Pausada: " + musica.getNome());
    }




}
