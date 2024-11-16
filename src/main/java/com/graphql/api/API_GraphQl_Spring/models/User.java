package com.graphql.api.API_GraphQl_Spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    private Long id;
}
