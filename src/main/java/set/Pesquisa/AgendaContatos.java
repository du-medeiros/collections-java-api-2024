package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
        }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> contatosPornome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPornome.add(c);
            }
        }
        return contatosPornome;
    }

 public Contato atualizarNumeroContato(String nome, int novoNumero){
    Contato contatoAtualizado = null;
    for(Contato c: contatoSet){
     if(c.getNome().equalsIgnoreCase(nome)) {
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


        agendaContatos.adicionarContato("Eduardo", 1955321);
        agendaContatos.adicionarContato("Eduardo1", 1955321);
        agendaContatos.adicionarContato("Eduardo", 1955321);
        agendaContatos.adicionarContato("Eduardo4", 1955321);
        agendaContatos.adicionarContato("Eduardo3", 1955321);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarContato("Eduardo4"));

        System.out.println(agendaContatos.atualizarNumeroContato("Eduardo1", 16953));
        agendaContatos.exibirContato();
    }

}