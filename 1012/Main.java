import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
 	public class Main{
 	 
	public static void main (String[] args){
	
	
	/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
 A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B
	*/

	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);

	
        
	double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
	

	a = teclado.nextDouble();
	b = teclado.nextDouble();
	c = teclado.nextDouble();
	
	triangulo= (a*c)/2;
	circulo= 3.14159 * Math.pow(c,2);
	trapezio= ((a+b)*c)/2;
	quadrado= b*b ;
	retangulo= a*b;
	
       

      	
        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",triangulo,circulo,trapezio,quadrado,retangulo);
        

	
	//fechar teclado
	teclado.close();
	}

	}