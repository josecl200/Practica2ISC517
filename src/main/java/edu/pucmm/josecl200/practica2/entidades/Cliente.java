package edu.pucmm.josecl200.practica2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Cliente implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    private Usuario credenciales;
    @Column(unique = true)
    private String cedula;
    private String foto;
}
