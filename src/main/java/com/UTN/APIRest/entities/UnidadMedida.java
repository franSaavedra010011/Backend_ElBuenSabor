package com.UTN.APIRest.entities;

import jakarta.persistence.Column;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Unidad_Medida")
public class UnidadMedida extends Base {
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "abreviatura")
    private String abreviattura;
    @Column(name = "fecha Alta")
    private Date fechaAlta;
    @Column(name = "fecha modificacion")
    private Date fechaModificacion;
    @Column(name = "fechaBaja")
    private Date fechaBaja;

/*
    public UnidadMedida() {
        this.denominacion = "Gramos";
        this.abreviatura = "gr";
        this.fechaAlta = new Date();
        this.fechaModificacion = new Date();
        this.fechaBaja = null;
    }

*/
}
