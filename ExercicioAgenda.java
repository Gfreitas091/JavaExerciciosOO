package ExerciciosPOO;

import java.util.HashMap;
import java.util.Map;

public class Agenda {


    private Map<String, String> contatos;


    public Agenda() {
        this.contatos = new HashMap<>();
    }


    public void adicionarContato(String nome, String numero) {
        contatos.put(nome, numero);
        System.out.println("Contato " + nome + " adicionado com sucesso!");
    }


    public void removerContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("Contato " + nome + " removido.");
        } else {
            System.out.println("O contato " + nome + " não existe na agenda.");
        }
    }


    public void exibirContatos() {
        if (!contatos.isEmpty()) {
            System.out.println("Lista de Contatos:");
            for (Map.Entry<String, String> entry : contatos.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", Número: " + entry.getValue());
            }
        } else {
            System.out.println("A agenda está vazia.");
        }
    }


    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarContato("Gustavo", "568974568");
        minhaAgenda.adicionarContato("Igor", "985678956");

        minhaAgenda.exibirContatos();

        minhaAgenda.removerContato("Gustavo");

        minhaAgenda.exibirContatos();
    }


}