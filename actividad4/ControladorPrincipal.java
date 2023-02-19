package com.chakour.entrega.actividad4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller // Esto indica que la clase es un controller
public class ControladorPrincipal {

	@Autowired // Indicamos que cargamos el bean llamado Usuario repositorio
	private ClienteRepositorio clienteRepositorio;
	@Autowired
	private TareaRepositorio tareaRepositorio;
	
	@GetMapping("/inicio")
	public String iniPg() {
		return "index";
	}
		
	@GetMapping(path="/listadoclientes")
	public String getListaUsuarios (Model modelo) {
		modelo.addAttribute("listado",  clienteRepositorio.findAll());
		return "/listadoclientes";
	}
	@GetMapping(path="/listadotareas")
	public String getListaPedidos (Model modelo) {
		modelo.addAttribute("listado",  tareaRepositorio.findAll());
		return "/listadotareas";
	}
}
