package com.graphql.api.API_GraphQl_Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.api.API_GraphQl_Spring.models.Producto;

@Repository
public interface IOProducto extends JpaRepository<Producto,Integer>{
    
}
