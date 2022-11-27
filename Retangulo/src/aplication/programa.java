package aplication;
import java.util.Locale;

import java.util.Scanner;

import entities.Retangulo;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo l,a;
		Retangulo rc=new Retangulo();
		
		System.out.println("digite o valor da largura");
		rc.largura=sc.nextDouble();
		System.out.println("Agora digite o valor da altura");
		rc.altura=sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n",rc.area() );
		System.out.printf("PERIMETER = %.2f%n", rc.perimeter());
		System.out.printf("DIAGONAL = %.2f%n",rc.diagonal());
		sc.close();
	}

}
