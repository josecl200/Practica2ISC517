package edu.pucmm.josecl200.practica2.servicios;

import edu.pucmm.josecl200.practica2.entidades.Cliente;
import edu.pucmm.josecl200.practica2.entidades.Orden;
import edu.pucmm.josecl200.practica2.repositorios.OrdenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {
    @Autowired
    public OrdenRepo ordenRepo;

    public List<Orden> getAllOrders(){
        return ordenRepo.findAllByOrderByFechaCreacionDesc();
    }

    public List<Orden> getAllOrdersFromClient(Cliente cliente){
        return ordenRepo.findAllByClienteOrderByFechaCreacionDesc(cliente);
    }

    public boolean saveOrden(Orden orden){
        if(ordenRepo.save(orden)!=null){
            return true;
        }
        return false;
    }

    public boolean deleteOrden(long id){
        Orden orden=ordenRepo.findById(id).get();
        if(orden!=null){
            ordenRepo.delete(orden);
            return true;
        }
        return false;
    }

}
