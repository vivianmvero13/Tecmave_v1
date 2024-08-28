package com.tecmave.dao;

import com.tecmave.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository <Categoria, Long>{
    
}
