package edu.pucmm.josecl200.practica2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Usuario implements Serializable {
    @Id
    private String usuario;
    private String pass;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Role> role;
}
