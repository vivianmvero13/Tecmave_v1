package com.tecmave.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.tecmave.service.EmailService;
import jakarta.mail.MessagingException;


@Controller
@RequestMapping("/cotizacion")
public class CotizacionController {
     
    @Autowired
    private EmailService emailService;
    @PostMapping("/enviar")
    public String enviarCotizacion(
        @RequestParam("nombre") String nombre,
        @RequestParam("placa") String placa,
        @RequestParam("apellidos") String apellidos,
        @RequestParam("correo") String correo,
        @RequestParam("telefono") String telefono,
        @RequestParam("descripcion") String descripcion,
        @RequestParam("marca") String marca,
        @RequestParam("modelo") String modelo,
        @RequestParam("anio") String anio ) throws MessagingException{

        String cuerpoHTML = "<html><head><style>"
                + "body { font-family: Arial, sans-serif; line-height: 1.6; background-color: #f9f9f9; margin: 0; padding: 20px; }"
                + ".container { max-width: 600px; margin: 0 auto; background-color: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }"
                + "h2 { color: #333; }"
                + "p { margin-bottom: 10px; }"
                + "strong { font-weight: bold; }"
                + "</style></head>"
                + "<body>"
                + "<div class=\"container\">"
                + "<h2>Detalles de Cotización</h2>"
                + "<p><strong>Nombre:</strong> " + nombre + "</p>"
                + "<p><strong>Apellidos:</strong> " + apellidos + "</p>"
                + "<p><strong>Correo Electrónico:</strong> " + correo + "</p>"
                + "<p><strong>Teléfono:</strong> " + telefono + "</p>"
                + "<p><strong>Descripción del Problema:</strong></p>"
                + "<p>" + descripcion + "</p>"
                + "<p><strong>Placa del Vehículo:</strong> " + placa + "</p>"
                + "<p><strong>Marca del Vehículo:</strong> " + marca + "</p>"
                + "<p><strong>Modelo del Vehículo:</strong> " + modelo + "</p>"
                + "<p><strong>Año del Vehículo:</strong> " + anio + "</p>"
                + "</div>"
                + "</body></html>";
        emailService.sendHtmlEmail(correo, "NUEVA COTIZACIÓN ID:"+placa,cuerpoHTML);
        return "index";
    }
    
    
}
