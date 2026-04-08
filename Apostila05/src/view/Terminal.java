package view;

import model.Carro;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.println("Digite o nome do carro: ");
        String nomeCarro = entrada.next();

        System.out.println("Digite o placa do carro: ");
        String placa = entrada.next();

        System.out.println("Digite o numero de vaga do carro: ");
        int numeroVaga = entrada.nextInt();

        System.out.println("Preferencial ? (SIM/NÃO)");
        boolean sim = entrada.nextBoolean();

        System.out.println("Digite o setor do carro: ");
        String setor = entrada.next();

        System.out.println("Hora de entrada: ");
        int entradaHora = entrada.nextInt();

        System.out.println("Hora de Saída: ");
        int saida = entrada.nextInt();

        System.out.println("Digite o valor do carro: ");
        double valorCarro = entrada.nextDouble();

        carro.setPlaca(placa);
        carro.setNumeroVaga(numeroVaga);
        carro.setPreferencial(sim);
        carro.setSetor(setor);
        carro.setHoraEntrada(entradaHora);
        carro.setHoraSaida(entradaHora);
        carro.setValor(valorCarro);




    }
}
