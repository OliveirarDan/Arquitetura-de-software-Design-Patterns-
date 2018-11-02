/**
 * @author Danilo Rodrigues Oliveira RA: 81612248
 */
package Exercicio7_2_Template_Method;

import java.util.Comparator;

public class ComparatorDouble implements Comparator<Double> {
	public int compare(Double d1, Double d2) {
		Double d1z = d1 - Math.floor(d1);
		Double d2z = d2 - Math.floor(d2);
		return d1z.compareTo(d2z);
	}
}
