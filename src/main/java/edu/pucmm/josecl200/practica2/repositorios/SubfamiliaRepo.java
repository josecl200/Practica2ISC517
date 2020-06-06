package edu.pucmm.josecl200.practica2.repositorios;

import edu.pucmm.josecl200.practica2.entidades.Familia;
import edu.pucmm.josecl200.practica2.entidades.SubFamilia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubfamiliaRepo extends JpaRepository<SubFamilia,String> {
    List<SubFamilia> findAllByFamilia(Familia familia);
}
