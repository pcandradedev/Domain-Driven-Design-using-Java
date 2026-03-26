package view;

import model.Cliente;
import model.ContaCorrente;
import model.Endereco;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Digite seu nome: ");
        cliente.nome = entrada.nextLine();

        System.out.println("Digite seu CPF: ");
        cliente.cpf = entrada.nextLine();

        cliente.retornarDados();

        System.out.println();

        Endereco endereco = new Endereco();

        System.out.println("Digite seu Logradouro: ");
        endereco.logradouro = entrada.next() + entrada.nextLine();
        System.out.println("Digite seu Numero: ");
        endereco.numero = entrada.nextShort() ;
        entrada.nextLine();
        System.out.println("Digite seu Complemento: ");
        endereco.complemento = entrada.nextLine();
        System.out.println("Digite seu CEP: ");
        endereco.cep = entrada.nextLine();

        //referênciando o objetos
        cliente.endereco = endereco;

        ContaCorrente conta = new ContaCorrente();
        conta.titular = cliente;

        System.out.println("Digite um valor para depositar: ");
        double deposita = entrada.nextDouble();
        conta.depositar(deposita);

        System.out.println("Saldo Atual: " + conta.saldo);

        System.out.println("Digite o valor que deseja retirar: ");
        double retirar = entrada.nextDouble();
        conta.sacar(retirar);

        System.out.println("Saldo Atual: " + conta.saldo);

        System.out.println("\nDados do Cliente:");
        System.out.println(cliente.retornarDados());

        System.out.println("\nEndereco:");
        System.out.println(endereco.retornarEndereco());

    }
}
