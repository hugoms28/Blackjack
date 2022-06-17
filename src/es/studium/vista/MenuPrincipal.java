package es.studium.vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;


public class MenuPrincipal extends Frame 
{
	private static final long serialVersionUID =1L;
	Label lblMenuPrincipal = new Label("Menú Principal", 1);
	Panel pnlBotonera = new Panel();
	Panel pnlBotoneraSalir = new Panel();
	public Button btnPartidaNueva = new Button("Partida Nueva");
	public Button btnTopTen = new Button("Top 10");
	public Button btnAyuda = new Button("Ayuda");
	public Button btnSalir = new Button("Salir");
	
	public MenuPrincipal() {
		setTitle("BlackJack");
		setBackground(Color.RED);
		setLayout(new BorderLayout());
		pnlBotonera.setLayout(new FlowLayout(FlowLayout.CENTER,200,10) );
		pnlBotonera.add(lblMenuPrincipal);
		pnlBotonera.add(btnPartidaNueva);
		pnlBotonera.add(btnTopTen);
		pnlBotonera.add(btnAyuda); 		
		pnlBotonera.add(btnSalir);
		add(pnlBotonera, "Center"); 		
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
