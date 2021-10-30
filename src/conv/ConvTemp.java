/*Concluí esse exercício com forma de fixação, utilizei os principais metodos de lógca de programação. Utilizei os mesmos
 * para fazer um sistema que desse a opção de calcular a temperatura quantas vezes necessário.
 * Autor: Igor Montezuma*/
package conv;

import java.util.Scanner;

public class ConvTemp {

	public ConvTemp() {
		
	}

	public static void main(String[] args) {
		
		int n = 0;
		int repe = 1;
		do {
		System.out.println("Conversor de Tempearaturas\n");
		System.out.println("Digite a temperatura em C°:\n");
		Scanner a = new Scanner(System.in);
		int temp = a.nextInt();
		System.out.println("1 - Converter Para F° \n2 - Converter para K°\n3 - Converter para Re°\n4 - Converter para Ra°");
		Scanner s = new Scanner(System.in);
		int opcao = s.nextInt();
		double op1 = temp * 1.8 + 32;
		double op2 = temp + 273.15;
		double op3 = temp * 0.8;
		double op4 = temp * 1.8 + 32 + 459.67;
		
			if(opcao == 1) {
				System.out.println(" conversão foi de "+temp+ "°C para "+op1+" °F\n");
			}else if(opcao == 2) {
				System.out.println("A conversão foi de "+temp+ "°C para "+op2+" °K\n");
			}else if(opcao == 3) {
				System.out.println("A conversão foi de "+temp+ "°C para "+op3+" Re°\n");
			}else {
				System.out.println("A conversão foi de "+temp+ "°C para "+op4+" °Ra\n");
			}
			System.out.println("Deseja converter mais algum valor? 1 = SIM / 0 NÃO");
			
			Scanner r = new Scanner(System.in);
			repe = r.nextInt();
			
			
		}while(repe != n);
		
	}

}
