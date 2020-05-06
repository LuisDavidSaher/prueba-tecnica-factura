package com.tienda.coldlt.controlador;

import com.tienda.coldlt.modelo.entidad.Factura;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path ="/factura")
public class FacturaControlador {

    @PostMapping(path ="/calcular")
    public @ResponseBody Factura calcularFactura(@RequestBody Factura factura ){
        factura.calcular();//calcula internamanente los valores de los items y el valor total de la factura
        return factura;
    }

}
