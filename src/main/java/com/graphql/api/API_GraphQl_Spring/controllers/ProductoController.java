package com.graphql.api.API_GraphQl_Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.api.API_GraphQl_Spring.models.Producto;
import com.graphql.api.API_GraphQl_Spring.repositories.IOProducto;

@Controller
public class ProductoController {
    @Autowired
    private IOProducto productoRepository;

    @QueryMapping
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }
}
