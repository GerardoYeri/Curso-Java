package com.coderhouse;
	//33 Crear una clase Estudiante con atributos como nombre y nota.
public class Estudiante {
	
	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("Gerardo", 7);
		
		estudiante1.mostrarInfoEstudiante();
		

	}
	
	String nombre;
	double nota;
	
	public Estudiante(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public void mostrarInfoEstudiante() {
		System.out.println("El nombre del estudiante es: "+nombre);
		System.out.println("La nota del estudiante es: "+ nota);
	}
}
