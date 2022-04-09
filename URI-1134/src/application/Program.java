package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Abasteça digitando o número respectivo");
		System.out.println();
		System.out.println("1: alcool --- 2: gasolina --- 3: diesel --- 4 status");
		System.out.println();
		System.out.print("Insira o código: ");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
			}
			else if (tipo == 2) {
				gasolina += 1;
			}
			else if (tipo == 3) {
				diesel += 1;
			}
			System.out.print("Insira o código: ");
			tipo = sc.nextInt();
		}
		System.out.println("Muito Obrigado");
		System.out.println("ALCOOL: " + alcool);
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("DIESEL: " + diesel);
		
		sc.close();

	}

}
