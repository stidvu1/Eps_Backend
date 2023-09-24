package com.gestion.eps.modelos;

import com.fasterxml.jackson.annotation.*;
import java.util.*;
import jakarta.persistence.*;


@Entity
@Table(name="especialistas")
public class Especialista {
	
	@Id
	private Long cedula_especialista;
	
	@Column(name="nombres", length=45, nullable = false)
	private String nombres;
	
	@Column(name= "apellidos",length=45, nullable = false)
	private String apellidos;
	
	@Column(name="rh",length=4,nullable = false)
	private String rh;
	
	@Column(name="telefono",length=15, nullable = false)
	private String telefono;
	
	@Column(name="correo",length=45,nullable = false)
	private String correo;
	
	@Column(name="departamento",length=45,nullable = false)
	private String departamento;
	
	@Column(name="ciudad",length=45,nullable = false)
	private String ciudad;
	
	@Column(name="direccion",length=45,nullable = false)
	private String direccion;
	
	private boolean enabled = true;	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@JoinColumn(name="especialidadId",referencedColumnName = "especialidad_id")
	private Especialidad especialidad;
	
	public Especialista() {
		
	}

	public Especialista(Long cedula_especialista, String nombres, String apellidos, String rh, String telefono,
			String correo, String departamento, String ciudad, String direccion, boolean enabled,
			Especialidad especialidad) {
		super();
		this.cedula_especialista = cedula_especialista;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rh = rh;
		this.telefono = telefono;
		this.correo = correo;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.enabled = enabled;
		this.especialidad = especialidad;
	}

	public Long getCedula_especialista() {
		return cedula_especialista;
	}

	public void setCedula_especialista(Long cedula_especialista) {
		this.cedula_especialista = cedula_especialista;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	
	

}
