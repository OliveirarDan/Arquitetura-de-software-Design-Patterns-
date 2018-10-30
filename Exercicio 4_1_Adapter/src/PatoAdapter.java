/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */

public class PatoAdapter extends Pato{
	private Ganso ganso;
	public PatoAdapter (Ganso ganso){
		this.ganso = ganso;
	}
	public void quack ( ){
		ganso.howk ( );
	}
}