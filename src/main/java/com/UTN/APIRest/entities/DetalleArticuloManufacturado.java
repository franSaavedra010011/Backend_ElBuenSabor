package com.UTN.APIRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Detalle_Artículo_Manufacturado")
public class DetalleArticuloManufacturado extends Base{

    @Column(name = "cantidad")
    private double cantidad;


    //Relacion con Articulo Insumo
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_detalleArticuloManufacturado")
    private List<ArticuloInsumo> articuloInsumos = new ArrayList<ArticuloInsumo>();

    //Relacion con articulo manufacturado
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_detalleArticuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;

/*
    public DetalleArticuloManufacturado(){
        this.cantidad = 1;
        this.articuloManufacturado = null;

        ArticuloInsumo carne1 = new ArticuloInsumo();
        carne1.setDenominacion("Carne");
        carne1.setStockActual(100);
        carne1.setPrecioCompra(200);

        ArticuloInsumo carne2 = new ArticuloInsumo();
        carne2.setDenominacion("Carne");
        carne2.setStockActual(100);
        carne2.setPrecioCompra(200);

        ArticuloInsumo pan = new ArticuloInsumo();
        pan.setDenominacion("Pan de hamburguesa");
        pan.setStockActual(200);
        pan.setPrecioCompra(100);

        ArticuloInsumo tomate = new ArticuloInsumo();
        tomate.setDenominacion("Tomate");
        tomate.setStockActual(50);
        tomate.setPrecioCompra(100);

        ArticuloInsumo lechuga = new ArticuloInsumo();
        lechuga.setDenominacion("Lechuga");
        lechuga.setStockActual(30);
        lechuga.setPrecioCompra(50);

        this.articuloInsumos.add(carne1);
        this.articuloInsumos.add(carne2);
        this.articuloInsumos.add(pan);
        this.articuloInsumos.add(tomate);
        this.articuloInsumos.add(lechuga);
    }
*/
}

