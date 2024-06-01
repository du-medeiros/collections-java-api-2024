package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    //
    private String Nome;
    private int Numero;

    public Contato(String nome, int numero) {
        Nome = nome;
        Numero = numero;
    }

    public String getNome() {
        return Nome;
    }

    public int getNumero() {
        return Numero;
        }

    public void setNumero(int numero) {
        Numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(Nome, contato.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Nome);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "Nome='" + Nome + '\'' +
                ", Numero=" + Numero +
                '}';
    }
}
