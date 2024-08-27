/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmave.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data 
@Entity 
@Table (name="producto")
public class Producto implements Serializable{
   private static final long serialVersionUID=1L;
  @Id
  @GeneratedValue (strategy=GenerationType.IDENTITY)
  @Column(name="id_producto")
    
  private Long  idProducto;
  private String descripcion;
  private String detalle;
  private double precio;
  private int existencias;
  private String rutaImagen;

  
  public Producto() {     
  }     
  
  public Producto(String producto, boolean activo) {         
      this.descripcion = producto;
  }
}
