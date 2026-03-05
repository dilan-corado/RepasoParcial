package RepasoExamen;

import java.util.Scanner;

public class RepasoExamen {
	
	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		System.out.println("Menú");
		System.out.println("1. Ejercicio Divisible entre 4");
		System.out.println("2. Ejercicio Factorial");
		System.out.println("3. Ejercicio Contar n cantidad");
		System.out.println("4. Ejercicio Promedio numeros pares entre 1 y n");
		System.out.println("5. Ejercicio Suma de los digitos de n");
		System.out.println("6. Ejercicio Multiplo 7 o 11");
		System.out.println("7. Ejerciicio Divisible entre 3 y no 2");
		System.out.println("8. Ejercicio Leer hora formato 24hrs");
		System.out.println("9. Ejercicio Números romanos");
		System.out.println("10. Ejercicio Opcion (Sumar, restar, multiplicar)");
		System.out.println("11. Ejercicio Muestra mayor y menor y valor absolito");
		System.out.println("12. Ejercicio Tabla de division");
		System.out.println("13. Ejercicio Cantidad de digitos pares");
		System.out.print("Elija una opcion: ");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1: ejercicioDivisibleEntreCuatro();
		break;
		case 2: ejercicioFactorial();
		break;
		case 3: ejercicioContarNumeros();
		break;
		case 4: ejercicioPromedio();
		break;
		case 5: ejercicioSumaDeSusDigitos();
		break;
		case 6: ejercicioMultiploDeSieteyOnce();
		break;
		case 7: ejercicioDivisblesEntreTresyDos();
		break;
		case 8: ejercicioHoraFormato24();
		break;
		case 9: ejercicioNumerosRomanos();
		break; 
		case 10: ejercicioOpcionSumaRestaMultiplicacion();
		break;
		case 11: ejercicioMayorMenorAbsoluto();
		break;
		case 12: ejercicioTablaDivision();
		break;
		case 13: cantidadDigitosPares();
		break;
		default: System.out.println("Opcion Invalida");
		}
	}
	//Ejercicio 1
		static void ejercicioDivisibleEntreCuatro() {

			System.out.print("Ingresa un numero: "); 
			
			int num = sc.nextInt();
			int suma = 0;
	
			for (int i = 1; i <= num; i++) {
				if ( i % 4 == 0) {
			suma += i;
			}
		}
	
	System.out.println("La suma es: " + suma);
	}
	//Ejercicio 2
		static void ejercicioFactorial() {
			
			System.out.print("Ingresa un numero: "); 
			
			int num = sc.nextInt();
			int factorial = 1;
			
			
			for(int i = 1; i <=num; i++) {
				factorial = factorial * i;
			}
			
			System.out.println("El factorial es: " + factorial);
			
		}
		//Ejercicio 3
		static void ejercicioContarNumeros() {
			
			System.out.print("cuantos números ingresará: ");
			
			int numero = sc.nextInt();
			int positivo = 0;
			int negativo = 0;
			int ceros = 0;
			
			for (int i = 1; i <= numero; i++) {
				
				System.out.print("Ingrese un numero: ");
				int num = sc.nextInt();
				
				if (num > 0) {
					positivo++;
				}
					else if (num < 0) {
						negativo++;
					}
						else  {
							ceros++; 
					}
			}
		System.out.println();
		System.out.println("Los numeros positivos son: "  + positivo);
		System.out.println("Los numeros negativos son: " + negativo);
		System.out.println("Los numeros ceros son: " + ceros);
		
		}
		// Ejercicio 4
		static void ejercicioPromedio() {
			
			System.out.print("Ingrese un numero: ");
			int numero = sc.nextInt();
			int suma = 0;
			int contador = 0; 
			
			for (int i = 1; i <=numero; i++) {
				if (i % 2 == 0) {
					suma += i;
					contador ++;
				}
			}
			
			double promedio = (double) suma / contador;
			System.out.println("El promedio de los pares es de: " + promedio);
		
		}
		//Ejercicio 5
		static void ejercicioSumaDeSusDigitos() {
			System.out.print("Ingrese un numero: ");
			
			long numero = sc.nextLong(); // use long ya que si usaba int me dejaba poner numeros pequeños con 10 digitos, long permite colocar
			long suma = 0; 				// mas digitos
			
			while (numero>0) {
				
				long digito = numero % 10;
				
				suma+= digito;
				
				numero = numero / 10; 
			}
		
		System.out.println("La suma de los digitos es de: " + suma);
		
		}
		// ejercicio 6
		static void ejercicioMultiploDeSieteyOnce() {
			System.out.print("Ingrese un numero: ");
			
			int numero = sc.nextInt();
			if (numero % 7 == 0 || numero % 11 == 0) {
				System.out.println("El numero es multiplo de 7 o de 11"); }
					else { System.out.println("El numero no es multiplo de ninguno ");
				}
		}
		//Ejercicio 7
		
		static void ejercicioDivisblesEntreTresyDos() {
			System.out.print("Ingres un numero: ");
			int numero = sc.nextInt();
			
			for (int i = 1; i <= numero; i++) {
				if ( i % 3 == 0 && i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		//Ejercicio 8
		
		static void ejercicioHoraFormato24() {
			System.out.print("Ingrese una hora en formato (0-23); ");
			int hora = sc.nextInt();
			
			if (hora >=0 && hora <= 11) {
				System.out.println("Mañana");}
				else if (hora >=12 && hora <=17) {
					System.out.println("Tarde");}
				else if (hora >=18 && hora <= 23) {
					System.out.println("Noche");}
				else {System.out.println("Hora invalida");}
		}
		//Ejercicio 9
		
		static void ejercicioNumerosRomanos() {
			System.out.print("Ingrese un numero del 1-5: ");
			int numero = sc.nextInt();
			
			switch (numero) {
			case 1:  System.out.print("I");
			break;
			case 2: System.out.print("II");
			break;
			case 3: System.out.print("III");
			break;
			case 4: System.out.print("IV");
			break;
			case 5: System.out.print("V");
			default: System.out.print("Numero invalido");
			}
		}
		//Ejercicio 10
		static void ejercicioOpcionSumaRestaMultiplicacion() {
		
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.print("Elija una opción: ");
			int opcion = sc.nextInt();
			
			System.out.println();
			System.out.print("Ingrese el primer numero: ");
			int numero1 = sc.nextInt();
			System.out.print("Ingrese el segundo numero: ");
			int numero2 = sc.nextInt();
			
			switch (opcion) {
			case 1: System.out.print("Resultado:  " + (numero1+numero2));
			break;
			case 2: System.out.print("Resultado:  " + (numero1-numero2));
			break;
			case 3: System.out.print("Resultado:  " + (numero1*numero2));
			break;
			default: System.out.print("Opcion invalida");  
			}
		}
		//ejercicio 11
		static void ejercicioMayorMenorAbsoluto() {
			
			System.out.print("Ingrese el primer número: ");
			int numero1 = sc.nextInt();
			System.out.print("Ingrese el segundo numero: ");
			int numero2= sc.nextInt();
			
			
			if(numero1 > numero2) {
			    System.out.println("El numero mayor es: " + numero1);
			    System.out.println("El numero menor es: " + numero2);
			}
			else {
			    System.out.println("El numero mayor es: " + numero2);
			    System.out.println("El numero menor es: " + numero1);
			}

			int diferencia = Math.abs(numero1 - numero2);

			System.out.println("Diferencia absoluta es: " + diferencia);
		}
		//ejercicio 12
		static void ejercicioTablaDivision() {
			
			System.out.print("ingrese un numero: ");
			int numero = sc.nextInt();
			
			for (int i = 1; i<=10; i++) {
				double resultado = (double)numero / i;
				
				System.out.println(numero + "/" + i + " = " + resultado);
			}
			
		}
		//ejercicio 13
		
		static void cantidadDigitosPares() {
		System.out.print("Ingresa un número: ");
		
		int numero = sc.nextInt();
		int contador = 0;
		
		while (numero > 0) {
			int digito = numero % 10;
				if (digito % 2 == 0) {
					contador++;}
				numero = numero / 10; 
				}
		System.out.println("Cantidad de dígitos pares: " + contador);
		
		}	
}

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


