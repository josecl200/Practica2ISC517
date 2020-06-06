package edu.pucmm.josecl200.practica2.repositorios;

import edu.pucmm.josecl200.practica2.entidades.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamiliaRepo extends JpaRepository<Familia,String> {
}
