package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Qtd_DiasVencidos {

	public static void main(String[] args) throws ParseException {
		//Aula verificando a quantidade de dias vencidos 
		
		
		//verificando a quantidade de dia ate o dia atual
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("1000-01-01"), LocalDate.now());// total de dias ate hoje
		System.out.println("possui " + dias + " dias ate o dia de hoje");
		
		//verificando a quantidade de anos ate o dia de hoje
		long anos = ChronoUnit.YEARS.between(LocalDate.parse("1000-01-01"), LocalDate.now());
		System.out.println("possui "+ anos + " anos ate o ano atual de hoje");
		
		//podendo usar tambem DECADES, MINUTES, HOURS, MONTHS, WEEKS ENTRE OUTROS
	}

}
