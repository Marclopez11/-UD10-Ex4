package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import ud10ej4.CalculoSimple;

public class main {
	static Scanner sc = new Scanner(System.in);
	static int proces = 0;
	static double valor1 = 0;
	static double valor = 0;

	public static void main(String[] args) {

		proces = syso();

		while (proces != 0) {
			switch (proces) {
			case 1:
				System.out.println(valorxy().sumar());
				syso();
				break;
			case 2:
				System.out.println(valorxy().resta());
				syso();
				break;
			case 3:
				System.out.println(valorxy().multi());
				syso();
				break;
			case 4:
				System.out.println(valorxy().division());
				syso();
				break;
			case 5:
				System.out.println(valorxy().potencia());
				syso();
				break;
			case 6:
				System.out.println(valorx().raizCuadrada());
				syso();
				break;
			case 7:
				System.out.println(valorx().raizcubica());
				syso();
				break;
			default:
				break;
			}
		}
	}

	// Crearem valores y calcularemos la media
	public static CalculoSimple valorxy() {

		while(true) {
		try {
			System.out.println("Valor 1");
			valor1 = sc.nextDouble();
			System.out.println("Valor 2");
			valor = sc.nextDouble();
			break;//si son correctos salta al catch

		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Valor incorrecto.");
			sc.next();


		}
		}
		CalculoSimple calculocondovalores = new CalculoSimple(valor1, valor);
		return calculocondovalores;

	
	}

	private static void pedirvalores() {

	}

	// Crearem el valor calcularemos la media
	public static CalculoSimple valorx() {
		

		while (true) {

			try {
				System.out.println("Valor 1");
				valor1 = sc.nextDouble();
				break;

			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("Valor incorrecto.");
				sc.next();

			}
		}
		// calculo.setX2(valor);
		CalculoSimple calculocondovalores = new CalculoSimple(valor1);
		return calculocondovalores;

	}

	// print
	public static int syso() {

		System.out.println("¿Que operacion quieres hacer?");
		System.out.println("1-Suma 2-Resta 3-Multi 4-division 5-Potencia 6-raizCuadrada 7-raizcubica");
		return proces = sc.nextInt();

	}

}
