package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    // atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

    }

    public void adicionarPessoa (String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPoridade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 29, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 28, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 39, 1.87);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 45, 0.9);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 15, 1.90);
        ordenacaoPessoa.adicionarPessoa("Nome 6", 9, 1.49);

        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println(ordenacaoPessoa.ordenarPoridade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

