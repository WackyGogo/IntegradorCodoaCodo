package com.example.animales.models;

import javax.persistence.*;

@Entity
@Table(name ="perdidos")

public class PerdidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    private String nombre;
    private Integer edad;
    private String zona;
    private String sexo;
    private String raza;
    private String color;
    private String foto;
    private String comentario;
    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    
    public String getZona(){
        return zona;
    }
    public void setZona(String zona){
        this.zona=zona;
    }

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getFoto(){
        return foto;
    }
    public void setFoto(String foto){
        this.foto=foto;
    }

    public String getComentario(){
        return comentario;
    }
    public void setComentario(String comentario){
        this.comentario=comentario;
    }
}
