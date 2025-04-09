package com.proyectoClase.springHR.controllers;

import com.proyectoClase.springHR.admin.ServComunAdmin;
import com.proyectoClase.springHR.entities.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/direccion")
public class DireccionController {

    @Autowired
    ServComunAdmin servicioComun;

    @GetMapping
    public String listadoDirecciones(Model model){
        List<Direccion> direcciones = servicioComun.listaDirecciones();
        model.addAttribute("listado", direcciones);
        return "t_direcciones";
    }

}
