package AparelhoTelefonico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AparelhoTelefonico {

    List<Contato> contatos;

    public AparelhoTelefonico() {
        this.contatos = new ArrayList<>();
    }

    public void exibirContatos(){
        List<Contato> contatosOrdenados = contatos.stream()
                .sorted()
                .toList();

        contatosOrdenados.forEach(System.out::println);
    }

    public void adicionarContato(String nome, Integer numero){
        contatos.add(new Contato(nome, numero));
    }

    public void ligarContato(String nome){
        Contato contato = contatos.stream()
                .filter( c -> c.getNome().equals(nome))
                .findFirst()
                .orElse(null);
        System.out.println("Chamando para o contato: " + contato);
    }

    public void iniciarCorrerioVoz(){
        System.out.println("Correio de voz iniciado...");
    }


}
