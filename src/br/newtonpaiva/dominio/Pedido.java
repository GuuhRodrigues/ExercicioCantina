package br.newtonpaiva.dominio;

import java.sql.Array;
import java.util.ArrayList;

public class Pedido {

    private Massa massa;
    private Cliente cliente;
    private ArrayList<Ingrediente> lista;
    private Double valorTotal;

    @Override
    public String toString() {
        return "Pedido{" +
                "lista=" + lista +
                '}';
    }

    public Double calculaValor(){
        valorTotal = getMassa().getValorMassa() + lista.size() * 2;
        return valorTotal;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Ingrediente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Ingrediente> lista) {
        this.lista = lista;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
