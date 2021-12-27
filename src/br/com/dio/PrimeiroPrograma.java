package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos corpos", 300);
        System.out.println(livro1);

    }
}

class Livro {
    private String nome;
    private Integer nPages;

    public Livro(String nome, Integer nPages) {
        this.nome = nome;
        this.nPages = nPages;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getnPages() {
        return nPages;
    }

    public void setnPages(Integer nPages) {
        this.nPages = nPages;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nPages=" + nPages +
                '}';
    }
}