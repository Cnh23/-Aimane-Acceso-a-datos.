package com.chakour.entrega.actividad4;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EntregaChakourApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EntregaChakourApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demoRelaciones(ClienteRepositorio repositorioCli, TareaRepositorio repositorioTask) {
		return (args) -> {
			//Cargamos en la BBDD algunos clientes por defecto
			Cliente cli1 = new Cliente("Antonio", "Ranchal");
			Cliente cli2 = new Cliente("David", "Perez");
			Cliente cli3 = new Cliente("Daniel", "Angulo");
			Cliente cli4 = new Cliente("Andrés", "Guz");
			Cliente cli5 = new Cliente("Adri", "Rodel");
			Cliente cli6 = new Cliente("Sebas", "Hur");
			Cliente cli7 = new Cliente("Aimane", "Chakour");

			Tarea tar1 = new Tarea("task1", "repasar apuntes de Spring Boot");
			Tarea tar2 = new Tarea("task2", "crear proyecto con JPA y Mongo");
			Tarea tar3 = new Tarea("task3", "revisar subida a GitHub");
			Tarea tar4 = new Tarea("task4", "hacer la compra");
			Tarea tar5 = new Tarea("task5", "pagar facturas");
			Tarea tar6 = new Tarea("task6", "entregar actividades interfaces");
			Tarea tar7 = new Tarea("task7", "instalar maquina virtual");
			Tarea tar8 = new Tarea("task8", "llamar a clientes");
			Tarea tar9 = new Tarea("task9", "asistir a charlas de programación");
			Tarea tar10 = new Tarea("task10", "limpiar el escritorio");
			
			cli1.getTaskList().addAll(Arrays.asList(tar1));
			cli2.getTaskList().addAll(Arrays.asList(tar2));
			cli3.getTaskList().addAll(Arrays.asList(tar3));
			cli4.getTaskList().addAll(Arrays.asList(tar4));
			cli5.getTaskList().addAll(Arrays.asList(tar6, tar7));
			cli6.getTaskList().addAll(Arrays.asList(tar8));
			cli7.getTaskList().addAll(Arrays.asList(tar9, tar10, tar5));
			
			repositorioCli.save(cli1);
			repositorioCli.save(cli2);
			repositorioCli.save(cli3);
			repositorioCli.save(cli4);
			repositorioCli.save(cli5);
			repositorioCli.save(cli6);
			repositorioCli.save(cli7);
			
			tar1 = new Tarea("task1", "repasar apuntes de Spring Boot", cli1);
			tar2 = new Tarea("task2", "crear proyecto con JPA y Mongo", cli2);
			tar3 = new Tarea("task3", "revisar subida a GitHub", cli3);
			tar4 = new Tarea("task4", "hacer la compra", cli4);
			tar5 = new Tarea("task5", "pagar facturas", cli7);
			tar6 = new Tarea("task6", "entregar actividades interfaces", cli5);
			tar7 = new Tarea("task7", "instalar maquina virtual", cli5);
			tar8 = new Tarea("task8", "llamar a clientes", cli6);
			tar9 = new Tarea("task9", "asistir a charlas de programación", cli7);
			tar10 = new Tarea("task10", "limpiar el escritorio", cli7);
			
			repositorioTask.save(tar1);
			repositorioTask.save(tar2);
			repositorioTask.save(tar3);
			repositorioTask.save(tar4);
			repositorioTask.save(tar5);
			repositorioTask.save(tar6);
			repositorioTask.save(tar7);
			repositorioTask.save(tar8);
			repositorioTask.save(tar9);
			repositorioTask.save(tar10);
		};
	}
}
