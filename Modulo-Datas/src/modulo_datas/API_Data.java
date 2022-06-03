package modulo_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class API_Data {

	public static void main(String[] args) {
		// nova API de data 
		
		/** gerando a data atual **/
		LocalDate dataAtual = LocalDate.now();
		System.out.println("data atual: " + dataAtual);
		
		
		/** gerando a hora atual **/
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora Atual: " + horaAtual);
		
		
		/** data e hora juntos **/
		LocalDateTime dataAtualhoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora Atua : " + dataAtualhoraAtual);
	}

}
