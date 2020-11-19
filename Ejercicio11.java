package subdivison;

import java.util.Scanner; // Añadir scanner

public class Ejercicio11 
{
	public Scanner sc = new Scanner(System.in);
	byte num; // Añadir variables
	byte max = 20;
	char resp = 'A'; // Para añadir letras
	
	public Ejercicio11()
	{
		
		do
			
		{	
			System.out.println("Desea Ver Un Número par (p) o impar (i)?: "); //Pregunta
			resp = sc.next().charAt(0); //Respuesta caracter
		} while ((resp!='P')&&(resp!='p')&&(resp!='I')&&(resp!='i')); // Se repite hasta que ponga uno de estos valores
		
		//(!((==1)||(==2)));//Repetir mientras no haya escrito 1 o 2
		
		if (resp=='P')  //Si es esta respuesta 
				
		{	
			do 
		{
				
			num = (byte) (Math.random () * (max+1));
			
		}while (num%2!=0); //Para dar valores pares 
			
		}
		
	else if (resp=='p')
		
	{	
		do 
	{
			
		num = (byte) (Math.random () * (max+1));
		
	}while (num%2!=0);
		
	}
			
	if (resp=='I')
		
	{	
		do 
	{		
		num = (byte) (Math.random () * (max+1));
		
	}while (num%2==0); //Para dar valores impares 
		
	}
	
else if (resp=='i')
	
{	
	do 
{
		
	num = (byte) (Math.random () * (max+1));
	
}while (num%2==0);
	
}
	
}

	public void Mostrar()
	
	{	
		System.out.println("Número aleatorio: "+num);
	}
	
	public void Cerrar()
	
	{	
		sc.close();
	}
	
	public static void main(String[] args) 
	
	{	
		Ejercicio11 Mostrar1 = new Ejercicio11();
		Mostrar1.Mostrar();
	}	
	
}
