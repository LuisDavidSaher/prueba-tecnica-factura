package com.tienda.coldlt.modelo.repositorio;

import org.springframework.data.repository.CrudRepository;
import  com.tienda.coldlt.modelo.entidad.Producto;

//interface para la comunicacion con la base de datos
public interface ProductoRepository extends CrudRepository <Producto, Long> {
    //implementacion automatica por el spring boot
}
