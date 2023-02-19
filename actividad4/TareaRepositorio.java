package com.chakour.entrega.actividad4;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TareaRepositorio extends CrudRepository<Tarea, Long>{
	
	List<Tarea> findByDescTarea(String descTarea);
	
	Tarea findById(long id);
	
	
}
