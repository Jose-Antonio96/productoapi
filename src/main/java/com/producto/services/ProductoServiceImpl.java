package com.producto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producto.repository.ProductoRepository;

import com.producto.models.Producto;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoRepository repository;

    @Override
    public List<Producto> productos() {
        return repository.findAll();
    }

    @Override
    public void altaProducto(Producto producto) {
        repository.save(producto);
    }

    @Override
    public void modificarProducto(int codigoProducto, int stock) {
        Producto producto = repository.findById(codigoProducto).orElse(null);
        if (producto != null) {
            producto.setStock(stock);
            repository.save(producto);
        }
        
    }

    @Override
    public double obtenerPrecio(int codigoProducto) {
        Producto producto = repository.findById(codigoProducto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return producto.getPrecioUnitario();
    }
}
