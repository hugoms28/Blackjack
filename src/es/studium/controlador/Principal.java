package es.studium.controlador;

import es.studium.modelo.Modelo;
import es.studium.vista.MenuPrincipal;

public class Principal {

	public static void main(String[] args) {
		
		MenuPrincipal MenuPrincipal = new MenuPrincipal();
		Modelo modelo = new Modelo();
		
		new Controlador(modelo, MenuPrincipal);

	}

}