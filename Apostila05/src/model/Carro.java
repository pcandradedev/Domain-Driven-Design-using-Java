package model;

public class Carro {

    private String placa;
    private int numeroVaga;
    private boolean preferencial;
    private String setor;
    private int horaEntrada;
    private int horaSaida;
    private double valor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularValorPagar() {
        int i = horaSaida - horaEntrada;
        return i * valor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                " Placa = " + placa + '\'' +
                ", Número Vaga = " + numeroVaga +
                ", Preferencial = " + preferencial +
                ", Setor=" + setor +
                ", Hora Entrada = " + horaEntrada +
                ", Hora Saida = " + horaSaida +
                ", Valor = " + valor +
                '}';
    }
}
