package RepasoExamen;

import java.util.Scanner;

public class RepasoExamen {
	
	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		System.out.println("Menu");
		System.out.println("1. Ejercicio divisible entre 4");
		System.out.println("2. Ejercicio Factorial");
		System.out.println("Elija una opcion: ");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1: ejercicioDivisibleEntreCuatro();
		break;
		case 2: ejercicioFactorial();
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
		
}
