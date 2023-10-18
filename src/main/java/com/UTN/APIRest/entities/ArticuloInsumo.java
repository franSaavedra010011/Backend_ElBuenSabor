package com.UTN.APIRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Artículo_Insumo")
public class ArticuloInsumo extends Base{
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "url imagen")
    private String urlImagen;
    @Column(name = "stock actual")
    private double stockActual;
    @Column(name = "stock minimo")
    private double stockMinimo;
    @Column(name = "precio compra")
    private double precioCompra;
    @Column(name = "fecha Alta")
    private Date fechaAlta;
    @Column(name = "fecha modificacion")
    private Date fechaModificacion;
    @Column(name = "fechaBaja")
    private Date fechaBaja;

    //Relacion con Unidad Medida
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_unidadMedida")
    private UnidadMedida unidadMedida;

    //Relacion con Rubro Articulo
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_rubroArticulo")
    private RubroArticulo rubroArticulo;

/*
    public ArticuloInsumo(){
        this.denominacion = "Pepsi 500ml";
        this.urlImagen = "https://dcdn.mitiendanube.com/stores/001/611/627/products/1500-regular-011-17aae1c17219bb3b8316179114560247-640-0.webp";
        this.stockActual = 50;
        this.stockMinimo = 10;
        this.precioCompra = 700;
        this.fechaAlta = new Date();
        this.fechaModificacion = new Date();
        this.fechaBaja = null;
    }
*/
}
