package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Descubrindo_dia_mes_ano {

	public static void main(String[] args) {
		//descubrindo os dias o mes e o ano com a nova API do java 

		LocalDate localDate = LocalDate.now();
		System.out.println("Data Atual :" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//dia do Semana
		System.out.println("O Dia da Semana � :"+ localDate.getDayOfWeek());

		//dia do M�s
		System.out.println("O Dia do M�s � :"+ localDate.getDayOfMonth());
		
		//dia do Ano
		System.out.println("O Dia do Ano � :"+ localDate.getDayOfYear());
		
		//O Ano
		System.out.println("O Ano � :"+ localDate.getYear());
		
		//O M�s
		System.out.println("O M�s � :"+ localDate.getMonth());
		 
		//O M�s  de 1 a 12
		System.out.println("Qual M�s :"+ localDate.getMonthValue());
		

	}

}
