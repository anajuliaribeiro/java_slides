package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;
	

public class Calculadora {

	private Scanner input;
	
		public Calculadora() {
			this.input = new Scanner(System.in);
			
		}
		
		public void somar() {
			try {
				System.out.println("Informe o primeiro valor: ");
				int x = this.input.nextInt();
				
				System.out.println("Informe o segundo valor: ");
				int y = this.input.nextInt();
				
				int resultado = x + y;
				System.out.println("A soma dos dois valores � igual �: " + resultado);
				
				
			} catch(InputMismatchException ime)	{
				
				System.out.println("Informe apenas valores inteiros");
				
			}
				
		}
		
		public void subtrair() {
			try {
				System.out.println("Informe o primeiro valor: ");
				int x = this.input.nextInt();
				
				System.out.println("Informe o segundo valor: ");
				int y = this.input.nextInt();
				
				int resultado = x - y;
				System.out.println("A subtra��o dos dois valores � igual �: " + resultado);
				
				
			} catch(InputMismatchException ime)	{
				
				System.out.println("Informe apenas valores inteiros");
				
			} finally {
				
				System.out.println("executando o bloco finally");
			}
				
		}
		
		public void dividir() {
			try {
				System.out.println("Informe o primeiro valor: ");
				int x = this.input.nextInt();
				
				System.out.println("Informe o segundo valor: ");
				int y = this.input.nextInt();
				
				int resultado = x / y;
				System.out.println("A divis�o de " + x + " por " + y + "� igual �: " + resultado);
				
				
			} catch(ArithmeticException ae) {
				
				System.out.println("Divis�o por zero � imposs�vel.");
			
			} catch(InputMismatchException ime)	{
				
				System.out.println("Informe apenas valores inteiros");
				
			} finally {
				
				System.out.println("executando o bloco finally");
			}
			
		}
		
		public void multiplicar() {
			try {
				System.out.println("Informe o primeiro valor: ");
				int x = this.input.nextInt();
				
				System.out.println("Informe o segundo valor: ");
				int y = this.input.nextInt();
				
				int resultado = x * y;
				System.out.println("A multiplica��o dos dois valores � igual �: " + resultado);
				
				
			} catch(InputMismatchException ime)	{
				
				System.out.println("Informe apenas valores inteiros");
				
			} finally {
				
				System.out.println("executando o bloco finally");
			}
				
		}	
	
		public void potencializar() {
			try {
				System.out.println("Informe o primeiro valor: ");
				int x = this.input.nextInt();
				
				System.out.println("Informe o valor da pot�ncia: ");
				int y = this.input.nextInt();
				
				int resultado = x ^ y;
				System.out.println("A potencializa��o dos dois valores � igual �: " + resultado);
				
				
			} catch(InputMismatchException ime)	{
				
				System.out.println("Informe apenas valores inteiros");
				
			} finally {
				
				System.out.println("executando o bloco finally");
			}
			
		}
			public void calcularRaizQuadrada() {
				try {
					System.out.println("Informe o primeiro valor: ");
					int x = this.input.nextInt();
										
					int resultado = (int) Math.sqrt(x);
					System.out.println("A potencializa��o dos dois valores � igual �: " + resultado);
					
					
				} catch(InputMismatchException ime)	{
					
					System.out.println("Informe apenas valores inteiros");
					
				} finally {
					
					System.out.println("executando o bloco finally");
				}
		}
		public void escolherOperacao() {
			System.out.println("====== MENU =====");
			System.out.println("Selecione a op��o desejada: ");
			System.out.println("1 - Somar;");
			System.out.println("2 - Subtrair;");
			System.out.println("3 - Dividir;");
			System.out.println("4 - Multiplicar;");
			System.out.println("=================");

			
			
		
		}



}
