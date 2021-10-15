package es.studium.compara1;

import java.util.Scanner;

public class compara1
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String cadena1, cadena2;
		System.out.println("Dame una cadena ");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena ");
		cadena2 = teclado.nextLine();
		if (cadena1.length()==cadena2.length()) {
			System.out.println("Las dos cadenas son iguales ");
		}
			else if(cadena1.length()<cadena2.length()) {
			System.out.println("La primera cadena es menor que la segunda");
			}
			else
			{
			System.out.println("la primera cadena es mayor que la primera");
			}

	}
}



//PROGRAMA Compara
//VARIABLES
//CADENA cadena1, cadena2
//INICIO
//ESCRIBIR "Dame una cadena"
//LEER cadena1
//ESCRIBIR "Dame otra cadena"
//LEER cadena2
// SI LONGITUD(cadena1)=LONGITUD(cadena2) ENTONCES
//	ESCRIBIR "Las cadenas tienen la misma longitud" 
//SINO
//SI LONGITUD (cadena1)<LONGITUD(cadena2)
//ESCRIBIR " La cadena 2 es mas larga"
//SINO 
//ESCRIBIR " La cadena 1 es mas larga"
//FINSI
//FINSI
//FIN

//FIN