package com.proyectoClase.springHR.admin;

import com.proyectoClase.springHR.entities.Direccion;
import com.proyectoClase.springHR.repositories.DireccionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionAdmin implements ServDirreccionAdmin{

    DireccionRepository repositorio;

    @Autowired
    public DireccionAdmin (DireccionRepository repositorio) {
        this.repositorio = repositorio;
    }

//    @Autowired
//    public List<Direccion> listaDirecciones(String idPais){
//        return repositorio.findAllByPais_Id(idPais);
//    }
}
