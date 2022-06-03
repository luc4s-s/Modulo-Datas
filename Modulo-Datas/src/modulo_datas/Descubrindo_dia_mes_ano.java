package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Descubrindo_dia_mes_ano {

	public static void main(String[] args) {
		//descubrindo os dias o mes e o ano com a nova API do java 

		LocalDate localDate = LocalDate.now();
		System.out.println("Data Atual :" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//dia do Semana
		System.out.println("O Dia da Semana é :"+ localDate.getDayOfWeek());

		//dia do Mês
		System.out.println("O Dia do Mês é :"+ localDate.getDayOfMonth());
		
		//dia do Ano
		System.out.println("O Dia do Ano é :"+ localDate.getDayOfYear());
		
		//O Ano
		System.out.println("O Ano é :"+ localDate.getYear());
		
		//O Mês
		System.out.println("O Mês é :"+ localDate.getMonth());
		 
		//O Mês  de 1 a 12
		System.out.println("Qual Mês :"+ localDate.getMonthValue());
		

	}

}
