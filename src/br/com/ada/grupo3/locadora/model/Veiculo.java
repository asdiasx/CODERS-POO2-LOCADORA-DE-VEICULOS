package br.com.ada.grupo3.locadora.model;

import java.util.Collection;

public class Veiculo implements Entidade {

    private String placa;
    private String modelo;
    private String fabricante;
    private boolean disponível;
    private TipoVeiculo tipo;

    public Veiculo(String placa, String modelo, String fabricante, TipoVeiculo tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.disponível = true;
    }

    @Override
    public String getId() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }
}
