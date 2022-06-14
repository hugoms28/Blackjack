package es.studium.controlador;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import es.studium.modelo.Modelo;
import es.studium.vista.MenuPrincipal;
import es.studium.vista.TopTen;


public class Controlador implements WindowListener, ActionListener, MouseListener{


	MenuPrincipal menuPrincipal;
	TopTen topTen = new TopTen();
	PartidaNueva partidaNueva = new PartidaNueva();
	Tablero tablero;
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
		partidaNueva.pedirNombreJugadores.addWindowListener(this);
		partidaNueva.btnComenzarPartida.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		if(botonPulsado.equals(menuPrincipal.btnSalir))
		{
			System.exit(0);
		}
		else if(botonPulsado.equals(menuPrincipal.btnTopTen)) //top ten
		{
			topTen.MostrarTopTen();
			menuPrincipal.setVisible(false);
		}
		else if(botonPulsado.equals(topTen.btnVolver)) //top ten
		{
			topTen.OcultarTopTen();
			menuPrincipal.setVisible(true);
		}
		else if(botonPulsado.equals(menuPrincipal.btnPartidaNueva)) //Partida Nueva
		{
			partidaNueva.MostrarDialogNumeroJugadores();
			menuPrincipal.setVisible(false);
		}
		else if(botonPulsado.equals(partidaNueva.btnContinuar)) //Partida Nueva
		{
			if(!partidaNueva.choNumeroJugadores.getSelectedItem().equals("Elegir número de jugadores..."))
			{
				partidaNueva.PrepararDialogNombresJugadores(Integer.parseInt(partidaNueva.choNumeroJugadores));
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
			partidaNueva.pedirNumeroJugadores.removeWindowListener(this);
			partidaNueva.btnContinuar.removeActionListener(this);
			partidaNueva.choNumeroJugadores.select(0);
			partidaNueva.removeAll();
			partidaNueva.OcultarDialogNombreJugadores();
		}
		else if((tablero!=null)&&(tablero.isActive()))
		{
			tablero.removeWindowListener(this);
			tablero.removeMouseListener(this);
			tablero.setVisible(false);
			partidaNueva.OcultarDialogNombreJugadores();
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