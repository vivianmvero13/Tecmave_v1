package com.tecmave.service;

import com.tecmave.domain.Cotizacion;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

public interface CotizarService {
     public void crearCotizacion(Cotizacion cotizacion) throws MessagingException;
}
