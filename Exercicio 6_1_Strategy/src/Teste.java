/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */


import java.util.Calendar;
import java.util.Locale;

public class Teste {

	public static void main(String[] args) {
		RetornoSemana retornosemana = new RetornoSemana();

		Calendar calendar = Calendar.getInstance();

		System.out.println(retornosemana.getSemana(calendar.get(Calendar.DAY_OF_WEEK)).messagem());

		System.out.println(retornosemana
				.getSemana(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH)).messagem());
	}
}