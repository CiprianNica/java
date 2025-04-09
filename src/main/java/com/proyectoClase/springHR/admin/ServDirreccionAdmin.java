package com.proyectoClase.springHR.admin;

import com.proyectoClase.springHR.entities.Direccion;

public interface ServDirreccionAdmin {
    public Direccion getDireccion(int id);
    public Direccion saveDireccion(Direccion direccion);
    public Direccion saveDireccion(int id, String direccion, String cp, String provincia, String pais_id);
}
