package com.tienda.coldlt.modelo.entidad;


public class Item {

    private Producto producto;
    private int cantidad;
    private  double valorTotal;

    //constructor
    public Item(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.valorTotal = producto.getValor() * cantidad;
    }

    //al llamar este metodo se calcula el valorTotal del este item
    public double calcular() {
        valorTotal = this.producto.getValor() * this.cantidad;
        return valorTotal;
    }

    //<getters><setters>
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valor) {
        this.valorTotal = valor;
    }
}

