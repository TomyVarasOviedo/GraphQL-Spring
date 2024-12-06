package com.graphql.api.API_GraphQl_Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.api.API_GraphQl_Spring.models.Producto;
import com.graphql.api.API_GraphQl_Spring.repositories.IOProducto;
import com.graphql.api.API_GraphQl_Spring.service.ProductoService;

@Controller
public class ProductoController {
    @Autowired
    private IOProducto productoRepository;
    @Autowired
    private ProductoService productoService;

    @QueryMapping
    public List<Producto> getProductos() {
        List<Producto> productos = productoRepository.findAll();
        return productos;
    }
    @MutationMapping
    public Producto addProducto(@Argument Producto producto){
        return productoRepository.save(producto);
    }
    @MutationMapping
    public boolean eliminarProducto(@Argument int idProducto){
        return productoService.eliminaProducto(idProducto);
    }
}
