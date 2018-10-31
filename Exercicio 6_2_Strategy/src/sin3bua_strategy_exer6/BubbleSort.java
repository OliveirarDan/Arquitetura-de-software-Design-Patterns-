/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */


package sin3bua_strategy_exer6;

public class BubbleSort implements Formatacao {

	@Override
	public int[] format(int v[], int x, int y) {

		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j + 1];
					v[j + 1] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}
}
