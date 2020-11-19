package subdivison;

import java.util.Scanner;

public class Ejercicio13 {
	
	public Scanner sc = new Scanner(System.in);
	public short n;
	
	public Ejercicio13()
	
	{
	
	do
		
	{	
		
		System.out.print("Introduza Un Valor: ");
		n = Short.valueOf(sc.nextLine());
		
	}while ((n!=2) && (n!=-2));
	
	}
	
	public void Mostrar()
	
	{
		
		
	}
	
	public void Cerrar()
	
	{
		
		sc.close();
		
	}
	
	public static void main(String[] args) {
		
		Ejercicio13 d = new Ejercicio13();
		d.Mostrar();

	}

}
