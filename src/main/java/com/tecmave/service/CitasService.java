package com.tecmave.service;

import com.tecmave.domain.AgendarCita
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
        return AgendarCitaDao.save(Agendarcita);
    }

    public AgendarCita getAgendarCita(int idCita) {
        return AgendarCitaDao.findById(IdCita).orElse(null);

    }

    public AgendarCita modificarcita(AgendarCita agendarcita) {
        return AgendarCitaDao.save(Agendarcita);

    }

    public AgendarCita eliminarcita(int idCita) {
        return AgendarCitaDao.deleteById(IdCita);
    }

    
    public List<AgendarCita> getcitastotal() {
        return AgendarCitaDao.findAll();
    }
}
