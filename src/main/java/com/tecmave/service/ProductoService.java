/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tecmave.service;

import java.util.List;


public interface ProductoService {
    //Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);
    //Se obtiene una producto por medio de ID
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
     public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
     public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
     public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
}
