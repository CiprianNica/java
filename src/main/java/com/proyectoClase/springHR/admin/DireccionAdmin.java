package com.proyectoClase.springHR.admin;

import com.proyectoClase.springHR.entities.Direccion;
import org.springframework.stereotype.Service;

@Service
public class DireccionAdmin implements ServDirreccionAdmin{
    @Override
    public Direccion getDireccion(int id) {
        return null;
    }

    @Override
    public Direccion saveDireccion(Direccion direccion) {
        return null;
    }

    @Override
    public Direccion saveDireccion(int id, String direccion, String cp, String provincia, String pais_id) {
        return null;
    }
}
