package es.studium.vista;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class PartidaNueva extends Frame
{
	private static final long serialVersionUID = 1L;
	public Dialog pedirNumeroJugadores = new Dialog(this, "BlackJack: Nueva Partida", true);
	public Dialog pedirNombresJugadores = new Dialog(this, "BlackJack: Nueva Partida", true);
	int numeroJugadores = 0;
	public String[] nombresJugadores = null;
	public Choice choNumeroJugadores = new Choice();
	public Button btnContinuar =new Button("Continuar...");
	
	public TextField txfNombre1 = new TextField(15);
	public Label lblEtiqueta1 = new Label("Jugador 1:");
	public TextField txfNombre2 = new TextField(15);
	public Label lblEtiqueta2 = new Label("Jugador 2:");
	public TextField txfNombre3 = new TextField(15);
	public Label lblEtiqueta3 = new Label("Jugador 3:");
	public TextField txfNombre4 = new TextField(15);
	public Label lblEtiqueta4 = new Label("Jugador 4:");
	public Button btnComenzarPartida = new Button("Comenzar Partida");
	public Object pedirNombreJugadores;
	
	public PartidaNueva() 
	{
		pedirNumeroJugadores.setBackground(Color.RED);
		pedirNumeroJugadores.setLayout(new FlowLayout());
		pedirNumeroJugadores.setSize(240,200);
		pedirNumeroJugadores.setLocationRelativeTo(null);
		pedirNumeroJugadores.setResizable(false);
		choNumeroJugadores.add("Elegir número de jugadores...");
		choNumeroJugadores.add("2");
		choNumeroJugadores.add("3");
		choNumeroJugadores.add("4");
		pedirNumeroJugadores.add(choNumeroJugadores);
		pedirNumeroJugadores.add(btnContinuar);
	}
	
	public void MostrarDialogNumeroJugadores() 
	{
		pedirNumeroJugadores.setVisible(true);
	}
	
	public void OcultarDialogNumeroJugadores()
	{
		pedirNumeroJugadores.setVisible(false);
	}
	
	public void PrepararDialogNombresJugadores(int numero)
	{
		pedirNombresJugadores.setBackground(Color.RED);
		pedirNombresJugadores.setLayout(new FlowLayout());
		pedirNombresJugadores.setSize(240,200);
		pedirNombresJugadores.setLocationRelativeTo(null);
		pedirNombresJugadores.setResizable(false);
		
		//1 jugador
		pedirNombresJugadores.add(lblEtiqueta1);
		txfNombre1.selectAll();
		txfNombre1.setText("");
		pedirNombresJugadores.add(txfNombre1);
		
		//2 jugadores
		pedirNombresJugadores.add(lblEtiqueta2);
		txfNombre2.selectAll();
		txfNombre2.setText("");
		pedirNombresJugadores.add(txfNombre2);
		
		//3 jugadores
		if(numero ==3) 
		{
			pedirNombresJugadores.add(lblEtiqueta3);
			txfNombre3.selectAll();
			txfNombre3.setText("");
			pedirNombresJugadores.add(txfNombre3);
		}
		else 
		{
			pedirNombresJugadores.remove(lblEtiqueta3);
			txfNombre3.selectAll();
			txfNombre3.setText("");
			pedirNombresJugadores.remove(txfNombre3);
		}
		
		//4 jugadores
		if(numero ==4) 
		{
			pedirNombresJugadores.add(lblEtiqueta3);
			txfNombre3.selectAll();
			txfNombre3.setText("");
			pedirNombresJugadores.add(txfNombre3);
			pedirNombresJugadores.add(lblEtiqueta4);
			txfNombre4.selectAll();
			txfNombre4.setText("");
			pedirNombresJugadores.add(txfNombre4);
		}
		else 
		{
			pedirNombresJugadores.remove(lblEtiqueta4);
			txfNombre4.selectAll();
			txfNombre4.setText("");
			pedirNombresJugadores.remove(txfNombre4);
		}
		pedirNombresJugadores.add(btnComenzarPartida);
		this.MostrarDialogNombresJugadores();
	}
	
	public void MostrarDialogNombresJugadores()
	{
		pedirNombresJugadores.setVisible(true);
	}
	
	public void OcultarDialogNombresJugadores()
	{
		pedirNombresJugadores.setVisible(false);
	}

}



