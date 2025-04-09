package com.proyectoClase.springHR.controllers;

import com.proyectoClase.springHR.admin.ServComunAdmin;
import com.proyectoClase.springHR.admin.ServDirreccionAdmin;
import com.proyectoClase.springHR.entities.Direccion;
import com.proyectoClase.springHR.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value ={"/","/direccion"})
public class DireccionController {

//    @Autowired
//    ServDirreccionAdmin servicio;

    @Autowired
    ServComunAdmin servicioComun;

//    @GetMapping
//    public String busccadorDirecciones(@RequestParam(name="id", required = false) Optional<String> idPais, Model model){
//
//        List<Direccion> direcciones = new ArrayList<Direccion>();
//
//        if(idPais.isPresent()){
//            direcciones = servicio.listaDirecciones(idPais.get());
//        }else {
//            direcciones = servicioComun.listaDirecciones();
//        }
//        List<Pais> paises = servicioComun.listPaises();
//        model.addAttribute("paises", paises);
//        model.addAttribute("listado", direcciones);
//
//        return "t_buscador_direcciones";
//    }
    public String listadoDirecciones(Model model){
        List<Direccion> direcciones = servicioComun.listaDirecciones();
        model.addAttribute("listado", direcciones);
        return "t_direcciones";
    }

}
