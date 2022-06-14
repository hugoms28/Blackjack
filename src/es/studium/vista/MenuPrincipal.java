package es.studium.vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;


public class MenuPrincipal extends Frame 
{
	private static final long serialVersionUID =1L;
	Label lblMenuPrincipal = new Label("Menú Principal", 1);
	Panel pnlBotonera = new Panel();
	Panel pnlBotoneraSalir = new Panel();
	Button btnPartidaNueva = new Button("Partida Nueva");
	Button btnTopTen = new Button("Top 10");
	Button btnAyuda = new Button("Ayuda");
	Button btnSalir = new Button("Salir");
	
	public MenuPrincipal() {
		setTitle("BlackJack");
		setLayout(new BorderLayout());
		setBackground(Color.RED);
		pnlBotonera.setLayout(new GridLayout(4, 1));
		pnlBotonera.add(lblMenuPrincipal);
		pnlBotonera.add(btnPartidaNueva);
		pnlBotonera.add(btnTopTen);
		pnlBotonera.add(btnAyuda);
		add(pnlBotonera, "Center");
		pnlBotoneraSalir.add(btnSalir);
		add(pnlBotoneraSalir, "South");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		MostrarPrincipal();
	}
	public void MostrarPrincipal() {
		this.setVisible(true);
	}
	
	public void OcultarPrincipal() {
		this.setVisible(false);
	}
}
