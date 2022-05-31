package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica3 {
	
private LocalDateTime fechaCita;
	
	private Doctor doctor;
	private Paciente paciente;
	
	//2) DI por constructor
	public CitaMedica3 (Doctor doctor, Paciente paciente) {
		this.doctor = doctor;
		this.paciente = paciente;
	}
	
	public String agendar(LocalDateTime fechaCita, String nombre, String apellido,
			int edad,String ciudad,String nombrePaciente, int edadPaciente) {
		
	
		
		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);
		
		//seteamos los atributos de la cita medica
		this.fechaCita = fechaCita;
		
		//se inserta la cita en la base de datos
		return "Cita agendada con constructor";
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
