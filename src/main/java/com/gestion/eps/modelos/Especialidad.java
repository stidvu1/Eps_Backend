package com.gestion.eps.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="especialidades")
public class Especialidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long especialidad_id;

	@Column(name="nombre",length=45,nullable=false)
	private String nombre;
	
	@Column(name="observacion",length=200,nullable=false)
	private String observacion;
	
	private boolean enabled=true;
	
	public Especialidad () {
		
	}

	public Especialidad(Long especialidad_id, String nombre, String observacion, boolean enabled) {
		super();
		this.especialidad_id = especialidad_id;
		this.nombre = nombre;
		this.observacion = observacion;
		this.enabled = enabled;
	}

	public Long getEspecialidad_id() {
		return especialidad_id;
	}

	public void setEspecialidad_id(Long especialidad_id) {
		this.especialidad_id = especialidad_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
