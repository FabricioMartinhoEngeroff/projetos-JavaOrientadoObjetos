package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
	   Funcionario funci = new Funcionario();
	   
	   System.out.print("Entre com o nome:");
	   funci.name = sc.nextLine();
	   System.out.print("Entre com o salario bruto:");
	   funci.grossSalary = sc.nextDouble();
	   System.out.print("Entre com  taxa de imposto:");
	   funci.tax = sc.nextDouble();
	   
	   System.out.println();
	   System.out.println("FUNCIONARIOS:" + funci );
	   System.out.println();
	   System.out.print("Qual a porcentagem para aumentar o salário?");
	   double percentage = sc.nextDouble();
	   funci.increaseSalary(percentage);
	   
	   System.out.println();
	   System.out.println("Dados atualizados:" + funci);
	   
	   sc.close();


	}

}
