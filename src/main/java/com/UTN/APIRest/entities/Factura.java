package com.UTN.APIRest.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Factura")
public class Factura extends Base {

    @Column(name = "numero")
    private int numero;
    @Column(name = "fecha facturacion")
    private Date fechaFacturacion;
    @Column(name = "identificador ")
    private Long mpPaymentID;
    @Column(name = "Id de pedido")
    private Long mpMerchantOrderId;
    @Column(name = "preferencia de pago")
    private String mpPreferentsId;
    @Column(name = "tipo de pago")
    private String mpPaymentType;
    @Column(name = "total venta")
    private double totalVenta;
    private Date horaEstimidaEntrega;
    @Column(name = "fecha Alta")
    private Date fechaAlta;
    @Column(name = "fecha modificacion")
    private Date fechaModificacion;
    @Column(name = "fechaBaja")
    private Date fechaBaja;

    private FormaPago formaPago;
    public enum FormaPago {
        EFECTIVO,
        MERCADO_PAGO
    }

    //Relacion con DetallePedido
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)    //orphanRemoval sirve para que si eliminamos un pedido tambien se eliminen los pedidosProducto asociados a ese pedido
    @JoinColumn(name = "fk_factura")

    private List<DetalleFactura> detalleFacturas = new ArrayList<DetalleFactura>();

/*
    public Factura() {

        this.numero = 1;
        this.fechaFacturacion = new Date();
        this.mpPaymentID = 123456L;
        this.mpMerchantOrderId = 7890L;
        this.mpPreferentsId = "Mercado Pago";
        this.mpPaymentType = "QR";
        this.totalVenta = 3000;
        this.horaEstimidaEntrega = new Date();
        this.fechaAlta = new Date();
        this.fechaModificacion = new Date();
        this.fechaBaja = null;
        this.formaPago = FormaPago.MERCADO_PAGO;
    }
*/
}
