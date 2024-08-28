package com.tecmave.service.impl;

import com.tecmave.dao.ProductoDao;
import com.tecmave.domain.Producto;
import com.tecmave.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoDao productoDao;
    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos){
        var lista=productoDao.findAll();
        return lista;
    }
    @Override
    @Transactional(readOnly=true)
    public Producto getProducto(Producto producto){
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
    @Override
    @Transactional
    public void save(Producto producto){
        productoDao.save(producto);
    }
    @Override
    @Transactional
    public void delete(Producto producto){
        productoDao.delete(producto);
    }
}
