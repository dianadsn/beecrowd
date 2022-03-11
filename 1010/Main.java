import java.util.Locale;
import java.util.Scanner;
 	public class Main{
 	 
	public static void main (String[] args){
	
	
	/*
	Fazer um programa para ler o código de uma peça 1, 
	o número de peças 1, o valor unitário de cada peça 1, o
	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
	 Calcule e mostre o valor a ser pago.mais.
	*/

	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);

	
        int codigo1,codigo2,qtdpeca1,qtdpeca2;
	double valorPeca1,valorPeca2,total;
	
	codigo1 = teclado.nextInt();
	qtdpeca1 = teclado.nextInt();
	valorPeca1 = teclado.nextDouble();
	codigo2 = teclado.nextInt();
	qtdpeca2 = teclado.nextInt();
	valorPeca2 = teclado.nextDouble();
	total = (double)(qtdpeca1*valorPeca1)+(qtdpeca2*valorPeca2);

      	
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
        

	
	//fechar teclado
	teclado.close();
	}

	}