package com.UTN.APIRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Artículo_Manufacturado")
public class ArticuloManufacturado extends Base {

    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempo estimado cocina")
    private double tiempoEstimadoCocina;
    @Column(name = "costo")
    private double costo;
    @Column(name = "precio venta")
    private double precioVenta;
    @Column(name = "url imagen")
    private String urlImagen;
    @Column(name = "fecha Alta")
    private Date fechaAlta;
    @Column(name = "fecha modificacion")
    private Date fechaModificacion;
    @Column(name = "fechaBaja")
    private Date fechaBaja;

/*
    public ArticuloManufacturado() {
        this.denominacion = "Hamburguesa";
        this.descripcion = "Hamburguesa grande con doble carne";
        this.tiempoEstimadoCocina = 20;
        this.costo = 650;
        this.precioVenta = 3000;
        this.urlImagen = "https://cdn-3.expansion.mx/dims4/default/d64801b/2147483647/strip/true/crop/1216x863+0+0/resize/1800x1277!/format/webp/quality/80/?url=https%3A%2F%2Fcdn-3.expansion.mx%2Fb7%2F07%2F047d352e4fdf984a0f7f08d2e1b0%2Fpromociones-dia-de-la-hamburguesa-2023.jpg";
        this.fechaAlta = new Date();
        this.fechaModificacion = new Date();
        this.fechaBaja = null;
    }
*/
}