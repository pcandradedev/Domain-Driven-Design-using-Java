package model;

public class Endereco {

    public String logradouro;
    public short numero;
    public String complemento;
    public String cep;

    public String retornarEndereco() {
        return "Logradouro: " + logradouro
                + "Número: " + numero
                + "Complemento: " + complemento
                + " CEP: " + cep;
    }
}
