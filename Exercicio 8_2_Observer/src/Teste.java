/**
 * @author Danilo Rodrigues Oliveira RA: 81612248
 */
public class Teste {
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		
		new Consumidor("Danilo", noticiario);
		noticiario.notificaNoticia(" O Pseudo Ciclista que n�o tem dinheiro para comprar um garmim", 01, 11, "T�pico: Esportes");
		
		new Consumidor("Jonhy", noticiario);
		noticiario.notificaNoticia(" A Calopsita que tenta fugir ", 02, 11, "T�pico: Vida Selvagem");

	}
}
