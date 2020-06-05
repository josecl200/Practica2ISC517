package edu.pucmm.josecl200.practica2.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class Item implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ItemModel model;
    private Boolean alquilado;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Timestamp fechaAlquiler;
}
