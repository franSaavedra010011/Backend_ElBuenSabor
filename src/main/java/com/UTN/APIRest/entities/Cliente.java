package com.UTN.APIRest.entities;

import com.UTN.APIRest.entities.Base;
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
@Table(name = "Cliente")
public class Cliente extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email")
    private String email;
    @Column(name = "fecha Alta")
    private Date fechaAlta;
    @Column(name = "fecha modificacion")
    private Date fechaModificacion;
    @Column(name = "fechaBaja")
    private Date fechaBaja;

    //Relacion a domicilio
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_cliente")

    private List<Domicilio> domicilios = new ArrayList<Domicilio>();


    //Relacion con pedido
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_cliente")

    private List<Pedido> pedido = new ArrayList<Pedido>();

    //Relacion con Usuario 1 a 1
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_usuario")
    private Usuario usuario;

/*
    public Cliente(){
        this.nombre = "Pepe";
        this.apellido = "Gomez";
        this.telefono = "261150386";
        this.email = "pepegomez@gmail.com";
        this.fechaAlta = new Date();
        this.fechaModificacion = new Date();
        this.fechaBaja = null;
    }
*/
}
