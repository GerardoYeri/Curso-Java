package com.coderhouse;

public class Ejercicos {

	public static void main(String[] args) {
	//Ejercicios sobre Variables y Tipos de Variables
		
		int edadUsuario = 30;
		final int numDiasSemana= 7;
		double precioProducto = 20.20;
		boolean alumnoAprobado = true;
		char inicialPersona = 'G';
		
		int notasAlumnos[] = new int[5];
		
		String nombrePersona = "Gerardo";
		float pesoPersona= 70.50f;
		
		//Ejercicios sobre Constantes
		
		final double pi = 3.14;
		final int CantAlumnos = 35;
		
		//Ejercicios sobre Operadores
		
		int numA = 30;
		int numB = 45;
		int resultadoSuma= numA + numB;
		System.out.println("El resultado de la suma es: "+resultadoSuma);
		
		double numC = 25.5;
		double numD = 15.80;
		double resultadoResta = numC - numD;
		System.out.println("El resultado de la resta es: "+ resultadoResta);
		
		int numE = 10;
		int numF = 40;
		int resultadoMulti = numE * numF;
		System.out.println("EL resultado de la multiplicacion es: "+ resultadoMulti);
		
		int numG = 50;
		int numH = 5;
		int resultadoDiv = numG / numH;
		 //preguntar sobre exepcion
		double restoDiv = numG % numH;
		
		//Ejercicios sobre Operadores Relacionales
		
		int primerNum = 45;
		int segundoNum = 66;
		System.out.println(primerNum > segundoNum);
		
		int numI = 35;
		int numJ = 2;
		System.out.println(numI % numJ);
		
		String producto1 = "cafe";
		String producto2 = "leche";
		System.out.println(producto1.equals(producto2));
		
		int notaAlumno = 8;
		System.out.println(notaAlumno >= 6);
		
		int numK = 7;
		System.out.println(numK >= 1 && numK <= 10);
		
		
		
		
		


	}

}
