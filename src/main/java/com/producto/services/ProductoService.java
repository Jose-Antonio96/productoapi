package com.producto.services;

import java.util.List;

import com.producto.models.Producto;

public interface ProductoService {
    List<Producto> productos();
    void altaProducto(Producto producto);
    void modificarProducto(int codigoProducto, int stock);
    double obtenerPrecio(int codigoProducto);

}
