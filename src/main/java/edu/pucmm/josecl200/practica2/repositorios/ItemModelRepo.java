package edu.pucmm.josecl200.practica2.repositorios;

import edu.pucmm.josecl200.practica2.entidades.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemModelRepo extends JpaRepository<ItemModel,Long> {
    List<ItemModel> findAllByOrderByPrecioPorDiaAsc();
}
