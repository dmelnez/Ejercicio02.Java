package edu.calAritmetica.controladores;

import java.util.Scanner;

import edu.calAritmetica.servicios.MenuImplementacion;
import edu.calAritmetica.servicios.MenuInterfaz;
import edu.calAritmetica.servicios.calculoImplementacion;
import edu.calAritmetica.servicios.calculoInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seleccionUsu;
		boolean cierraMenu = false ;
		Scanner seleccionScan = new Scanner (System.in);
		MenuInterfaz mi = new MenuImplementacion ();
		calculoInterfaz mi01 = new calculoImplementacion ();
		while (!cierraMenu) {
			
			seleccionUsu = mi.mostrarMenu(seleccionScan);
			
			switch(seleccionUsu) {
			
			
				case 0:
					System.out.println("[INFO] - Se Ejecuta Caso 0 - SUMA");
				
					int sumaV01 = mi02.suma();
					System.out.println(sumaV);
					break;
				case 1:
					System.out.println("[INFO] - Se Ejecuta Caso 1 - RESTA");
					int restaV = mi01.resta();
					System.out.println(restaV);
					break;
				case 2:
					System.out.println("[INFO] - Se Ejecuta Caso 2 - MULTIPLICACON");
					int multV = mi01.multiplicacion();
					System.out.println(multV);
					break;
				case 3:
					System.out.println("[INFO] - Se Ejecuta Caso 3 - DIVISION");
					int divV = mi01.division();
					System.out.println(divV);
					break;
				case 4:
					System.out.println("[INFO] - Se Ejecuta Caso 4 - Cerrar Menu");
					cierraMenu = true;
					break;

				default:
					System.out.println(" [INFO] - Vuelva a Seleccionar una opcion");
						break;
				
			
			}
		}

	}

}
