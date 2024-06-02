package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.Map;

public class Evento {
    //atributos
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "AgendaEventos{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }

}
