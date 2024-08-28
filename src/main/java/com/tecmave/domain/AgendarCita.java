package com.tecmave.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.Date;



@Data
@Entity
@Table(name = "cita")
public class AgendarCita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idCita;
    private String Nombre;
    private String Apellido;
    private Date Fecha;
    private String MotivoCita;
    
    
    public AgendarCita() {}

    public AgendarCita(Long idCita, String Nombre, String Apellido, Date Fecha, String MotivoCita) {
        this.idCita = idCita;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha = Fecha;
        this.MotivoCita = MotivoCita;
    }

 
    
    
    

}
