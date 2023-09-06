package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato (String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Samuel", 123456);
        agendaContatos.adicionarContato("Samuel", 0);
        agendaContatos.adicionarContato("Samuel da Silva", 222221);
        agendaContatos.adicionarContato("Samuel DIO", 654654);
        agendaContatos.adicionarContato("João Silva", 222222);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Samuel"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("João Silva", 888888));

        agendaContatos.exibirContato();

    }
}
