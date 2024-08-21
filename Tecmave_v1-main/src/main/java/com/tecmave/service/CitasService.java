package com.tecmave.service;

import com.tecmave.domain.AgendarCita;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tecmave.Dao.AgendarCitaDao;

@Service
public class CitasService {

    @Autowired
    private AgendarCitaDao agendarcitadao;

    public AgendarCita crearcita(AgendarCita agendarcita) {
        return agendarcitadao.save(agendarcita);
    }

    public AgendarCita getCita(Long idCita) {
        return agendarcitadao.findById(idCita).orElse(null);

    }

    public AgendarCita modificarcita(AgendarCita agendarcita) {
        return agendarcitadao.save(agendarcita);

    }

    public void eliminarcita(Long idCita) {
         agendarcitadao.deleteById(idCita);
    }

    
    public List<AgendarCita> getcitastotal() {
        return agendarcitadao.findAll();
    }
}
