package com.mugpork.Presidenciales.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadanos")
public class BaseDeDatos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idCiudadano;

    @Column(name="cc")
    private Integer cedula;
    
    @Column(name = "name")
    private String nombre;

    @Column(name = "lastname")
    private String apellido;

    private String mail;

    @Column(name = "phone")
    private Integer telefono; 

    @Column(name = "address")
    private String direccion;

    @Column(name = "city")
    private String ciudad;

    @Column(name = "voting_status")
    private Integer estadoVotacion;

    @Column(name = "voted_for")
    private String votoPor;
    

    public Integer getIdCiudadano() {
        return this.idCiudadano;
    }

    public void setIdCiudadano(Integer idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public Integer getCc() {
        return this.cedula;
    }

    public void setCc(Integer cc) {
        this.cedula = cc;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getVotingStatus() {
        return this.estadoVotacion;
    }

    public void setVotingStatus(Integer votingStatus) {
        this.estadoVotacion = votingStatus;
    }

    public String getVotoPor() {
        return this.votoPor;
    }

    public void setVotoPor(String votoPor) {
        this.votoPor = votoPor;
    }
    
}
