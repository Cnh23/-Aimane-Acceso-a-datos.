package com.chakour.entrega.actividad4;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName, lastName;
	
	//Un cliente puede tener varias tareas
	@OneToMany(mappedBy="cliente")
	private List<Tarea> taskList = new ArrayList<>();
	
	public Cliente() {}
	
	public Cliente(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Cliente(String firstName, String lastName, List<Tarea> taskList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.taskList = taskList;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']",
				id, firstName, lastName);
		
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public List<Tarea> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Tarea> taskList) {
		this.taskList = taskList;
	}
}
