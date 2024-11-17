package com.coderhouse;

public class Ejercicos {

	public static void main(String[] args) {
	//Ejercicios sobre Variables y Tipos de Variables
		
		//1
		int edadUsuario = 30;
		System.out.println("La edad del usuario es: "+ edadUsuario);
		//2
		final int numDiasSemana= 7;
		System.out.println("Cantidad de dias de la semana: "+ numDiasSemana);
		//3
		double precioProducto = 20.20;
		System.out.println("El precio del producto es: "+ precioProducto);
		//4
		boolean alumnoAprobado = true;
		System.out.println("el alumno esta aprobado: "+ alumnoAprobado);
		//5
		char inicialPersona = 'G';
		System.out.println("La inicial de la persona es: "+ inicialPersona);
		//6
		int notasAlumnos[][] = new int[5][5];
		notasAlumnos[0][0] = 7;
		
		//7
		String nombrePersona = "Gerardo";
		System.out.println("El nombre de la persona es: "+ nombrePersona);
		
		//8
		float pesoPersona= 70.50f;
		System.out.println("El peso de la persona es: "+ pesoPersona);
		
		//Ejercicios sobre Constantes
		//9
		final double PI = 3.14;
		System.out.println("El valor de pi es: "+ PI);
		//10
		final int CANT_ALUMNOS = 35;
		System.out.println("La cantidad de alumnos es: "+ CANT_ALUMNOS);
		//Ejercicios sobre Operadores
		//11
		int numA = 30;
		int numB = 45;
		int resultadoSuma= numA + numB;
		System.out.println("El resultado de la suma es: "+resultadoSuma);
		//12
		double numC = 25.5;
		double numD = 15.80;
		double resultadoResta = numC - numD;
		System.out.println("El resultado de la resta es: "+ resultadoResta);
		//13
		int numE = 10;
		int numF = 40;
		int resultadoMulti = numE * numF;
		System.out.println("EL resultado de la multiplicacion es: "+ resultadoMulti);
		//14
		try {
		int numG = 50;
		int numH = 0;
		int resultadoDiv = numG / numH;
		System.out.println("El resultado de la division es: "+resultadoDiv);
		} catch (ArithmeticException e) {

			System.out.println("No se puede dividir por cero");
		}
		 //preguntar sobre exepcion
		
		//15
		int num1 = 39;
		int num2 = 48;
		double restoDiv = num1 % num2;
		System.out.println("El resto es:" + restoDiv);
		
		//Ejercicios sobre Operadores Relacionales
		
		//16
		int primerNum = 45;
		int segundoNum = 66;
		System.out.println(primerNum > segundoNum);
		
		//17
		int numI = 35;
		int numJ = 2;
		System.out.println(numI % numJ);
		
		//18
		String producto1 = "cafe";
		String producto2 = "leche";
		System.out.println(producto1.equals(producto2));
		
		//19
		int notaAlumno = 8;
		System.out.println(notaAlumno >= 6);
		
		//20
		int numK = 7;
		System.out.println(numK >= 1 && numK <= 10);
		
		//Ejercicios sobre Buenas Prácticas
		
		//21
		int numeroEntero ;
		double numeroDoubleDecimales;
		//22
		numeroEntero = 20;
		numeroDoubleDecimales = 345.772;
		
		System.out.println(numeroEntero == numeroDoubleDecimales);
		
		//23
		//Refactorizar un código para eliminar variables innecesarias
		//float numeroFloatDecimales;
		//char unSoloCaracter;
		//boolean verdaderoFalso;
		
		//24
		
		int edadCliente = 30;
		String nombreCliente = "Gerardo"; 
		
		mostrarInfoCliente(edadCliente , nombreCliente);
		
		//25
		System.out.println("-------------------------------------------------------");
	
		int valorHamburguesa = 10000;
		int valorPizza = 7000;
		int valorTarta = 5000;
		System.out.println("Hamburguesa: $"+ valorHamburguesa);
		System.out.println("Pizza: $"+ valorPizza);
		System.out.println("Tarta: $"+ valorTarta);
		System.out.println("El cliente compro una Hamburguesa, una pizza y una Tarta");
		mostrarTotalCompra(valorHamburguesa, valorPizza, valorTarta);
		
		
		

	}
		public static void mostrarInfoCliente(int edadCliente, String nombreCliente) {
			System.out.println("La edad del cliente es: "+ edadCliente + " y el nombre es: "+ nombreCliente);
		}
		
		public static void mostrarTotalCompra(int valorHamburguesa, int valorPizza, int valorTarta) {
			System.out.println("El total de la compra es: "+ (valorHamburguesa+ valorPizza + valorTarta));
			
		}
}
