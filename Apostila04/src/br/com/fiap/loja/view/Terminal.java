package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Categoria;
import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        //Ler os dados do produto
        Scanner entrada = new Scanner(System.in);

        //Criar o objeto produto
        Produto produto = new Produto();

        //Atribuir os valores ao objeto
        System.out.println("Digite o nome do produto: ");
        produto.nome = entrada.nextLine();

        System.out.println("Digite o preço do produto: ");
        produto.preco = entrada.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        produto.quantidade = entrada.nextInt();

        System.out.println("Possui garantia (true/false): )");
        produto.garantia = entrada.nextBoolean();
        entrada.nextLine();

        //Criando a categoria
        Categoria categoria1 = new Categoria();

        //Receber valores da categoria (nome e descrição)
        System.out.println("Digite o nome da categoria: ");
        categoria1.nome = entrada.nextLine();

        System.out.println("Digite a descrição da categoria: ");
        categoria1.descricao = entrada.nextLine();

        //Adicionar os valores nos atributos da categoria

        //Associar a categoria ao produto.
        /*

         * Estamos usando o objeto produto que criamos,
         * acessando o atributo de referência categoria que existe dentro da classe Produto,
         * e atribuindo-lhe o objeto categoria que foi criado na main.

         Produto → é o objeto da classe Produto que você criou na main.
         .categoria → é o atributo do tipo referência dentro da classe Produto.
         categoria → é o objeto da classe Categoria que você criou na main.

         **/
        produto.categoria = categoria1;

        //Exibir os valores dos atributos
        System.out.println("Dados do produto :");
        System.out.println(produto.nome + ", quantidade: " + produto.quantidade);
        System.out.println("R$ " + produto.preco + ", tem garantia: " + produto.garantia);
        System.out.println("Categoria : " + produto.categoria.nome);
    }

}
