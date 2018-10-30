

package exercicio1_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Danilo Rodrigues Oliveira   RA: 81612248
 */
public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a data no formato dd/mm/aaaa:");
		String date = input.next();
		System.out.println("Digite uma opção \"Pizza\" OU  \"Calzone\"");
		String s = input.next(); // getting a String value
		String produto = s;
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		DayOfWeek dayOfWeek = LocalDate.parse(date, formatter).getDayOfWeek();
		
		int value = dayOfWeek.getValue();

		System.out.println(dayOfWeek);
		
		if(produto.equals("Pizza")) {
			PizzariaAbstractFactory pizzariaFactory = new PizzaFactory();
			Produto pizza = pizzariaFactory.getTypeInstance(String.valueOf(value));		
			pizza.printIngredientes();
			
		}else if(produto.equals("Calzone")){
			PizzariaAbstractFactory calzoneFactory = new CalzoneFactory();
			Produto calzone = calzoneFactory.getTypeInstance(String.valueOf(value));		
			calzone.printIngredientes();
		}			
	}
}
