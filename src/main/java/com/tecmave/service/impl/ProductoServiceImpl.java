package com.tecmave.service.impl;

import com.tecmave.dao.ProductoDao;
import com.tecmave.domain.Producto;
import com.tecmave.service.ProductoService;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoDao productoDao;
    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(){
        var lista=productoDao.findAll();
        return lista;
    }
    @Override
    @Transactional(readOnly=true)
    public Producto getProducto(Producto producto){
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
}
