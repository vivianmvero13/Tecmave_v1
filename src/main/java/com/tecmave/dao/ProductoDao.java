package com.tecmave.dao;

import com.tecmave.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends JpaRepository <Producto, Long>{
    
}
