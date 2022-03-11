 import java.util.Scanner;
	public class Main{
 	 
	public static void main (String[] args){
	
	
	/*
         Faça um programa para ler dois valores inteiros, 
         e depois mostrar na tela a soma desses números com uma
         mensagem explicativa, conforme exemplos.
	*/

	Scanner teclado = new Scanner(System.in);

	
        int a = teclado.nextInt();
	
	int b = teclado.nextInt();

        a = a + b;
	
        System.out.println("SOMA = "+ a);
        

	
	//fechar teclado
	teclado.close();
	}

	}