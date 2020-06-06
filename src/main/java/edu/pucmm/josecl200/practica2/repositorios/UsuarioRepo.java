package edu.pucmm.josecl200.practica2.repositorios;

import edu.pucmm.josecl200.practica2.entidades.Role;
import edu.pucmm.josecl200.practica2.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, String> {
    Usuario findByUsuario(String usuario);
    List<Usuario> findAllByRole(Role role);

}
