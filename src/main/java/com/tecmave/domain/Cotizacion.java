/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmave.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Cris
 */

@Data
public class Cotizacion implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String placa;
    private String apellidos;
    private String correo;
    private String telefono;
    private String descripcion;
    private String marca;
    private String modelo;
    private String anio;

    public Cotizacion() {
    }
    
    
}
