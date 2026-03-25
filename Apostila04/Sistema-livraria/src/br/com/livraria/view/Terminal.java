package br.com.livraria.view;

import br.com.livraria.model.Autor;
import br.com.livraria.model.Livro;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Criando um livro
        Livro livro = new Livro();

        System.out.println("Digite o nome do livro: ");
        livro.titulo = entrada.next() + entrada.nextLine();

        System.out.println("Digite o preço do livro: ");
        livro.preco = entrada.nextDouble();

        System.out.println("Digite o número de paginas do livro: ");
        livro.paginas = entrada.nextInt();

        //criando um autor
        Autor autor = new Autor();

        // Lendo os dados do autor
        System.out.println("Digite o nome do autor do livro: ");
        autor.nome = entrada.next() + entrada.nextLine();

        System.out.println("Digite a nacionalidade do autor do livro: ");
        autor.nacionalidade = entrada.next() + entrada.nextLine();

        // Associando autor ao livro
        livro.autor = autor;

        // Mostrando informações
        System.out.println("Titulo do livro: " + livro.titulo);
        System.out.println("Preço : " + livro.preco);
        System.out.println("Paginas do livro: " + livro.paginas);
        System.out.println("Autor: " + autor.nome);


    }
}
