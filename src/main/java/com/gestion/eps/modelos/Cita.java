package com.gestion.eps.modelos;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name="citas")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cita_id;
	
	@JsonFormat(pattern="yyyy-MM-dd",timezone="America/Bogota")
	private Date fecha;
	
	@Column(name="observacion", length = 200, nullable = false)
	private String observacion;
	
	@ManyToOne
	@JoinColumn(name="pacienteC",referencedColumnName="cedula_paciente")
	Paciente paciente;
	
	

}
