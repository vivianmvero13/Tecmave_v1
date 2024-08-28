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
  private boolean activo;
  
  //private long idCategoria;
  
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;
  
  public Producto() {     
  }     
  
  public Producto(String producto, boolean activo) {         
      this.descripcion = producto;         
      this.activo = activo;     
  }
}
