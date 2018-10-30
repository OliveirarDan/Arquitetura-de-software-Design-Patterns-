/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */
package exercicio1_2;

public class PizzaCalabresa implements Pizza {

	@Override
	public void printIngredientes() {
		System.out.println("Pizza de Calabresa - Ingrediente: Queijo, Calabresa e Tomate");		
	}

	@Override
	public String toString() {
		return "PizzaCalabresa []";
	}
}
