package com.tienda.coldlt.modelo.entidad;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Esta clase corresponde a una entidad en la Base de Datos
@Entity
public class Producto {

    //declaracion de atributos
    @Id//llave primaria
    private long codigo;
    private double valor;
    private  String nombre;


    //<getters><setters>
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
