/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */


package facade;

import java.io.Serializable;

public class ObjetoDeTeste implements Serializable{

	public String descricaoDaClasse;

	public ObjetoDeTeste(String descricaoDaClasse) {
		super();
		this.descricaoDaClasse = descricaoDaClasse;
	}

	public String getDescricaoDaClasse() {
		return descricaoDaClasse;
	}

	public void setDescricaoDaClasse(String descricaoDaClasse) {
		this.descricaoDaClasse = descricaoDaClasse;
	}
	
	
}
