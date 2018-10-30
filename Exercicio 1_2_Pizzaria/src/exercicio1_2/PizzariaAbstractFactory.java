/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */
package exercicio1_2;

import exercicio1_2.Produto;

public interface PizzariaAbstractFactory {
	Produto getTypeInstance(String diaDaSemana);
}
