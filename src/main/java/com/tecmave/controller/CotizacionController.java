package com.tecmave.controller;


import com.tecmave.domain.Cotizacion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/cotizar")
public class CotizacionController {
    @GetMapping("/listado")
    public String inicio() {
        return "/cotizar/listado";
    }
}
