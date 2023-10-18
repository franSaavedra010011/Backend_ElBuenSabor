package com.UTN.APIRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "combo_manufacturado_insumo")
public class ComboManufacturadoInsumo {

    @Column(name = "fecha_hora_hasta")
    private Date fechaHoraHasta;
    @Column(name = "fecha_hora_desde")
    private Date fechaHoraDesde;
}
