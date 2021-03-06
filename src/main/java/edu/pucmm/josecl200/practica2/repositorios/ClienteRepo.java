package edu.pucmm.josecl200.practica2.repositorios;

import edu.pucmm.josecl200.practica2.entidades.Cliente;
import edu.pucmm.josecl200.practica2.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente,Long>{

}
