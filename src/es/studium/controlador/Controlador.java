package es.studium.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import es.studium.modelo.Modelo;
import es.studium.vista.MenuPrincipal;
import es.studium.vista.PartidaNueva;
import es.studium.vista.Tablero;
import es.studium.vista.TopTen;


public class Controlador implements WindowListener, ActionListener, MouseListener{


	MenuPrincipal menuPrincipal;
	TopTen topTen = new TopTen();
	PartidaNueva partidaNueva = new PartidaNueva();
	Tablero tablero;
	/*Tablero tablero;*/
	Modelo modelo;
	int numJugadores;	
	int turno = 1;

	public Controlador(Modelo m, MenuPrincipal mp) {

		modelo = m;
		menuPrincipal = mp;

		menuPrincipal.addWindowListener(this);
		menuPrincipal.btnTopTen.addActionListener(this);
		menuPrincipal.btnPartidaNueva.addActionListener(this);
		menuPrincipal.btnSalir.addActionListener(this);
		topTen.addWindowListener(this);
		topTen.btnVolver.addActionListener(this);
		partidaNueva.pedirNumeroJugadores.addWindowListener(this);
		partidaNueva.btnContinuar.addActionListener(this);
		partidaNueva.pedirNombresJugadores.addWindowListener(this);
		partidaNueva.btnComenzarPartida.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		if(botonPulsado.equals(menuPrincipal.btnSalir))
		{
			System.exit(0);
		}
		else if(botonPulsado.equals(menuPrincipal.btnTopTen)) // Top Ten
		{
			topTen.MostrarTopTen();
			menuPrincipal.setVisible(false);
		}
		else if(botonPulsado.equals(topTen.btnVolver)) // Top Ten
		{
			topTen.OcultarTopTen();
			menuPrincipal.setVisible(true);
		}
		else if(botonPulsado.equals(menuPrincipal.btnPartidaNueva)) // Partida Nueva
		{
			partidaNueva.MostrarDialogNumeroJugadores();
			menuPrincipal.setVisible(true);
		}
		else if(botonPulsado.equals(partidaNueva.btnContinuar)) // Partida Nueva
		{
			if(!partidaNueva.choNumeroJugadores.getSelectedItem().equals("Elegir número de jugadores..."))
			{
				partidaNueva.PrepararDialogNombresJugadores(Integer.parseInt(partidaNueva.choNumeroJugadores.getSelectedItem()));
			}else
			{
				System.out.println("Número no valido, elige otro");
				partidaNueva.MostrarDialogNumeroJugadores();
			}
		}
		else if(botonPulsado.equals(partidaNueva.btnComenzarPartida)) // Partida Nueva
		{
			numJugadores = Integer.parseInt(partidaNueva.choNumeroJugadores.getSelectedItem());
			if((numJugadores==4)&&(!partidaNueva.txfNombre1.getText().equals(""))
					&&(!partidaNueva.txfNombre2.getText().equals(""))
					&&(!partidaNueva.txfNombre3.getText().equals(""))
					&&(!partidaNueva.txfNombre4.getText().equals("")))
			{
				tablero = new Tablero(4, partidaNueva.txfNombre1.getText(),partidaNueva.txfNombre2.getText(),partidaNueva.txfNombre3.getText(),partidaNueva.txfNombre4.getText());
				tablero.addWindowListener(this);
				tablero.addMouseListener(this);
				tablero.setVisible(true);
				partidaNueva.setVisible(false);
			}
			else if((numJugadores==3)&&(!partidaNueva.txfNombre1.getText().equals(""))
					&&(!partidaNueva.txfNombre2.getText().equals(""))
					&&(!partidaNueva.txfNombre3.getText().equals("")))
			{
				tablero = new Tablero(3,partidaNueva.txfNombre1.getText(),partidaNueva.txfNombre2.getText(),partidaNueva.txfNombre3.getText(),"");
				tablero.addWindowListener(this);
				tablero.addMouseListener(this);
				tablero.setVisible(true);
				partidaNueva.setVisible(false);
			}
			else if((numJugadores==2)&&(!partidaNueva.txfNombre1.getText().equals(""))
					&&(!partidaNueva.txfNombre2.getText().equals("")))
			{
				tablero = new Tablero(2, partidaNueva.txfNombre1.getText(),partidaNueva.txfNombre2.getText(),"","");
				tablero.addWindowListener(this);
				tablero.addMouseListener(this);
				tablero.setVisible(true);
				partidaNueva.setVisible(false);
			}
			else
			{
				partidaNueva.txfNombre1.requestFocus();
			}
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		if(topTen.isActive())
		{
			topTen.OcultarTopTen();
			menuPrincipal.setVisible(true);
		}
		else if(partidaNueva.pedirNumeroJugadores.isActive())
		{
<<<<<<< HEAD
			partidaNueva.pedirNumeroJugadores.removeWindowListener(this);
			partidaNueva.btnContinuar.removeActionListener(this);
			partidaNueva.choNumeroJugadores.select(0);
			partidaNueva.removeAll();
			partidaNueva.OcultarDialogNombresJugadores();
=======
			partidaNueva.setVisible(false);
			menuPrincipal.setVisible(true);
		}
		else if(partidaNueva.pedirNombresJugadores.isActive())
		{
			partidaNueva.OcultarDialogNombresJugadores();
			menuPrincipal.setVisible(true);
>>>>>>> 89bb22150d3d853d79c003e7b100c6c1bb04d06c
		}
		else if((tablero!=null)&&(tablero.isActive()))
		{
			tablero.removeWindowListener(this);
			tablero.removeMouseListener(this);
			tablero.setVisible(false);
			partidaNueva.OcultarDialogNombresJugadores();
			menuPrincipal.setVisible(true);
		}
		else 
		{	
			System.exit(0);
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

}