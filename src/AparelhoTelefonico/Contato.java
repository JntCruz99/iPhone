package AparelhoTelefonico;

public class Contato implements Comparable<Contato>{

    private String nome;

    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Contato c) {
        return this.getNome().compareTo(c.getNome());
    }
}
