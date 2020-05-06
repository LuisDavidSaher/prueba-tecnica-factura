package com.tienda.coldlt.modelo.entidad;


import java.util.List;

public class Factura{

    //decalracion de atributos
    private List<Item> items;
    private String cliente;
    private double valorTotal;

    //en este metodo hacemos un recorrido por todos loa item para obtener la sumatoria de los valores de los items
    public void calcular(){
        this.valorTotal=0;//inicializamos el acumulador para la sumatoria
        for (int i = 0; i < items.size(); i++) {//ciclo para recorrer la lista de ITEM
            items.get(i).calcular();//obtenemos el calculo individual del valortotal del item sub i
            this.valorTotal=items.get(i).getValorTotal();//regresamos el total
        }
    }

    //<getters><setters>
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
