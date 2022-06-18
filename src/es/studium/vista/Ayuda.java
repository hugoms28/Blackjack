package es.studium.vista;

import java.io.IOException;

public class Ayuda {

	public static void main(String[] args)
	{
		try
		{
			Runtime.getRuntime().exec("hh.exe blackjack.chm");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
