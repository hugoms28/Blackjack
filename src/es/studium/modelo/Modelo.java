package es.studium.modelo;

import java.util.Random;

public class Modelo {

Random rnd = new Random();
	
	public void barajar(int uno[], int dos[], int tres[], int cuatro[])
	{		
		int jugador = 0;
		int iUno=0, iDos=0, iTres=0, icuatro=0;
		
		for(int i = 1; i <= 52; i++)
		{
			jugador = rnd.nextInt(2);
			if((jugador==0)&&(iUno<13)) // Jugador 1
			{
				uno[iUno] = i;
				iUno++;
			}
			else if(iDos<13) // Jugador 2
			{
				dos[iDos] = i;
				iDos++;
			}
			else if(iTres<13) // Jugador 2
			{
				tres[iTres] = i;
				iTres++;
			}
			else if(icuatro<13) // Jugador 2
			{
				cuatro[icuatro] = i;
				icuatro++;
			}
		}
		rebarajar(uno);
		rebarajar(dos);
		rebarajar(tres);
		rebarajar(cuatro);
	}
	public void rebarajar(int t[])
	{
		int aleatorio, auxiliar;
		for(int i=0; i<13; i++)
		{
			aleatorio = rnd.nextInt(12)+1;
			auxiliar = t[i];
			t[i] = t[aleatorio];
			t[aleatorio] = auxiliar;
		}
	}
}
