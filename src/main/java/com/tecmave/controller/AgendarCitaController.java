
package com.tecmave.controller;

/**
 *
 * @author villa
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.tecmave.domain.AgendarCita;
import com.tecmave.service.CitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AgendarCita")
        
public class AgendarCitaController {
    @Autowired
    private CitasService citaservice;
    
    @PostMapping
    public AgendarCita crearcita(@RequestBody AgendarCita agendarcita){
        return citaservice.crearcita(agendarcita);
    }
    
    @GetMapping("/{idCita}")
    public AgendarCita getCita(@PathVariable Long idCita) {
        return citaservice.getCita(idCita);
        
    }
    @PutMapping("/{idCita}")
    public AgendarCita modificarcita(@PathVariable Long idCita, @RequestBody AgendarCita agendarcita){
        agendarcita.setIdCita( idCita);
        return citaservice.modificarcita(agendarcita);
    }
    
    @DeleteMapping("/{idCita}")
    public AgendarCita eliminarcita(@PathVariable Long idCita){
        return citaservice.eliminarcita(idCita);
    }
    
    @GetMapping
    public List<AgendarCita> getcitastotal(){
        return citaservice.getcitastotal();
    }
    
}
