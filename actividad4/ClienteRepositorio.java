package com.chakour.entrega.actividad4;

import java.util.List;
import org.springframework.data.repository.*;

public interface ClienteRepositorio extends CrudRepository<Cliente, Long>{
	
	List<Cliente> findByLastName(String lastName);
	
	Cliente findById(long id);
}
