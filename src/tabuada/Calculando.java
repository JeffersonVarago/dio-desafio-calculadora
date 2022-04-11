package tabuada;

import java.util.Scanner;

public class Calculando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite qual a tabuada você deseja: ");

		int j = sc.nextInt();
		int i;

		for (i = 0; i <= 10; i++) {
			sc.close();
			System.out.println(i + " X " + j + " = " + j * i);

		}

	}

}
	
	