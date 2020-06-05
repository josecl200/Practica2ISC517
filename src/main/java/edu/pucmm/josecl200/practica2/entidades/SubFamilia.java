package edu.pucmm.josecl200.practica2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class SubFamilia implements Serializable {
    @Id
    private String subfamilia;
    @ManyToOne
    private Familia familia;
}
