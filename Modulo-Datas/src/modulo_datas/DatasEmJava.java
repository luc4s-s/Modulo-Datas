package modulo_datas;

import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		/** o date sera substituido pelo calendar **/
		System.out.println("Dia do mes: " + date.getDate());
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Minuto da hora: " + date.getMinutes());
		System.out.println("Segundos da hora: " + date.getSeconds());
				//Era para esta (date.getYear()); 
		System.out.println("Ano: " + (date.getYear() + 1900)); //o nao e somado 1900 como base, mais oque foi imprimido no console
		System.out.println(": " + date.getTime());
		System.out.println(": " + date.getTimezoneOffset());
	}

	
}
