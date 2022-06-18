package es.studium.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Tablero extends Frame
{
	private static final long serialVersionUID = 1L;
	Toolkit herramientas;
	Image tapete, reverso;
	// A --> Diamantes
	// B --> Corazones
	// C --> Tréboles
	// D --> Picas
	Image A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13;
	Image B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13;
	Image C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13;
	Image D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, D12, D13;
	String jugador1, jugador2, jugador3, jugador4;
	int numJugadores;
	int imagenAmostrar1 = 0;
	int imagenAmostrar2 = 0;
	int imagenAmostrar3 = 0;
	int imagenAmostrar4 = 0;
	int puntosJugador1 = 0;
	int puntosJugador2 = 0;	
	int puntosJugador3 = 0;
	int puntosJugador4 = 0;
	
	public Tablero(int n, String j1, String j2, String j3, String j4)
	{
		numJugadores = n;
		jugador1 = j1;
		jugador2 = j2;
		jugador3 = j3;
		jugador4 = j4;
		herramientas = getToolkit();
		tapete = herramientas.getImage("img/CapturaBuena.PNG");
		reverso = herramientas.getImage("img/reverso.png");
		cargarCartas();
		this.setTitle("BlackJack");
		this.setSize(1029,526);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(tapete, 0, 30, this);
		Font fuente = new Font("Arial", Font.BOLD, 12);
		g.setFont(fuente);
		g.setColor(Color.black);
		g.drawString("Jugador 1: " + puntosJugador1 + " puntos", 150, 500);
		g.drawImage(reverso, 150, 300, this);
		g.setColor(Color.black);
		g.drawString("Jugador 2: " + puntosJugador2 + " puntos", 350, 500);
		g.drawImage(reverso, 350, 300, this);
		switch(numJugadores)
		{
			case 3:
				g.setColor(Color.black);
				g.drawString("Jugador 3: " + puntosJugador3 + " puntos", 550, 500);
				g.drawImage(reverso, 550, 300, this);
			case 4:
				g.setColor(Color.black);
				g.drawString("Jugador 3: " + puntosJugador3 + " puntos", 550, 500);
				g.drawImage(reverso, 550, 300, this);
				g.setColor(Color.black);
				g.drawString("Jugador 4: " + puntosJugador4 + " puntos", 750, 500);
				g.drawImage(reverso, 750, 300, this);
				
		}
		switch(imagenAmostrar1)
		{
		case 1:
			g.drawImage(A1, 150, 150, this);
			break;
		case 2:
			g.drawImage(A2, 150, 150, this);
			break;
		case 3:
			g.drawImage(A3, 150, 150, this);
			break;
		case 4:
			g.drawImage(A4, 150, 150, this);
			break;
		case 5:
			g.drawImage(A5, 150, 150, this);
			break;
		case 6:
			g.drawImage(A6, 150, 150, this);
			break;
		case 7:
			g.drawImage(A7, 150, 150, this);
			break;
		case 8:
			g.drawImage(A8, 150, 150, this);
			break;
		case 9:
			g.drawImage(A9, 150, 150, this);
			break;
		case 10:
			g.drawImage(A10, 150, 150, this);
			break;
		case 11:
			g.drawImage(A11, 150, 150, this);
			break;
		case 12:
			g.drawImage(A12, 150, 150, this);
			break;
		case 13:
			g.drawImage(A13, 150, 150, this);
			break;
		case 14:
			g.drawImage(B1, 150, 150, this);
			break;
		case 15:
			g.drawImage(B2, 150, 150, this);
			break;
		case 16:
			g.drawImage(B3, 150, 150, this);
			break;
		case 17:
			g.drawImage(B4, 150, 150, this);
			break;
		case 18:
			g.drawImage(B5, 150, 150, this);
			break;
		case 19:
			g.drawImage(B6, 150, 150, this);
			break;
		case 20:
			g.drawImage(B7, 150, 150, this);
			break;
		case 21:
			g.drawImage(B8, 150, 150, this);
			break;
		case 22:
			g.drawImage(B9, 150, 150, this);
			break;
		case 23:
			g.drawImage(B10, 150, 150, this);
			break;
		case 24:
			g.drawImage(B11, 150, 150, this);
			break;
		case 25:
			g.drawImage(B12, 150, 150, this);
			break;
		case 26:
			g.drawImage(B13, 150, 150, this);
			break;
		case 27:
			g.drawImage(C1, 150, 150, this);
			break;
		case 28:
			g.drawImage(C2, 150, 150, this);
			break;
		case 29:
			g.drawImage(C3, 150, 150, this);
			break;
		case 30:
			g.drawImage(C4, 150, 150, this);
			break;
		case 31:
			g.drawImage(C5, 150, 150, this);
			break;
		case 32:
			g.drawImage(C6, 150, 150, this);
			break;
		case 33:
			g.drawImage(C7, 150, 150, this);
			break;
		case 34:
			g.drawImage(C8, 150, 150, this);
			break;
		case 35:
			g.drawImage(C9, 150, 150, this);
			break;
		case 36:
			g.drawImage(C10, 150, 150, this);
			break;
		case 37:
			g.drawImage(C11, 150, 150, this);
			break;
		case 38:
			g.drawImage(C12, 150, 150, this);
			break;
		case 39:
			g.drawImage(C13, 150, 150, this);
			break;
		case 40:
			g.drawImage(D1, 150, 150, this);
			break;
		case 41:
			g.drawImage(D2, 150, 150, this);
			break;
		case 42:
			g.drawImage(D3, 150, 150, this);
			break;
		case 43:
			g.drawImage(D4, 150, 150, this);
			break;
		case 44:
			g.drawImage(D5, 150, 150, this);
			break;
		case 45:
			g.drawImage(D6, 150, 150, this);
			break;
		case 46:
			g.drawImage(D7, 150, 150, this);
			break;
		case 47:
			g.drawImage(D8, 150, 150, this);
			break;
		case 48:
			g.drawImage(D9, 150, 150, this);
			break;
		case 49:
			g.drawImage(D10, 150, 150, this);
			break;
		case 50:
			g.drawImage(D11, 150, 150, this);
			break;
		case 51:
			g.drawImage(D12, 150, 150, this);
			break;
		case 52:
			g.drawImage(D13, 150, 150, this);
			break;
		}
		switch(imagenAmostrar2)
		{
		case 1:
			g.drawImage(A1, 350, 150, this);
			break;
		case 2:
			g.drawImage(A2, 350, 150, this);
			break;
		case 3:
			g.drawImage(A3, 350, 150, this);
			break;
		case 4:
			g.drawImage(A4, 350, 150, this);
			break;
		case 5:
			g.drawImage(A5, 350, 150, this);
			break;
		case 6:
			g.drawImage(A6, 350, 150, this);
			break;
		case 7:
			g.drawImage(A7, 350, 150, this);
			break;
		case 8:
			g.drawImage(A8, 350, 150, this);
			break;
		case 9:
			g.drawImage(A9, 350, 150, this);
			break;
		case 10:
			g.drawImage(A10, 350, 150, this);
			break;
		case 11:
			g.drawImage(A11, 350, 150, this);
			break;
		case 12:
			g.drawImage(A12, 350, 150, this);
			break;
		case 13:
			g.drawImage(A13, 350, 150, this);
			break;
		case 14:
			g.drawImage(B1, 350, 150, this);
			break;
		case 15:
			g.drawImage(B2, 350, 150, this);
			break;
		case 16:
			g.drawImage(B3, 350, 150, this);
			break;
		case 17:
			g.drawImage(B4, 350, 150, this);
			break;
		case 18:
			g.drawImage(B5, 350, 150, this);
			break;
		case 19:
			g.drawImage(B6, 350, 150, this);
			break;
		case 20:
			g.drawImage(B7, 350, 150, this);
			break;
		case 21:
			g.drawImage(B8, 350, 150, this);
			break;
		case 22:
			g.drawImage(B9, 350, 150, this);
			break;
		case 23:
			g.drawImage(B10, 350, 150, this);
			break;
		case 24:
			g.drawImage(B11, 350, 150, this);
			break;
		case 25:
			g.drawImage(B12, 350, 150, this);
			break;
		case 26:
			g.drawImage(B13, 350, 150, this);
			break;
		case 27:
			g.drawImage(C1, 350, 150, this);
			break;
		case 28:
			g.drawImage(C2, 350, 150, this);
			break;
		case 29:
			g.drawImage(C3, 350, 150, this);
			break;
		case 30:
			g.drawImage(C4, 350, 150, this);
			break;
		case 31:
			g.drawImage(C5, 350, 150, this);
			break;
		case 32:
			g.drawImage(C6, 350, 150, this);
			break;
		case 33:
			g.drawImage(C7, 350, 150, this);
			break;
		case 34:
			g.drawImage(C8, 350, 150, this);
			break;
		case 35:
			g.drawImage(C9, 350, 150, this);
			break;
		case 36:
			g.drawImage(C10, 350, 150, this);
			break;
		case 37:
			g.drawImage(C11, 350, 150, this);
			break;
		case 38:
			g.drawImage(C12, 350, 150, this);
			break;
		case 39:
			g.drawImage(C13, 350, 150, this);
			break;
		case 40:
			g.drawImage(D1, 350, 150, this);
			break;
		case 41:
			g.drawImage(D2, 350, 150, this);
			break;
		case 42:
			g.drawImage(D3, 350, 150, this);
			break;
		case 43:
			g.drawImage(D4, 350, 150, this);
			break;
		case 44:
			g.drawImage(D5, 350, 150, this);
			break;
		case 45:
			g.drawImage(D6, 350, 150, this);
			break;
		case 46:
			g.drawImage(D7, 350, 150, this);
			break;
		case 47:
			g.drawImage(D8, 350, 150, this);
			break;
		case 48:
			g.drawImage(D9, 350, 150, this);
			break;
		case 49:
			g.drawImage(D10, 350, 150, this);
			break;
		case 50:
			g.drawImage(D11, 350, 150, this);
			break;
		case 51:
			g.drawImage(D12, 350, 150, this);
			break;
		case 52:
			g.drawImage(D13, 350, 150, this);
			break;
		}
		switch(imagenAmostrar3)
		{
		case 1:
			g.drawImage(A1, 550, 150, this);
			break;
		case 2:
			g.drawImage(A2, 550, 150, this);
			break;
		case 3:
			g.drawImage(A3, 550, 150, this);
			break;
		case 4:
			g.drawImage(A4, 550, 150, this);
			break;
		case 5:
			g.drawImage(A5, 550, 150, this);
			break;
		case 6:
			g.drawImage(A6, 550, 150, this);
			break;
		case 7:
			g.drawImage(A7, 550, 150, this);
			break;
		case 8:
			g.drawImage(A8, 550, 150, this);
			break;
		case 9:
			g.drawImage(A9, 550, 150, this);
			break;
		case 10:
			g.drawImage(A10, 550, 150, this);
			break;
		case 11:
			g.drawImage(A11, 550, 150, this);
			break;
		case 12:
			g.drawImage(A12, 550, 150, this);
			break;
		case 13:
			g.drawImage(A13, 550, 150, this);
			break;
		case 14:
			g.drawImage(B1, 550, 150, this);
			break;
		case 15:
			g.drawImage(B2, 550, 150, this);
			break;
		case 16:
			g.drawImage(B3, 550, 150, this);
			break;
		case 17:
			g.drawImage(B4, 550, 150, this);
			break;
		case 18:
			g.drawImage(B5, 550, 150, this);
			break;
		case 19:
			g.drawImage(B6, 550, 150, this);
			break;
		case 20:
			g.drawImage(B7, 550, 150, this);
			break;
		case 21:
			g.drawImage(B8, 550, 150, this);
			break;
		case 22:
			g.drawImage(B9, 550, 150, this);
			break;
		case 23:
			g.drawImage(B10, 550, 150, this);
			break;
		case 24:
			g.drawImage(B11, 550, 150, this);
			break;
		case 25:
			g.drawImage(B12, 550, 150, this);
			break;
		case 26:
			g.drawImage(B13, 550, 150, this);
			break;
		case 27:
			g.drawImage(C1, 550, 150, this);
			break;
		case 28:
			g.drawImage(C2, 550, 150, this);
			break;
		case 29:
			g.drawImage(C3, 550, 150, this);
			break;
		case 30:
			g.drawImage(C4, 550, 150, this);
			break;
		case 31:
			g.drawImage(C5, 550, 150, this);
			break;
		case 32:
			g.drawImage(C6, 550, 150, this);
			break;
		case 33:
			g.drawImage(C7, 550, 150, this);
			break;
		case 34:
			g.drawImage(C8, 550, 150, this);
			break;
		case 35:
			g.drawImage(C9, 550, 150, this);
			break;
		case 36:
			g.drawImage(C10, 550, 150, this);
			break;
		case 37:
			g.drawImage(C11, 550, 150, this);
			break;
		case 38:
			g.drawImage(C12, 550, 150, this);
			break;
		case 39:
			g.drawImage(C13, 550, 150, this);
			break;
		case 40:
			g.drawImage(D1, 550, 150, this);
			break;
		case 41:
			g.drawImage(D2, 550, 150, this);
			break;
		case 42:
			g.drawImage(D3, 550, 150, this);
			break;
		case 43:
			g.drawImage(D4, 550, 150, this);
			break;
		case 44:
			g.drawImage(D5, 550, 150, this);
			break;
		case 45:
			g.drawImage(D6, 550, 150, this);
			break;
		case 46:
			g.drawImage(D7, 550, 150, this);
			break;
		case 47:
			g.drawImage(D8, 550, 150, this);
			break;
		case 48:
			g.drawImage(D9, 550, 150, this);
			break;
		case 49:
			g.drawImage(D10, 550, 150, this);
			break;
		case 50:
			g.drawImage(D11, 550, 150, this);
			break;
		case 51:
			g.drawImage(D12, 550, 150, this);
			break;
		case 52:
			g.drawImage(D13, 550, 150, this);
			break;
		}
		switch(imagenAmostrar4)
		{
		case 1:
			g.drawImage(A1, 750, 150, this);
			break;
		case 2:
			g.drawImage(A2, 750, 150, this);
			break;
		case 3:
			g.drawImage(A3, 750, 150, this);
			break;
		case 4:
			g.drawImage(A4, 750, 150, this);
			break;
		case 5:
			g.drawImage(A5, 750, 150, this);
			break;
		case 6:
			g.drawImage(A6, 750, 150, this);
			break;
		case 7:
			g.drawImage(A7, 750, 150, this);
			break;
		case 8:
			g.drawImage(A8, 750, 150, this);
			break;
		case 9:
			g.drawImage(A9, 750, 150, this);
			break;
		case 10:
			g.drawImage(A10, 750, 150, this);
			break;
		case 11:
			g.drawImage(A11, 750, 150, this);
			break;
		case 12:
			g.drawImage(A12, 750, 150, this);
			break;
		case 13:
			g.drawImage(A13, 750, 150, this);
			break;
		case 14:
			g.drawImage(B1, 750, 150, this);
			break;
		case 15:
			g.drawImage(B2, 750, 150, this);
			break;
		case 16:
			g.drawImage(B3, 750, 150, this);
			break;
		case 17:
			g.drawImage(B4, 750, 150, this);
			break;
		case 18:
			g.drawImage(B5, 750, 150, this);
			break;
		case 19:
			g.drawImage(B6, 750, 150, this);
			break;
		case 20:
			g.drawImage(B7, 750, 150, this);
			break;
		case 21:
			g.drawImage(B8, 750, 150, this);
			break;
		case 22:
			g.drawImage(B9, 750, 150, this);
			break;
		case 23:
			g.drawImage(B10, 750, 150, this);
			break;
		case 24:
			g.drawImage(B11, 750, 150, this);
			break;
		case 25:
			g.drawImage(B12, 750, 150, this);
			break;
		case 26:
			g.drawImage(B13, 750, 150, this);
			break;
		case 27:
			g.drawImage(C1, 750, 150, this);
			break;
		case 28:
			g.drawImage(C2, 750, 150, this);
			break;
		case 29:
			g.drawImage(C3, 750, 150, this);
			break;
		case 30:
			g.drawImage(C4, 750, 150, this);
			break;
		case 31:
			g.drawImage(C5, 750, 150, this);
			break;
		case 32:
			g.drawImage(C6, 750, 150, this);
			break;
		case 33:
			g.drawImage(C7, 750, 150, this);
			break;
		case 34:
			g.drawImage(C8, 750, 150, this);
			break;
		case 35:
			g.drawImage(C9, 750, 150, this);
			break;
		case 36:
			g.drawImage(C10, 750, 150, this);
			break;
		case 37:
			g.drawImage(C11, 750, 150, this);
			break;
		case 38:
			g.drawImage(C12, 750, 150, this);
			break;
		case 39:
			g.drawImage(C13, 750, 150, this);
			break;
		case 40:
			g.drawImage(D1, 750, 150, this);
			break;
		case 41:
			g.drawImage(D2, 750, 150, this);
			break;
		case 42:
			g.drawImage(D3, 750, 150, this);
			break;
		case 43:
			g.drawImage(D4, 750, 150, this);
			break;
		case 44:
			g.drawImage(D5, 750, 150, this);
			break;
		case 45:
			g.drawImage(D6, 750, 150, this);
			break;
		case 46:
			g.drawImage(D7, 750, 150, this);
			break;
		case 47:
			g.drawImage(D8, 750, 150, this);
			break;
		case 48:
			g.drawImage(D9, 750, 150, this);
			break;
		case 49:
			g.drawImage(D10, 750, 150, this);
			break;
		case 50:
			g.drawImage(D11, 750, 150, this);
			break;
		case 51:
			g.drawImage(D12, 750, 150, this);
			break;
		case 52:
			g.drawImage(D13, 750, 150, this);
			break;
		}
	}
	
	public void cargarCartas()
	{
		A1 = herramientas.getImage("img/A1.png");
		A2 = herramientas.getImage("img/A2.png");
		A3 = herramientas.getImage("img/A3.png");
		A4 = herramientas.getImage("img/A4.png");
		A5 = herramientas.getImage("img/A5.png");
		A6 = herramientas.getImage("img/A6.png");
		A7 = herramientas.getImage("img/A7.png");
		A8 = herramientas.getImage("img/A8.png");
		A9 = herramientas.getImage("img/A9.png");
		A10 = herramientas.getImage("img/A10.png");
		A11 = herramientas.getImage("img/A11.png");
		A12 = herramientas.getImage("img/A12.png");
		A13 = herramientas.getImage("img/A13.png");
		B1 = herramientas.getImage("img/B1.png");
		B2 = herramientas.getImage("img/B2.png");
		B3 = herramientas.getImage("img/B3.png");
		B4 = herramientas.getImage("img/B4.png");
		B5 = herramientas.getImage("img/B5.png");
		B6 = herramientas.getImage("img/B6.png");
		B7 = herramientas.getImage("img/B7.png");
		B8 = herramientas.getImage("img/B8.png");
		B9 = herramientas.getImage("img/B9.png");
		B10 = herramientas.getImage("img/B10.png");
		B11 = herramientas.getImage("img/B11.png");
		B12 = herramientas.getImage("img/B12.png");
		B13 = herramientas.getImage("img/B13.png");
		C1 = herramientas.getImage("img/C1.png");
		C2 = herramientas.getImage("img/C2.png");
		C3 = herramientas.getImage("img/C3.png");
		C4 = herramientas.getImage("img/C4.png");
		C5 = herramientas.getImage("img/C5.png");
		C6 = herramientas.getImage("img/C6.png");
		C7 = herramientas.getImage("img/C7.png");
		C8 = herramientas.getImage("img/C8.png");
		C9 = herramientas.getImage("img/C9.png");
		C10 = herramientas.getImage("img/C10.png");
		C11 = herramientas.getImage("img/C11.png");
		C12 = herramientas.getImage("img/C12.png");
		C13 = herramientas.getImage("img/C13.png");
		D1 = herramientas.getImage("img/D1.png");
		D2 = herramientas.getImage("img/D2.png");
		D3 = herramientas.getImage("img/D3.png");
		D4 = herramientas.getImage("img/D4.png");
		D5 = herramientas.getImage("img/D5.png");
		D6 = herramientas.getImage("img/D6.png");
		D7 = herramientas.getImage("img/D7.png");
		D8 = herramientas.getImage("img/D8.png");
		D9 = herramientas.getImage("img/D9.png");
		D10 = herramientas.getImage("img/D10.png");
		D11 = herramientas.getImage("img/D11.png");
		D12 = herramientas.getImage("img/D12.png");
		D13 = herramientas.getImage("img/D13.png");
	}
	public void valor()
	{
		A1 = herramientas.getImage("img/A1.png");
		A2 = herramientas.getImage("img/A2.png");
		A3 = herramientas.getImage("img/A3.png");
		A4 = herramientas.getImage("img/A4.png");
		A5 = herramientas.getImage("img/A5.png");
		A6 = herramientas.getImage("img/A6.png");
		A7 = herramientas.getImage("img/A7.png");
		A8 = herramientas.getImage("img/A8.png");
		A9 = herramientas.getImage("img/A9.png");
		A10 = herramientas.getImage("img/A10.png");
		A11 = herramientas.getImage("img/A11.png");
		A12 = herramientas.getImage("img/A12.png");
		A13 = herramientas.getImage("img/A13.png");
		B1 = herramientas.getImage("img/B1.png");
		B2 = herramientas.getImage("img/B2.png");
		B3 = herramientas.getImage("img/B3.png");
		B4 = herramientas.getImage("img/B4.png");
		B5 = herramientas.getImage("img/B5.png");
		B6 = herramientas.getImage("img/B6.png");
		B7 = herramientas.getImage("img/B7.png");
		B8 = herramientas.getImage("img/B8.png");
		B9 = herramientas.getImage("img/B9.png");
		B10 = herramientas.getImage("img/B10.png");
		B11 = herramientas.getImage("img/B11.png");
		B12 = herramientas.getImage("img/B12.png");
		B13 = herramientas.getImage("img/B13.png");
		C1 = herramientas.getImage("img/C1.png");
		C2 = herramientas.getImage("img/C2.png");
		C3 = herramientas.getImage("img/C3.png");
		C4 = herramientas.getImage("img/C4.png");
		C5 = herramientas.getImage("img/C5.png");
		C6 = herramientas.getImage("img/C6.png");
		C7 = herramientas.getImage("img/C7.png");
		C8 = herramientas.getImage("img/C8.png");
		C9 = herramientas.getImage("img/C9.png");
		C10 = herramientas.getImage("img/C10.png");
		C11 = herramientas.getImage("img/C11.png");
		C12 = herramientas.getImage("img/C12.png");
		C13 = herramientas.getImage("img/C13.png");
		D1 = herramientas.getImage("img/D1.png");
		D2 = herramientas.getImage("img/D2.png");
		D3 = herramientas.getImage("img/D3.png");
		D4 = herramientas.getImage("img/D4.png");
		D5 = herramientas.getImage("img/D5.png");
		D6 = herramientas.getImage("img/D6.png");
		D7 = herramientas.getImage("img/D7.png");
		D8 = herramientas.getImage("img/D8.png");
		D9 = herramientas.getImage("img/D9.png");
		D10 = herramientas.getImage("img/D10.png");
		D11 = herramientas.getImage("img/D11.png");
		D12 = herramientas.getImage("img/D12.png");
		D13 = herramientas.getImage("img/D13.png");
	}
	
	public void mostrarCartaMazo1(int carta)
	{
		imagenAmostrar1 = carta;
		repaint();
	}
	public void mostrarCartaMazo2(int carta)
	{
		imagenAmostrar2 = carta;
		repaint();
	}
	public void mostrarCartaMazo3(int carta)
	{
		imagenAmostrar3 = carta;
		repaint();
	}
	public void mostrarCartaMazo4(int carta)
	{
		imagenAmostrar4 = carta;
		repaint();
	}
	public void aumentarPuntosJugador1()
	{
		puntosJugador1++;
		repaint();
	}
	public void aumentarPuntosJugador2()
	{
		puntosJugador2++;
		repaint();
	}
	public void aumentarPuntosJugador3()
	{
		puntosJugador3++;
		repaint();
	}
	public void aumentarPuntosJugador4()
	{
		puntosJugador4++;
		repaint();
	}
	public void resetearContadores()
	{
		puntosJugador1 = 0;
		puntosJugador2 = 0;
		puntosJugador3 = 0;
		puntosJugador4 = 0;
		repaint();
	}
}
