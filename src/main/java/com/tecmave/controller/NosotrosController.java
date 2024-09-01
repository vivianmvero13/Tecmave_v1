package com.tecmave.controller;

import com.tecmave.domain.Cotizacion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nosotros")
public class NosotrosController {
    @GetMapping("/listado")
    public String nosotros() {
        return "/nosotros/listado";
    }
}
