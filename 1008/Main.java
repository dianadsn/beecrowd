import java.util.Locale;
import java.util.Scanner;
 	public class Main{
 	 
	public static void main (String[] args){
	
	
	/*
	Fazer um programa que leia o número de um funcionário, 
	seu número de horas trabalhadas, o valor que recebe por
	hora e calcula o salário desse funcionário. 
	A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
	*/

	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);

	
        int numero,horas;
	double valorHora,salario;
	
	numero = teclado.nextInt();
	horas = teclado.nextInt();
	valorHora = teclado.nextDouble();
	salario = (double)horas*valorHora;

      	
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",numero,salario);
        

	
	//fechar teclado
	teclado.close();
	}

	}