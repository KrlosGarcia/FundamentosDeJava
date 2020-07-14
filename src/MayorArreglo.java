
public class MayorArreglo {

	public static void main(String[] args) {
		int[] numeros = new int[]{
				-10,-2,-6,-8,-9,-19,-20,15,-13,-45
			};
		
		int max =numeros[0];
		int posicion = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (max < numeros[i]) {
				max=numeros[i];
				posicion=i;
			}
		
			System.out.println("EL numero mayor es: " + max);	
			System.out.println("El numero fue encontrado en la posicion: " + posicion);
	}

}
	}
