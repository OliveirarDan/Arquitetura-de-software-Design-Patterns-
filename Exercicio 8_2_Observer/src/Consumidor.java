/**
 * @author Danilo Rodrigues Oliveira RA: 81612248
 */
public class Consumidor {

	private NoticiarioAssina noticiario;
	private String nome;

	public Consumidor(String nome, NoticiarioAssina noticiario) {
		
		this.noticiario = noticiario;
		this.nome = nome;
		this.noticiario.inscrever(this);
	}

	public void update() {
		System.out.println(nome + " recebeu a notícia: " + noticiario.getNoticia().toString());
	}

	public String getNome() {
		return this.nome;
	}

}
