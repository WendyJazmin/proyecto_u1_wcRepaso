package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//a la clase cita medica tambien se lo coloca un modelo de inversion de control
@Service
public class CitaMedica {
	
	private LocalDateTime fechaCita;
	
	//1)inyeccion de dependencias por atributos, se lo hace con Autowired
	@Autowired
	private Doctor doctor;
	
	@Autowired
	private Paciente paciente;
	
	////2) DI por constructor
	//public CitaMedica (Doctor doctor, Paciente paciente) {
		//this.doctor = doctor;
		//this.paciente = paciente;
	//}
	
	public String agendar(LocalDateTime fechaCita, String nombre, String apellido,
			int edad,String ciudad,String nombrePaciente, int edadPaciente) {
		
		///////////
		//this.doctor = new Doctor();//aqui se le invoca a new para que se puede imprimir la cita medica, pero esto no se debe hace
		//this.paciente = new Paciente();
		////////////
		
		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);
		
		//seteamos los atributos de la cita medica
		this.fechaCita = fechaCita;
		
		//se inserta la cita en la base de datos
		return "Cita agendada";
	}
	
	//set y get
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
}
