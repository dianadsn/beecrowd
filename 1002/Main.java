 import java.util.Scanner;
 import java.util.Locale;
	public class Main{
 	 
	public static void main (String[] args){
	
	
	/*
	Faça um programa para ler o valor do raio de um círculo,
	e depois mostrar o valor da área deste círculo com quatro
	casas decimais conforme exemplos..
	*/

	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);

	
        double PI = 3.14159;
	
	double raio = teclado.nextDouble();

        double area = PI * Math.pow(raio,2);
	
        System.out.printf("A=%.4f%n",area);
        

	
	//fechar teclado
	teclado.close();
	}

	}