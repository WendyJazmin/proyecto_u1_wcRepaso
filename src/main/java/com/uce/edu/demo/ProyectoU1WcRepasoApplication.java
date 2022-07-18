package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.consultorio.CitaMedica3;
import com.uce.edu.demo.universidad.Matricula;
import com.uce.edu.demo.universidad.Matricula2;
import com.uce.edu.demo.universidad.Matricula3;

@SpringBootApplication
public class ProyectoU1WcRepasoApplication implements CommandLineRunner{
	
	//1) DI por atributo
		@Autowired
		private CitaMedica cita;
		
		//@Autowired
		//private CitaMedica3 cita2;
	
/*
	//1)(DI) por atributo, inyeccion de dependencia por atributos
	@Autowired
	private CitaMedica cita;*/
	
	//2) Inyeccion por constructor
	@Autowired
	private CitaMedica3 cita3;
	
	//3) Inyeccion por metodos set y get
	@Autowired
	private CitaMedica2 cita2;
	
	
	//MATRICULA
	//1)(DI) por atributo, inyeccion de dependencia por atributos
	@Autowired
	private Matricula matricula1;
	
	//2) DI por constructor
	@Autowired
	private Matricula2 matricula2;
	
	//3) DI por metodos set
	@Autowired
	private Matricula3 matricula3;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcRepasoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyeto con spring framework");
		System.out.println("segundo branch");
		
		/*
		String respuesta = cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta);
		
		String respuesta3 = cita3.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta3);
		
		String respuesta2 = cita2.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta2);
		
		//MATRICULA
		System.out.println();
		
		String respuesta4 = matricula1.matricular(LocalDateTime.now(), "Marco", 14245657, 20, "Economia", 50);
		System.out.println(respuesta4);
		
		String respuesta5 = matricula2.matricular(LocalDateTime.now(), "Andrea", 14088757, 19, "Fisica", 12);
		System.out.println(respuesta5);
		
		String respuesta6 = matricula3.matricular(LocalDateTime.now(), "Daniel", 13238857, 22, "Ecuaciones Diferenciales", 44);
		System.out.println(respuesta6);
		*/
	}

}
