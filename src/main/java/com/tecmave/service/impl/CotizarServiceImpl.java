/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmave.service.impl;

import com.tecmave.domain.Cotizacion;
import com.tecmave.service.CorreoService;
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
    private CorreoService correoService;
     @Autowired
    private MessageSource messageSource; //creado en semana 4...
    @Override
    public void crearCotizacion(Cotizacion cotizacion) throws MessagingException {
        String contenidoHtml = String.format(
            "<html><body>" +
            "<h1>%s</h1>" +
            "<p><strong>Nombre:</strong> %s</p>" +
            "<p><strong>Apellidos:</strong> %s</p>" +
            "<p><strong>Correo:</strong> %s</p>" +
            "<p><strong>Teléfono:</strong> %s</p>" +
            "<p><strong>Descripción:</strong> %s</p>" +
            "<p><strong>Marca:</strong> %s</p>" +
            "<p><strong>Modelo:</strong> %s</p>" +
            "<p><strong>Año:</strong> %s</p>" +
            "</body></html>",
            messageSource.getMessage("cotizacion.correo.titulo", new Object[]{cotizacion.getPlaca()}, Locale.getDefault()),
            cotizacion.getNombre(),
            cotizacion.getApellidos(),
            cotizacion.getCorreo(),
            cotizacion.getTelefono(),
            cotizacion.getDescripcion(),
            cotizacion.getMarca(),
            cotizacion.getModelo(),
            cotizacion.getAnio()
        );

        correoService.enviarCorreoHtml(
            cotizacion.getCorreo(), // Dirección de destino (puedes cambiarla si es una dirección fija)
            messageSource.getMessage("cotizacion.correo.asunto", null, Locale.getDefault()), // Asunto del correo
            contenidoHtml // Contenido HTML del correo
        );
    }
}
