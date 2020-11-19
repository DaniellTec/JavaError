package ejercicio2;

import java.util.Scanner;

public class cuatroxcinco 
{
	
	public Scanner sc = new Scanner(System.in);
	public short n, primerNum;

	public cuatroxcinco()
	
	{	do
		{
			System.out.print("Introduzca Un Número Par Entero Entre 2 & 80000:");
			n = Short.valueOf(sc.nextLine());
		} while ((n%2!=0)&&(n<=80000)); //( ( ( (n%2)==1)  && (n>=2) && (n<=80000) ) ) ;  //Solo coge valores pares
		
		if (n>=10000)
		{	primerNum = (short)(n/10000); // Para que tenga la primera letra del valor
		
		}
		else if (n>=1000)
			primerNum = (short)(n/1000);
		else if (n>100)
			primerNum = (short)(n/100);
		else if (n>10)
			primerNum = (short)(n/10);
		else
			primerNum = n;
	}
	
	public void Mostrar()
	{	
		System.out.println("Número escrito "+n);
		System.out.println("Primera cifra: "+primerNum);	
				
     	short primernum = n;
        System.out.print("Cinco multiplicaciones: ");
        for (byte b=0;b<5;b++)//5 veces
    {	primernum = (short) (primernum * 4);
	    System.out.print(primernum+" ");
			}
			
		
	}
	
public void Cerrar()
	
	{	
		sc.close();
	}
	
	public static void main (String [] args)
	{	cuatroxcinco e = new cuatroxcinco ();
		e.Mostrar();
	}
}
