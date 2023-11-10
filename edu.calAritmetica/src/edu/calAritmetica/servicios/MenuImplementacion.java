package edu.calAritmetica.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int mostrarMenu(Scanner seleccionScan) {
		
		int opcionSeleccionada;
		
		System.out.println("########################################");
		System.out.println("########### MENU DE SELECCION ##########");
		System.out.println("########################################");
		System.out.println("# 0. Suma                              #");
		System.out.println("# 1. Resta                             #");
		System.out.println("# 2. Multiplicacion                    #");
		System.out.println("# 3. Division                          #");
		System.out.println("# 4. Modulo de una Suma      		   #");
		System.out.println("########################################");
		System.out.println("          Seleccione una Opcion         ");
		System.out.println("########################################");

		opcionSeleccionada = seleccionScan.nextInt();
		
		return opcionSeleccionada;
	}
	
}
