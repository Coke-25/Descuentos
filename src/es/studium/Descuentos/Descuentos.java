package es.studium.Descuentos;

import java.util.Scanner;

public class Descuentos 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		int a, c;
		double b, d=0.0;
		String descuento="";
		System.out.println("¿Cual es el código del producto?");
		a = teclado.nextInt();
		System.out.println("¿Cual es el precio del producto?");
		b = teclado.nextDouble();
		System.out.println("¿Cuantas unidades son?");
		c = teclado.nextInt();

		if (c>100)
		{
			d = ((b)-(b*0.4));
			descuento = "40%";
		}
		else if (c<=100&&c>=25)
		{
			d = ((b)-(b*0.2));
			descuento = "20%";
		}
		else if (c>=10&&c<=24)
		{
			d = ((b)- (b*0.1));
			descuento = "10%";
		}
		else 
		{
			d = b;
			descuento = "No se aplica descuento.";
		}
		System.out.println("El código del artículo es: " + a);
		System.out.println("El subtotal es: " + c*b + "€");
		System.out.println("El descuento es: " + descuento);
		System.out.println("El total a pagar es: " + c*d + "€");
	teclado.close();
	}

}
