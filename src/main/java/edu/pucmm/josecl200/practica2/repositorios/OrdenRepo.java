package edu.pucmm.josecl200.practica2.repositorios;

import edu.pucmm.josecl200.practica2.entidades.Cliente;
import edu.pucmm.josecl200.practica2.entidades.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdenRepo extends JpaRepository<Orden,Long> {
    List<Orden> findAllByClienteOrderByFechaCreacionDesc(Cliente cliente);
    List<Orden> findAllByOrderByFechaCreacionDesc();
}
