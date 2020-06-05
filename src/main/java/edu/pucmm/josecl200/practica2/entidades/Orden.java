package edu.pucmm.josecl200.practica2.entidades;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Orden implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;
    @Temporal(value = TemporalType.TIMESTAMP) @CreationTimestamp
    private Timestamp fechaCreacion;
    @OneToOne
    private Item item;




}
