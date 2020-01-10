package es.Studium.Compara2;

import java.util.Arrays;
import java.util.Scanner;

public class Compara2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int i;
		String tabla[] = new String[2];
		for(i=0;i<2;i++)
		{
			System.out.println("Ingrese el valor de la posición: "+i);
			tabla[i] = teclado.next(); 
		}
		Arrays.parallelSort(tabla);
		imprimirArray(tabla);
		teclado.close();
	}
	public static void imprimirArray (String tabla[]){
		for(int i=0;i<tabla.length;i++){
			System.out.println(tabla[i]);
		}
	}


}
