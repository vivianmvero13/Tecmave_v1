
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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/AgendarCita")
        
public class AgendarCitaController {
    @Autowired
    private CitasService citaservice;
    
    @GetMapping
    public String mostrarAgendarCita(Model model){
        model.addAttribute("agendarcita", new AgendarCita());
        return "agendarcita";
    }
    
    @PostMapping
    public String crearcita(@ModelAttribute AgendarCita agendarcita, Model model){
        citaservice.crearcita(agendarcita);
        model.addAttribute("message", "Cita Agendada Correctamente!");
        return "redirect:/AgendarCita";
    }
    
    @GetMapping("/{idCita}")
    public AgendarCita getCita(@PathVariable Long idCita) {
        return citaservice.getCita(idCita);
        
    }
    @PutMapping("/{idCita}")
    public AgendarCita modificarcita(@PathVariable Long idCita, @RequestBody AgendarCita agendarcita){
        agendarcita.setIdCita(idCita);
        return citaservice.modificarcita(agendarcita);
    }
    
    @DeleteMapping("/{idCita}")
    public ResponseEntity<String> eliminarcita(@PathVariable Long idCita){
         citaservice.eliminarcita(idCita);
        return ResponseEntity.ok("Cita eliminada exitosamente");
    }
    
    @GetMapping("/todas")
    public List<AgendarCita> getcitastotal(){
        return citaservice.getcitastotal();
    }
    
}
