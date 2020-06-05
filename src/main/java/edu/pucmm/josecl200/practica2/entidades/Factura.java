package edu.pucmm.josecl200.practica2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Factura implements Serializable {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    Orden orden;
    @Temporal(value = TemporalType.TIMESTAMP)
    Timestamp fechaEntregado;
    private Double precio;
}
