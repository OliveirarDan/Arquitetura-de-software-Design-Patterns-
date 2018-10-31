/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */


package sin3bua_strategy_exer6;

import java.util.Scanner;

public class TestandoStrategy {
	public static String tipo;
	public static void main(String[] args) {
		
		int[] vetor = new int[31];
		
		vetor[0] = 4;
		vetor[1] = 8;
		vetor[2] = 6;
		vetor[3] = 748;
		vetor[4] = 20;
		vetor[5] = 918;
		vetor[6] = 32;
		vetor[7] = 405;
		vetor[8] = 82;
		vetor[9] = 3;
		vetor[10] = 7;
		vetor[11] = 13;
		vetor[12] = 35;
		vetor[13] = 22;
		vetor[14] = 1272;
		vetor[15] = 928;
		vetor[16] = 32;
		vetor[17] = 5;
		vetor[18] = 80;
		vetor[19] = 33;
		vetor[20] = 81;
		vetor[21] = 123;
		vetor[22] = 45;
		vetor[23] = 12;
		vetor[24] = 72;
		vetor[25] = 908;
		vetor[26] = 36;
		vetor[27] = 475;
		vetor[28] = 84;
		vetor[29] = 342;
		vetor[30] = 872;
		
		while(true) {
		
			System.out.println("\nInsira 'Insert', 'Bubble', 'Select' ou 'Quick'  para determinar a ordenação");
			Scanner entrada = new Scanner(System.in);
			String input = entrada.nextLine();
			tipo = input;
		
		
			if(tipo.equals("Insert")) {
				Formatacao format = new InsertSort();
				Ordem ordem = new Ordem(format);
				ordem.publish(vetor);
				
				for(int l = 0; l< vetor.length; l++) {
					System.out.print(vetor[l]+" - ");
				}
			}else if(tipo.equals("Bubble")) {
				Formatacao format = new BubbleSort();
				Ordem ordem = new Ordem(format);
				ordem.publish(vetor);
				
				for(int l = 0; l< vetor.length; l++) {
					System.out.print(vetor[l]+" - ");
				}
			}else if(tipo.equals("Select")) {
				Formatacao format = new SelectSort();
				Ordem ordem = new Ordem(format);
				ordem.publish(vetor);
				
				for(int l = 0; l< vetor.length; l++) {
					System.out.print(vetor[l]+" - ");
				}
			}else if(tipo.equals("Quick")) {
				Formatacao format = new SelectSort();
				Ordem ordem = new Ordem(format);
				ordem.publish(vetor);
				
				for(int l = 0; l< vetor.length; l++) {
					System.out.print(vetor[l]+" - ");
				}
			}else {
				System.out.println("Inserir um valor correto\n");
			}
		}
		
	}

}
