package com.UTN.APIRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Carrito")
public class Carrito {

    @Column(name = "nombre")
    private String nombreCarrito;
    @Column(name = "numero")
    private int nroCarrito;
}
