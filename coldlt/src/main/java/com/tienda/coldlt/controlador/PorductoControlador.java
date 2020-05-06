package com.tienda.coldlt.controlador;

import com.tienda.coldlt.modelo.entidad.Producto;
import com.tienda.coldlt.modelo.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//la siguiente anotacion nos permite recicir peticiones de cualquier orige con metodos GET, POST, PUT, DELETE
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping(path = "/producto")
public class PorductoControlador {
    @Autowired//cargamos de la base de datos
    private ProductoRepository productoRepository;

    //recibe los campos del nuevo porductos como parametor de la url
    @PostMapping
    public @ResponseBody String addNewProducto(@RequestParam long codigo, double valor, String nombre){
        Producto nuevoProducto = new Producto();//secrea un nuevo producto vacio
        nuevoProducto.setCodigo(codigo);        //luego se modifican sus atributos por los del nuevo producto
        nuevoProducto.setValor(valor);
        nuevoProducto.setNombre(nombre);
        productoRepository.save(nuevoProducto);//Guradmos el nuevo producto
        return "saved";
    }

    @PutMapping
    public @ResponseBody String editProducto(@RequestParam  long codigo, double valor, String nombre){
        Producto producto = productoRepository.findById(codigo).get();
        producto.setNombre(nombre);
        producto.setValor(valor);
        producto.setCodigo(codigo);
        productoRepository.save(producto);
        return "saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Producto> getTodosLosProductos(){
        return productoRepository.findAll();
    }

    @GetMapping()
    public @ResponseBody Producto getProductoPorId(@RequestParam long codigo){
        return productoRepository.findById(codigo).get();
    }

    @DeleteMapping(path = "/delete")
    public @ResponseBody String deleteProductoURL(@RequestParam long id){
        productoRepository.deleteById(id);
        return "hecho";
    }
    @DeleteMapping
    public @ResponseBody String deleteProducto(@RequestBody Producto producto){
        productoRepository.delete(producto);
        return "hecho";
    }
}
