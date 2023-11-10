package edu.calAritmetica.servicios;

import java.util.Scanner;

public class calculoImplementacion implements calculoInterfaz{

	public int suma() {
		
		System.out.print("Seleccion de Suma");
		Scanner usuNum01 = new Scanner (System.in);
		Scanner usuNum02 = new Scanner (System.in);
		
		return sumaV;	
	}
	
	
 public int resta() {
		
		System.out.print("Seleccion de Resta");

		
	}
	
 
 public int multiplicacion() {
		
		System.out.print("Seleccion de Multiplicacion");
		int multV = 1;
		return multV;	
	}
 
 
 public int division() {
		
		System.out.print("Seleccion de Multiplicacion");
		int divV = 1;
		return divV;	
	}
	
	
 
 public int moduloSuma() {
		
		System.out.print("Seleccion de Modulo de Suma");
		int moduloV = 1;
		return moduloV;	
	}
 
}
