package es.studium.vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;


public class TopTen extends Frame 
{
	private static final long serialVersionUID =1L;
	TextArea txaRanking = new TextArea(20, 10);
	public Button btnVolver = new Button("Volver");
	
	public TopTen() {
		setTitle("BlackJack: Ranking");
		setLayout(new BorderLayout());
		setBackground(Color.RED);
		txaRanking.append("#\tNombre\t\tPuntos");
		add(txaRanking, "Center");
		add(btnVolver, "South");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	public void MostrarTopTen() {
		this.setVisible(true);
	}
	
	public void OcultarTopTen() {
		this.setVisible(false);
	}
}