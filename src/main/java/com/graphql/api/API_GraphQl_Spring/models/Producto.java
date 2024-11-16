package com.graphql.api.API_GraphQl_Spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProducto;

    @Column
    private String nombre;

    @Column
    private String fechaLlegada;

    @Column
    private int cantidad;

    @Column
    private double costo;

    @Column
    private String categoria;
}
