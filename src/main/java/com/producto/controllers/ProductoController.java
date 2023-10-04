package com.producto.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import com.producto.models.Producto;
import com.producto.services.ProductoService;

@RestController
public class ProductoController {
    @Autowired
    ProductoService service;

    @GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> getProductos() {
        return service.productos();
    }

    @PutMapping(value = "producto", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarStock(@RequestBody Producto producto) {
        service.modificarProducto(producto.getCodigoProducto(), producto.getStock());
    }

    @PostMapping(value = "producto", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void alta(@RequestBody Producto producto) {
        service.altaProducto(producto);
    }

    @GetMapping(value = "producto/{codigoProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double precio(@PathVariable("codigoProducto") int codigoProducto) {
        return service.obtenerPrecio(codigoProducto);
    }
}
