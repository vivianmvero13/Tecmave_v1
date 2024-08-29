package com.tecmave.controller;


import com.tecmave.domain.Cotizacion;
import com.tecmave.service.CotizarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



@Controller
@RequestMapping("/cotizar")
public class CotizacionController {
    @Autowired
    private CotizarService cotizarService;
    
    @PostMapping("/enviarCotizacion")
    public String enviarCotizacion(@ModelAttribute Cotizacion cotizacion, Model model) throws MessagingException {

        cotizarService.crearCotizacion(cotizacion); // Procesa la cotización y envía el correo

        // Redirige a la vista del listado después de procesar la cotización
        return "redirect:/cotizar/listado";
    }
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        model.addAttribute("cotizacion", new Cotizacion());
        return "cotizar/listado";
    }
    
    
}
