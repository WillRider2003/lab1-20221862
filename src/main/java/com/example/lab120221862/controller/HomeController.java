package com.example.lab120221862.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/carta", method = RequestMethod.GET)
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal(){
        return "Pedido";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listarPlatos(){
        return "Platos";
    }

    @RequestMapping(value = "crearFrm", method = RequestMethod.GET)
    public String formularioPlatos(){
        return "Platos / crear";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.GET)
    public String guardarPlatos(){
        return "redirect: /carta";
    }

}