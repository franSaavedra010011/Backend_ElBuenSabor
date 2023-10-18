package com.UTN.APIRest.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Detalle_Pedido")
public class DetallePedido extends Base {

    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "subTotal")
    private double subTotal;
    @Column(name = "subTotal costo")
    private double subTotalCosto;

    //Relacion con ArticuloInsumo
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloInsumo")
    private ArticuloInsumo articuloInsumo;

    //Relacion con ArticuloManufacturado
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;

/*
    public DetallePedido() {
        this.cantidad = 5;
        this.subTotal = 50.0;
        this.subTotalCosto = 45.0;

        ArticuloInsumo insumo = new ArticuloInsumo();
        insumo.setDenominacion("Tomate");
        insumo.setPrecioCompra(50);
        insumo.setStockActual(100);

        this.articuloInsumo = insumo;

        ArticuloManufacturado manufacturado = new ArticuloManufacturado();
        manufacturado.setDenominacion("Hamburguesa");
        manufacturado.setPrecioVenta(3000);
        manufacturado.setTiempoEstimadoCocina(20);

        this.articuloManufacturado = manufacturado;
    }
*/
}