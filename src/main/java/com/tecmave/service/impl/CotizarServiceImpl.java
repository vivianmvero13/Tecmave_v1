/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmave.service.impl;

import com.tecmave.domain.Cotizacion;
import com.tecmave.service.CotizarService;
import jakarta.mail.MessagingException;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 *
 * @author Cris
 */
@Service
public class CotizarServiceImpl implements CotizarService{
     @Autowired
    private MessageSource messageSource; //creado en semana 4...
    @Override
    public Model crearCotizacion(Model model, Cotizacion cotizacion)
       throws MessagingException {
       String mensaje;
       mensaje = String.format(
        messageSource.getMessage(
                 "cotizacion.correo.mensaje",
                 null,
                 Locale.getDefault()),
             cotizacion.getNombre(),
             cotizacion.getApellidos(),
             cotizacion.getCorreo(),
             cotizacion.getTelefono(),
             cotizacion.getDescripcion(),
             cotizacion.getMarca(),
             cotizacion.getModelo(),
             cotizacion.getAnio()
         );
        model.addAttribute(String.format(
            "titulo",
            messageSource.getMessage(
            "cotizacion.correo.titulo",
            null,
            Locale.getDefault()),
            cotizacion.getPlaca()));
        model.addAttribute("mensaje", mensaje);
        return model;
    }
}
