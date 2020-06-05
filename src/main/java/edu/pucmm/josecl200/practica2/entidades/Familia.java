package edu.pucmm.josecl200.practica2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity @AllArgsConstructor @Data @NoArgsConstructor
public class Familia implements Serializable {
    @Id
    private String familia;
}
