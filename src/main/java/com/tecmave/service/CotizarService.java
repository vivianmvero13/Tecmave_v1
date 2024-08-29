package com.tecmave.service;

import com.tecmave.domain.Cotizacion;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;


public interface CotizarService {
     public Model crearCotizacion(Model model, Cotizacion cotizacion) throws MessagingException;
}
