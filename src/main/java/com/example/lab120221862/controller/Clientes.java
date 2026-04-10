package com.example.lab120221862.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/clientela", method = RequestMethod.GET)
public class Clientes {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String nombreCliente(){
        return "Nombre";
    }
    @ResponseBody
    public String formularioCliente(){
        return "Cliente / crear";
    }
    @RequestMapping(value = "/guardar", method = RequestMethod.GET)
    public String guardarCliente(){
        return "redirect: /clientela";
    }
}
