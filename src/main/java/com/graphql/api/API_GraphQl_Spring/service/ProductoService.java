package com.graphql.api.API_GraphQl_Spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.api.API_GraphQl_Spring.models.Producto;
import com.graphql.api.API_GraphQl_Spring.repositories.IOProducto;

@Service
public class ProductoService {
    @Autowired
    private IOProducto userRepository;

    public ArrayList<Producto> getProductos() {
        return (ArrayList<Producto>) userRepository.findAll();
    }
    public Producto guardarProducto(Producto producto) {
        return userRepository.save(producto);
    }
    @SuppressWarnings("deprecation")
    public boolean  eliminaProducto(int idProducto) {
        Producto producto = (userRepository.existsById(idProducto))? userRepository.getById(idProducto) : null;
        if (producto != null) {
            userRepository.deleteById(idProducto);
            return true;
        }
        return false;
    }
}