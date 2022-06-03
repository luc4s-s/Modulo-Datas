package modulo_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class API_Data {

	public static void main(String[] args) {
		// nova API de data 
		
		/** gerando a data atual **/
		System.out.println("---FORMATADA---");
		LocalDate dataAtual = LocalDate.now();
		System.out.println("data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		/** gerando a hora atual **/
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora Atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		
		/** data e hora juntos **/
		LocalDateTime dataAtualhoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora Atua : " + dataAtualhoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n");
	
	
		// Data e Hora nao formatada 
		
		/** gerando a data atual **/
		System.out.println("---NÃO FORMATADA---");
		LocalDate dataAtual0 = LocalDate.now();
		System.out.println("data atual: " + dataAtual0);
		
		
		/** gerando a hora atual **/
		LocalTime horaAtual0 = LocalTime.now();
		System.out.println("Hora Atual: " + horaAtual0);
		
		
		/** data e hora juntos **/
		LocalDateTime dataAtualhoraAtual0 = LocalDateTime.now();
		System.out.println("Data e Hora Atua : " + dataAtualhoraAtual0);
	}

}
