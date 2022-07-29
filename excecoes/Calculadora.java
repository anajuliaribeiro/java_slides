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
				System.out.println("A soma dos dois valores é igual à: " + resultado);
				
				
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
				System.out.println("A subtração dos dois valores é igual à: " + resultado);
				
				
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
				System.out.println("A divisão de " + x + " por " + y + "é igual à: " + resultado);
				
				
			} catch(ArithmeticException ae) {
				
				System.out.println("Divisão por zero é impossível.");
			
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
				System.out.println("A multiplicação dos dois valores é igual à: " + resultado);
				
				
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
				
				System.out.println("Informe o valor da potência: ");
				int y = this.input.nextInt();
				
				int resultado = x ^ y;
				System.out.println("A potencialização dos dois valores é igual à: " + resultado);
				
				
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
					System.out.println("A potencialização dos dois valores é igual à: " + resultado);
					
					
				} catch(InputMismatchException ime)	{
					
					System.out.println("Informe apenas valores inteiros");
					
				} finally {
					
					System.out.println("executando o bloco finally");
				}
		}
		public void escolherOperacao() {
			System.out.println("====== MENU =====");
			System.out.println("Selecione a opção desejada: ");
			System.out.println("1 - Somar;");
			System.out.println("2 - Subtrair;");
			System.out.println("3 - Dividir;");
			System.out.println("4 - Multiplicar;");
			System.out.println("=================");

			
			
		
		}



}
