package com.tecmave.controller;


import com.tecmave.domain.Cotizacion;
import com.tecmave.service.CategoriaService;
import com.tecmave.service.CotizarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.mail.MessagingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/cotizar")
public class CotizacionController {
    @Autowired
    private CotizarService cotizarService;
    
    @PostMapping("/enviarCotizacion")
    public String enviarCotizacion(Model model, Cotizacion cotizacion)
            throws MessagingException {
        model = cotizarService.crearCotizacion(model, cotizacion);
        return "redirect:/cotizar/listado"; // Usa redirect para redirigir después del POST
    }
    
    @GetMapping("/listado")
    public String inicio() {
        return "cotizar/listado";
    }
    
    
}
