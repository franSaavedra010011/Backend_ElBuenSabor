package com.UTN.APIRest.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Detalle_Factura")
public class DetalleFactura extends  Base{
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "subTotal")
    private double subTotal;


    //relacion con articulo insumo
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloInsumo")
    private ArticuloInsumo articuloInsumo;

    //relacion con articulo manufacturado
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;

/*
    public DetalleFactura() {
        this.cantidad = 2;
        this.subTotal = 15.0;

        ArticuloInsumo insumo = new ArticuloInsumo();
        insumo.setDenominacion("Tomate");
        insumo.setPrecioCompra(50);
        insumo.setStockActual(50);

        this.articuloInsumo = insumo;
        this.articuloManufacturado = null;
    }
*/

}
