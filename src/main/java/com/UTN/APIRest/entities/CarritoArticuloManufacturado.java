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
@Table(name = "Carrito_articulo_manufacturado")
public class CarritoArticuloManufacturado {

    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "numero de linea")
    private int numeroLinea;
}
