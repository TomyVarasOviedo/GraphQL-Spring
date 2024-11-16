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
}