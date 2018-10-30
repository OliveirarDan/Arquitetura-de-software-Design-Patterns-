/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */

package Classes;
import java.util.*;

class NewSomador extends SomadorExistente implements SomadorEsperado {

	public int somaVetor(int[] vetor) {

		ArrayList<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}

		return this.somaLista(lista);
	}

}