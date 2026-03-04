package RepasoExamen;

import java.util.Scanner;

public class RepasoExamen {
	
	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		System.out.println("Menú");
		System.out.println("1. Ejercicio divisible entre 4");
		System.out.println("2. Ejercicio Factorial");
		System.out.println("3. Ejercicio contar n cantidad");
		System.out.println("4. Ejercicio Promedio numeros pares entre 1 y n");
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
		default: System.out.println("Opcion Invalida");
		}
	}
	
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
	
		static void ejercicioFactorial() {
			
			System.out.print("Ingresa un numero: "); 
			
			int num = sc.nextInt();
			int factorial = 1;
			
			
			for(int i = 1; i <=num; i++) {
				factorial = factorial * i;
			}
			
			System.out.println("El factorial es: " + factorial);
			
		}
		
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
		
		System.out.println("Los numeros positivos son: "  + positivo);
		System.out.println("Los numeros negativos son: " + negativo);
		System.out.println("Los numeros ceros son: " + ceros);
		
		}
		
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
}

