import java.util.Scanner;

public class SoloPositivos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		int i = 0;
		while (i<5) {
			System.out.println("Leer numero (" + i + "): ");
			int numero = in.nextInt();
			if(numero > 0)
			System.out.println("Numero: " + numero);
			i++;
		}
		
		
	/*
	for(int i = 0; i < 5; i++) {
		//i++ es el numero de saltos (de 1 en 1)
		System.out.println("Leer numero (" + i + "): ");
		int numero = in.nextInt();
		if(numero > 0)
			System.out.println("Numero: " + numero);
		
		}
		*/
		
	}

}
