/**
 * @author Danilo Rodrigues Oliveira RA: 81612248
 */
package Exercicio7_2_Template_Method;

import java.util.Arrays;

public class Teste {
	
	private static final int NUM = 5;

	
	private static Double[] construirVetor() {
		Double[] d = new Double[NUM];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * NUM;
		return d;
	}

	
	public static void main(String[] args) throws Exception {
		
		Double[] v = construirVetor();
		
		Arrays.sort(v, new ComparatorDouble());
		
		System.out.println(Arrays.toString(v));
	}
}
