package edu.pucmm.josecl200.practica2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class ItemModel implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precioPorDia;
    private String foto;
    @ManyToOne
    private Familia familia;
    @ManyToOne
    private SubFamilia subFamilia;
}
