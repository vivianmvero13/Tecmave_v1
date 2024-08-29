package com.tecmave.dao;

import com.tecmave.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao  extends JpaRepository <Venta,Long>{
    
}