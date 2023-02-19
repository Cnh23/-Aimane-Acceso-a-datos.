package com.chakour.entrega.actividad4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tarea {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nombreTarea, descTarea;
	
	//La tarea pertenece a un único cliente
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	protected Tarea() {}
	
	public Tarea(String nombreTarea, String descTarea) {
		super();
		this.nombreTarea = nombreTarea;
		this.descTarea = descTarea;
	}
	
	public Tarea(String nombreTarea, String descTarea, Cliente cliente) {
		super();
		this.nombreTarea = nombreTarea;
		this.descTarea = descTarea;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public String getNombreTarea() {
		return nombreTarea;
	}

	public String getDescTarea() {
		return descTarea;
	}

	@Override
	public String toString() {
		return String.format("Tarea[id=%d, nombreTarea='%s', descTarea='%s', cliente='%s']",
				id, nombreTarea, descTarea, cliente);
	}
}
