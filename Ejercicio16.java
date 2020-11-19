package subdivison;

import java.util.Scanner;

public class Ejercicio16 {
	
	public Scanner sc = new Scanner(System.in);
	public Short n;

	public Ejercicio16() {	
		
		do{
		
		
		System.out.print("Introduzca Un Número: ");
		n = Short.valueOf(sc.nextLine());
		} while ((n!=0) && (!(n<0)));
		
		if (n==0)
			
		{
				
			System.out.println("Total:100");
			
		}else if (n>0)
		
		{
			System.out.println("Total: "+n);
			
		}
				
	}
	public void Mostrar() 
	
	{
	
	}
	
	public void Cerrar()
	
	{
		
		sc.close();
		
	}
			
	public static void main(String[] args) {

		Ejercicio16 Total = new Ejercicio16();
		Total.Mostrar();

	}

}
