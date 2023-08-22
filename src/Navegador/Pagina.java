package Navegador;

public class Pagina {

    private String url;

    private String nomeAba;

    public Pagina(String url, String nomeAba) {
        this.url = url;
        this.nomeAba = nomeAba;
    }

    public String getUrl() {
        return url;
    }

    public String getNomeAba() {
        return nomeAba;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "url='" + url + '\'' +
                ", nomeAba='" + nomeAba + '\'' +
                '}';
    }
}
