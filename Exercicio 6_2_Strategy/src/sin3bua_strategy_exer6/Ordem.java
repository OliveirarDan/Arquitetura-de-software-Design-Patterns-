/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */


package sin3bua_strategy_exer6;

public class Ordem {
	int x, y;
	
	private final Formatacao formatacao;
	
	public Ordem(Formatacao formatacao) {
		this.formatacao = formatacao;
	}
	
	public int[] publish (int vetor[]) {
		formatacao.format(vetor,x, y);
		return vetor;
	}
	
}
