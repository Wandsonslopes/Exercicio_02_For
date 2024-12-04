package exercicio_For;

import java.util.Scanner;

public class Exercicio_02_For {

	public static void main(String[] args) {

		// Variaveis
		int numero;
		int contador;
		int pares = 0;
		int impares = 0;

		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador <= 10; contador = contador + 1) {
			System.out.println("Digite o " + contador + "º número");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				pares = pares + 1;
			} else {
				impares = impares + 1;
			}
		}
		System.out.println("\nQuantidade de números pares: " + pares);
		System.out.println("\nQuantidade de números pares: " + impares);

	}

}
