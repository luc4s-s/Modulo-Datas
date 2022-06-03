package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FaixaDeTempo {

	public static void main(String[] args) {

		
		LocalDate dataBase = LocalDate.parse("2019-10-25"); 
		
		System.out.println("Adicionando 5 dias "+ (dataBase = dataBase.plusDays(5)));
		System.out.println("Adicionando 5 Semanas "+ (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Adicionando 5 Mês "+ (dataBase = dataBase.plusMonths(5)));
		System.out.println("Adicionando 5 Anos "+ (dataBase = dataBase.plusYears(5)) + "\n");
		
		
		/**Menos Dias, Semana, Mes, Ano **/
		
		System.out.println("Menos 5 Dias "+ (dataBase = dataBase.minusDays(1)));
		System.out.println("Menos 5 semansa "+ (dataBase = dataBase.minusWeeks(1)));
		System.out.println("Menos 5 Mês "+ (dataBase = dataBase.minusMonths(1)));
		System.out.println("Menos 5 Anos "+ (dataBase = dataBase.minusYears(1)));
		

		/** Gerando boletos e adicionando mas um dia, mes, ano etc..**/
		
		for (int mes = 1; mes <=12; mes++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Data de Vencimento do Boleto : "
			+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do Mês : " + mes);
		}


	} 

}
