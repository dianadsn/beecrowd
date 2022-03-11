 import java.util.Scanner;
 	public class Main{
 	 
	public static void main (String[] args){
	
	
	/*
	Fazer um programa para ler quatro valores inteiros A, B, C e D. 
	A seguir, calcule e mostre a diferença do produto
	de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
	*/

	
	Scanner teclado = new Scanner(System.in);

	
        int A,B,C,D;
	
	A = teclado.nextInt();
	B = teclado.nextInt();
	C = teclado.nextInt();
	D = teclado.nextInt();

        int diferenca = (A * B - C * D);
	
        System.out.println("DIFERENCA = "+diferenca);
        

	
	//fechar teclado
	teclado.close();
	}

	}