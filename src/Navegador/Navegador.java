package Navegador;

import java.util.ArrayList;
import java.util.List;

public class Navegador {

    private List<Pagina> paginas;

    public Navegador() {
        this.paginas = new ArrayList<>();
    }

    public void novaPagina(String url, String nomeAba){
        paginas.add(new Pagina(url, nomeAba));
    }

    public void fecharPagina(String nomeAba){
        try {
            paginas.removeIf(p -> p.getNomeAba().equals(nomeAba));
        }catch (Exception e){
            System.out.println("Pagina com nome: " + nomeAba+ " não existe");
        }

    }

    public void abrirPagina(String nomeAba){
        Pagina paginaAberta = paginas.stream()
                .filter(p -> p.getNomeAba().equals(nomeAba))
                .findFirst()
                .orElse(null);

        System.out.println("Pagina aberta: " + paginaAberta);
    }

    public void atualizarPagina(String nomeAba, Pagina pagina){
        Pagina paginatemp = null;
        for (Pagina p: paginas){
            if (p.getNomeAba().equals(nomeAba)){
                paginatemp = p;
                p = pagina;
                break;
            }
        }
        System.out.println("Pagina atualizada de " + paginatemp + " Para a pagina: " + pagina);
    }



}
