package RepodutorMusicial;

import java.util.Timer;

public class Musica {

    private String nome;

    private String artitaNome;

    private String albunNome;

    private String classific;

    public Musica(String nome, String artitaNome, String albunNome, String classific) {
        this.nome = nome;
        this.artitaNome = artitaNome;
        this.albunNome = albunNome;
        this.classific = classific;
    }

    public String getNome() {
        return nome;
    }

    public String getArtitaNome() {
        return artitaNome;
    }

    public String getAlbunNome() {
        return albunNome;
    }

    public String getClassific() {
        return classific;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", artitaNome='" + artitaNome + '\'' +
                ", albunNome='" + albunNome + '\'' +
                ", classific='" + classific + '\'' +
                '}';
    }
}
