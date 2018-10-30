/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */

import java.util.ArrayList;
import java.util.List;

public class Teste{

	public static void main (String [] args){

		List <Pato> patos = new ArrayList <> ();
		patos.add (new PatoReal());
		patos.add( new PatoReal());
		patos.add (new Patolino());
		Ganso ganso = new Ganso ();
		patos.add (new PatoAdapter (ganso));	
		while (true){
			for (Pato pato : patos){
				pato.quack( );
			}
		}
		
	}
}

