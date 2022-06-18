package es.studium.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

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
	Modelo modelo;
	int numJugadores;	
	int mazoJugador1[] = new int[13];
	int mazoJugador2[] = new int[13];
	int mazoJugador3[] = new int[13];
	int mazoJugador4[] = new int[13];
	int cartaActualJugador1 = 0;
	int cartaActualJugador2 = 0;
	int cartaActualJugador3 = 0;
	int cartaActualJugador4 = 0;
	int puntosJugador1 = 0;
	int puntosJugador2 = 0;
	int puntosJugador3 = 0;
	int puntosJugador4 = 0;
	int uno, dos;

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
		this.modelo.barajar(mazoJugador1, mazoJugador2, mazoJugador3, mazoJugador4);
		for(int i= 0; i < 13; i++)
		{
			System.out.println(mazoJugador1[i]+"-->"+mazoJugador2[i]+"-->"+mazoJugador3[i]+"-->"+mazoJugador4[i]);
		}

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
			menuPrincipal.setVisible(false);
			numJugadores = Integer.parseInt(partidaNueva.choNumeroJugadores.getSelectedItem());
			if((numJugadores==4)&&(!partidaNueva.txfNombre1.getText().equals(""))
					&&(!partidaNueva.txfNombre2.getText().equals(""))
					&&(!partidaNueva.txfNombre3.getText().equals(""))
					&&(!partidaNueva.txfNombre4.getText().equals("")))
			{
				tablero = new Tablero(4, partidaNueva.txfNombre1.getText(),
						partidaNueva.txfNombre2.getText(),
						partidaNueva.txfNombre3.getText(),
						partidaNueva.txfNombre4.getText());
				tablero.addWindowListener(this);
				tablero.addMouseListener(this);
				tablero.setVisible(true);
				partidaNueva.setVisible(false);
			}
			else if((numJugadores==3)&&(!partidaNueva.txfNombre1.getText().equals(""))
					&&(!partidaNueva.txfNombre2.getText().equals(""))
					&&(!partidaNueva.txfNombre3.getText().equals("")))
			{
				tablero = new Tablero(3,partidaNueva.txfNombre1.getText(),
						partidaNueva.txfNombre2.getText(),
						partidaNueva.txfNombre3.getText(),"");
				tablero.addWindowListener(this);
				tablero.addMouseListener(this);
				tablero.setVisible(true);
				partidaNueva.setVisible(false);
			}
			else if((numJugadores==2)&&(!partidaNueva.txfNombre1.getText().equals(""))
					&&(!partidaNueva.txfNombre2.getText().equals("")))
			{
				tablero = new Tablero(2, partidaNueva.txfNombre1.getText(),
						partidaNueva.txfNombre2.getText(),"","");
				tablero.addWindowListener(this);
				tablero.addMouseListener(this);
				tablero.setVisible(true);
				partidaNueva.setVisible(false);
			}
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

			partidaNueva.pedirNumeroJugadores.removeWindowListener(this);
			partidaNueva.btnContinuar.removeActionListener(this);
			partidaNueva.OcultarDialogNombresJugadores();

			partidaNueva.setVisible(false);
			menuPrincipal.setVisible(true);
		}
		else if(partidaNueva.pedirNombresJugadores.isActive())
		{
			partidaNueva.pedirNombresJugadores.removeWindowListener(this);
			partidaNueva.btnComenzarPartida.removeActionListener(this);
			partidaNueva.choNumeroJugadores.select(0); // Reseteamos el desplegable
			partidaNueva.removeAll();
			partidaNueva.OcultarDialogNombresJugadores();
			menuPrincipal.setVisible(true);

		}
		else if((tablero!=null)&&(tablero.isActive()))
		{
			tablero.removeWindowListener(this);
			tablero.removeMouseListener(this);
			tablero.setVisible(false);
			partidaNueva.OcultarDialogNombresJugadores();
			menuPrincipal.setVisible(false);
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
	public void mouseClicked(MouseEvent evento)
	{
		int x = evento.getX();
		int y = evento.getY();
		
		ArrayList<Integer> listJugador2 = new ArrayList<Integer>();
		ArrayList<Integer> listJugador3 = new ArrayList<Integer>();
		ArrayList<Integer> listJugador4 = new ArrayList<Integer>();
		ArrayList<Integer> listJugador1 = new ArrayList<Integer>();

		
		if((x>=150)&&(x<=259)&&(y>=300)&&(y<=450))
		{
			// Mostrar la carta del Mazo 1
			this.tablero.mostrarCartaMazo1(mazoJugador1[cartaActualJugador1]);
			listJugador1.add(mazoJugador1[cartaActualJugador1]);
			int sumaJugador1 = 0;
			for(int i = 0; i < listJugador1.size(); i++) {
				sumaJugador1 += listJugador1.get(i);
			}
		} 
		else if ((x>=350)&&(x<=459)&&(y>=300)&&(y<=450))
		{
			// Mostrar la carta del Mazo 2
			this.tablero.mostrarCartaMazo2(mazoJugador2[cartaActualJugador2]);
			uno = mazoJugador1[cartaActualJugador1] % 13;
			if(uno==0)
			{
				uno = 13;
			}
			dos = mazoJugador2[cartaActualJugador2] % 13;
			if(dos==0)
			{
				dos = 13;
			}
			if(uno>dos)
			{
				puntosJugador1++;
				this.tablero.aumentarPuntosJugador1();
				this.tablero.lblMensajeRonda.setText("Jugador 1 gana esta ronda!");
				this.tablero.dlgMensajeRonda.setVisible(true);
			}
			else if (uno<dos)
			{
				puntosJugador2++;
				this.tablero.aumentarPuntosJugador2();
				this.tablero.lblMensajeRonda.setText("Jugador 2 gana esta ronda!");
				this.tablero.dlgMensajeRonda.setVisible(true);
			}
			else // uno = dos
			{
				this.tablero.lblMensajeRonda.setText("Nadie gana esta ronda!");
				this.tablero.dlgMensajeRonda.setVisible(true);
			}
			cartaActualJugador1++;
			cartaActualJugador2++;
		}
		if((puntosJugador1 >= 4) && (puntosJugador1 >= puntosJugador2+2))
		{
			// Ganador el Jugador 1
			this.tablero.lblMensajeFinPartida.setText("GANA Jugador 1");
			this.tablero.dlgMensajeFinPartida.setVisible(true);
		}
		else if ((puntosJugador2 >= 4) && (puntosJugador2 >= puntosJugador1+2))
		{
			// Ganador el Jugador 2
			this.tablero.lblMensajeFinPartida.setText("GANA Jugador 2");
			this.tablero.dlgMensajeFinPartida.setVisible(true);
		}

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